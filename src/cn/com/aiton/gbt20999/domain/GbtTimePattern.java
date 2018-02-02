package cn.com.aiton.gbt20999.domain;

/**
 * 信号机的配时方案表
 * @author Administrator
 *
 */
public class GbtTimePattern {
	//设备ID
	private int deviceId;
	//配时方案的方案号
	private byte timePatternId;
	//周期时长
	private byte cycleTime;
	//相位差
	private byte offset;
	//协调相位
	private byte coordinatePhase;
	//阶段配时表号
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
