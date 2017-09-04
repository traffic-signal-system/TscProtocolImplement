package cn.com.aiton.gbt20999.domain;

public class GbtStagePattern16Phase {
	private int deviceId;
	private byte stagePatternId;
	private byte stageId;
	private short allowPhase;
	private byte greenTime;
	private byte yellowTime;
	private byte redTime;
	private byte option;
	@Override
	public String toString() {
		return "GbtStagePattern [deviceId=" + deviceId + ", stagePatternId="
				+ stagePatternId + ", stageId=" + stageId + ", allowPhase="
				+ allowPhase + ", greenTime=" + greenTime + ", yellowTime="
				+ yellowTime + ", redTime=" + redTime + ", option=" + option
				+ "]";
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public byte getStagePatternId() {
		return stagePatternId;
	}
	public void setStagePatternId(byte stagePatternId) {
		this.stagePatternId = stagePatternId;
	}
	public byte getStageId() {
		return stageId;
	}
	public void setStageId(byte stageId) {
		this.stageId = stageId;
	}
	public short getAllowPhase() {
		return allowPhase;
	}
	public void setAllowPhase(short allowPhase) {
		this.allowPhase = allowPhase;
	}
	public byte getGreenTime() {
		return greenTime;
	}
	public void setGreenTime(byte greenTime) {
		this.greenTime = greenTime;
	}
	public byte getYellowTime() {
		return yellowTime;
	}
	public void setYellowTime(byte yellowTime) {
		this.yellowTime = yellowTime;
	}
	public byte getRedTime() {
		return redTime;
	}
	public void setRedTime(byte redTime) {
		this.redTime = redTime;
	}
	public byte getOption() {
		return option;
	}
	public void setOption(byte option) {
		this.option = option;
	}
}
