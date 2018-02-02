package cn.com.aiton.gbt20999.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import cn.com.aiton.gbt20999.domain.GbtStagePattern;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.StagePatternService;
import cn.com.aiton.gbt20999.utils.ByteUtils;
import cn.com.aiton.gbt20999.utils.CheckGbt;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;
/**
 * Created by Administrator on 14-2-14.
 * 阶段配时服务类
 */
public class StagePatternServiceImpl implements StagePatternService {
    /**
     * ���źŻ���ȡ32��λ�Ľ׶���������
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtStagePattern> getStagePattern32Phase(TscNode node) {
        List<GbtStagePattern> gbtStagePatterns = new ArrayList<GbtStagePattern>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_STAGEPATTERN);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            if(!CheckGbt.check(bytes, "GbtStagePattern")){
                return null;
            }
            byte[] objectArray = new byte[GbtDefine.STAGE_RESULT_LEN * GbtDefine.STAGEPATTERN_RESULT_LEN * GbtDefine.STAGEPATTERN_BYTE_SIZE];
            System.arraycopy(bytes,5,objectArray,0,objectArray.length);
            byte[][] stagePatternArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.STAGE_RESULT_LEN * GbtDefine.STAGEPATTERN_RESULT_LEN, GbtDefine.STAGEPATTERN_BYTE_SIZE);
            for(int i=0; i<GbtDefine.STAGE_RESULT_LEN * GbtDefine.STAGEPATTERN_RESULT_LEN ;i++){
                GbtStagePattern gbtStagePattern = new GbtStagePattern();
                //gbtStagePattern.setDeviceId(node.getId());
                gbtStagePattern.setStagePatternId(stagePatternArrayResult[i][0]);
                gbtStagePattern.setStageId(stagePatternArrayResult[i][1]);
                byte[] allowPhase = {stagePatternArrayResult[i][2],stagePatternArrayResult[i][3],stagePatternArrayResult[i][4],stagePatternArrayResult[i][5]};
                gbtStagePattern.setAllowPhase(ByteUtils.byteToInt(allowPhase));
                gbtStagePattern.setGreenTime(stagePatternArrayResult[i][6]);
                gbtStagePattern.setYellowTime(stagePatternArrayResult[i][7]);
                gbtStagePattern.setRedTime(stagePatternArrayResult[i][8]);
                gbtStagePattern.setOption(stagePatternArrayResult[i][9]);
                gbtStagePatterns.add(gbtStagePattern);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtStagePatterns;
    }

    /**
     * @param node
     * @return
     */
    @Override
    public List<GbtStagePattern> getStagePattern16Phase(TscNode node) {
        List<GbtStagePattern> gbtStagePatterns = new ArrayList<GbtStagePattern>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_STAGEPATTERN);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            if(!CheckGbt.check(bytes, "GbtStagePattern")){
                return null;
            }
            byte[] objectArray = new byte[GbtDefine.STAGE_RESULT_LEN * GbtDefine.STAGEPATTERN_RESULT_LEN * GbtDefine.STAGE_PATTERN_BYTE_SIZE_16];
            System.arraycopy(bytes,5,objectArray,0,objectArray.length);
            byte[][] stagePatternArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.STAGE_RESULT_LEN * GbtDefine.STAGEPATTERN_RESULT_LEN, GbtDefine.STAGE_PATTERN_BYTE_SIZE_16);
            for(int i=0; i< GbtDefine.STAGE_RESULT_LEN * GbtDefine.STAGEPATTERN_RESULT_LEN  ;i++){
                GbtStagePattern gbtStagePattern = new GbtStagePattern();
                //gbtStagePattern.setDeviceId(node.getId());
                gbtStagePattern.setStagePatternId(stagePatternArrayResult[i][0]);
                gbtStagePattern.setStageId(stagePatternArrayResult[i][1]);
                byte[] allowPhase = {stagePatternArrayResult[i][2],stagePatternArrayResult[i][3]};
                gbtStagePattern.setAllowPhase(ByteUtils.byteToInt(allowPhase));
                gbtStagePattern.setGreenTime(stagePatternArrayResult[i][4]);
                gbtStagePattern.setYellowTime(stagePatternArrayResult[i][5]);
                gbtStagePattern.setRedTime(stagePatternArrayResult[i][6]);
                gbtStagePattern.setOption(stagePatternArrayResult[i][7]);
                gbtStagePatterns.add(gbtStagePattern);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtStagePatterns;
    }

    /**
     * @param node
     * @param gbtStagePatterns
     * @return
     */
    @Override
    public Message setStagePatternBy16Phase(TscNode node, List<GbtStagePattern> gbtStagePatterns) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_STAGEPATTERN_RESPONSE, (byte) GbtDefine.STAGEPATTERN_RESULT_LEN);
            hex = ArrayUtils.add(hex,(byte)(GbtDefine.STAGE_RESULT_LEN));
            Iterator<GbtStagePattern> gbtStagePatternIterator = gbtStagePatterns.iterator();
            while(gbtStagePatternIterator.hasNext()){
                GbtStagePattern gbtStagePattern = gbtStagePatternIterator.next();
                hex = ArrayUtils.add(hex,gbtStagePattern.getStagePatternId());
                hex = ArrayUtils.add(hex,gbtStagePattern.getStageId());
                hex = ArrayUtils.addAll(hex, ByteUtils.shortToByte((short)gbtStagePattern.getAllowPhase()));
                hex = ArrayUtils.add(hex,gbtStagePattern.getGreenTime());
                hex = ArrayUtils.add(hex,gbtStagePattern.getYellowTime());
                hex = ArrayUtils.add(hex,gbtStagePattern.getRedTime());
                hex = ArrayUtils.add(hex,gbtStagePattern.getOption());
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

    /**
     * @param node
     * @param gbtStagePatterns
     * @return
     */
    @Override
    public Message setStagePatternBy32Phase(TscNode node, List<GbtStagePattern> gbtStagePatterns) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_STAGEPATTERN_RESPONSE, (byte) GbtDefine.STAGEPATTERN_RESULT_LEN);
            hex = ArrayUtils.add(hex,(byte)(GbtDefine.STAGE_RESULT_LEN));
            Iterator<GbtStagePattern> gbtStagePatternIterator = gbtStagePatterns.iterator();
            while(gbtStagePatternIterator.hasNext()){
                GbtStagePattern gbtStagePattern = gbtStagePatternIterator.next();
                hex = ArrayUtils.add(hex,gbtStagePattern.getStagePatternId());
                hex = ArrayUtils.add(hex,gbtStagePattern.getStageId());
                hex = ArrayUtils.addAll(hex, ByteUtils.intToByte(gbtStagePattern.getAllowPhase()));
                hex = ArrayUtils.add(hex,gbtStagePattern.getGreenTime());
                hex = ArrayUtils.add(hex,gbtStagePattern.getYellowTime());
                hex = ArrayUtils.add(hex,gbtStagePattern.getRedTime());
                hex = ArrayUtils.add(hex,gbtStagePattern.getOption());
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
