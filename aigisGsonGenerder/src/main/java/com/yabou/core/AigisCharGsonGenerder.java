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
		Mission mission4 = createMission("魔女の宴",3,35,Arrays.asList(GoldChar.白き魔女クロリス,SliverChar.鋼鉄の女レアン,SliverChar.魔女カリオペ));
		Mission mission5 = createMission("魔女の狂騒",5,45,Arrays.asList(GoldChar.白き魔女クロリス,SliverChar.癒し手アリサ,SliverChar.狂戦士フューネス));
		daily.setMissions(Arrays.asList(mission,mission2,mission3,mission4,mission5));
		
		Daily daily2 = new Daily("魔女の娘",1);
		Mission mission6 = createMission("魔女の復活",2,20,Arrays.asList(SliverChar.魔導師ヴァレリー,TongChar.王国魔術師ロイ,IronChar.山賊手下A,IronChar.鉄の聖霊));
		Mission mission7 = createMission("魔女の夜",2,20,Arrays.asList(SliverChar.狂戦士フューネス,TongChar.王国重歩兵ラセル,IronChar.一般兵A弓,TongChar.銅の聖霊));
		Mission mission8 = createMission("魔女の逆襲II",3,25,Arrays.asList(PlatinumChar.白き魔女ベリンダ,TongChar.王国兵士レオ,IronChar.一般兵B魔法,SliverChar.銀の聖霊));
		Mission mission9 = createMission("魔女の隠れ家II",3,30,Arrays.asList(SliverChar.女盗賊ハリッサ,TongChar.王国兵士ヘクター,IronChar.一般兵A,GoldChar.金の聖霊));
		Mission mission10 = createMission("魔女の追撃",3,35,Arrays.asList(SliverChar.癒し手ドルカ,SliverChar.鋼鉄の女レアン,TongChar.山賊バーガン,PlatinumChar.白金の聖霊));
		Mission mission11 = createMission("魔女の宴II",5,50,Arrays.asList(PlatinumChar.白き魔女ベリンダ,SliverChar.弓兵ソーマ,TongChar.弓兵ウィルフレッド,BlackChar.黒の聖霊));
		daily2.setMissions(Arrays.asList(mission6,mission7,mission8,mission9,mission10,mission11));
		
		
		
		
		dailyList = new ArrayList<Daily>();
		dailyList.addAll(Arrays.asList(daily,daily2));
		
		List<String> charClassList=new ArrayList<String>();
		CharClass[] values = CharClass.values();
		for (CharClass charClass : values) {
			charClassList.add(charClass.name());
		}
		
		System.out.println(gson.toJson(dailyList));
//		System.out.println(gson.toJson(charClassList));
		
	}

	private static Mission createMission(String name,int tili,int meili,List<Char> items) {
		Mission mission = new Mission(name,tili,meili);
		mission.setDropItems(items);
		return mission;
	}
}
