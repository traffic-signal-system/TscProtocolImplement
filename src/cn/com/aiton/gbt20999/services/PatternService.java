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
     * @param node
     * @return
     */
    public List<GbtTimePattern> getTimePattern(TscNode node);

    /**
     * ������ʱ���ݵ��źŻ�
     * @param node
     * @param gbtTimePatterns
     * @return
     */
    public Message setTimePattern(TscNode node,List<GbtTimePattern> gbtTimePatterns);

    
}
