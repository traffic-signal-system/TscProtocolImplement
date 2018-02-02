package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtPhase;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 * 相位服务类
 */
public interface PhaseService {
	/**
	 * 取得信号机所有的相位信息
	 * @param node 信号机节点，主要为ip地址和端口
	 * @return 信号机数据集合
	 */
    public List<GbtPhase> getPhase(TscNode node);
    /**
     * 设置信号机的相位信息
     * @param gbtPhases 相位实体类数据
     * @param node 信号机节点，主要为ip地址和端口
     * @return 返回设置是否成功信息
     */
    public Message setPhase(List<GbtPhase> gbtPhases,TscNode node);
}
