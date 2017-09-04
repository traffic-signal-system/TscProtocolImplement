package cn.com.aiton.gbt20999.domain;

public class GbtChannel {
	private int deviceId;
	private byte channelId;
	private byte controlSource;
	private byte autoFlashControl;
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
