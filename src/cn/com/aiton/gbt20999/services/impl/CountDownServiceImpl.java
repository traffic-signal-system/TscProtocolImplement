package cn.com.aiton.gbt20999.services.impl;

import java.util.List;

import cn.com.aiton.gbt20999.domain.CountDown;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.CountDownService;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;


public class CountDownServiceImpl implements CountDownService{
    @Override
    public List<CountDown> getCntDownDev(TscNode node) {
        // TODO 增加倒计时，还要设计
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_CNTDOWNDEV);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            System.out.println("服务端回应数据：" + bytes.toString());
            if(bytes == null || bytes.length ==0){
            	return null;
            }else{
            	CountDown cd = new CountDown();
//            	for()
//            	cd.setDeviceId(0);
//            	cd.setCountDownId(bytes[]);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Message setCntDownDev(List<CountDown> countDowns, TscNode node) {
        // TODO
        return null;
    }
}
