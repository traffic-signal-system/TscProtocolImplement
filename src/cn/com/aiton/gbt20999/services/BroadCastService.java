package cn.com.aiton.gbt20999.services;

import java.util.List;
/**
 * 对在局域网内的信号机进行广播
 * @author Administrator
 *
 */
public interface BroadCastService {
	/**
	 * 对在网的信号机进行广播，
	 * 比如 192.168.1.136信号机在网，可以进行通信。
	 * 那么它会返回数据给
	 * @return
	 */
	public List<String> getNodeNetwork();
}
