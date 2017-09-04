package cn.com.aiton.gbt20999.domain;

public class GbtDirec {
	private int deviceId;
	private byte direcId;
	private byte phaseId;
	private byte overlapId;
	private byte roadCount;
	@Override
	public String toString() {
		return "GbtDirec [deviceId=" + deviceId + ", direcId=" + direcId
				+ ", phaseId=" + phaseId + ", overlapId=" + overlapId
				+ ", roadCount=" + roadCount + "]";
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public byte getDirecId() {
		return direcId;
	}
	public void setDirecId(byte direcId) {
		this.direcId = direcId;
	}
	public byte getPhaseId() {
		return phaseId;
	}
	public void setPhaseId(byte phaseId) {
		this.phaseId = phaseId;
	}
	public byte getOverlapId() {
		return overlapId;
	}
	public void setOverlapId(byte overlapId) {
		this.overlapId = overlapId;
	}
	public byte getRoadCount() {
		return roadCount;
	}
	public void setRoadCount(byte roadCount) {
		this.roadCount = roadCount;
	}
}
