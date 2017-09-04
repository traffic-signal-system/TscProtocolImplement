package cn.com.aiton.gbt20999.domain;

public class GbtDetector {

	private byte detectorId;
	private byte phaseId;
	private byte detectorType;
	private byte direc;
	private byte requestEffectTime;
	private byte detectorOption;
	private short saturationVolume;
	private byte saturationOccupancy;


	public byte getDetectorId() {
		return detectorId;
	}
	public void setDetectorId(byte detectorId) {
		this.detectorId = detectorId;
	}
	public byte getPhaseId() {
		return phaseId;
	}
	public void setPhaseId(byte phaseId) {
		this.phaseId = phaseId;
	}
	public byte getDetectorType() {
		return detectorType;
	}
	public void setDetectorType(byte detectorType) {
		this.detectorType = detectorType;
	}
	public byte getDirec() {
		return direc;
	}
	public void setDirec(byte direc) {
		this.direc = direc;
	}
	public short getSaturationVolume() {
		return saturationVolume;
	}
	public void setSaturationVolume(short saturationVolume) {
		this.saturationVolume = saturationVolume;
	}
	public byte getSaturationOccupancy() {
		return saturationOccupancy;
	}
	public void setSaturationOccupancy(byte saturationOccupancy) {
		this.saturationOccupancy = saturationOccupancy;
	}
	public byte getRequestEffectTime() {
		return requestEffectTime;
	}
	public void setRequestEffectTime(byte requestEffectTime) {
		this.requestEffectTime = requestEffectTime;
	}
	public byte getDetectorOption() {
		return detectorOption;
	}
	public void setDetectorOption(byte detectorOption) {
		this.detectorOption = detectorOption;
	}
	@Override
	public String toString() {
		return "GbtDetector [detectorId=" + detectorId + ", phaseId=" + phaseId
				+ ", detectorType=" + detectorType + ", direc=" + direc
				+ ", requestEffectTime=" + requestEffectTime
				+ ", detectorOption=" + detectorOption + ", saturationVolume="
				+ saturationVolume + ", saturationOccupancy="
				+ saturationOccupancy + "]";
	}
	
}
