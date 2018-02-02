package cn.com.aiton.gbt20999.services;

import java.util.Date;
import java.util.List;

import cn.com.aiton.gbt20999.domain.GbtEventLog;
import cn.com.aiton.gbt20999.domain.TscNode;

/**
 * 信号机日志服务类
 * Created by Administrator on 14-2-14.
 */
public interface LogEventService {
    /**
     * ȡ��һ���ڵ��������־����
     * @param node
     * @return
     */
    public List<GbtEventLog> getEventLog(TscNode node);

    /**
     * ����ʱ��ȡ����־�����ʱ������һ�졣
     * @param node
     * @param date
     * @return
     */
    public List<GbtEventLog> getEventLogByTime(TscNode node ,Date date);

    /**
     * ������־���Ͷ�ȡ��־����
     * @param node
     * @param type
     * @return
     */
    public List<GbtEventLog> getEventLogByEventType(TscNode node,byte type);

    /**
     * ��������ʱ�䣬����ʼʱ��ͽ���ʱ���ڵ���־���ݶ�ȡ����
     * @param node
     * @param startTime
     * @param endTime
     * @return
     */
    public List<GbtEventLog> getEventLogByStartTimeAndEndTime(TscNode node,Date startTime,Date endTime);
}
