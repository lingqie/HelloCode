package com.yabou.core;

public class Item {
	
	private int id;
	private String name;
	private int judgeTime;
	
	public Item(int id,String name,int judgeTime) {
		this.id=id;
		this.name=name;
		this.judgeTime=judgeTime;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJudgeTime() {
		return judgeTime;
	}
	public void setJudgeTime(int judgeTime) {
		this.judgeTime = judgeTime;
	}


	
	
}
