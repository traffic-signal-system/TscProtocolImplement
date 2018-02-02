package cn.com.aiton.gbt20999.domain;
/**
 * 检测器数据，体现检测过车的数据。
 * @author Administrator
 *
 */
public class GbtDetectData {
	//检测器编号 
	private byte detectorId;
	//所有车流量
	private byte allFlow;
	//大车流量 
	private byte bigVehicleFlow;
	//小车流量
	private byte smallVehicleFlow;
	//占有率
	private byte occupancy;
	//车速度
	private byte speed;
	//车头时距
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
