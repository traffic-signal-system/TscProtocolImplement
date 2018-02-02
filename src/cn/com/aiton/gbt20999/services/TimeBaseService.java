package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtTimeBase;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 * 时基服务类
 */
public interface TimeBaseService {
    /**
     * ���źŻ��õ�ĳ���ڵ��ʱ������
     * @param node 信号机节点，主要是IP地址和端口号
     * @return 返回数据
     */
    public List<GbtTimeBase> getTimeBase(TscNode node);

    /**
     * ����ʱ�����ݵ��źŻ�
     * ͨ������
     * @param gbtTimeBaseList  时基数据集合
     * @param node 信号机节点，主要是IP地址和端口号
     * @return 返回数据
     */
    public Message setTimeBaseByCalendar(List<GbtTimeBase> gbtTimeBaseList,TscNode node);

    /**
     * ����ʱ�����ݵ��źŻ�
     * ͨ����ģʽ
     * @param gbtTimeBases 时基数据
     * @param node 信号机节点，主要是IP地址和端口号
     * @return 返回数据
     */
    public Message setTimeBaseByWeekend(List<GbtTimeBase> gbtTimeBases,TscNode node);
    /**
     * 
     * @param gbtTimeBases 时基数据
     * @param node 信号机节点，主要是IP地址和端口号
     * @return 返回数据
     */
    public Message setTimeBaseByMonth(List<GbtTimeBase> gbtTimeBases,TscNode node);

}
