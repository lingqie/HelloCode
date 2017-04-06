package com.yabou.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class AigisCharGsonGenerder {
	private static ArrayList<Daily> dailyList;

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

		Daily daily12 = new Daily("アンナと雪の美女",11);
		daily12.setMissions(Arrays.asList(
				createMission("冠雪の大地",1,20,Arrays.asList(SliverChar.忍者カゲロウ,IronChar.足軽,IronChar.一般兵B重装)),
				createMission("白雪の凶手",2,25,Arrays.asList(SliverChar.魔女カリオペ,TongChar.妖精郷の戦士アトラ,ItemChar.魔水晶)),
				createMission("雪嶺の魔女",3,30,Arrays.asList(PlatinumChar.凍氷の守り手エリザ,SliverChar.ドワーフ戦士グスタフ,TongChar.中忍ハヤテJ2)),
				createMission("破られた封印",5,40,Arrays.asList(SliverChar.妖精郷の射手ローレン,SliverChar.癒し手ドルカ,PlatinumChar.白金の聖霊,ItemChar.魔水晶)),
				createMission("太古の魔物",7,55,Arrays.asList(PlatinumChar.凍氷の守り手エリザ,SliverChar.魔導師ヴァレリー,SliverChar.槍騎兵エレイン,ItemChar.魔水晶J2)),
				createMission("凶魔の大侵攻",2,100,Arrays.asList(GoldChar.金の聖霊,PlatinumChar.白金の聖霊,BlackChar.黒の聖霊))
				));

		Daily daily13 = new Daily("山賊王への道",12);
		daily13.setMissions(Arrays.asList(
				createMission("ロロネ山賊団の野望",1,20,Arrays.asList(PlatinumChar.山賊娘ロロネ)),
				createMission("山賊王争奪戦",2,25,Arrays.asList(PlatinumChar.山賊娘ロロネ,SliverChar.山賊頭モーティマ,IronChar.山賊手下AJ2)),
				createMission("聖霊と共に",3,30,Arrays.asList(PlatinumChar.山賊娘ロロネ,TongChar.銅の聖霊,PlatinumChar.白金の聖霊,BlackChar.黒の聖霊)),
				createMission("山賊流の戦い方",5,40,Arrays.asList(PlatinumChar.山賊娘ロロネ,SliverChar.鋼鉄の女レアン,SliverChar.魔導師ヴァレリー,TongChar.山賊バーガンJ3)),
				createMission("姫山賊と姫海賊",7,55,Arrays.asList(PlatinumChar.山賊娘ロロネ,SliverChar.妖精郷の戦士ロザリー,SliverChar.海賊ジョヴァンニ,PlatinumChar.プラチナアーマー)),
				createMission("山賊王統一戦",12,90,Arrays.asList(PlatinumChar.山賊娘ロロネ,SliverChar.暗殺者セシリー,SliverChar.狂戦士フューネス,PlatinumChar.白金の聖霊))
				));

		Daily daily14 = new Daily("竜騎士の誓い",13);
		daily14.setMissions(Arrays.asList(
				createMission("竜の騎士",1,20,Arrays.asList(PlatinumChar.竜騎士ルシル)),
				createMission("ファイアブレス",2,25,Arrays.asList(PlatinumChar.竜騎士ルシル,SliverChar.海賊ヴェロッテ,IronChar.一般兵A重装)),
				createMission("爆弾部隊",3,30,Arrays.asList(PlatinumChar.竜騎士ルシル,SliverChar.堕天使ニエル,SliverChar.魔法剣士リカルド,TongChar.王国兵士ヘクター)),
				createMission("廃都の大混戦",5,40,Arrays.asList(PlatinumChar.竜騎士ルシル,SliverChar.槍騎兵エレイン,SliverChar.癒し手ドルカ,ItemChar.花束)),
				createMission("真竜の卵",7,55,Arrays.asList(PlatinumChar.竜騎士ルシル,SliverChar.傭兵クレイブ,SliverChar.金色の盾ベルナール,PlatinumChar.プラチナアーマー)),
				createMission("手裏剣乱舞",12,90,Arrays.asList(PlatinumChar.竜騎士ルシル,SliverChar.忍者カゲロウ,TongChar.中忍ハヤテJ2,PlatinumChar.白金の聖霊))
				));

		Daily daily15 = new Daily("錬金術士と賢者の石",14);
		daily15.setMissions(Arrays.asList(
				createMission("賢者の石",1,20,Arrays.asList (PlatinumChar.白衣の錬金術士コリン)),
				createMission("魔の研究者",2,25,Arrays.asList (PlatinumChar.白衣の錬金術士コリン,SliverChar.暗殺者セシリー,IronChar.一般兵A弓J2)),
				createMission("地中でうごめく 影",3,30,Arrays.asList(PlatinumChar.白衣の錬金術士コリン,SliverChar.妖精郷の戦士ロザリー,SliverChar.弓兵ソーマ,TongChar.海賊マウロJ2)),
				createMission("心を支配する 力",5,40,Arrays.asList(PlatinumChar.白衣の錬金術士コリン,SliverChar.魔導師ヴァレリー,SliverChar.砲兵パーシス,ItemChar.魔水晶J2)),
				createMission("真理の代償",7,55,Arrays.asList (PlatinumChar.白衣の錬金術士コリン,SliverChar.鋼鉄の女レアン,SliverChar.足軽頭サノスケ,PlatinumChar.プラチナアーマー)),
				createMission("魔界の軍勢",12,90,Arrays.asList (PlatinumChar.白衣の錬金術士コリン,SliverChar.見習い騎兵ミーシャ,SliverChar.癒し手アリサ,ItemChar.虹の聖霊))
				));

		Daily daily16 = new Daily("モンクの修行場",15);
		daily16.setMissions(Arrays.asList(
		createMission("白帯",1,20,Arrays.asList(PlatinumChar.武闘家リン,ItemChar.魔水晶,ItemChar.花束)),
		createMission("初段",2,25,Arrays.asList(PlatinumChar.武闘家リン,SliverChar.暗殺者セシリー,ItemChar.魔水晶)),
		createMission("十段",3,30,Arrays.asList(PlatinumChar.武闘家リン,SliverChar.鋼鉄の女レアン,ItemChar.花束)),
		createMission("師範代",5,35,Arrays.asList(PlatinumChar.武闘家リン,SliverChar.妖精郷の戦士ロザリー,SliverChar.傭兵クレイブ,ItemChar.水晶)),
		createMission("奥義覚醒",7,60,Arrays.asList(PlatinumChar.武闘家リン,SliverChar.妖精郷の戦士ロザリー,SliverChar.山賊頭モーティマ,ItemChar.魔水晶2))

		));

		Daily daily17 = new Daily("聖鎚闘士の挑戦",16);
		daily17.setMissions(Arrays.asList(
		createMission("誇り高き聖鎚闘士",1,20,Arrays.asList(PlatinumChar.聖鎚闘士ミランダ)),
		createMission("迅速なる赤鎧",2,25,Arrays.asList(PlatinumChar.聖鎚闘士ミランダ,SliverChar.弓兵ソーマ,IronChar.一般兵A重装J2)),
		createMission("哀しみの亡霊",3,30,Arrays.asList(PlatinumChar.聖鎚闘士ミランダ,SliverChar.暗殺者セシリー,SliverChar.金色の盾ベルナール,TongChar.王国重歩兵ラセルJ2)),
		createMission("鉄壁の陣形",5,40,Arrays.asList(PlatinumChar.聖鎚闘士ミランダ,SliverChar.海賊ヴェロッテ,SliverChar.ドワーフ戦士グスタフ,ItemChar.魔水晶J2)),
		createMission("魔法と鎧",7,55,Arrays.asList(PlatinumChar.聖鎚闘士ミランダ,SliverChar.砲兵パーシス,SliverChar.癒し手アリサ,PlatinumChar.プラチナアーマー)),
		createMission("鎧の軍勢",12,90,Arrays.asList(PlatinumChar.聖鎚闘士ミランダ,SliverChar.魔女カリオペ,SliverChar.見習い騎兵ミーシャ,PlatinumChar.白金の聖霊J2))
		));
		
		Daily daily18 = new Daily("鬼招きの巫女",17);
		daily18.setMissions(Arrays.asList(
		createMission("一つ目の鬼",1,20,Arrays.asList(ItemChar.花束,ItemChar.魔水晶)),
		createMission("鬼退治",2,25,Arrays.asList(PlatinumChar.巫女シホ,SliverChar.弓兵ソーマ,IronChar.一般兵A弓,ItemChar.花束)),
		createMission("鬼の逆襲",2,30,Arrays.asList(SliverChar.魔導師ヴァレリー,SliverChar.女盗賊ハリッサ,IronChar.一般兵A魔法,ItemChar.魔水晶)),
		createMission("鬼の進撃",3,35,Arrays.asList(PlatinumChar.巫女シホ,SliverChar.新緑の兵士フィリス,IronChar.一般兵B重装,ItemChar.花束)),
		createMission("鬼の怒り 極級",6,60,Arrays.asList(PlatinumChar.巫女シホ,SliverChar.金色の盾ベルナール,TongChar.王国魔術師ロイ,ItemChar.魔水晶2))

		));
		
		Daily daily19 = new Daily("砲科学校の訓練生",18);
		daily19.setMissions(Arrays.asList(
		createMission("砲術士の少女",1,20,Arrays.asList(PlatinumChar.爆砲の新兵カノン)),
		createMission("訓練開始",2,25,Arrays.asList(SliverChar.海賊ヴェロッテ,TongChar.王国魔術師ロイ,ItemChar.花束)),
		createMission("地の利	",3,30,Arrays.asList(PlatinumChar.爆砲の新兵カノン,SliverChar.鋼鉄の女レアン,SliverChar.魔女カリオペ,TongChar.王国兵士レオJ2)),
		createMission("隊伍堂々",5,40,Arrays.asList(PlatinumChar.爆砲の新兵カノン,SliverChar.傭兵クレイブ,SliverChar.弓兵ダニエラ,ItemChar.魔水晶J2)),
		createMission("更なる高み",7,55,Arrays.asList(PlatinumChar.爆砲の新兵カノン,SliverChar.山賊頭モーティマ,SliverChar.修道戦士エーテル,PlatinumChar.プラチナアーマー)),
		createMission("同窓の友",12,90,Arrays.asList(PlatinumChar.爆砲の新兵カノン,SliverChar.魔導師ヴァレリー,SliverChar.暗殺者セシリー,ItemChar.ルビーJ2))
		));
		
		Daily daily20 = new Daily("囚われの魔法剣士",19);
		daily20.setMissions(Arrays.asList(
		createMission("侵攻",1,20,Arrays.asList(PlatinumChar.魔法剣士シャルロット,ItemChar.魔水晶,ItemChar.花束)),
		createMission("不死の戦士",2,30,Arrays.asList(PlatinumChar.魔法剣士シャルロット,SliverChar.見習い騎兵ミーシャ,TongChar.王国魔術師ロイ,ItemChar.魔水晶)),
		createMission("激戦",3,40,Arrays.asList(PlatinumChar.魔法剣士シャルロット,SliverChar.魔導師ヴァレリー,ItemChar.樽ビール,ItemChar.一般ワイン)),
		createMission("死者の王",5,50,Arrays.asList(PlatinumChar.魔法剣士シャルロット,SliverChar.魔術師パレス,SliverChar.魔女カリオペ,ItemChar.魔水晶2)),
		createMission("決戦 極級",7,70,Arrays.asList(PlatinumChar.魔法剣士シャルロット,SliverChar.魔術師パレス,SliverChar.神官クリストファー,ItemChar.水晶M))
		));

		Daily daily21 = new Daily("死霊の船と提督の決意",20);
		daily21.setMissions(Arrays.asList(
		createMission("軍服の漂流者",1,20,Arrays.asList(PlatinumChar.提督リーンベル)),
		createMission("荒海の魚群",2,25,Arrays.asList(SliverChar.弓武者カズハ,SliverChar.銀の聖霊,TongChar.弓兵アルスJ2)),
		createMission("死霊たちの船",3,30,Arrays.asList(SliverChar.癒し手アリサ,GoldChar.金の聖霊,ItemChar.花束)),
		createMission("最後の指揮",5,40,Arrays.asList(PlatinumChar.提督リーンベル,SliverChar.新緑の兵士フィリス,SliverChar.忍者サイゾウ,ItemChar.魔水晶)),
		createMission("死者を操る者",7,55,Arrays.asList(PlatinumChar.提督リーンベル,SliverChar.魔術師パレス,SliverChar.青竜のガドラス,PlatinumChar.プラチナアーマー)),
		createMission("死霊術師の研究所前",9,90,Arrays.asList(PlatinumChar.提督リーンベル,SliverChar.金色の盾ベルナール,SliverChar.魔女カリオペ,ItemChar.ダイヤ))
		));

		Daily daily22 = new Daily("帝国の天馬騎士",21);
		daily22.setMissions(Arrays.asList(
		createMission("白き帝国の騎士",1,20,Arrays.asList(PlatinumChar.帝国天馬騎士イザベル)),
		createMission("白の軍団",2,25,Arrays.asList(SliverChar.金色の盾ベルナール,SliverChar.銀の聖霊,TongChar.帝国歩兵ディルクJ2)),
		createMission("黒の軍団",3,30,Arrays.asList(PlatinumChar.帝国天馬騎士イザベル,SliverChar.見習い騎兵ミーシャ,TongChar.帝国歩兵ディルクJ2)),
		createMission("黒の暴走",5,40,Arrays.asList(SliverChar.ドワーフ戦士グスタフ,SliverChar.魔術師パレス,GoldChar.金の聖霊,ItemChar.魔水晶2)),
		createMission("魔の砦	",7,55,Arrays.asList(PlatinumChar.帝国天馬騎士イザベル,SliverChar.弓武者カズハ,SliverChar.堕天使ニエル,PlatinumChar.プラチナアーマー)),
		createMission("忠誠の誓い",12,90,Arrays.asList(PlatinumChar.帝国天馬騎士イザベル,SliverChar.暗殺者セシリー,SliverChar.海賊ヴェロッテ,ItemChar.ダイヤ))
		));
		
		Daily daily23 = new Daily("暗黒騎士団と狙われた癒し手",22);
		daily23.setMissions(Arrays.asList(
				createMission("闇を宿す癒し手",1,20,Arrays.asList(PlatinumChar.背反の癒し手ユーノ,TongChar.銅の聖霊,ItemChar.花束)),
				createMission("新生暗黒騎士団",2,25,Arrays.asList(SliverChar.砂漠の戦士アサル,SliverChar.弓兵ソーマ,SliverChar.銀の聖霊J2)),
				createMission("仕組まれた強襲",4,30,Arrays.asList(SliverChar.忍者サイゾウ,SliverChar.魔術師パレス,BlackChar.黒の聖霊,ItemChar.魔水晶)),
				createMission("奪われた癒しの力	",5,40,Arrays.asList(PlatinumChar.背反の癒し手ユーノ,SliverChar.鋼鉄の女レアン,SliverChar.癒し手ドルカ,ItemChar.花束)),
				createMission("魔導の暗黒騎士",7,55,Arrays.asList(PlatinumChar.背反の癒し手ユーノ,SliverChar.暗殺者セシリー,SliverChar.破魔僧正フドウ,PlatinumChar.プラチナアーマー)),
				createMission("闇の魂の暴走",12,90,Arrays.asList(PlatinumChar.背反の癒し手ユーノ,SliverChar.侍剣士イロハ,SliverChar.海賊ヴェロッテ,ItemChar.ルビーJ2))
				));
		
		Daily daily24 = new Daily("獣人の誇り",23);
		daily24.setMissions(Arrays.asList(
		createMission("魔狼と獣人",1,20,Arrays.asList(PlatinumChar.獣人エイダ,SliverChar.槍騎兵エレイン,ItemChar.花束)),
		createMission("剣呑な獣道",2,30,Arrays.asList(PlatinumChar.獣人エイダ,SliverChar.魔女カリオペ,ItemChar.花束,ItemChar.魔水晶)),
		createMission("飢えた狼たち",3,40,Arrays.asList(PlatinumChar.獣人エイダ,SliverChar.魔術師パレス,ItemChar.樽ビール,ItemChar.一般ワイン)),
		createMission("目覚める野性",5,50,Arrays.asList(PlatinumChar.獣人エイダ,SliverChar.海賊ジョヴァンニ,SliverChar.足軽頭サノスケ,PlatinumChar.プラチナアーマー)),
		createMission("決戦 極級",7,70,Arrays.asList(PlatinumChar.獣人エイダ,SliverChar.妖精郷の戦士ロザリー,SliverChar.妖精郷の射手ローレン,PlatinumChar.プラチナアーマー)),
		createMission("金狼 神級",2,100,Arrays.asList(ItemChar.魔水晶3,ItemChar.極上酒,ItemChar.ルビー))
		));
		
		Daily daily25 = new Daily("白の帝国と偽りの都市",24);
		daily25.setMissions(Arrays.asList(
				createMission("自由都市からの使者",1,20,Arrays.asList(TongChar.王国兵士レオ,TongChar.銅の聖霊,ItemChar.花束)),
				createMission("白の帝国の侵略",2,25,Arrays.asList(PlatinumChar.帝国兵長リーゼロッテ,SliverChar.弓武者カズハ,SliverChar.銀の聖霊)),
				createMission("本隊との決戦",4,30,Arrays.asList(PlatinumChar.帝国兵長リーゼロッテ,SliverChar.魔女カリオペ,BlackChar.黒の聖霊,ItemChar.魔水晶)),
				createMission("偽りの住民",5,40,Arrays.asList(PlatinumChar.帝国兵長リーゼロッテ,SliverChar.金色の盾ベルナール,SliverChar.槍騎兵エレイン,ItemChar.花束J2)),
				createMission("偽りの英雄",7,55,Arrays.asList(PlatinumChar.帝国兵長リーゼロッテ,SliverChar.神官クリストファー,SliverChar.魔術師パレス,PlatinumChar.プラチナアーマー)),
				createMission("偽りの王子軍",12,90,Arrays.asList(PlatinumChar.帝国兵長リーゼロッテ,SliverChar.青竜のガドラス,SliverChar.山賊頭モーティマ,ItemChar.ルビーJ2))
				));
		
		Daily daily26 = new Daily("堕天使の封印",25);
		daily26.setMissions(Arrays.asList(
			createMission("黒翼の少女",1,20,Arrays.asList(PlatinumChar.堕天使クロエ,ItemChar.魔水晶,ItemChar.花束)),
			createMission("魔界の門",2,30,Arrays.asList(PlatinumChar.堕天使クロエ,SliverChar.魔女カリオペ,ItemChar.花束,ItemChar.魔水晶)),
			createMission("無邪気な殺意",3,40,Arrays.asList(PlatinumChar.堕天使クロエ,SliverChar.海賊ジョヴァンニ,ItemChar.樽ビール,ItemChar.一般ワイン)),
			createMission("邪悪な微笑",5,50,Arrays.asList(PlatinumChar.堕天使クロエ,SliverChar.女盗賊ハリッサ,SliverChar.弓兵ダニエラ,PlatinumChar.プラチナアーマー)),
			createMission("凶魔出現",7,70,Arrays.asList(PlatinumChar.堕天使クロエ,SliverChar.神官クリストファー,SliverChar.足軽頭サノスケ,PlatinumChar.プラチナアーマー)),
	        createMission("四面楚歌",2,100,Arrays.asList(ItemChar.魔水晶,ItemChar.魔水晶2,ItemChar.魔水晶3))
		));

		Daily daily27 = new Daily("暗黒騎士団と聖夜の贈り物",26);
		daily27.setMissions(Arrays.asList(
			createMission("聖夜の弓騎兵",1,20,Arrays.asList(PlatinumChar.聖夜の弓騎兵サラサ,TongChar.銅の聖霊,ItemChar.花束)),
			createMission("暗黒騎士との約束",2,25,Arrays.asList(PlatinumChar.聖夜の弓騎兵サラサ,SliverChar.魔女メローネ,SliverChar.銀の聖霊)),
			createMission("二つの戦線",3,30,Arrays.asList(PlatinumChar.聖夜の弓騎兵サラサ,SliverChar.傭兵クレイブ,BlackChar.黒の聖霊,ItemChar.魔水晶)),
			createMission("暗黒の弓騎兵",5,40,Arrays.asList(PlatinumChar.聖夜の弓騎兵サラサ,SliverChar.鋼鉄の女レアン,SliverChar.槍騎兵エレイン,ItemChar.花束J2)),
			createMission("雪山の共同戦線",7,55,Arrays.asList(PlatinumChar.聖夜の弓騎兵サラサ,SliverChar.司祭シャロン,SliverChar.魔術師パレス,PlatinumChar.白金の聖霊)),
            createMission("トロルの恐怖",12,90,Arrays.asList(PlatinumChar.聖夜の弓騎兵サラサ,SliverChar.神官クリストファー,PlatinumChar.プラチナアーマー,ItemChar.ルビーJ2))
		));
		
		Daily daily28 = new Daily("古代の機甲兵", 27);
		daily28.setMissions(Arrays.asList(
				createMission("古代の遺産", 1, 20, Arrays.asList(PlatinumChar.機甲士リッカ, ItemChar.魔水晶, ItemChar.花束)),
				createMission("洞窟の主", 2, 30, Arrays.asList(PlatinumChar.機甲士リッカ, SliverChar.足軽頭サノスケ, TongChar.銅の聖霊,ItemChar.樽ビール)),
				createMission("三つ巴の戦い", 3, 40,
						Arrays.asList(PlatinumChar.機甲士リッカ, SliverChar.弓兵ソーマ, ItemChar.魔水晶J2, ItemChar.魔水晶2)),
				createMission("機甲兵団", 5, 50,
						Arrays.asList(PlatinumChar.機甲士リッカ, SliverChar.猫魔女ネーニャ, PlatinumChar.白金の聖霊, PlatinumChar.プラチナアーマー)),
				createMission("制御不能 極級", 7, 70,
						Arrays.asList(PlatinumChar.機甲士リッカ, SliverChar.暗殺者セシリー, SliverChar.ドワーフ戦士グスタフ, PlatinumChar.プラチナアーマー)),
				createMission("烈火 神級", 2, 100,
						Arrays.asList(GoldChar.金の聖霊,PlatinumChar.白金の聖霊, BlackChar.黒の聖霊)),
				createMission("再起動 神級", 12, 90,
						Arrays.asList(PlatinumChar.機甲士リッカ, SliverChar.格闘家ダン, SliverChar.海賊ジョヴァンニ, ItemChar.ダイヤ))
		));
		
		Daily daily29 = new Daily("呪術師と妖魔の女王", 28);
		daily29.setMissions(Arrays.asList(
				createMission("淀んだ空気", 1, 20, Arrays.asList(IronChar.一般兵A魔法J2,TongChar.銅の聖霊 ,ItemChar.花束)),
				createMission("呪術師の呪い", 2, 25,
						Arrays.asList(PlatinumChar.忘我の呪術師レヴィ, SliverChar.魔術師パレス, SliverChar.銀の聖霊)),
				createMission("呪術師再び", 3, 30,
						Arrays.asList(PlatinumChar.忘我の呪術師レヴィ, SliverChar.魔女カリオペ, BlackChar.黒の聖霊, ItemChar.魔水晶)),
				createMission("卑劣な罠", 7, 55,
						Arrays.asList(PlatinumChar.忘我の呪術師レヴィ, SliverChar.槍騎兵エレイン, SliverChar.癒し手アリサ, ItemChar.花束J2)),
				createMission("ゴブリンクイーン", 7, 70,
						Arrays.asList(PlatinumChar.忘我の呪術師レヴィ,  SliverChar.忍者サイゾウ,SliverChar.司祭シャロン,
								PlatinumChar.白金の聖霊)),
				createMission("暴走する力", 9, 12, Arrays.asList(PlatinumChar.忘我の呪術師レヴィ, SliverChar.足軽頭サノスケ,
						PlatinumChar.プラチナアーマー, ItemChar.ルビーJ2))
		));
		
		Daily daily30 = new Daily("私掠船長と魔の海域", 29);
		daily30.setMissions(Arrays.asList(
				createMission("私掠船の船長", 1, 20, Arrays.asList(PlatinumChar.私掠船長サブリナ, TongChar.銅の聖霊, ItemChar.花束)),
				createMission("マーマン", 2, 25, Arrays.asList(PlatinumChar.私掠船長サブリナ, SliverChar.弓兵ダニエラ, SliverChar.銀の聖霊)),
				createMission("投槍の一撃", 3, 30,
						Arrays.asList(PlatinumChar.私掠船長サブリナ, SliverChar.海賊ジョヴァンニ, BlackChar.黒の聖霊, ItemChar.魔水晶)),
				createMission("挟撃の甲板", 4, 50,
						Arrays.asList(SliverChar.山賊頭モーティマ, SliverChar.癒し手ドルカ, GoldChar.金の聖霊, ItemChar.花束J2)),
				createMission("魔神ウェパル", 7, 55,
						Arrays.asList(PlatinumChar.私掠船長サブリナ, SliverChar.魔術師パレス, SliverChar.魔法剣士リカルド,
								PlatinumChar.白金の聖霊)),
				createMission("それぞれの自由", 9, 12, Arrays.asList(PlatinumChar.私掠船長サブリナ, SliverChar.錬金術士テルマ,
						PlatinumChar.プラチナアーマー, ItemChar.ルビーJ2))
		));
		
		Daily daily31 = new Daily("ヴァンパイアと聖なる復讐者", 30);
		daily31.setMissions(Arrays.asList(
				createMission("灰より出る者", 1, 20, Arrays.asList(PlatinumChar.聖なる復讐者ルマリア, TongChar.銅の聖霊, ItemChar.花束)),
				createMission("ヴァンパイアを追う者", 2, 25,
						Arrays.asList(PlatinumChar.聖なる復讐者ルマリア, SliverChar.弓兵ソーマ, SliverChar.銀の聖霊)),
				createMission("老練なる神官戦士", 3, 40,
						Arrays.asList(PlatinumChar.聖なる復讐者ルマリア, SliverChar.神官戦士ニコラウス, BlackChar.黒の聖霊, ItemChar.魔水晶)),
				createMission("絡みつく羽音", 4, 50,
						Arrays.asList(SliverChar.吸血鬼狩人フーリ, SliverChar.癒し手ドルカ, GoldChar.金の聖霊, ItemChar.花束J2)),
				createMission("公爵の家畜部屋", 7, 55,
						Arrays.asList(PlatinumChar.聖なる復讐者ルマリア, SliverChar.女盗賊ハリッサ, SliverChar.妖精郷の戦士ロザリー,
								PlatinumChar.白金の聖霊)),
				createMission("ルマリアの決意", 9, 12, Arrays.asList(PlatinumChar.聖なる復讐者ルマリア, SliverChar.海賊ヴェロッテ,
						PlatinumChar.プラチナアーマー, ItemChar.ルビーJ2))
		));
		
		Daily daily32 = new Daily("妖魔の女王と戦術の天才", 31);
		daily32.setMissions(Arrays
				.asList(createMission("天才の集団戦術", 1, 20, Arrays.asList(IronChar.一般兵A重装, TongChar.銅の聖霊, ItemChar.花束)),
						createMission("天才の機動戦術", 2, 25,
								Arrays.asList(PlatinumChar.天才戦術家ヘレナ, SliverChar.見習い騎兵ミーシャ, SliverChar.銀の聖霊)),
						createMission("天才の火力戦術", 3, 30,
								Arrays.asList(PlatinumChar.天才戦術家ヘレナ, SliverChar.ドワーフ戦士グスタフ, BlackChar.黒の聖霊, ItemChar.魔水晶)),
						createMission("天才の中央突破戦術", 4, 50,
								Arrays.asList(PlatinumChar.天才戦術家ヘレナ, SliverChar.足軽頭サノスケ, SliverChar.弓兵ソーマ,
										ItemChar.花束J2)),
						createMission("天才の工作戦術", 7, 55,
								Arrays.asList(PlatinumChar.天才戦術家ヘレナ, SliverChar.暗殺者セシリー,SliverChar.山賊頭モーティマ, 
										PlatinumChar.白金の聖霊)),
						createMission("女王の怒り", 9, 12, Arrays.asList(PlatinumChar.天才戦術家ヘレナ, SliverChar.魔術師パレス,
								PlatinumChar.プラチナアーマー, ItemChar.ルビーJ2))
		));
		
		Daily daily33 = new Daily("魔界蟻と囚われた男達", 32);
		daily33.setMissions(Arrays.asList(
				createMission("暴れる山賊たち", 1, 20,
						Arrays.asList(PlatinumChar.冒険者オスカー, SliverChar.山賊頭モーティマ, ItemChar.樽ビール)),
				createMission("操られし戦士", 2, 25, Arrays.asList(PlatinumChar.冒険者ジェイク, SliverChar.盗賊バラッド, SliverChar.銀の聖霊)),
				createMission("操られし冒険者", 3, 30,
						Arrays.asList(SliverChar.弓騎兵ミゲル, SliverChar.足軽頭サノスケ, BlackChar.黒の聖霊, ItemChar.魔水晶)),
				createMission("囚われた男達", 4, 50,
						Arrays.asList(PlatinumChar.冒険者オスカー, PlatinumChar.冒険者ジェイク, SliverChar.海賊ジョヴァンニ, ItemChar.花束J2)),
				createMission("魔界アリの女王", 7, 55,
						Arrays.asList(PlatinumChar.冒険者オスカー, PlatinumChar.冒険者ジェイク, PlatinumChar.プラチナアーマー,
								PlatinumChar.白金の聖霊)),
				createMission("女王蟻の執念", 9, 12, Arrays.asList(PlatinumChar.冒険者オスカー, PlatinumChar.冒険者ジェイク,
						SliverChar.神官戦士ニコラウス, ItemChar.極上酒J2))
				));
		
		Daily daily34 = new Daily("天使たちの陰謀", 33);
		daily34.setMissions(Arrays.asList(
				createMission("神託の聖職者", 1, 20,
						Arrays.asList(PlatinumChar.聖職者セレイナ, TongChar.銅の聖霊, ItemChar.花束)),
				createMission("接舷の白兵戦", 2, 25,
						Arrays.asList(PlatinumChar.聖職者セレイナ, SliverChar.魔導師ヴァレリー, SliverChar.銀の聖霊)),
				createMission("森の中の追走劇", 4, 30,
						Arrays.asList(PlatinumChar.聖職者セレイナ, SliverChar.神官戦士ニコラウス, BlackChar.黒の聖霊, ItemChar.魔水晶)),
				createMission("霧に包まれた森", 5, 40,
						Arrays.asList( SliverChar.弓兵ソーマ,SliverChar.見習い騎兵ミーシャ, GoldChar.金の聖霊, ItemChar.花束J2)),
				createMission("大天使長と空舞う天使たち", 7, 55,
						Arrays.asList(PlatinumChar.聖職者セレイナ, SliverChar.堕天使ニエル, SliverChar.癒し手アリサ, PlatinumChar.白金の聖霊)),
				createMission("さらわれたセレイナ", 9, 12,
						Arrays.asList(PlatinumChar.聖職者セレイナ, SliverChar.魔術師パレス, PlatinumChar.プラチナアーマー, ItemChar.ルビーJ2))
		));
		
		Daily daily35 = new Daily("魔蝿の森と呪われた番人", 34);
		daily35.setMissions(Arrays.asList(
				createMission("魔の森の住人", 1, 20, Arrays.asList(PlatinumChar.闇の森の番人アイーダ, TongChar.密林の老練射手ガガ, ItemChar.花束)),
				createMission("魔の森のトレント", 2, 25,
						Arrays.asList(PlatinumChar.闇の森の番人アイーダ, SliverChar.弓兵ダニエラ, SliverChar.銀の聖霊)),
				createMission("魔神の信奉者", 4, 30,
						Arrays.asList(SliverChar.密林の弓騎兵ルナール, SliverChar.盗賊バラッド, BlackChar.黒の聖霊, ItemChar.魔水晶)),
				createMission("邪悪なる共同戦線", 5, 40,
						Arrays.asList(PlatinumChar.闇の森の番人アイーダ, SliverChar.密林の槍騎兵チグリ, GoldChar.金の聖霊, ItemChar.花束J2)),
				createMission("復活の魔蝿", 7, 55,
						Arrays.asList(PlatinumChar.闇の森の番人アイーダ, SliverChar.狂戦士フューネス,SliverChar.魔女カリオペ, 
								PlatinumChar.白金の聖霊)),
				createMission("信仰の果て", 9, 12, Arrays.asList(PlatinumChar.闇の森の番人アイーダ, SliverChar.密林の守護者ダナン,
						PlatinumChar.プラチナアーマー, ItemChar.ルビーJ2	))
		));
		
				


		dailyList = new ArrayList<Daily>();
		dailyList.addAll(Arrays.asList(
				daily,daily2,daily3,daily4,daily5,daily6,daily7,daily8,daily10
				,daily11,daily12,daily13,daily14,daily15,daily16,daily17,daily18,daily19,daily20
				,daily21,daily22,daily23,daily24,daily25,daily26,daily27,daily28,daily29,daily30
				,daily31,daily32,daily33,daily34,daily35
				));

		List<String> charClassList=new ArrayList<String>();
		CharClass[] values = CharClass.values();
		for (CharClass charClass : values) {
			charClassList.add(charClass.name());
		}
		
		
		List<String> ccliwai=Arrays.asList("舞娘","暗黑骑士","龙骑","好感物","巫女","水兵","天马","咒术","游侠","金桶");
		List<String> liwai=Arrays.asList("铁圣灵","铜圣灵","魔水晶","银圣灵","金圣灵","白圣灵","黑圣灵","虹圣灵","白桶");
		
		List<charMissionSummary> summaries = new ArrayList<charMissionSummary>();
		for (String charName : charClassList) {
			if (!ccliwai.contains(charName)) {
				charMissionSummary cms = new charMissionSummary();
				cms.setCharName(charName);
				for (Daily d : dailyList) {
					for (Mission m : d.getMissions()) {
						if (m.getDropItems() != null) {
							for (Char item : m.getDropItems()) {
								if ((item.getCclass().equals(CharClass.valueOf(charName))&&item.getRank().equals("sliver"))||
										((item.getCclass().equals(CharClass.valueOf(charName)))&&(liwai.contains(charName)))) {
									List<Mission> m1 = cms.getMissions();
									m1.add(m);
									cms.setMissions(m1);
								}
							}
						}
					}
				}
				summaries.add(cms);
			}
		}
		
		 System.out.println(gson.toJson(summaries));
//		System.out.println(gson.toJson(dailyList));
//		 System.out.println(gson.toJson(charClassList));
	}
	
	
	
	
	public static String getZhuZiInfo(String info){
		
		
		return "";
	}
		

	private static Mission createMission(String name, int tili, int meili, List<Char> items) {
		Mission mission = new Mission(name, tili, meili);
		mission.setDropItems(items);
		return mission;
	}
}
