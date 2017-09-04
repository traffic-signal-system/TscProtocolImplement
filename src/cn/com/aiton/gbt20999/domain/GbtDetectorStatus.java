package cn.com.aiton.gbt20999.domain;

public class GbtDetectorStatus {
	private byte detectorStatusId;
	private byte detectorStatus;
	private byte detectorStatusAlarm;
	public byte getDetectorStatusId() {
		return detectorStatusId;
	}
	public void setDetectorStatusId(byte detectorStatusId) {
		this.detectorStatusId = detectorStatusId;
	}
	public byte getDetectorStatus() {
		return detectorStatus;
	}
	public void setDetectorStatus(byte detectorStatus) {
		this.detectorStatus = detectorStatus;
	}
	public byte getDetectorStatusAlarm() {
		return detectorStatusAlarm;
	}
	public void setDetectorStatusAlarm(byte detectorStatusAlarm) {
		this.detectorStatusAlarm = detectorStatusAlarm;
	}
	
}
