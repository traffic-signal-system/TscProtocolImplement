package cn.com.aiton.gbt20999.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import cn.com.aiton.gbt20999.domain.GbtChannel;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;
import cn.com.aiton.gbt20999.services.ChannelService;
import cn.com.aiton.gbt20999.utils.ByteUtils;
import cn.com.aiton.gbt20999.utils.CheckGbt;
import cn.com.aiton.gbt20999.utils.GbtDefine;
import cn.com.aiton.gbt20999.utils.UdpClientSocket;

/**
 * 信号机的通道数据处理类
 * @author Administrator
 *
 */
public class ChannelServiceImpl implements ChannelService {
    
	/**
     * 通过Udp取得信号机的所有某个节点的通道数据
     * @param node 信号节点，主要为ip地址和端口
     * @return 信号机的通道数据集合
     */
    @Override
    public List<GbtChannel> getChannel(TscNode node) {
        List<GbtChannel> gbtChannels = new ArrayList<GbtChannel>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_CHANNEL);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("����˻�Ӧ���ݣ�" + info);
            if(!CheckGbt.check(bytes, "Channel")){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.CHANNEL_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] channelArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.CHANNEL_RESULT_LEN, GbtDefine.CHANNEL_BYTE_SIZE);
            for(int i=0; i< bytes[3] ;i++){
                GbtChannel gbtChannel = new GbtChannel();
               // gbtChannel.setDeviceId(node.getId());
                gbtChannel.setChannelId(channelArrayResult[i][0]);
                gbtChannel.setControlSource(channelArrayResult[i][1]);
                gbtChannel.setAutoFlashControl(channelArrayResult[i][2]);
                gbtChannel.setControlType(channelArrayResult[i][3]);
                gbtChannels.add(gbtChannel);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtChannels;
    }

    /**
     * 保存某个节点的通道数据
     * @param node 信号节点，主要为ip地址和端口
     * @param gbtChannels 信号机的通道参数
     * @return Message 返回设置是否成功的信怎
     */
    @Override
    public Message setChannel(TscNode node, List<GbtChannel> gbtChannels) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_CHANNEL_RESPONSE, (byte) GbtDefine.CHANNEL_RESULT_LEN);
            Iterator<GbtChannel> gbtChannelIterator = gbtChannels.iterator();
            while(gbtChannelIterator.hasNext()){
                GbtChannel gbtChannel = gbtChannelIterator.next();
                hex = ArrayUtils.add(hex,gbtChannel.getChannelId());
                hex = ArrayUtils.add(hex,gbtChannel.getControlSource());
                hex = ArrayUtils.add(hex,gbtChannel.getAutoFlashControl());
                hex = ArrayUtils.add(hex,gbtChannel.getControlType());
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
