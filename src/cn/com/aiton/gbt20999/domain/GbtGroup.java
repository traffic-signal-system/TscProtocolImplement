package cn.com.aiton.gbt20999.domain;
/**
 * 信号机群管理，主要在平台对接上使用。
 * @author Administrator
 *
 */
public class GbtGroup {
	//群ID
	private int groupId;
	//域ID
	private int domainId;
	//群名称
	private String groupName;
	//群是否启用
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
