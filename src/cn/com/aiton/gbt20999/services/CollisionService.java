package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtCollision;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 * 信号机绿冲突相关操作类，可以设置和取得某台信号机的冲突数据
 */
public interface CollisionService {
    /**
     * ȡ��16λ�źŻ����̳�ͻ����
     * @param node
     * @return
     */
    public List<GbtCollision> getCollisionBy16Phase(TscNode node);

    /**
     * ȡ��32��λ�źŻ����̳�ͻ����
     * @param node
     * @return
     */
    public List<GbtCollision> getCollisionBy32Phase(TscNode node);

    /**
     * �����õ����ݷ��͸�ĳ���źŻ�
     * @param gbtCollisions
     * @param node
     * @return
     */
    public Message setCollision(List<GbtCollision> gbtCollisions,TscNode node);

    /**
     * ���������̳�ͻ���ݵ����ݿ���
     * @param gbtCollisions
     * @return
     */
    
}
