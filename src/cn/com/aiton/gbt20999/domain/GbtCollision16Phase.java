package cn.com.aiton.gbt20999.domain;
/**
 * 绿冲突16相位信号机专用
 * @author Administrator
 *
 */
public class GbtCollision16Phase {
	//相位号
	private byte phaseId;
	//标志 0表示不冲突 ，1表示冲突
	private short flag;

	public byte getPhaseId() {
		return phaseId;
	}
	public void setPhaseId(byte phaseId) {
		this.phaseId = phaseId;
	}
	public short getFlag() {
		return flag;
	}
	public void setFlag(short flag) {
		this.flag = flag;
	}

	
}
