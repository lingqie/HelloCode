package com.yabou.core;

import java.util.ArrayList;
import java.util.List;

public class charMissionSummary {
	
	public String charName;
	public List<Mission> missions;
	
	public charMissionSummary() {
		this.charName="";
		this.missions=new ArrayList<Mission>();
	}
	
	public String getCharName() {
		return charName;
	}
	public void setCharName(String charName) {
		this.charName = charName;
	}
	public List<Mission> getMissions() {
		return missions;
	}
	public void setMissions(List<Mission> missions) {
		this.missions = missions;
	}
	

}
