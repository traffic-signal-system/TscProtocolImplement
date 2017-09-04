package cn.com.aiton.gbt20999.domain;

public class GbtCollision {
	
	private byte phaseId;
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
