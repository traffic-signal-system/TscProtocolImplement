package cn.com.aiton.gbt20999.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import cn.com.aiton.gbt20999.domain.GbtDirec;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.PhaseToDirecService;
import cn.com.aiton.gbt20999.utils.ByteUtils;
import cn.com.aiton.gbt20999.utils.CheckGbt;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;

/**
 * Created by Administrator on 14-2-14.
 * 方向与相位对应服务类
 */
public class PhaseToDirecServiceImpl implements PhaseToDirecService {
    /**
     * ���ź���ȡ�÷�������
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtDirec> getPhaseToDirec(TscNode node) {
        List<GbtDirec> gbtDirecs = new ArrayList<GbtDirec>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_PHASE_DIREC);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            if(!CheckGbt.check(bytes, "getPhaseToDirec")){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.PHASE_DIREC_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] direcArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.PHASE_DIREC_RESULT_LEN, GbtDefine.PHASE_DIREC_BYTE_SIZE);
            for(int i=0; i< bytes[3] ;i++){
                GbtDirec gbtDirec = new GbtDirec();
                //gbtDirec.setDeviceId(node.getId());
                gbtDirec.setDirecId(direcArrayResult[i][0]);
                gbtDirec.setPhaseId(direcArrayResult[i][1]);
                gbtDirec.setOverlapId(direcArrayResult[i][2]);
                gbtDirec.setRoadCount(direcArrayResult[i][3]);
                gbtDirecs.add(gbtDirec);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtDirecs;
    }

    /**
     * ���÷������ݵ��źŻ���
     *
     * @param gbtDirecs
     * @return
     */
    @Override
    public Message setPhaseToDirec(List<GbtDirec> gbtDirecs,TscNode node) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_PHASE_DIREC_RESPONSE, (byte) GbtDefine.PHASE_DIREC_RESULT_LEN);
            Iterator<GbtDirec> gbtDirecIterator = gbtDirecs.iterator();
            while(gbtDirecIterator.hasNext()){
                GbtDirec gbtDirec = gbtDirecIterator.next();
                hex = ArrayUtils.add(hex,gbtDirec.getDirecId());
                hex = ArrayUtils.add(hex,gbtDirec.getPhaseId());
                hex = ArrayUtils.add(hex,gbtDirec.getOverlapId());
                hex = ArrayUtils.add(hex,gbtDirec.getRoadCount());
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            String info = client.receive(node.getIpAddress(), node.getPort());
            byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            System.out.println("����˻�Ӧ���ݣ�" + info);
//TODO   ��д�Ƿ�ɹ�����
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }
}
