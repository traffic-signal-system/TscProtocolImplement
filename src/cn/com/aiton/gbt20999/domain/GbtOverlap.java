package cn.com.aiton.gbt20999.domain;

/**
 * 跟随相位实体类
 * @author Administrator
 *
 */
public class GbtOverlap {
	//设备ID
	private int deviceId;
	//跟随相位ID
	private byte overlapId;
	//跟随相位类型
	private byte overlapType;
	//包含相位数量
	private byte includePhaseCount;
	//包含相位，以,分隔
	private String includePhase;
	//修正相位数量
	private byte amendPhaseCount;
	//修正相位，以，分开
	private String amendPhase;
	//绿灯时间
	private byte tailGreen;
	//黄灯时间
	private byte tailYellow;
	//红灯时间
	private byte tailRed;
	
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public byte getOverlapId() {
		return overlapId;
	}
	public void setOverlapId(byte overlapId) {
		this.overlapId = overlapId;
	}
	public byte getOverlapType() {
		return overlapType;
	}
	public void setOverlapType(byte overlapType) {
		this.overlapType = overlapType;
	}
	public byte getIncludePhaseCount() {
		return includePhaseCount;
	}
	public void setIncludePhaseCount(byte includePhaseCount) {
		this.includePhaseCount = includePhaseCount;
	}
	
	public byte getAmendPhaseCount() {
		return amendPhaseCount;
	}
	public void setAmendPhaseCount(byte amendPhaseCount) {
		this.amendPhaseCount = amendPhaseCount;
	}
	
	@Override
	public String toString() {
		return "GbtOverlap [deviceId=" + deviceId + ", overlapId=" + overlapId
				+ ", overlapType=" + overlapType + ", includePhaseCount="
				+ includePhaseCount + ", includePhase=" + includePhase
				+ ", amendPhaseCount=" + amendPhaseCount + ", amendPhase="
				+ amendPhase + ", tailGreen=" + tailGreen + ", tailYellow="
				+ tailYellow + ", tailRed=" + tailRed + "]";
	}
	public String getIncludePhase() {
		return includePhase;
	}
	public void setIncludePhase(String includePhase) {
		this.includePhase = includePhase;
	}
	public String getAmendPhase() {
		return amendPhase;
	}
	public void setAmendPhase(String amendPhase) {
		this.amendPhase = amendPhase;
	}
	public byte getTailGreen() {
		return tailGreen;
	}
	public void setTailGreen(byte tailGreen) {
		this.tailGreen = tailGreen;
	}
	public byte getTailYellow() {
		return tailYellow;
	}
	public void setTailYellow(byte tailYellow) {
		this.tailYellow = tailYellow;
	}
	public byte getTailRed() {
		return tailRed;
	}
	public void setTailRed(byte tailRed) {
		this.tailRed = tailRed;
	}

}
