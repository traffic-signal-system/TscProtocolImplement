package cn.com.aiton.gbt20999.domain;

public class TscNode {
	private int deviceId;
	private int groupId;
	private int groupSequence;
	private String deviceName;
	private String ipAddress;
	private int port;
	private String version;
	private int linkType;
	private int protocolType;
	@Override
	public String toString() {
		return "Node [deviceId=" + deviceId + ", groupId=" + groupId
				+ ", groupSequence=" + groupSequence + ", deviceName="
				+ deviceName + ", ipAddress=" + ipAddress + ", port=" + port
				+ ", version=" + version + ", linkType=" + linkType
				+ ", protocolType=" + protocolType + "]";
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getGroupSequence() {
		return groupSequence;
	}
	public void setGroupSequence(int groupSequence) {
		this.groupSequence = groupSequence;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getLinkType() {
		return linkType;
	}
	public void setLinkType(int linkType) {
		this.linkType = linkType;
	}
	public int getProtocolType() {
		return protocolType;
	}
	public void setProtocolType(int protocolType) {
		this.protocolType = protocolType;
	}
}
