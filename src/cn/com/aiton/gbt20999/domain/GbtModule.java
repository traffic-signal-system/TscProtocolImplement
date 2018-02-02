package cn.com.aiton.gbt20999.domain;
/**
 * 信号机模块配置相关的数据，
 * @author Administrator
 *
 */
public class GbtModule {
	//设备ID
	private int deviceId;
	//模块ID，主要包括电源板；控制板；车检板；接口板；灯驱板；机载显示板
	private byte moduleId;
	//设备节点
	private String deviceNode;
	//厂家
	private String factory;
	//模型
	private String model;
	//版本
	private String version;
	//类型
	private byte type;
	@Override
	public String toString() {
		return "GbtModule [deviceId=" + deviceId + ", moduleId=" + moduleId
				+ ", deviceNode=" + deviceNode + ", factory=" + factory
				+ ", model=" + model + ", version=" + version + ", type="
				+ type + "]";
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public byte getModuleId() {
		return moduleId;
	}
	public void setModuleId(byte moduleId) {
		this.moduleId = moduleId;
	}
	public String getDeviceNode() {
		return deviceNode;
	}
	public void setDeviceNode(String deviceNode) {
		this.deviceNode = deviceNode;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public byte getType() {
		return type;
	}
	public void setType(byte type) {
		this.type = type;
	}
}
