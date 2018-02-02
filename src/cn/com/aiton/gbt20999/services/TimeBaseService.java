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
     * @param node
     * @return
     */
    public List<GbtTimeBase> getTimeBase(TscNode node);

    /**
     * ����ʱ�����ݵ��źŻ�
     * ͨ������
     * @param gbtTimeBaseList
     * @param node
     * @return
     */
    public Message setTimeBaseByCalendar(List<GbtTimeBase> gbtTimeBaseList,TscNode node);

    /**
     * ����ʱ�����ݵ��źŻ�
     * ͨ����ģʽ
     * @param gbtTimeBases
     * @param node
     * @return
     */
    public Message setTimeBaseByWeekend(List<GbtTimeBase> gbtTimeBases,TscNode node);
    /**
     * 
     * @param gbtTimeBases
     * @param node
     * @return
     */
    public Message setTimeBaseByMonth(List<GbtTimeBase> gbtTimeBases,TscNode node);

}
