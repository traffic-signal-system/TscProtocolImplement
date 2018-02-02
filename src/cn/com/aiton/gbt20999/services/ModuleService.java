package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtModule;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 * 信号机模块读取功能,由信号机插入多少块板有关,是无法进行设置.只能进行读取
 */
public interface ModuleService {
    /**
     * �õ��źŻ���ģ���ź�
     * @param node 信号节点，主要是IP地址和端口号
     * @return 返回Module内容
     */
    public List<GbtModule> getModule(TscNode node);

    /**
     * ��ǰ�źŻ������忨��״̬
     * @param node 信号节点，主要是IP地址和端口号
     * @return  返回Module内容
     */
    public byte[] getModuleState(TscNode node);
}
