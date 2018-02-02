package cn.com.aiton.gbt20999.domain;

/**
 * 检测器状态VO对象
 * @author Administrator
 *
 */
public class GbtDetectorStatus {
	//检测器编号ID
	private byte detectorStatusId;
	//检测器状态
	private byte detectorStatus;
	//检测器报警
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
