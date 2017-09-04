package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtTimePattern;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface PatternService {
    /**
     * 从信号机读取配时数据
     * @param node
     * @return
     */
    public List<GbtTimePattern> getTimePattern(TscNode node);

    /**
     * 设置配时数据到信号机
     * @param node
     * @param gbtTimePatterns
     * @return
     */
    public Message setTimePattern(TscNode node,List<GbtTimePattern> gbtTimePatterns);

    
}
