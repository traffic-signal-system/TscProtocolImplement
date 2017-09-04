package cn.com.aiton.gbt20999.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import cn.com.aiton.gbt20999.domain.GbtTimePattern;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.PatternService;
import cn.com.aiton.gbt20999.utils.ByteUtils;
import cn.com.aiton.gbt20999.utils.CheckGbt;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;


public class PatternServiceImpl implements PatternService {
    /**
     * ���źŻ���ȡ��ʱ����
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtTimePattern> getTimePattern(TscNode node) {
        List<GbtTimePattern> gbtTimePatterns = new ArrayList<GbtTimePattern>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_PATTERN);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            if(!CheckGbt.check(bytes, "GbtTimePattern")){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.PATTERN_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] timePatternArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.PATTERN_RESULT_LEN, GbtDefine.PATTERN_BYTE_SIZE);
            for(int i=0; i< bytes[3] ;i++){
                GbtTimePattern gbtTimePattern = new GbtTimePattern();
                //gbtTimePattern.setDeviceId(node.getId());
                gbtTimePattern.setTimePatternId(timePatternArrayResult[i][0]);
                gbtTimePattern.setCycleTime(timePatternArrayResult[i][1]);
                gbtTimePattern.setOffset(timePatternArrayResult[i][2]);
                gbtTimePattern.setCoordinatePhase(timePatternArrayResult[i][3]);
                gbtTimePattern.setStagePatternId(timePatternArrayResult[i][4]);
                gbtTimePatterns.add(gbtTimePattern);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtTimePatterns;
    }

    /**
     * ������ʱ���ݵ��źŻ�
     *
     * @param node
     * @param gbtTimePatterns
     * @return
     */
    @Override
    public Message setTimePattern(TscNode node, List<GbtTimePattern> gbtTimePatterns) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_PATTERN_RESPONSE, (byte) GbtDefine.PATTERN_RESULT_LEN);
            Iterator<GbtTimePattern> gbtTimePatternIterator = gbtTimePatterns.iterator();
            while(gbtTimePatternIterator.hasNext()){
                GbtTimePattern gbtTimePattern = gbtTimePatternIterator.next();
                hex = ArrayUtils.add(hex,gbtTimePattern.getTimePatternId());
                hex = ArrayUtils.add(hex,gbtTimePattern.getCycleTime());
                hex = ArrayUtils.add(hex,gbtTimePattern.getOffset());
                hex = ArrayUtils.add(hex,gbtTimePattern.getCoordinatePhase());
                hex = ArrayUtils.add(hex,gbtTimePattern.getStagePatternId());
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
