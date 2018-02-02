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
     * @param node 信号机节点，主要是IP地址和端口号
     * @return 返回数据
     */ 
    public List<GbtOverlap> getOverlapPhase(TscNode node);

    /**
     * ��������λ�������õ��źŻ�
     * @param node 信号机节点，主要是IP地址和端口号
     * @param gbtOverlaps 跟随相位集合
     * @return 返回数据
     */
    public Message setOverlapPhase(TscNode node ,List<GbtOverlap> gbtOverlaps);

    

}
