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
		
		Daily daily3 = new Daily("闇の忍者軍団",2);
		daily3.setMissions(Arrays.asList(
		createMission("闇の忍者",1,20,Arrays.asList(PlatinumChar.忍者アザミ,IronChar.足軽,IronChar.下忍)),
		createMission("忍者ふたたび",2,30,Arrays.asList(PlatinumChar.忍者アザミ,SliverChar.足軽頭サノスケ,TongChar.中忍ハヤテ,IronChar.下忍)),
		createMission("天飛の術",3,40,Arrays.asList(PlatinumChar.忍者アザミ,SliverChar.神官クリストファー,TongChar.中忍ハヤテJ2)),
		createMission("痺毒の術",5,50,Arrays.asList(PlatinumChar.忍者アザミ,SliverChar.忍者カゲロウ,ItemChar.魔水晶J3,PlatinumChar.プラチナアーマー)),
		createMission("忍びの本義 極級",7,70,Arrays.asList(PlatinumChar.忍者アザミ,SliverChar.槍騎兵エレイン,SliverChar.狂戦士フューネス,PlatinumChar.プラチナアーマー)),
		createMission("触手の舞　神級",2,100,Arrays.asList(ItemChar.魔水晶,ItemChar.魔水晶2,ItemChar.魔水晶3))
		));
		
		Daily daily4 = new Daily("鬼を宿す剣士",3);
		daily4.setMissions(Arrays.asList(
		createMission("鬼の力",1,20,Arrays.asList(PlatinumChar.剣豪モミジ,IronChar.一般兵A重装,IronChar.鉄の聖霊)),
		createMission("影の魔物",2,30,Arrays.asList(PlatinumChar.剣豪モミジ,SliverChar.傭兵クレイブ,TongChar.王国重歩兵ラセル,TongChar.銅の聖霊)),
		createMission("破壊の砲弾",3,40,Arrays.asList(PlatinumChar.剣豪モミジ,SliverChar.妖精郷の射手ローレン,TongChar.王国重歩兵ラセルJ2)),
		createMission("混沌の戦線",5,50,Arrays.asList(PlatinumChar.剣豪モミジ,SliverChar.見習い騎兵ミーシャ,SliverChar.海賊ジョヴァンニ,ItemChar.魔水晶J3)),
		createMission("力の解放 極級",7,70,Arrays.asList(PlatinumChar.剣豪モミジ,SliverChar.鋼鉄の女レアン,SliverChar.足軽頭サノスケ,PlatinumChar.白金の聖霊)),
		createMission("悪鬼襲来 神級",2,100,Arrays.asList(GoldChar.金の聖霊,PlatinumChar.白金の聖霊,BlackChar.黒の聖霊))
		));
		
		Daily daily5 = new Daily("聖戦士の挑戦",4);
		daily5.setMissions(Arrays.asList(
		createMission("始まりの戦い",1,20,Arrays.asList(SliverChar.傭兵クレイブ,TongChar.山賊バーガン,IronChar.山賊手下B,ItemChar.花束)),
		createMission("鉄球と鎧",2,25,Arrays.asList(PlatinumChar.聖戦士マリーベル,SliverChar.暗殺者セシリー,IronChar.一般兵A弓,ItemChar.花束)),
		createMission("亡霊の鎧",2,30,Arrays.asList(SliverChar.魔導師ヴァレリー,SliverChar.弓兵ソーマ,IronChar.一般兵A魔法,ItemChar.花束)),
		createMission("鎧の戦列",3,35,Arrays.asList(PlatinumChar.聖戦士マリーベル,SliverChar.魔女カリオペ,IronChar.一般兵B,ItemChar.花束)),
		createMission("鎧の戦列２",6,60,Arrays.asList(PlatinumChar.聖戦士マリーベル,SliverChar.鋼鉄の女レアン,TongChar.王国重歩兵ラセル,ItemChar.ルビー))
		));
		
		Daily daily6 = new Daily("影の狙撃手",5);
		daily6.setMissions(Arrays.asList(
		createMission("凶手の矢",1,20,Arrays.asList(PlatinumChar.漆黒の射手リタ,IronChar.一般兵A弓J2)),
		createMission("影からの奇襲",2,25,Arrays.asList(PlatinumChar.漆黒の射手リタ,SliverChar.魔導師ヴァレリー,TongChar.弓兵アルス)),
		createMission("這い寄る影",3,30,Arrays.asList(PlatinumChar.漆黒の射手リタ,SliverChar.癒し手アリサ,TongChar.弓兵ウィルフレッドJ2)),
		createMission("天からの矢雨",5,40,Arrays.asList(PlatinumChar.漆黒の射手リタ,SliverChar.猫魔女ネーニャ,SliverChar.狂戦士フューネス,SliverChar.銀の聖霊)),
		createMission("覚悟の決戦",7,55,Arrays.asList(PlatinumChar.漆黒の射手リタ,SliverChar.忍者カゲロウ,SliverChar.盗賊バラッド,PlatinumChar.白金の聖霊)),
		createMission("魔窟からの使者",2,100,Arrays.asList(GoldChar.金の聖霊,PlatinumChar.白金の聖霊,BlackChar.黒の聖霊))
		));
		
		Daily daily7 = new Daily("魔人の宿命",6);
		daily7.setMissions(Arrays.asList(
		createMission("魔人の少女",1,20,Arrays.asList(PlatinumChar.混血の狩人フラン,IronChar.一般兵A魔法J2)),
		createMission("闇夜の吸血鬼",2,25,Arrays.asList(PlatinumChar.混血の狩人フラン,SliverChar.ドワーフ戦士グスタフ,TongChar.王国魔術師ロイ)),
		createMission("吸血鬼の襲来",3,30,Arrays.asList(PlatinumChar.混血の狩人フラン,SliverChar.鋼鉄の女レアン,TongChar.王国兵士ヘクターJ2)),
		createMission("魔狼の住処",5,40,Arrays.asList(PlatinumChar.混血の狩人フラン,SliverChar.吸血鬼狩人フーリ,SliverChar.暗殺者セシリー,SliverChar.銀の聖霊)),
		createMission("吸血の宴　極級",7,55,Arrays.asList(PlatinumChar.混血の狩人フラン,SliverChar.弓兵ダニエラ,SliverChar.魔女カリオペ,PlatinumChar.白金の聖霊)),
		createMission("感染　神級",2,100,Arrays.asList(GoldChar.金の聖霊,PlatinumChar.白金の聖霊,BlackChar.黒の聖霊))
		));
		
		Daily daily8 = new Daily("戦乙女の契約",7);
		daily8.setMissions(Arrays.asList(
		createMission("戦乙女の挑戦",1,20,Arrays.asList(PlatinumChar.戦乙女エミリア,IronChar.山賊手下B,IronChar.一般兵A魔法)),
		createMission("騎兵の一矢",2,25,Arrays.asList(SliverChar.見習い騎兵ミーシャ,TongChar.弓兵アルス,ItemChar.魔水晶)),
		createMission("弓騎兵の戦列",3,30,Arrays.asList(SliverChar.砲兵パーシス,SliverChar.海賊ヴェロッテ,TongChar.王国兵士ヘクターJ2)),
		createMission("重装騎兵",5,40,Arrays.asList(PlatinumChar.戦乙女エミリア,SliverChar.魔法剣士リカルド,PlatinumChar.白金の聖霊,ItemChar.魔水晶)),
		createMission("最後の戦い",7,55,Arrays.asList(PlatinumChar.戦乙女エミリア,SliverChar.盗賊バラッド,SliverChar.癒し手ドルカ,ItemChar.魔水晶J2)),
		createMission("騎兵の侵攻",2,100,Arrays.asList(GoldChar.金の聖霊,PlatinumChar.白金の聖霊,BlackChar.黒の聖霊))
		));
		
		
		
		
		
		Daily daily9 = new Daily("暗黒騎士団の脅威",8);
		daily9.setMissions(Arrays.asList(
				createMission("宣戦布告",1,20,Arrays.asList(ItemChar.花束,ItemChar.魔水晶)),
				createMission("闇の聖女",2,25,Arrays.asList(PlatinumChar.暗黒騎士ユリナ,SliverChar.鋼鉄の女レアン,ItemChar.花束,ItemChar.魔水晶)),
				createMission("追撃戦",2,30,Arrays.asList(SliverChar.狂戦士フューネス,SliverChar.傭兵クレイブ,ItemChar.花束,ItemChar.魔水晶)),
				createMission("暗黒の波動",3,35,Arrays.asList(PlatinumChar.暗黒騎士ユリナ,SliverChar.魔女カリオペ,ItemChar.花束,ItemChar.魔水晶)),
				createMission("決戦 極級",6,60,Arrays.asList(PlatinumChar.暗黒騎士ユリナ,SliverChar.槍騎兵エレイン,ItemChar.花束,ItemChar.魔水晶))
				));
		
		Daily daily10 = new Daily("暗黒舞踏会",9);
		daily10.setMissions(Arrays.asList(
				createMission("囚われた踊り子",1,20,Arrays.asList(PlatinumChar.情熱の踊り子ワルツ,IronChar.一般兵A,IronChar.一般兵A重装)),
				createMission("闇に捧げられた円舞",2,25,Arrays.asList(PlatinumChar.情熱の踊り子ワルツ,SliverChar.金色の盾ベルナール,TongChar.王国重歩兵ラセル,ItemChar.魔水晶)),
				createMission("狂奏の踊り子",3,30,Arrays.asList(PlatinumChar.情熱の踊り子ワルツ,SliverChar.傭兵クレイブ,TongChar.海賊マウロ,ItemChar.魔水晶)),
				createMission("灼熱の舞台",5,40,Arrays.asList(PlatinumChar.情熱の踊り子ワルツ,SliverChar.癒し手ドルカ,SliverChar.槍騎兵エレイン,SliverChar.銀の聖霊)),
				createMission("2つの旋律　極級",7,55,Arrays.asList(PlatinumChar.情熱の踊り子ワルツ,SliverChar.海賊ヴェロッテ,SliverChar.吸血鬼狩人フーリ,PlatinumChar.白金の聖霊)),
				createMission("闇の舞踏会　神級",2,100,Arrays.asList(GoldChar.金の聖霊,PlatinumChar.白金の聖霊,BlackChar.黒の聖霊))
				));
		
		Daily daily11 = new Daily("魔術の秘法",10);
		daily11.setMissions(Arrays.asList(
				createMission("秘法の伝承者",0,15,null),
				createMission("魔物退治 初級",2,25,Arrays.asList(PlatinumChar.秘法の伝承者オデット,TongChar.弓兵アルス,IronChar.一般兵A魔法,ItemChar.魔水晶)),
				createMission("魔物退治 中級",2,30,Arrays.asList(SliverChar.魔導師ヴァレリー,TongChar.王国重歩兵ラセル,ItemChar.魔水晶2,ItemChar.魔水晶J2)),
				createMission("魔物退治 上級",3,35,Arrays.asList(PlatinumChar.秘法の伝承者オデット,SliverChar.金色の盾ベルナール,IronChar.一般兵B重装,ItemChar.魔水晶)),
				createMission("魔物退治 極級",6,60,Arrays.asList(PlatinumChar.秘法の伝承者オデット,SliverChar.魔女カリオペ,TongChar.王国魔術師ロイ,ItemChar.魔水晶))
				));
		
		
		
		
		
		dailyList = new ArrayList<Daily>();
		dailyList.addAll(Arrays.asList(
				daily,daily2,daily3,daily4,daily5,daily6,daily7,daily8,daily10,
				daily11
				
				
				));
		
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
