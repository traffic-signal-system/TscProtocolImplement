package cn.com.aiton.gbt20999.domain;
/**
 * 信号机的配置数据
 * @author Administrator
 *
 */
public class GbtConfig {
	//设备ID
	private int deviceId;
	//配置ID
	private String configId;
	//配置内容，不同的配置项目有不同的数据含义，具体请查看说明书
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
