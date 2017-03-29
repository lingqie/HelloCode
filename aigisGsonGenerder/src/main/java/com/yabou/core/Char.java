package com.yabou.core;

public class Char {
	private String id;
	private String name;
	private CharClass cclass;
	private String rank;
	
	public Char(String id,String name,CharClass c) {
		this.id=id;
		this.name=name;
		this.cclass=c;
		this.setRank("sliver");
	}
	
	public Char(String id,String name,CharClass c,String rank) {
		this.id=id;
		this.name=name;
		this.cclass=c;
		this.setRank(rank);
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

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	
	
}
