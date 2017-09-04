package cn.com.aiton.gbt20999.domain;

import java.util.Date;

public class GbtDeviceLog {
	private int deviceId;
	private int eventId;
	private byte eventType;
	private Date eventTime;
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
