package cn.com.aiton.gbt20999.domain;

/**
 * 信号机通道相关的实体类，
 * @author Administrator
 *
 */
public class GbtChannel {
	//设备ID
	private int deviceId;
	//通道ID
	private byte channelId;
	//控制相位
	private byte controlSource;
	//闪灯控制
	private byte autoFlashControl;
	//控制类型
	private byte controlType;
	@Override
	public String toString() {
		return "GbtChannel [deviceId=" + deviceId + ", channelId=" + channelId
				+ ", controlSource=" + controlSource + ", autoFlashControl="
				+ autoFlashControl + ", controlType=" + controlType + "]";
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public byte getChannelId() {
		return channelId;
	}
	public void setChannelId(byte channelId) {
		this.channelId = channelId;
	}
	public byte getControlSource() {
		return controlSource;
	}
	public void setControlSource(byte controlSource) {
		this.controlSource = controlSource;
	}
	public byte getAutoFlashControl() {
		return autoFlashControl;
	}
	public void setAutoFlashControl(byte autoFlashControl) {
		this.autoFlashControl = autoFlashControl;
	}
	public byte getControlType() {
		return controlType;
	}
	public void setControlType(byte controlType) {
		this.controlType = controlType;
	}
}
