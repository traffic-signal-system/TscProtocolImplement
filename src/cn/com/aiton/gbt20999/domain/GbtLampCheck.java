package cn.com.aiton.gbt20999.domain;

/**
 * 灯泡检测模型表
 * @author Administrator
 *
 */
public class GbtLampCheck {
	//主键
    private Long id;
	//设备ID
    private Long deviceId;
	//灯炮ID
    private int lampId;
	//灯炮标志信，0表示不进行检测，1表示检测
    private int lampFlag;

    @Override
    public String toString() {
        return "GbtLampCheck{" +
                "id=" + id +
                ", deviceId=" + deviceId +
                ", lampId=" + lampId +
                ", lampFlag=" + lampFlag +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public int getLampId() {
        return lampId;
    }

    public void setLampId(int lampId) {
        this.lampId = lampId;
    }

    public int getLampFlag() {
        return lampFlag;
    }

    public void setLampFlag(int lampFlag) {
        this.lampFlag = lampFlag;
    }
}
