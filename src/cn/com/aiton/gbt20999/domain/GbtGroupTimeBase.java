package cn.com.aiton.gbt20999.domain;
/**
 * 群时基配置表实体类，两个功能
 * 1、在组建无线缆绿波可以使用
 * 2、对群控制方面可以使用
 * @author Administrator
 *
 */
public class GbtGroupTimeBase {
	//群ID
	private int groupId;
	//时基ID
	private byte timeBaseId;
	//月
	private int month;
	//周
	private short week;
	//日
	private long day;
	//群时段ID
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
