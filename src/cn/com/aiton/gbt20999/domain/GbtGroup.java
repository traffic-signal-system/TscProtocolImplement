package cn.com.aiton.gbt20999.domain;

public class GbtGroup {
	private int groupId;
	private int domainId;
	private String groupName;
	private int groupEnable;
	@Override
	public String toString() {
		return "GbtGroup [groupId=" + groupId + ", domainId=" + domainId
				+ ", groupName=" + groupName + ", groupEnable=" + groupEnable + "]";
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getDomainId() {
		return domainId;
	}
	public void setDomainId(int domainId) {
		this.domainId = domainId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getGroupEnable() {
		return groupEnable;
	}
	public void setGroupEnable(int groupEnable) {
		this.groupEnable = groupEnable;
	}
}
