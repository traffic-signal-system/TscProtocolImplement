package cn.com.aiton.gbt20999.domain;

public class GbtTimePattern {
	private int deviceId;
	private byte timePatternId;
	private byte cycleTime;
	private byte offset;
	private byte coordinatePhase;
	private byte stagePatternId;
	@Override
	public String toString() {
		return "GbtTimePattern [deviceId=" + deviceId + ", timePatternId="
				+ timePatternId + ", cycleTime=" + cycleTime + ", offset="
				+ offset + ", coordinatePhase=" + coordinatePhase
				+ ", stagePatternId=" + stagePatternId + "]";
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public byte getTimePatternId() {
		return timePatternId;
	}
	public void setTimePatternId(byte timePatternId) {
		this.timePatternId = timePatternId;
	}
	public byte getCycleTime() {
		return cycleTime;
	}
	public void setCycleTime(byte cycleTime) {
		this.cycleTime = cycleTime;
	}
	public byte getOffset() {
		return offset;
	}
	public void setOffset(byte offset) {
		this.offset = offset;
	}
	public byte getCoordinatePhase() {
		return coordinatePhase;
	}
	public void setCoordinatePhase(byte coordinatePhase) {
		this.coordinatePhase = coordinatePhase;
	}
	public byte getStagePatternId() {
		return stagePatternId;
	}
	public void setStagePatternId(byte stagePatternId) {
		this.stagePatternId = stagePatternId;
	}
}
