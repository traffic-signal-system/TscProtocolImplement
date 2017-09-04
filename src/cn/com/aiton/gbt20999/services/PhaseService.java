package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtPhase;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface PhaseService {
    public List<GbtPhase> getPhase(TscNode node);
    public Message setPhase(List<GbtPhase> gbtPhases,TscNode node);
}
