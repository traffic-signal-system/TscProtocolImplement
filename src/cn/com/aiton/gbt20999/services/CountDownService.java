package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.CountDown;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface CountDownService {
    public List<CountDown> getCntDownDev(TscNode node);

    public Message setCntDownDev(List<CountDown> countDowns,TscNode node);
}
