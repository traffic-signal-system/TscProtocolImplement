package cn.com.aiton.gbt20999.domain;

/**
 * 检测器日志实体类
 * @author Administrator
 *
 */
public class GbtEventLog {

	//设备ID
    private int deviceId;
	//日志ID
    private byte logId;
	//日志类型
    private byte eventType;
	//时间，用格林威志表示时间1970 1 1 0 0 0 开始
    private int happenTime;
	//日志内容
    private int eventValue;
	//字条串表示时间
    private String eventTime;
	//字符串表示内容
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
