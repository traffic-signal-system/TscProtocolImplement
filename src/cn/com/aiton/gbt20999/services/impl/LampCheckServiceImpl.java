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


public class LampCheckServiceImpl implements LampCheckService {
    /**
     * 关闭灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("关闭第一块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 关闭灯控板2的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("关闭第二块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 关闭灯控板3的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("关闭第三块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 关闭灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("关闭第四块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 关闭灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("关闭第五块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 关闭灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("关闭第六块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 关闭灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("关闭第七块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 关闭灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("关闭第八块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 关闭灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
     * 打开灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("打开第一块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 打开灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("打开第二块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 打开灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("打开第三块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 打开灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("打开第四块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 打开灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("打开第五块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 打开灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("打开第六块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 打开灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("打开第七块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 打开灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
            	msg.setMsg("协议通信异常");
            	msg.setObj("灯泡检测");
            }else{
            	msg.setBoo(true);
            	msg.setMsg("打开第八块灯泡检测成功");
            	msg.setObj("灯泡检测");
            }
           // System.out.println("服务端回应数据：" + info);
        }catch (Exception ex){
        	msg.setBoo(false);
        	msg.setMsg(ex.toString());
        	msg.setObj("灯泡检测");
            
        }
        return msg;
    }

    /**
     * 打开灯控板1的绿冲突检测
     *
     * @param node
     * @return
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
     * 得到灯控板1的绿冲突检测数据
     *
     * @param node
     * @return
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
