package cn.com.aiton.gbt20999.services;

import cn.com.aiton.gbt20999.domain.TscNode;
/**
 * 主动上报实现功能 类
 * @author Administrator
 *
 */
public interface ExtReportStatusService {
	/**
	 * 取得信号机的实时状态信息
	 * @param node 信号机节点，主要是ip地址和端口参数最为重要
	 */
	public void getState(TscNode node);
}
