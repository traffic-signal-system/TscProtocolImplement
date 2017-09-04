package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtDirec;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface PhaseToDirecService {
    /**
     * 从信号中取得方向数据
     * @param node
     * @return
     */
    public List<GbtDirec> getPhaseToDirec(TscNode node);

    /**
     * 配置方向数据到信号机中
     * @param gbtDirecs
     * @return
     */
    public Message setPhaseToDirec(List<GbtDirec> gbtDirecs,TscNode node);
}
