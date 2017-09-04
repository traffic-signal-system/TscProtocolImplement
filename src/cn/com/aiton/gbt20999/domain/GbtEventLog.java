package cn.com.aiton.gbt20999.domain;


public class GbtEventLog {

    private int deviceId;
    private byte logId;
    private byte eventType;
    private int happenTime;
    private int eventValue;
    private String eventTime;
    private String eventLogDesc;

	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public byte getLogId() {
		return logId;
	}
	public void setLogId(byte logId) {
		this.logId = logId;
	}
	public byte getEventType() {
		return eventType;
	}
	public void setEventType(byte eventType) {
		this.eventType = eventType;
	}
	public int getHappenTime() {
		return happenTime;
	}
	public void setHappenTime(int happenTime) {
		this.happenTime = happenTime;
	}
	public int getEventValue() {
		return eventValue;
	}
	public void setEventValue(int eventValue) {
		this.eventValue = eventValue;
	}
	public String getEventTime() {
		return eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}
	public String getEventLogDesc() {
		return eventLogDesc;
	}
	public void setEventLogDesc(String eventLogDesc) {
		this.eventLogDesc = eventLogDesc;
	}

  
}
