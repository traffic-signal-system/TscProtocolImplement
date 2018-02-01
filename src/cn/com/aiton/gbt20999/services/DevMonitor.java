package cn.com.aiton.gbt20999.services;

import cn.com.aiton.gbt20999.domain.DevState;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 * 取得信号机的相关运行状态，
 * 状态信号有，信号机的双向门是否被打开；信号机的温度；信号机的湿度；信号机的电压；信号机的震动
 */
public interface DevMonitor {
	/**
	 * 取得信号机的信息
	 * 状态信号有，信号机的双向门是否被打开；信号机的温度；信号机的湿度；信号机的电压；信号机的震动
	 * @param node
	 * @return
	 */
    public DevState getTscMonitor(TscNode node);

}
