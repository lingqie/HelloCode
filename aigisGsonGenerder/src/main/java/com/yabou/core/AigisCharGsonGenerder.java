package com.yabou.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class AigisCharGsonGenerder {
	private static ArrayList<Daily> dailyList;
	private static int daliysize=2;
	
	public static void main(String[] args) {
		Gson gson = new Gson();
				
		Daily daily = new Daily("魔女を救え！",0);
		Mission mission = createMission("魔女の逆襲",2,20,Arrays.asList(SliverChar.魔女カリオペ,SliverChar.弓兵ダニエラ,SliverChar.傭兵クレイブ));
		Mission mission2 = createMission("魔女の逆襲",2,25,Arrays.asList(SliverChar.魔女カリオペ,SliverChar.魔導師ヴァレリー,GoldChar.白き魔女クロリス));
		Mission mission3 = createMission("魔女の隠れ家",3,30,Arrays.asList(SliverChar.魔女カリオペ,SliverChar.見習い騎兵ミーシャ,SliverChar.暗殺者セシリー));
		Mission mission4 = createMission("魔女の隠れ家",3,35,Arrays.asList(GoldChar.白き魔女クロリス,SliverChar.鋼鉄の女レアン,SliverChar.魔女カリオペ));
		Mission mission5 = createMission("魔女の隠れ家",5,45,Arrays.asList(GoldChar.白き魔女クロリス,SliverChar.癒し手アリサ,SliverChar.狂戦士フューネス));
		daily.setMissions(Arrays.asList(mission,mission2,mission3,mission4,mission5));
		
		
		
		
		
		
		dailyList = new ArrayList<Daily>();
		dailyList.add(daily);
		
		List<String> charClassList=new ArrayList<String>();
		CharClass[] values = CharClass.values();
		for (CharClass charClass : values) {
			charClassList.add(charClass.name());
		}
		
//		System.out.println(gson.toJson(dailyList));
		System.out.println(gson.toJson(charClassList));
		
	}

	private static Mission createMission(String name,int tili,int meili,List<Char> items) {
		Mission mission = new Mission(name,tili,meili);
		mission.setDropItems(items);
		return mission;
	}
}
