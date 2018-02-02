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
     * @param node
     * @return
     */
    public Message setTiming(TscNode node);
}
