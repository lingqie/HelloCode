package com.yabou.core;

import java.util.List;

public class Mission {
	private int no;
	private int tiLi;
	private int meiLi;
	private String missionJPName;
	private List<Object> dropItems;
	
	public Mission(String JpName,int tiLi,int meiLi) {
		this.missionJPName=JpName;
		this.tiLi=tiLi;
		this.meiLi=meiLi;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	
	public List<Object> getDropItems() {
		return dropItems;
	}
	public void setDropItems(List<Object> dropItems) {
		this.dropItems = dropItems;
	}
	
	
	
}
