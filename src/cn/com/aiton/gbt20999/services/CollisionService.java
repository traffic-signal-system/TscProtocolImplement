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
     * @param node 信号机的节点参数，主要包括信号机IP地址和端口号
     * @return 返回绿冲突数据
     */
    public List<GbtCollision> getCollisionBy16Phase(TscNode node);

    /**
     * ȡ��32��λ�źŻ����̳�ͻ����
     * @param node 信号机的节点参数，主要包括信号机IP地址和端口号
     * @return 返回绿冲突数据
     */
    public List<GbtCollision> getCollisionBy32Phase(TscNode node);

    /**
     * �����õ����ݷ��͸�ĳ���źŻ�
     * @param gbtCollisions 绿冲突集合
     * @param node 信号机的节点参数，主要包括信号机IP地址和端口号
     * @return 返回绿冲突数据
     */
    public Message setCollision(List<GbtCollision> gbtCollisions,TscNode node);

    /**
     * ���������̳�ͻ���ݵ����ݿ���
     * @param gbtCollisions 绿冲突集合
     * @return 返回绿冲突数据
     */
    
}
