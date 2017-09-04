package cn.com.aiton.gbt20999.domain;

public class GbtDetectData {
	private byte detectorId;
	private byte allFlow;
	private byte bigVehicleFlow;
	private byte smallVehicleFlow;
	private byte occupancy;
	private byte speed;
	private byte vehicleLength;
	public byte getDetectorId() {
		return detectorId;
	}
	public void setDetectorId(byte detectorId) {
		this.detectorId = detectorId;
	}
	public byte getAllFlow() {
		return allFlow;
	}
	public void setAllFlow(byte allFlow) {
		this.allFlow = allFlow;
	}
	public byte getBigVehicleFlow() {
		return bigVehicleFlow;
	}
	public void setBigVehicleFlow(byte bigVehicleFlow) {
		this.bigVehicleFlow = bigVehicleFlow;
	}
	public byte getSmallVehicleFlow() {
		return smallVehicleFlow;
	}
	public void setSmallVehicleFlow(byte smallVehicleFlow) {
		this.smallVehicleFlow = smallVehicleFlow;
	}
	public byte getOccupancy() {
		return occupancy;
	}
	public void setOccupancy(byte occupancy) {
		this.occupancy = occupancy;
	}
	public byte getSpeed() {
		return speed;
	}
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	public byte getVehicleLength() {
		return vehicleLength;
	}
	public void setVehicleLength(byte vehicleLength) {
		this.vehicleLength = vehicleLength;
	}
	
}
