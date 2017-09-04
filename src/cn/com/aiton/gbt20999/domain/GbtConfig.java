package cn.com.aiton.gbt20999.domain;

public class GbtConfig {
	private int deviceId;
	private String configId;
	private String configData;
	@Override
	public String toString() {
		return "GbtConfig [deviceId=" + deviceId + ", configId=" + configId
				+ ", configData=" + configData + "]";
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public String getConfigId() {
		return configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}
	public String getConfigData() {
		return configData;
	}
	public void setConfigData(String configData) {
		this.configData = configData;
	}
}
