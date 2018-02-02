package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtTimePattern;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 * 配时方案服务类
 */
public interface PatternService {
    /**
     * ���źŻ���ȡ��ʱ����
     * @param node   信号机节点，主要 是IP地址和端口号
     * @return 返回数据
     */
    public List<GbtTimePattern> getTimePattern(TscNode node);

    /**
     * ������ʱ���ݵ��źŻ�
     * @param node 信号机节点，主要 是IP地址和端口号
     * @param gbtTimePatterns 配时方案集合数据
     * @return 返回数据
     */
    public Message setTimePattern(TscNode node,List<GbtTimePattern> gbtTimePatterns);

    
}
