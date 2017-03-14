package com.yabou.core;

public class Char {
	private int id;
	private String name;
	private CharClass cclass;
	
	public Char(int id,String name,CharClass c) {
		this.id=id;
		this.name=name;
		this.cclass=c;
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
	
	
}
