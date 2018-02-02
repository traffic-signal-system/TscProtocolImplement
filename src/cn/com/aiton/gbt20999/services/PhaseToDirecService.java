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
     * @param node
     * @return
     */
    public List<GbtDirec> getPhaseToDirec(TscNode node);

    /**
     * ���÷������ݵ��źŻ���
     * @param gbtDirecs
     * @return
     */
    public Message setPhaseToDirec(List<GbtDirec> gbtDirecs,TscNode node);
}
