package cn.com.aiton.gbt20999.domain;

public class GbtGroupSchedule {
	private int groupId;
	private byte scheduleId;
	private byte eventId;
	private byte beginHour;
	private byte beginMinute;
	private byte timePatternId;
	private byte controlMode;
	@Override
	public String toString() {
		return "GbtGroupSchedule [groupId=" + groupId + ", scheduleId="
				+ scheduleId + ", eventId=" + eventId + ", beginHour="
				+ beginHour + ", beginMinute=" + beginMinute
				+ ", timePatternId=" + timePatternId + ", controlMode="
				+ controlMode + "]";
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public byte getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(byte scheduleId) {
		this.scheduleId = scheduleId;
	}
	public byte getEventId() {
		return eventId;
	}
	public void setEventId(byte eventId) {
		this.eventId = eventId;
	}
	public byte getBeginHour() {
		return beginHour;
	}
	public void setBeginHour(byte beginHour) {
		this.beginHour = beginHour;
	}
	public byte getBeginMinute() {
		return beginMinute;
	}
	public void setBeginMinute(byte beginMinute) {
		this.beginMinute = beginMinute;
	}
	public byte getTimePatternId() {
		return timePatternId;
	}
	public void setTimePatternId(byte timePatternId) {
		this.timePatternId = timePatternId;
	}
	public byte getControlMode() {
		return controlMode;
	}
	public void setControlMode(byte controlMode) {
		this.controlMode = controlMode;
	}
}
