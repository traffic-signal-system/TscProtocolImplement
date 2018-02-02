package cn.com.aiton.gbt20999.domain;

import java.util.Date;
/**
 * 检测器日志实体类，已经弃用，请使用GbtEventLog类
 * @author Administrator
 *
 */
public class GbtDeviceLog {
	//设备ID
	private int deviceId;
	//日志ID
	private int eventId;
	//日志类型
	private byte eventType;
	//日志发生时间
	private Date eventTime;
	//日志内容，具体内容值代表，请查看文档
	private long eventValue;
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public byte getEventType() {
		return eventType;
	}
	public void setEventType(byte eventType) {
		this.eventType = eventType;
	}
	public Date getEventTime() {
		return eventTime;
	}
	@Override
	public String toString() {
		return "GbtDeviceLog [deviceId=" + deviceId + ", eventId=" + eventId
				+ ", eventType=" + eventType + ", eventTime=" + eventTime
				+ ", eventValue=" + eventValue + "]";
	}
	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}
	public long getEventValue() {
		return eventValue;
	}
	public void setEventValue(long eventValue) {
		this.eventValue = eventValue;
	}
}
