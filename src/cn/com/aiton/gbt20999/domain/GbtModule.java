package cn.com.aiton.gbt20999.domain;

public class GbtModule {
	private int deviceId;
	private byte moduleId;
	private String deviceNode;
	private String factory;
	private String model;
	private String version;
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
