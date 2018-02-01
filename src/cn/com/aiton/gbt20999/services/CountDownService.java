package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.CountDown;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * 倒计时相关操作
 * Created by Administrator on 14-2-14.
 */
public interface CountDownService {
	/**
	 * 取得倒计时配置信息
	 * @param node
	 * @return
	 */
    public List<CountDown> getCntDownDev(TscNode node);
	/**
	 * 设置倒计时配置信息
	 * @param countDowns
	 * @param node
	 * @return
	 */
    public Message setCntDownDev(List<CountDown> countDowns,TscNode node);
}
