package cn.com.aiton.gbt20999.domain;
/**
 * 检测器告警表
 * @author Administrator
 *
 */
public class GbtDetectorWarm {
	//检测器ID
	private byte detectorId;
	//告警状态
	private byte warmStatus;
	//告警
	private byte coilWarm;
	public byte getDetectorId() {
		return detectorId;
	}
	public void setDetectorId(byte detectorId) {
		this.detectorId = detectorId;
	}
	public byte getWarmStatus() {
		return warmStatus;
	}
	public void setWarmStatus(byte warmStatus) {
		this.warmStatus = warmStatus;
	}
	public byte getCoilWarm() {
		return coilWarm;
	}
	public void setCoilWarm(byte coilWarm) {
		this.coilWarm = coilWarm;
	}
	
}
	