package cn.com.aiton.gbt20999.domain;

/**
 * 通道输出内容，其中包括通道ID，红灯，绿灯，黄灯
 * @author Administrator
 *
 */
public class GbtChannelOutput {
	//通道 ID
	private byte rowId;
	//红灯数据
	private byte red;
	//黄灯数据
	private byte yellow;
	//绿灯数据
	private byte green;
	public byte getRowId() {
		return rowId;
	}
	public void setRowId(byte rowId) {
		this.rowId = rowId;
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
