package cn.com.aiton.gbt20999.domain;

public class GbtGroupTimeBase {
	private int groupId;
	private byte timeBaseId;
	private int month;
	private short week;
	private long day;
	private byte scheduleId;
	@Override
	public String toString() {
		return "GbtGroupTimeBase [groupId=" + groupId + ", timeBaseId="
				+ timeBaseId + ", month=" + month + ", week=" + week + ", day="
				+ day + ", scheduleId=" + scheduleId + "]";
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public byte getTimeBaseId() {
		return timeBaseId;
	}
	public void setTimeBaseId(byte timeBaseId) {
		this.timeBaseId = timeBaseId;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public short getWeek() {
		return week;
	}
	public void setWeek(short week) {
		this.week = week;
	}
	public long getDay() {
		return day;
	}
	public void setDay(long day) {
		this.day = day;
	}
	public byte getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(byte scheduleId) {
		this.scheduleId = scheduleId;
	}
}
