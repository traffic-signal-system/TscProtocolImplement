package cn.com.aiton.gbt20999.services.impl;

import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;

public class ManalControlService implements cn.com.aiton.gbt20999.services.ManalControlService {


    @Override
    public void switchMunual(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_MUNUAL);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
           // Message message= CheckGbt.check(result);
          
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void switchSelf(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_SELF);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void switchStepByNumber(TscNode node, int num) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            GbtDefine.CTRL_NEXTSTEP[3] = (byte)(num);
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NEXTSTEP);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void switchNextStep(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NEXTSTEP);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void switchNextPhase(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NEXTPHASE);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * by me
     * @param node
     * @param num
     * @return
     */
    @Override
    public void switchPhaseByNumber(TscNode node, int num) {
        
        try {
            UdpClientSocket client = new UdpClientSocket();
            byte[]a=GbtDefine.CTRL_NEXTPHASE;
            a[4]=(byte)num;
            client.send(node.getIpAddress(), node.getPort(),a );
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void switchNextDirec(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NEXTDIREC);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void switchNorth(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NORTH);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void switchEast(TscNode node) {
       
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_EAST);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void switchSouth(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_SOUTH);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
//            return serviceResult;
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void switchWest(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_WEST);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void switchOffLine(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_OFF);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void switchFlas(TscNode node) {
        
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_FLASH);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void switchRed(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_RED);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            Message message= CheckGbt.check(result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
