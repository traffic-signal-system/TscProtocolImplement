package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtOverlap;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 * 信号机的跟随相位操作服务类
 */
public interface OverlapPhaseService {
    /**
     * ���źŻ�ȡ�ø�����λ����
     * @param node
     * @return
     */
    public List<GbtOverlap> getOverlapPhase(TscNode node);

    /**
     * ��������λ�������õ��źŻ�
     * @param node
     * @param gbtOverlaps
     * @return
     */
    public Message setOverlapPhase(TscNode node ,List<GbtOverlap> gbtOverlaps);

    

}
