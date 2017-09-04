package cn.com.aiton.gbt20999.domain;

import java.util.Date;

public class GbtTrafficStatistics {
	private long deviceId;
	private byte detectorId;
	private Date recordTime;
	@Override
	public String toString() {
		return "GbtTrafficStatistics [deviceId=" + deviceId + ", detectorId="
				+ detectorId + ", recordTime=" + recordTime + ", sumVolume="
				+ sumVolume + ", avgOccupancy=" + avgOccupancy
				+ ", maxOccupancy=" + maxOccupancy + ", minOccupancy="
				+ minOccupancy + "]";
	}
	public long getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(long deviceId) {
		this.deviceId = deviceId;
	}
	public byte getDetectorId() {
		return detectorId;
	}
	public void setDetectorId(byte detectorId) {
		this.detectorId = detectorId;
	}
	public Date getRecordTime() {
		return recordTime;
	}
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}
	public long getSumVolume() {
		return sumVolume;
	}
	public void setSumVolume(long sumVolume) {
		this.sumVolume = sumVolume;
	}
	public int getAvgOccupancy() {
		return avgOccupancy;
	}
	public void setAvgOccupancy(int avgOccupancy) {
		this.avgOccupancy = avgOccupancy;
	}
	public int getMaxOccupancy() {
		return maxOccupancy;
	}
	public void setMaxOccupancy(int maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
	}
	public int getMinOccupancy() {
		return minOccupancy;
	}
	public void setMinOccupancy(int minOccupancy) {
		this.minOccupancy = minOccupancy;
	}
	private long sumVolume;
	private int  avgOccupancy;
	private int maxOccupancy;
	private int minOccupancy;
}
