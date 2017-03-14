package com.yabou.core;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class AigisCharGsonGenerder {
	private List<Daily> dailys;
	private static Item tieshengling;
	private static Item tongshengling;
	private static Item yinshengling;
	private static Item jinshengling;
	private static Item baishengling;
	private static Item heishengling;
	private static Char 男银兵;
	private static Char 青梅弓;
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		tieshengling = new Item(1,"铁圣灵",1);
		tongshengling = new Item(2,"铜圣灵",1);
		yinshengling = new Item(3,"银圣灵",1);
		jinshengling = new Item(4,"金圣灵",1);
		baishengling = new Item(5,"白圣灵",1);
		heishengling = new Item(6,"黑圣灵",1);
		
		Item baitong=new Item(4,"白桶",1);
		
		Item moshui1J2=new Item(1,"魔水晶",2);
		Item moshui2J2=new Item(2,"魔水晶*2",2);
		Item moshui3J2=new Item(3,"魔水晶*3",2);	
		
		男银兵 = new Char(1,"傭兵クレイブ",CharClass.士兵);
		青梅弓= new Char(2,"弓兵ダニエラ",CharClass.弓箭手);
		
		Daily daily = new Daily("魔女を救え！");
		Mission mission = new Mission("魔女を救え！：魔女の隠れ家",20,2);
		mission.setDropItems(Arrays.asList(new Char(1,"",CharClass.士兵),moshui1J2));
		Mission mission2 = new Mission("魔女を救え！：魔女の隠れ家",30,4);
		mission.setDropItems(Arrays.asList(new Char(1,"银豆芽",CharClass.士兵),new Char(1,"",CharClass.士兵),moshui1J2));
		daily.setMissions(Arrays.asList(mission,mission2));
		System.out.println(gson.toJson(daily));
			
		
		
	}
}
