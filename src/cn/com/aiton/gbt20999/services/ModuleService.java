package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtModule;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface ModuleService {
    /**
     * �õ��źŻ���ģ���ź�
     * @param node
     * @return
     */
    public List<GbtModule> getModule(TscNode node);

    /**
     * ��ǰ�źŻ������忨��״̬
     * @param node
     * @return
     */
    public byte[] getModuleState(TscNode node);
}
