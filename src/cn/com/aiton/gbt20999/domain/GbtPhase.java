package cn.com.aiton.gbt20999.domain;
/**
 * 相位表实体类
 * @author Administrator
 *
 */
public class GbtPhase {
	//设备iD
	private int deviceId;
	//相位ID
	private byte phaseId;
	//行人绿灯时间
	private byte pedestrainGreen;
	//行人绿灯清空时间
	private byte pedestrainClear;
	//最小绿灯时间
	private byte minGreen;
	//绿灯延时时间
	private byte greenDelayUnit;
	//最大绿灯时间1
	private byte maxGreen1;
	//最大绿灯时间2
	private byte maxGreen2;
	//固定绿灯时间
	private byte fixGreen;
	//绿闪
	private byte greenFlash;
	//相位类型
	private byte phaseType;
	//相位选项
	private byte phaseOption;
	//扩展
	private byte extend;
	@Override
	public String toString() {
		return "GbtPhase [deviceId=" + deviceId + ", phaseId=" + phaseId
				+ ", pedestrainGreen=" + pedestrainGreen + ", pedestrainClear="
				+ pedestrainClear + ", minGreen=" + minGreen
				+ ", greenDelayUnit=" + greenDelayUnit + ", maxGreen1="
				+ maxGreen1 + ", maxGreen2=" + maxGreen2 + ", fixGreen="
				+ fixGreen + ", greenFlash=" + greenFlash + ", phaseType="
				+ phaseType + ", phaseOption=" + phaseOption + ", extend="
				+ extend + "]";
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public byte getPhaseId() {
		return phaseId;
	}
	public void setPhaseId(byte phaseId) {
		this.phaseId = phaseId;
	}
	public byte getPedestrainGreen() {
		return pedestrainGreen;
	}
	public void setPedestrainGreen(byte pedestrainGreen) {
		this.pedestrainGreen = pedestrainGreen;
	}
	public byte getPedestrainClear() {
		return pedestrainClear;
	}
	public void setPedestrainClear(byte pedestrainClear) {
		this.pedestrainClear = pedestrainClear;
	}
	public byte getMinGreen() {
		return minGreen;
	}
	public void setMinGreen(byte minGreen) {
		this.minGreen = minGreen;
	}
	public byte getGreenDelayUnit() {
		return greenDelayUnit;
	}
	public void setGreenDelayUnit(byte greenDelayUnit) {
		this.greenDelayUnit = greenDelayUnit;
	}
	public byte getMaxGreen1() {
		return maxGreen1;
	}
	public void setMaxGreen1(byte maxGreen1) {
		this.maxGreen1 = maxGreen1;
	}
	public byte getMaxGreen2() {
		return maxGreen2;
	}
	public void setMaxGreen2(byte maxGreen2) {
		this.maxGreen2 = maxGreen2;
	}
	public byte getFixGreen() {
		return fixGreen;
	}
	public void setFixGreen(byte fixGreen) {
		this.fixGreen = fixGreen;
	}
	public byte getGreenFlash() {
		return greenFlash;
	}
	public void setGreenFlash(byte greenFlash) {
		this.greenFlash = greenFlash;
	}
	public byte getPhaseType() {
		return phaseType;
	}
	public void setPhaseType(byte phaseType) {
		this.phaseType = phaseType;
	}
	public byte getPhaseOption() {
		return phaseOption;
	}
	public void setPhaseOption(byte phaseOption) {
		this.phaseOption = phaseOption;
	}
	public byte getExtend() {
		return extend;
	}
	public void setExtend(byte extend) {
		this.extend = extend;
	}
}
