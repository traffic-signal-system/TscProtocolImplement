package cn.com.aiton.gbt20999.domain;

public class GbtTimeBase {
	private int deviceId;
	private byte timeBaseId;
	private short month;
	private byte week;
	private int day;
	private byte scheduleId;
	
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public byte getTimeBaseId() {
		return timeBaseId;
	}
	public void setTimeBaseId(byte timeBaseId) {
		this.timeBaseId = timeBaseId;
	}
	
	public byte getWeek() {
		return week;
	}
	public void setWeek(byte week) {
		this.week = week;
	}
	
	@Override
	public String toString() {
		return "GbtTimeBase [deviceId=" + deviceId + ", timeBaseId="
				+ timeBaseId + ", month=" + month + ", week=" + week + ", day="
				+ day + ", scheduleId=" + scheduleId + "]";
	}
	public short getMonth() {
		return month;
	}
	public void setMonth(short month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public byte getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(byte scheduleId) {
		this.scheduleId = scheduleId;
	}
}
