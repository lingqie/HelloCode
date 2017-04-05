package com.yabou.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Daily {
	private int no;
	private String dailyJPName;
	private List<Mission> missions;
	private int size;
	
	public Daily(String JpName,int no) {
		this.dailyJPName=JpName;
		this.no=no;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public List<Mission> getMissions() {
		return missions;
	}
	public void setMissions(List<Mission> missions) {
		for (Mission mission : missions) {
			mission.setDailyNo(this.no);
			mission.setDailyJPName(this.dailyJPName);
		}
		this.missions = missions;
		this.setSize(missions.size());
	}
	public String getDailyJPName() {
		return dailyJPName;
	}
	public void setDailyJPName(String dailyJPName) {
		this.dailyJPName = dailyJPName;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
