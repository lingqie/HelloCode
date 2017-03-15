package com.yabou.core;

public class Char {
	private String id;
	private String name;
	private CharClass cclass;
	private int judgeTime;
	
	public Char(String id,String name,CharClass c) {
		this.id=id;
		this.name=name;
		this.cclass=c;
		this.judgeTime=1;
	}
	
	public Char(String id,String name,CharClass c,int judgeTime) {
		this.id=id;
		this.name=name;
		this.cclass=c;
		this.judgeTime=judgeTime;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public CharClass getCclass() {
		return cclass;
	}

	public void setCclass(CharClass cclass) {
		this.cclass = cclass;
	}

	public int getJudgeTime() {
		return judgeTime;
	}

	public void setJudgeTime(int judgeTime) {
		this.judgeTime = judgeTime;
	}
	
	
}
