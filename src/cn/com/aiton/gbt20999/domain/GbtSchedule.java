package cn.com.aiton.gbt20999.domain;

/**
 * 信号机时段表
 * @author Administrator
 *
 */
public class GbtSchedule {
	//设备iD
	private int deviceId;
	//时段表ID
	private byte scheduleId;
	//事件ID
	private byte eventId;
	//开始小时
	private byte beginHour;
	//开始分钟
	private byte beginMinute;
	//控制模式
	private byte controlMode;
	//配时表ID
	private byte timePatternId;
	//基本
	private byte auxOut;
	//特殊
	private byte specialOut;
	@Override
	public String toString() {
		return "GbtSchedule [deviceId=" + deviceId + ", scheduleId="
				+ scheduleId + ", eventId=" + eventId + ", beginHour="
				+ beginHour + ", beginMinute=" + beginMinute + ", controlMode="
				+ controlMode + ", timePatternId=" + timePatternId
				+ ", auxOut=" + auxOut + ", specialOut=" + specialOut + "]";
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
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
	public byte getControlMode() {
		return controlMode;
	}
	public void setControlMode(byte controlMode) {
		this.controlMode = controlMode;
	}
	public byte getTimePatternId() {
		return timePatternId;
	}
	public void setTimePatternId(byte timePatternId) {
		this.timePatternId = timePatternId;
	}
	public byte getAuxOut() {
		return auxOut;
	}
	public void setAuxOut(byte auxOut) {
		this.auxOut = auxOut;
	}
	public byte getSpecialOut() {
		return specialOut;
	}
	public void setSpecialOut(byte specialOut) {
		this.specialOut = specialOut;
	}
}
