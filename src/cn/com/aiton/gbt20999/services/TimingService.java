package cn.com.aiton.gbt20999.services;

import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 * 校时服务类
 */
public interface TimingService {
    /**
     * Уʱ����
     * @param node 信号节点，主要为IP地址和端口号
     * @return 返回是否正常
     */
    public Message setTiming(TscNode node);
}
