package cn.com.aiton.gbt20999.services;

import cn.com.aiton.gbt20999.domain.ExtController;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface ControllerService {
    public byte[] getController(TscNode node);
    public byte[] setController(ExtController extController);
}
