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
     * @param node  信号节点信息，主要是IP地址和端口号
     * @return 返回数据
     */
    public List<GbtEventLog> getEventLog(TscNode node);

    /**
     * ����ʱ��ȡ����־�����ʱ������һ�졣
     * @param node  信号节点信息，主要是IP地址和端口号
     * @param date  日期
     * @return 返回数据
     */
    public List<GbtEventLog> getEventLogByTime(TscNode node ,Date date);

    /**
     * ������־���Ͷ�ȡ��־����
     * @param node  信号节点信息，主要是IP地址和端口号
     * @param type 類型
     * @return 返回数据
     */
    public List<GbtEventLog> getEventLogByEventType(TscNode node,byte type);

    /**
     * ��������ʱ�䣬����ʼʱ��ͽ���ʱ���ڵ���־���ݶ�ȡ����
     * @param node  信号节点信息，主要是IP地址和端口号  信号节点信息，主要是IP地址和端口号
     * @param startTime 開始時間
     * @param endTime 結束時間
     * @return 返回数据
     */
    public List<GbtEventLog> getEventLogByStartTimeAndEndTime(TscNode node,Date startTime,Date endTime);
}
