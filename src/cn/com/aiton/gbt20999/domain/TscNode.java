package cn.com.aiton.gbt20999.domain;
/**
 * 信号节点对象
 * @author Administrator
 *
 */
public class TscNode {
	//设备ID
	private int deviceId;
	//群ID
	
	private int groupId;
	//一个群里节点序号，一个群组排名
	private int groupSequence;
	//设备名称
	private String deviceName;
	//IP地址
	private String ipAddress;
	//端口
	private int port;
	//版本
	private String version;
	//连接类型
	private int linkType;
	//通信协议
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
