package com.yabou.core;

import java.util.List;

public class Mission{
	private int tiLi;
	private int meiLi;
	private String missionJPName;
	private List<Char> dropItems;
	private int dailyNo;
	private String dailyJPName;
	
	public Mission(String JpName,int tiLi,int meiLi) {
		this.missionJPName=JpName;
		this.tiLi=tiLi;
		this.meiLi=meiLi;
	}
	
	public int getTiLi() {
		return tiLi;
	}
	public void setTiLi(int tiLi) {
		this.tiLi = tiLi;
	}
	public int getMeiLi() {
		return meiLi;
	}
	public void setMeiLi(int meiLi) {
		this.meiLi = meiLi;
	}
	public String getMissionJPName() {
		return missionJPName;
	}
	public void setMissionJPName(String missionJPName) {
		this.missionJPName = missionJPName;
	}
	
	public List<Char> getDropItems() {
		return dropItems;
	}
	public void setDropItems(List<Char> dropItems) {
		this.dropItems = dropItems;
	}

	public int getDailyNo() {
		return dailyNo;
	}

	public void setDailyNo(int dailyNo) {
		this.dailyNo = dailyNo;
	}

	public String getDailyJPName() {
		return dailyJPName;
	}

	public void setDailyJPName(String dailyJPName) {
		this.dailyJPName = dailyJPName;
	}	
	
	@Override
	public boolean equals(Object obj) {
		Mission other=(Mission)obj;
		return this.dailyJPName.equals(other.dailyJPName)&&this.missionJPName.equals(other.missionJPName);
	}
	
}
