package cn.com.aiton.gbt20999.domain;


public class GbtLampCheck {
    private Long id;
    private Long deviceId;
    private int lampId;
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
