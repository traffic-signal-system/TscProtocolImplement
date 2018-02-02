package cn.com.aiton.gbt20999.domain;
/**
 * 跟随相位的运行时的状态
 * @author Administrator
 *
 */
public class GbtOverlapStatus {
	//跟随相位ID
	private byte overlapId;
	//红灯
	private byte red;
	//黄灯
	private byte yellow;
	//绿灯
	private byte green;
	public byte getOverlapId() {
		return overlapId;
	}
	public void setOverlapId(byte overlapId) {
		this.overlapId = overlapId;
	}
	public byte getRed() {
		return red;
	}
	public void setRed(byte red) {
		this.red = red;
	}
	public byte getYellow() {
		return yellow;
	}
	public void setYellow(byte yellow) {
		this.yellow = yellow;
	}
	public byte getGreen() {
		return green;
	}
	public void setGreen(byte green) {
		this.green = green;
	}
	
}
