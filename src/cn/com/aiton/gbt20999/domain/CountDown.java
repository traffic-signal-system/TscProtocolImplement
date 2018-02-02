package cn.com.aiton.gbt20999.domain;


/**
 * Created by Administrator on 14-2-16.
 * 交通信号机外设中的倒计时相关数据类
 */

public class CountDown {
	//设备ID
    private Long deviceId;
	//倒计时配置ID
    private byte countDownId;
	//相位
    private int phase;
	//跟随相位
    private short overlapPhase;
	//模型
    private byte mode;

   

    @Override
	public String toString() {
		return "CountDown [deviceId=" + deviceId + ", countDownId="
				+ countDownId + ", phase=" + phase + ", overlapPhase="
				+ overlapPhase + ", mode=" + mode + "]";
	}

	public int getPhase() {
		return phase;
	}

	public void setPhase(int phase) {
		this.phase = phase;
	}

	public short getOverlapPhase() {
		return overlapPhase;
	}

	public void setOverlapPhase(short overlapPhase) {
		this.overlapPhase = overlapPhase;
	}

	public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public byte getCountDownId() {
        return countDownId;
    }

    public void setCountDownId(byte countDownId) {
        this.countDownId = countDownId;
    }

   

    public byte getMode() {
        return mode;
    }

    public void setMode(byte mode) {
        this.mode = mode;
    }
}
