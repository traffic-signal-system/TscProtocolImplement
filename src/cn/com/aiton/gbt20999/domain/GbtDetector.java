package cn.com.aiton.gbt20999.domain;
/**
 * 车检器实体类
 * @author Administrator
 *
 */
public class GbtDetector {
//车检器编号 
	private byte detectorId;
	//相位ID
	private byte phaseId;
	//车检测器类型
	private byte detectorType;
	//方向
	private byte direc;
	//时间
	private byte requestEffectTime;
	//检测器选项
	private byte detectorOption;
	//饱和度值
	private short saturationVolume;
	//饱和度占有率
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
