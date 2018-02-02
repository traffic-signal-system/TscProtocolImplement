package cn.com.aiton.gbt20999.domain;
/**
 * 信号机阶段配置
 * @author Administrator
 *
 */
public class GbtStagePattern16Phase {
	//设备ID
	private int deviceId;
	//阶段配置ID
	private byte stagePatternId;
	//阶段ID
	private byte stageId;
	//允许相位
	private short allowPhase;
	//绿灯时间
	private byte greenTime;
	//黄灯时间
	private byte yellowTime;
	//红灯时间
	private byte redTime;
	//配置选项
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
