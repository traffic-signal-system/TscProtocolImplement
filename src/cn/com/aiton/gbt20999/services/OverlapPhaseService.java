package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtOverlap;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface OverlapPhaseService {
    /**
     * 从信号机取得跟随相位数据
     * @param node
     * @return
     */
    public List<GbtOverlap> getOverlapPhase(TscNode node);

    /**
     * 将跟随相位数据设置到信号机
     * @param node
     * @param gbtOverlaps
     * @return
     */
    public Message setOverlapPhase(TscNode node ,List<GbtOverlap> gbtOverlaps);

    

}
