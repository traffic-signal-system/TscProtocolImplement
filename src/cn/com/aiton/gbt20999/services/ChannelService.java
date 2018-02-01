package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtChannel;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 * 信号机的通道数据处理类
 */
public interface ChannelService {
    /**
     * 通过Udp取得信号机的所有某个节点的通道数据
     * @param node 信号节点，主要为ip地址和端口
     * @return 信号机的通道数据集合
     */
    public List<GbtChannel> getChannel(TscNode node);

    /**
     * 保存某个节点的通道数据
     * @param node 信号节点，主要为ip地址和端口
     * @param gbtChannels 信号机的通道参数
     * @return Message 返回设置是否成功的信怎
     */
    public Message setChannel(TscNode node,List<GbtChannel> gbtChannels);

   
}
