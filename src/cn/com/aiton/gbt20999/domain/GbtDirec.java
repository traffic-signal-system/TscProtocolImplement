package cn.com.aiton.gbt20999.domain;

/**
 * 路口方向实体类
 * @author Administrator
 *
 */
public class GbtDirec {
	//设备编号，这个统一是平台中取得的数据。单机使用并要不可用
	private int deviceId;
	//方向ID，结合方向定义表使用
	private byte direcId;
	//相位ID
	private byte phaseId;
	//跟随相位ID
	private byte overlapId;
	//车道数量
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
