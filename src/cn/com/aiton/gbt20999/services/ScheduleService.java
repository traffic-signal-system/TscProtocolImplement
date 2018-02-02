package cn.com.aiton.gbt20999.services;

import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtSchedule;
import cn.com.aiton.gbt20999.domain.Message;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 * 时段表服务类
 */
public interface ScheduleService {
    /**
     * �õ�ĳ���źŻ���ʱ�α�����
     * @param node
     * @return
     */
    public List<GbtSchedule> getSchedule(TscNode node);

    /**
     * ����ĳ���źŻ���ʱ������
     * @param node
     * @param gbtSchedules
     * @return
     */
    public Message setSchedule(TscNode node,List<GbtSchedule> gbtSchedules);

   
}
