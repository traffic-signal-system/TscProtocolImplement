package cn.com.aiton.gbt20999.domain;
/**
 * 时基配置
 * @author Administrator
 *
 */
public class GbtTimeBase {
	//设备ID
	private int deviceId;
	//时基ID
	private byte timeBaseId;
	//月
	private short month;
	//周
	private byte week;
	//日
	private int day;
	//时段表ID
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
