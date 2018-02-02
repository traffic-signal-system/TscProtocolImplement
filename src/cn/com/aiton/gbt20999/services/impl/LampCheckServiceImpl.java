package cn.com.aiton.gbt20999.services.impl;

import java.util.ArrayList;
import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtLampCheck;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.LampCheckService;
import cn.com.aiton.gbt20999.utils.ByteUtils;
import cn.com.aiton.gbt20999.utils.CheckGbt;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;

/**
 * 灯泡检测服务类
 * Created by Administrator on 14-2-14.
 */
public class LampCheckServiceImpl implements LampCheckService {
    /**
     * �رյƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckCloseOne(TscNode node) {
        Message msg = new Message();
        try{
        	
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_ONE_NO_CHECK);
           // String info = client.receive(node.getIpAddress(), node.getPort());
            
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�رյ�һ����ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �رյƿذ�2���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckCloseTwo(TscNode node) {
        Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_TWO_NO_CHECK);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�رյڶ�����ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �رյƿذ�3���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckCloseThree(TscNode node) {
        Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_THREE_NO_CHECK);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�رյ�������ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �رյƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckCloseFour(TscNode node) {
        Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_FOUR_NO_CHECK);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�رյ��Ŀ���ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �رյƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckCloseFive(TscNode node) {
        Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_FIVE_NO_CHECK);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�رյ������ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �رյƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckCloseSix(TscNode node) {
        Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_SIX_NO_CHECK);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�رյ�������ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �رյƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckCloseSeven(TscNode node) {
        Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_SEVEN_NO_CHECK);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�رյ��߿���ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �رյƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckCloseEight(TscNode node) {
        Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_EIGHT_NO_CHECK);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�رյڰ˿���ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �رյƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public List<Message> setLampCheckCloseALL(TscNode node) {
        List<Message> messages = new ArrayList<Message>();
        messages.add(this.setLampCheckCloseOne(node));
        messages.add(this.setLampCheckCloseTwo(node));
        messages.add(this.setLampCheckCloseThree(node));
        messages.add(this.setLampCheckCloseFour(node));
        messages.add(this.setLampCheckCloseFive(node));
        messages.add(this.setLampCheckCloseSix(node));
        messages.add(this.setLampCheckCloseSeven(node));
        messages.add(this.setLampCheckCloseEight(node));
        return messages;
    }

    /**
     * �򿪵ƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckOpenOne(TscNode node) {
        Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_ONE_CHECK);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�򿪵�һ����ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �򿪵ƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckOpenTwo(TscNode node) {
        Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_TWO_CHECK);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�򿪵ڶ�����ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �򿪵ƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckOpenThree(TscNode node) {
        Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_THREE_CHECK);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�򿪵�������ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �򿪵ƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckOpenFour(TscNode node) {
        Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_FOUR_CHECK);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�򿪵��Ŀ���ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �򿪵ƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckOpenFive(TscNode node) {
        Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_FIVE_CHECK);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�򿪵������ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �򿪵ƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckOpenSix(TscNode node) {
        Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_SIX_CHECK);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�򿪵�������ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �򿪵ƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckOpenSeven(TscNode node) {
        Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_SEVEN_CHECK);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�򿪵��߿���ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �򿪵ƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public Message setLampCheckOpenEight(TscNode node) {
        Message msg = new Message();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_LAMP_BLOCK_CHECK_COLLISION_EIGHT_CHECK);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            if (bytes[0] == 0x86){
            	msg.setBoo(false);
            	msg.setMsg("Э��ͨ���쳣");
            	msg.setObj("���ݼ��");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("�򿪵ڰ˿���ݼ��ɹ�");
            	msg.setObj("���ݼ��");
            }
           // System.out.println("����˻�Ӧ���ݣ�" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("���ݼ��");
            
        }
        return msg;
    }

    /**
     * �򿪵ƿذ�1���̳�ͻ���
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public List<Message> setLampCheckOpenALL(TscNode node) {
        List<Message> messages = new ArrayList<Message>();
        messages.add(this.setLampCheckOpenOne(node));
        messages.add(this.setLampCheckOpenTwo(node));
        messages.add(this.setLampCheckOpenThree(node));
        messages.add(this.setLampCheckOpenFour(node));
        messages.add(this.setLampCheckOpenFive(node));
        messages.add(this.setLampCheckOpenSix(node));
        messages.add(this.setLampCheckOpenSeven(node));
        messages.add(this.setLampCheckOpenEight(node));
        return messages;
    }

    /**
     * �õ��ƿذ�1���̳�ͻ�������
     *
     * @param node 节点信息，主要是信号机的IP地址和端口号
     * @return 返回数据
     */
    @Override
    public List<GbtLampCheck> getLampCheck(TscNode node) {
        List<GbtLampCheck> gbtLampChecks = new ArrayList<GbtLampCheck>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_LAMP_CHECK);
            String info = client.receive(node.getIpAddress(), node.getPort());
            byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            if(!CheckGbt.check(bytes,"LampCheck")){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.LAMP_CHECK_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] lampCheckResult = ByteUtils.oneArrayToTwoArray(objectArray,(int)bytes[3],GbtDefine.LAMP_CHECK_BYTE_SIZE);
            GbtLampCheck gbtLampCheck = new GbtLampCheck();
            for(int i=0; i<bytes[3];i++){
                //gbtLampCheck.setDeviceId(node.getId());
                gbtLampCheck.setLampId(lampCheckResult[i][0]);
                gbtLampCheck.setLampFlag(lampCheckResult[i][1]);
                gbtLampChecks.add(gbtLampCheck);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtLampChecks;
    }
}
