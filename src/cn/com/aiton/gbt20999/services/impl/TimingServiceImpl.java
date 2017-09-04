package cn.com.aiton.gbt20999.services.impl;

import java.util.Calendar;
import java.util.GregorianCalendar;

import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.TimingService;
import cn.com.aiton.gbt20999.utils.ByteUtils;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;

/**
 * Created by Administrator on 14-2-23.
 */
public class TimingServiceImpl implements TimingService {
    /**
     * 校时功能
     *
     * @param node
     * @return
     */
    @Override
    public Message setTiming(TscNode node) {
        Message message = new Message();
        try{
            byte[] hex = GbtDefine.SET_TIMING;
            Calendar cal = GregorianCalendar.getInstance();
            Long time = cal.getTimeInMillis();
            int timeInt =(int)(time/1000);
            byte[] bytes = ByteUtils.intToByte(timeInt);
            hex[3] = bytes[3];
            hex[4] = bytes[2];
            hex[5] = bytes[1];
            hex[6] = bytes[0];
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
//            byte[] result = ByteUtils.stringToByteArrayByISO(info);
//            System.out.println("服务端回应数据：" + info);
//TODO   缩写是否成功部分
            if(result[0] != 0x86){
            	message.setBoo(true);
            	message.setMsg("setTiming");
            	message.setObj("setTiming");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }
}
