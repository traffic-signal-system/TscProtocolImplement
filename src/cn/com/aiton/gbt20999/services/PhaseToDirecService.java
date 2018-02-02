package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtDirec;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 * 方向与相位对应服务类
 */
public interface PhaseToDirecService {
    /**
     * ���ź���ȡ�÷�������
     * @param node 信号机节点，主要是IP地址 和端口号
     * @return 返回数据
     */
    public List<GbtDirec> getPhaseToDirec(TscNode node);

    /**
     * ���÷������ݵ��źŻ���
     * @param gbtDirecs 方向集合
     * @param node 节点 信息，主要是IP地址和端口号
     * @return 返回成功是否数据
     */
    public Message setPhaseToDirec(List<GbtDirec> gbtDirecs,TscNode node);
}
