package cn.com.aiton.gbt20999.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import cn.com.aiton.gbt20999.domain.GbtOverlap;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.OverlapPhaseService;
import cn.com.aiton.gbt20999.utils.ByteUtils;
import cn.com.aiton.gbt20999.utils.CheckGbt;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.OverlapPhaseUtils;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;

/**
 * Created by Administrator on 14-2-14.
 * 信号机的跟随相位操作服务类
 */
public class OverlapPhaseServiceImpl implements OverlapPhaseService {
    /**
     * ���źŻ�ȡ�ø�����λ����
     *
     * @param node 节点 信息，主要是 IP地址和端口号
     * @return 返回跟随相位集合
     */
    @Override
    public List<GbtOverlap> getOverlapPhase(TscNode node) {
        List<GbtOverlap> gbtOverlaps = new ArrayList<GbtOverlap>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_OVERLAPPHASE);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            if(!CheckGbt.check(bytes, "Channel")){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.OVERLAPPHASE_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] overlapArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.OVERLAPPHASE_RESULT_LEN, GbtDefine.OVERLAPPHASE_BYTE_SIZE);
            for(int i=0; i< bytes[3] ;i++){
                GbtOverlap gbtOverlap = new GbtOverlap();
                //gbtOverlap.setDeviceId(node.getId());
                gbtOverlap.setOverlapId(overlapArrayResult[i][0]);
                gbtOverlap.setOverlapType(overlapArrayResult[i][1]);
                gbtOverlap.setIncludePhaseCount(overlapArrayResult[i][2]);
                gbtOverlap.setIncludePhase(new String(overlapArrayResult[i][3]+","+overlapArrayResult[i][4]+","+overlapArrayResult[i][5]+","+overlapArrayResult[i][6]+","+overlapArrayResult[i][7]+","+overlapArrayResult[i][8]+","+overlapArrayResult[i][9]+","+overlapArrayResult[i][10]+","+overlapArrayResult[i][11]+","+overlapArrayResult[i][12]+","+overlapArrayResult[i][13]+","+overlapArrayResult[i][14]+","+overlapArrayResult[i][15]+","+overlapArrayResult[i][16]+","+overlapArrayResult[i][17]+","+overlapArrayResult[i][18]));
                gbtOverlap.setAmendPhaseCount(overlapArrayResult[i][19]);
                gbtOverlap.setAmendPhase(new String(overlapArrayResult[i][20] + "," + overlapArrayResult[i][21] + "," + overlapArrayResult[i][22] + "," + overlapArrayResult[i][23] + "," + overlapArrayResult[i][24] + "," + overlapArrayResult[i][25] + "," + overlapArrayResult[i][26] + "," + overlapArrayResult[i][27] + "," + overlapArrayResult[i][28] + "," + overlapArrayResult[i][29] + "," + overlapArrayResult[i][30] + "," + overlapArrayResult[i][31] + "," + overlapArrayResult[i][32] + "," + overlapArrayResult[i][33] + "," + overlapArrayResult[i][34] + "," + overlapArrayResult[i][35]));
                gbtOverlap.setTailGreen(overlapArrayResult[i][36]);
                gbtOverlap.setTailYellow(overlapArrayResult[i][37]);
                gbtOverlap.setTailRed(overlapArrayResult[i][38]);
                gbtOverlaps.add(gbtOverlap);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtOverlaps;
    }

    /**
     * ��������λ�������õ��źŻ�
     *
     * @param node 节点信息，包括IP地址和端口号
     * @param gbtOverlaps 返回跟随相位集合数据
     * @return 返回是否成功
     */
    @Override
    public Message setOverlapPhase(TscNode node, List<GbtOverlap> gbtOverlaps) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_OVERLAPPHASE_RESPONSE, (byte) GbtDefine.OVERLAPPHASE_RESULT_LEN);
            Iterator<GbtOverlap> gbtOverlapIterator = gbtOverlaps.iterator();
            while(gbtOverlapIterator.hasNext()){
                GbtOverlap gbtChannel = gbtOverlapIterator.next();
                hex = ArrayUtils.add(hex,gbtChannel.getOverlapId());
                hex = ArrayUtils.add(hex,gbtChannel.getOverlapType());
                hex = ArrayUtils.add(hex,gbtChannel.getIncludePhaseCount());
                hex = ArrayUtils.addAll(hex, OverlapPhaseUtils.stringToByteArray(gbtChannel.getIncludePhase()));
                hex = ArrayUtils.add(hex,gbtChannel.getAmendPhaseCount());
                hex = ArrayUtils.addAll(hex, OverlapPhaseUtils.stringToByteArray(gbtChannel.getAmendPhase()));
                hex = ArrayUtils.add(hex,gbtChannel.getTailGreen());
                hex = ArrayUtils.add(hex,gbtChannel.getTailYellow());
                hex = ArrayUtils.add(hex,gbtChannel.getTailRed());
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            String info = client.receive(node.getIpAddress(), node.getPort());
//            byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            System.out.println("����˻�Ӧ���ݣ�" + info);
//TODO   ��д�Ƿ�ɹ�����
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }

    
}
