package cn.com.aiton.gbt20999.domain;

/**
 * 绿冲突实体类
 * @author Administrator
 *
 */
public class GbtCollision {
	//相位号
	private byte phaseId;
	//标志，0表示不冲突 1表示冲突
	private int flag;

	public byte getPhaseId() {
		return phaseId;
	}
	public void setPhaseId(byte phaseId) {
		this.phaseId = phaseId;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "GbtCollision [phaseId=" + phaseId + ", flag=" + flag + "]";
	}
	
}
