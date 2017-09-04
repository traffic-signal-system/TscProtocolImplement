package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtChannel;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface ChannelService {
    /**
     * 通过Udp取得信号机的�?��某个节点的�?道数�?
     * @param node
     * @return
     */
    public List<GbtChannel> getChannel(TscNode node);

    /**
     * 保存某个节点的�?道数�?
     * @param node
     * @param gbtChannels
     * @return
     */
    public Message setChannel(TscNode node,List<GbtChannel> gbtChannels);

   
}
