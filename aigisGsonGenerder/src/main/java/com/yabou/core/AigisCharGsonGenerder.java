package com.yabou.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class AigisCharGsonGenerder {
	private List<Daily> dailys;
	private static Char tieshengling;
	private static Char tongshengling;
	private static Char yinshengling;
	private static Char jinshengling;
	private static Char baishengling;
	private static Char heishengling;
	private static Char nanyinbing;
	private static Char qingmeigong;
	private static Char juanmaobing;
	private static ArrayList<Daily> dailyList;
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		tieshengling = new Char("001","铁圣灵",CharClass.圣灵);
		tongshengling = new Char("002","铜圣灵",CharClass.圣灵);
		yinshengling = new Char("003","银圣灵",CharClass.圣灵);
		jinshengling = new Char("004","金圣灵",CharClass.圣灵);
		baishengling = new Char("005","白圣灵",CharClass.圣灵);
		heishengling = new Char("006","黑圣灵",CharClass.圣灵);
		
		Char baitong=new Char("007","白桶",CharClass.桶,1);
		
		Char moshui1J2=new Char("008","魔水晶",CharClass.魔水晶,2);
		Char moshui2J2=new Char("009","魔水晶*2",CharClass.魔水晶,2);
		Char moshui3J2=new Char("010","魔水晶*3",CharClass.魔水晶,2);	
		
		Daily daily = new Daily("魔女を救え！",0);
		Mission mission = new Mission("魔女の襲撃",20,2);
		mission.setDropItems(Arrays.asList(SliverChar.傭兵クレイブ,SliverChar.ドワーフ戦士グスタフ,SliverChar.妖精郷の戦士ロザリー));
		
		Mission mission2 = new Mission("魔女の逆襲	",25,2);
		mission2.setDropItems(Arrays.asList(SliverChar.傭兵クレイブ));
		daily.setMissions(Arrays.asList(mission,mission2));
		
		
		Daily daily2 = new Daily("魔女の娘",1);
		Mission mission3 = new Mission("魔女の復活",20,2);
		mission3.setDropItems(Arrays.asList(SliverChar.傭兵クレイブ,SliverChar.ドワーフ戦士グスタフ,SliverChar.妖精郷の戦士ロザリー));
		
		Mission mission4 = new Mission("魔女の夜	",25,2);
		mission4.setDropItems(Arrays.asList(SliverChar.傭兵クレイブ,SliverChar.金色の盾ベルナール));
		daily2.setMissions(Arrays.asList(mission3,mission4));
		
		dailyList = new ArrayList<Daily>();
		dailyList.add(daily);
		dailyList.add(daily2);
		
		List<String> charClassList=new ArrayList<String>();
		CharClass[] values = CharClass.values();
		for (CharClass charClass : values) {
			charClassList.add(charClass.name());
		}
		
//		System.out.println(gson.toJson(dailyList));
		System.out.println(gson.toJson(charClassList));
		
	}
}
