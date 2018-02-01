package cn.com.aiton.gbt20999.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 交通信号机主动上报实体类，用于将实时数据上报
 * @author Administrator
 *
 */
public class ExtReportState implements Serializable{
	/**
	 * 动态数据
	 */
	private static final long serialVersionUID = 1L;
	private  String workModel;	//工作模式
    private  String workStatus;	//工作状态
    private  String controlModel; //控制方式
    private  int currentSchedule;//当前时段
    private  int currentTimePattern;//当前配时方案
    private  int currentStagePattern;//当前阶段配时
    private  int stageCount;//步总数
    private  int currentStage;//当前步
    private  int stageTotalTime;//当前阶段总时间（所有步时间和，包括当前相位绿灯，黄灯，红灯的时间）
    private  int stageRunTime;//已运行时间
    private  List<Integer> listChannelRedStatus;//亮红灯的通道号数组
    private  List<Integer> listChannelYellowStatus;//亮黄灯的通道号数组
    private  List<Integer> listChannelGreenStatus;//亮绿灯的通道号数组
    private  List<Integer> listChannelFlashStatus;//亮闪灯的通道号数组
    private  int cycleTime;//周期
    private  Boolean resportTscStatusFlag = false;//
	private int basetime;

	public int getBasetime() {
		return basetime;
	}

	public void setBasetime(int basetime) {
		this.basetime = basetime;
	}

	public String getWorkModel() {
		return workModel;
	}
	public void setWorkModel(String workModel) {
		this.workModel = workModel;
	}
	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	public String getControlModel() {
		return controlModel;
	}
	public void setControlModel(String controlModel) {
		this.controlModel = controlModel;
	}
	public int getCurrentSchedule() {
		return currentSchedule;
	}
	public void setCurrentSchedule(int currentSchedule) {
		this.currentSchedule = currentSchedule;
	}
	public int getCurrentTimePattern() {
		return currentTimePattern;
	}
	public void setCurrentTimePattern(int currentTimePattern) {
		this.currentTimePattern = currentTimePattern;
	}
	public int getCurrentStagePattern() {
		return currentStagePattern;
	}
	public void setCurrentStagePattern(int currentStagePattern) {
		this.currentStagePattern = currentStagePattern;
	}
	public int getStageCount() {
		return stageCount;
	}
	public void setStageCount(int stageCount) {
		this.stageCount = stageCount;
	}
	public int getCurrentStage() {
		return currentStage;
	}
	public void setCurrentStage(int currentStage) {
		this.currentStage = currentStage;
	}
	public int getStageTotalTime() {
		return stageTotalTime;
	}
	public void setStageTotalTime(int stageTotalTime) {
		this.stageTotalTime = stageTotalTime;
	}
	public int getStageRunTime() {
		return stageRunTime;
	}
	public void setStageRunTime(int stageRunTime) {
		this.stageRunTime = stageRunTime;
	}
	public List<Integer> getListChannelRedStatus() {
		return listChannelRedStatus;
	}
	public void setListChannelRedStatus(List<Integer> listChannelRedStatus) {
		this.listChannelRedStatus = listChannelRedStatus;
	}
	public List<Integer> getListChannelYellowStatus() {
		return listChannelYellowStatus;
	}
	public void setListChannelYellowStatus(List<Integer> listChannelYellowStatus) {
		this.listChannelYellowStatus = listChannelYellowStatus;
	}
	public List<Integer> getListChannelGreenStatus() {
		return listChannelGreenStatus;
	}
	public void setListChannelGreenStatus(List<Integer> listChannelGreenStatus) {
		this.listChannelGreenStatus = listChannelGreenStatus;
	}
	public List<Integer> getListChannelFlashStatus() {
		return listChannelFlashStatus;
	}
	public void setListChannelFlashStatus(List<Integer> listChannelFlashStatus) {
		this.listChannelFlashStatus = listChannelFlashStatus;
	}
	public int getCycleTime() {
		return cycleTime;
	}
	public void setCycleTime(int cycleTime) {
		this.cycleTime = cycleTime;
	}
	public Boolean getResportTscStatusFlag() {
		return resportTscStatusFlag;
	}
	public void setResportTscStatusFlag(Boolean resportTscStatusFlag) {
		this.resportTscStatusFlag = resportTscStatusFlag;
	}
	
}
