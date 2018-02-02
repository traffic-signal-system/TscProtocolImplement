package cn.com.aiton.gbt20999.domain;
/**
 * 信号机群的阶段配时表的数据内容
 * @author Administrator
 *
 */
public class GbtGroupTimePattern {
	//群ID
	private int groupId;
	//阶段配时表的主键ID
	private byte timePatternId;
	//周期时间
	private byte cycleTime;
	//协调时间
	private String offset;
	//协调相位
	private String coordPhase;
	//阶段表ID
	private byte stagePatternId;
	@Override
	public String toString() {
		return "GbtGroupTimePattern [groupId=" + groupId + ", timePatternId="
				+ timePatternId + ", cycleTime=" + cycleTime + ", offset="
				+ offset + ", coordPhase=" + coordPhase + ", stagePatternId="
				+ stagePatternId + "]";
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public byte getTimePatternId() {
		return timePatternId;
	}
	public void setTimePatternId(byte timePatternId) {
		this.timePatternId = timePatternId;
	}
	public byte getCycleTime() {
		return cycleTime;
	}
	public void setCycleTime(byte cycleTime) {
		this.cycleTime = cycleTime;
	}
	public String getOffset() {
		return offset;
	}
	public void setOffset(String offset) {
		this.offset = offset;
	}
	public String getCoordPhase() {
		return coordPhase;
	}
	public void setCoordPhase(String coordPhase) {
		this.coordPhase = coordPhase;
	}
	public byte getStagePatternId() {
		return stagePatternId;
	}
	public void setStagePatternId(byte stagePatternId) {
		this.stagePatternId = stagePatternId;
	}
}
