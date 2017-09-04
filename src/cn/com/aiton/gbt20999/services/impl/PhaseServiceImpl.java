package cn.com.aiton.gbt20999.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import cn.com.aiton.gbt20999.domain.GbtPhase;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.PhaseService;
import cn.com.aiton.gbt20999.utils.ByteUtils;
import cn.com.aiton.gbt20999.utils.CheckGbt;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;


public class PhaseServiceImpl implements PhaseService{
    @Override
    public List<GbtPhase> getPhase(TscNode node) {
        List<GbtPhase> gbtPhases = new ArrayList<GbtPhase>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_PHASE);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
//            byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
//            System.out.println("服务端回应数据：" + info);

            if(!CheckGbt.check(bytes,"Phase")){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.PHASE_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,bytes[3] * GbtDefine.PHASE_BYTE_SIZE);
            byte[][] phaseArrayResult = ByteUtils.oneArrayToTwoArray(objectArray,bytes[3],GbtDefine.PHASE_BYTE_SIZE);
            for(int i=0;i<bytes[3];i++){
                GbtPhase gbtPhase = new GbtPhase();
                //gbtPhase.setDeviceId(node.getId());
                gbtPhase.setPhaseId(phaseArrayResult[i][0]);
                gbtPhase.setPedestrainGreen(phaseArrayResult[i][1]);
                gbtPhase.setPedestrainClear(phaseArrayResult[i][2]);
                gbtPhase.setMinGreen(phaseArrayResult[i][3]);
                gbtPhase.setGreenDelayUnit(phaseArrayResult[i][4]);
                gbtPhase.setMaxGreen1(phaseArrayResult[i][5]);
                gbtPhase.setMaxGreen2(phaseArrayResult[i][6]);
                gbtPhase.setFixGreen(phaseArrayResult[i][7]);
                gbtPhase.setGreenFlash(phaseArrayResult[i][8]);
                gbtPhase.setPhaseType(phaseArrayResult[i][9]);
                gbtPhase.setPhaseOption(phaseArrayResult[i][10]);
                gbtPhase.setExtend(phaseArrayResult[i][11]);

                gbtPhases.add(gbtPhase);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtPhases;
    }

    @Override
    public Message setPhase(List<GbtPhase> gbtPhases,TscNode node) {
        Message message = new Message();
        try{
            //byte[] hex = new byte[GbtDefine.PHASE_BYTE_SIZE*GbtDefine.PHASE_RESULT_LEN +GbtDefine.SET_PHASE_RESPONSE.length + 1];
            byte[] hex = ArrayUtils.add(GbtDefine.SET_PHASE_RESPONSE,(byte)GbtDefine.PHASE_RESULT_LEN);
            Iterator<GbtPhase> gbtPhaseIterator = gbtPhases.iterator();
            while(gbtPhaseIterator.hasNext()){
                GbtPhase gbtPhase = gbtPhaseIterator.next();
                byte[] objectArray = {gbtPhase.getPhaseId(),gbtPhase.getPedestrainGreen()
                        ,gbtPhase.getPedestrainClear(),gbtPhase.getMinGreen()
                        ,gbtPhase.getGreenDelayUnit(),gbtPhase.getMaxGreen1()
                        ,gbtPhase.getMaxGreen2(),gbtPhase.getFixGreen()
                        ,gbtPhase.getGreenFlash(),gbtPhase.getPhaseType()
                        ,gbtPhase.getPhaseOption(),gbtPhase.getExtend()};
                hex = ArrayUtils.addAll(hex,objectArray);
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            String info = client.receive(node.getIpAddress(), node.getPort());
            byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            System.out.println("服务端回应数据：" + info);

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }
}
