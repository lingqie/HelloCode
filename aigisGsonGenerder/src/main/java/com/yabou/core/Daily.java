package com.yabou.core;

import java.util.List;

public class Daily {
	private int no;
	private String dailyJPName;
	private List<Mission> missions;
	
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
		this.missions = missions;
	}
	public String getDailyJPName() {
		return dailyJPName;
	}
	public void setDailyJPName(String dailyJPName) {
		this.dailyJPName = dailyJPName;
	}	
}
