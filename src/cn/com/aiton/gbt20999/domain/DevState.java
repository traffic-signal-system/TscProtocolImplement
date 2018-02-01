package cn.com.aiton.gbt20999.domain;

/**
 * 信号机的双向门是否被打开；信号机的温度；信号机的湿度；信号机的电压；信号机的震动
 * @author Administrator
 *
 */
public class DevState {
	/**
	 * 信号机的双向门是否被打开
	 */
	private int door;
	//信号机的温度
	private int temp;
	//信号机的湿度
	private int humidity;
	//信号机的电压；
	private int voltage;
	//信号机的震动
	private int shock;
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public int getVoltage() {
		return voltage;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public int getShock() {
		return shock;
	}
	public void setShock(int shock) {
		this.shock = shock;
	}
	@Override
	public String toString() {
		return "DevState [door=" + door + ", temp=" + temp + ", humidity=" + humidity + ", voltage=" + voltage
				+ ", shock=" + shock + "]";
	}
	
}
