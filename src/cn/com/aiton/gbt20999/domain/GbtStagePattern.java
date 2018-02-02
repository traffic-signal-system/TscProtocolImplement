package cn.com.aiton.gbt20999.domain;
/**
 * 阶段配时表
 * @author Administrator
 *
 */
public class GbtStagePattern {
	//设备ID
	private int deviceId;
	//阶段配时号
	private byte stagePatternId;
	//阶段号
	private byte stageId;
	//放行相位
	private int allowPhase;
	//阶段绿灯时间
	private byte greenTime;
	//阶段黄灯时间
	private byte yellowTime;
	//阶段红灯时间
	private byte redTime;
	//阶段选项参数 
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
	public int getAllowPhase() {
		return allowPhase;
	}
	public void setAllowPhase(int allowPhase) {
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
