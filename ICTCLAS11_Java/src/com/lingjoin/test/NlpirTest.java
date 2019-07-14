package com.lingjoin.test;
import com.lingjoin.demo.*;
import java.io.*;
//import org.junit.Test;
import com.lingjoin.demo.NlpirMethod;
import com.lingjoin.util.*;
/**
 * 分词组件测试
 * 
 * @author move
 *
 */
public class NlpirTest {
	/**
	 * 测试文本分词
	 */
	//@Test
	public void testParagraphProcess(){
		String content="我叫王卓凡，我爱你毕业于南京大学清华大学，我的家在湖北省宜昌点军区 还有东方明珠 埃菲尔铁塔 ";
		String content1="这是一条信息检索，关于湖南大学，湖北大学,华中科技大学";
		String content2="很古很古的时候，西北天际忽然塌了一角，天一开口，狂风大作，雨雪冰雹，倾渴\n" + 
				"不止，地上成了洪流冰川世界。玉皇大帝急忙派女娲下凡炼石补天。\n" + 
				"女娲牵着金牛，驮着金磨、金锅，来到浮山。白天，金牛拉磨碎石，女娲升火冶炼，\n" + 
				"辛苦劳累，倒也不觉什么。可是到了晚上，寒气袭人，冷得女娲和金牛不能入睡休息。金牛就给女娲出了个主意，去天上带个行宫下来。于是女娲和金牛偷偷回到天宫，把王母娘娘的逍遥宫驮下来，放在现在平定城西八十里路的地方，准备晚上住宿。谁知那宫一\n" + 
				"落凡界，金碧辉煌， 闪闪发光。女娲怕被王母娘娘看见，就摘下自己的翡翠玉冠，吹口仙气，那冠帽立刻变大，罩在逍遥宫上。晚上女娲和金牛就住在里面，不冷不热，倒也舒适。白天女娲和金牛去浮山炼石时，女娲总担心丢掉王母娘娘的逍遥宫。金牛又出主意让女娲用锁将石门锁上。 就这样， 女娲白天和金牛出去上浮山炼石， 晚上用钥匙打开\n" + 
				"锁子，回宫休息。七七四十九天头上，五色彩石炼好了，女娲便用锁将石门锁好，她一个人去找\"撑天柱\"去了。找啊找，在海里找到大螯。那大整的腿很长，她要将大整的腿折下来作为撑天柱，大鳌不让，打起来，女娲打败了大鳌，折了鳌腿。女娲没1到，她和大鳌搏斗时，将开锁的钥匙掉到海里了。\n" + 
				"女娲用鳌腿撑住天，用炼好的五彩石把天补好了，准备打开石门上的锁，牵金牛驮行宫向玉皇大帝交旨，可是找不到开锁的钥匙了，只好自己回天宫去。这么一来，就在上艾留下她的翡翠玉冠，玉冠下盖着王母娘娘的逍遥宫。那给女娲出主意的金牛，再回不到天宫，着急了，就拉着金磨在里面转呀转呀，转个不停。\n" + 
				"据说，王母娘娘丢了逍遥宫，查实是女娲偷的，便罚女娲下凡造人。女娲创造了人给人讲了她丢钥匙的事，让人帮她找钥匙，人才知道那像帽一样的山是女娲的翡翠玉冠\n" ;
		
		String result = NlpirMethod.NLPIR_ParagraphProcess(content, 1);
		System.out.println(result);
	}

	/**
	 * 测试文本路径分词
	 */
	//@Test
	public void testFileProcess(){
//		double flag = NlpirMethod.NLPIR_FileProcess("test/source.txt", "test/result39.txt", 1);
		double flag = NlpirMethod.NLPIR_FileProcess("shenhuatest/shenhua_1.txt", "shenhuaresult/shenhuaresult_1", 1);
		System.out.println(flag);
	}
	//任意路径

	public void testfile(String socrefilename,String resultfilename) {
		double flag = NlpirMethod.NLPIR_FileProcess(socrefilename, resultfilename, 1);
		System.out.println(flag);
	}
	/**
	 * 测试细粒度分词
	 */
	//@Test
	public void testFinerSegment(){
		String content = "据俄罗斯卫星网8月11日发布美国《国家利益》杂志刊登的文章称，中国购买俄制苏-27第四代战机，为本国空军翻开了现代史的页章。" +
				"从那时起，中国空军日益强大。中国空军长期以来落后于像美国这样的世界大国，从2008年起中国开始研制堪舆美国F-22猛禽战机和F-35闪电-II相媲美的第五代战机J-20和J-31，" +
				"不仅用它们装备本国空军，而且还在国际市场销售。它让中国具有了远程打击的能力，能达到西太平洋的任何地点。J-31可能成为J-20的有力补充，是理想的战机，能在西太平洋切断重要地区。" +
				"J-31升空后，完全能应对美国的F-35。这些战机能从根本上改变中国同美国以及同台湾地区冲突的走向。如果中国大陆通过台湾海峡进攻台湾(解放军每年都要进行这方面的演练)，" +
				"因为拥有最先进的战机而具有的空中优势是解放军进攻取胜的关键因素。这无疑应当引起美国的不安，无论是从战略上，还是从战术上以及从机动性上，美国《国家利益》警告。";
		String result = NlpirMethod.NLPIR_FinerSegment(content);
		System.out.println(result);
	}

	/**
	 * 测试文本关键词
	 */
	//@Test
	public void testKeyWords(){
		String content="很古很古的时候，西北天际忽然塌了一角，天一开口，狂风大作，雨雪冰雹，倾渴\n" + 
				"不止，地上成了洪流冰川世界。玉皇大帝急忙派女娲下凡炼石补天。\n" + 
				"女娲牵着金牛，驮着金磨、金锅，来到浮山。白天，金牛拉磨碎石，女娲升火冶炼，\n" + 
				"辛苦劳累，倒也不觉什么。可是到了晚上，寒气袭人，冷得女娲和金牛不能入睡休息。金牛就给女娲出了个主意，去天上带个行宫下来。于是女娲和金牛偷偷回到天宫，把王母娘娘的逍遥宫驮下来，放在现在平定城西八十里路的地方，准备晚上住宿。谁知那宫一\n" + 
				"落凡界，金碧辉煌， 闪闪发光。女娲怕被王母娘娘看见，就摘下自己的翡翠玉冠，吹口仙气，那冠帽立刻变大，罩在逍遥宫上。晚上女娲和金牛就住在里面，不冷不热，倒也舒适。白天女娲和金牛去浮山炼石时，女娲总担心丢掉王母娘娘的逍遥宫。金牛又出主意让女娲用锁将石门锁上。 就这样， 女娲白天和金牛出去上浮山炼石， 晚上用钥匙打开\n" + 
				"锁子，回宫休息。七七四十九天头上，五色彩石炼好了，女娲便用锁将石门锁好，她一个人去找\"撑天柱\"去了。找啊找，在海里找到大螯。那大整的腿很长，她要将大整的腿折下来作为撑天柱，大鳌不让，打起来，女娲打败了大鳌，折了鳌腿。女娲没1到，她和大鳌搏斗时，将开锁的钥匙掉到海里了。\n" + 
				"女娲用鳌腿撑住天，用炼好的五彩石把天补好了，准备打开石门上的锁，牵金牛驮行宫向玉皇大帝交旨，可是找不到开锁的钥匙了，只好自己回天宫去。这么一来，就在上艾留下她的翡翠玉冠，玉冠下盖着王母娘娘的逍遥宫。那给女娲出主意的金牛，再回不到天宫，着急了，就拉着金磨在里面转呀转呀，转个不停。\n" + 
				"据说，王母娘娘丢了逍遥宫，查实是女娲偷的，便罚女娲下凡造人。女娲创造了人给人讲了她丢钥匙的事，让人帮她找钥匙，人才知道那像帽一样的山是女娲的翡翠玉冠\n" + 
				"";
		String content1 = "据俄罗斯卫星网8月11日发布美国《国家利益》杂志刊登的文章称，中国购买俄制苏-27第四代战机，为本国空军翻开了现代史的页章。" +
				"从那时起，中国空军日益强大。中国空军长期以来落后于像美国这样的世界大国，从2008年起中国开始研制堪舆美国F-22猛禽战机和F-35闪电-II相媲美的第五代战机J-20和J-31，" +
				"不仅用它们装备本国空军，而且还在国际市场销售。它让中国具有了远程打击的能力，能达到西太平洋的任何地点。J-31可能成为J-20的有力补充，是理想的战机，能在西太平洋切断重要地区。" +
				"J-31升空后，完全能应对美国的F-35。这些战机能从根本上改变中国同美国以及同台湾地区冲突的走向。如果中国大陆通过台湾海峡进攻台湾(解放军每年都要进行这方面的演练)，" +
				"因为拥有最先进的战机而具有的空中优势是解放军进攻取胜的关键因素。这无疑应当引起美国的不安，无论是从战略上，还是从战术上以及从机动性上，美国《国家利益》警告。";
		String result = NlpirMethod.NLPIR_GetKeyWords(content, 100, true);
		System.out.println(result);
	}

	/**
	 * 测试文本路径关键词
	 */
	//@Test
	public void testFileKeyWords(){
		String result = NlpirMethod.NLPIR_GetFileKeyWords("test/source.txt", 100, true);
		System.out.println(result);
	}
    //自定义路径
	public void testfileKeywords(String soucre){
		String result = NlpirMethod.NLPIR_GetFileKeyWords(soucre, 100, true);
		System.out.println(result);
	}
	/**
	 * 测试文本新词(有时文本太短，没有新词)
	 */
	//@Test
	public void testNewWords(){
		String content="很古很古的时候，西北天际忽然塌了一角，天一开口，狂风大作，雨雪冰雹，倾渴\n" + 
				"不止，地上成了洪流冰川世界。玉皇大帝急忙派女娲下凡炼石补天。\n" + 
				"女娲牵着金牛，驮着金磨、金锅，来到浮山。白天，金牛拉磨碎石，女娲升火冶炼，\n" + 
				"辛苦劳累，倒也不觉什么。可是到了晚上，寒气袭人，冷得女娲和金牛不能入睡休息。金牛就给女娲出了个主意，去天上带个行宫下来。于是女娲和金牛偷偷回到天宫，把王母娘娘的逍遥宫驮下来，放在现在平定城西八十里路的地方，准备晚上住宿。谁知那宫一\n" + 
				"落凡界，金碧辉煌， 闪闪发光。女娲怕被王母娘娘看见，就摘下自己的翡翠玉冠，吹口仙气，那冠帽立刻变大，罩在逍遥宫上。晚上女娲和金牛就住在里面，不冷不热，倒也舒适。白天女娲和金牛去浮山炼石时，女娲总担心丢掉王母娘娘的逍遥宫。金牛又出主意让女娲用锁将石门锁上。 就这样， 女娲白天和金牛出去上浮山炼石， 晚上用钥匙打开\n" + 
				"锁子，回宫休息。七七四十九天头上，五色彩石炼好了，女娲便用锁将石门锁好，她一个人去找\"撑天柱\"去了。找啊找，在海里找到大螯。那大整的腿很长，她要将大整的腿折下来作为撑天柱，大鳌不让，打起来，女娲打败了大鳌，折了鳌腿。女娲没1到，她和大鳌搏斗时，将开锁的钥匙掉到海里了。\n" + 
				"女娲用鳌腿撑住天，用炼好的五彩石把天补好了，准备打开石门上的锁，牵金牛驮行宫向玉皇大帝交旨，可是找不到开锁的钥匙了，只好自己回天宫去。这么一来，就在上艾留下她的翡翠玉冠，玉冠下盖着王母娘娘的逍遥宫。那给女娲出主意的金牛，再回不到天宫，着急了，就拉着金磨在里面转呀转呀，转个不停。\n" + 
				"据说，王母娘娘丢了逍遥宫，查实是女娲偷的，便罚女娲下凡造人。女娲创造了人给人讲了她丢钥匙的事，让人帮她找钥匙，人才知道那像帽一样的山是女娲的翡翠玉冠\n" + 
				"";
		String content1 = "日前，网友上传了052D型驱逐舰173号长沙舰在蓝色水面上航行照片。有网友猜测，长沙舰已经交付南海舰队，是中国海军已列装的第二艘，同时也是最新一艘的052D型神盾级驱逐舰。" +
				"新闻延伸：英国《简氏防务周刊》近日再次谈及中国海军更新换代的热点话题，报道称，中国第二艘052D型导弹驱逐舰长沙舰于7月中旬服役，并已加入解放军南海舰队，预计将部署到海南岛亚龙湾基地。" +
				"它是这种中国最先进驱逐舰的第二艘，首舰昆明舰于2014年3月服役，并进行了一系列广泛的系统测试。报道称“052D与之前的型号相比，武器系统的主要变化是更换了新型相控阵雷达和通用型垂直发射系统，" +
				"后者可以同时容纳防空导弹、反潜导弹、反舰导弹和巡航导弹。因此需要花费较长时间进行密集测试。”让西方吃惊的是这种新型驱逐舰的建造速度。据称第七艘052D型驱逐舰已于7月下水，江南造船厂的船台上还在建造第八和第九艘。" +
				"052D型驱逐舰的建造规模已达到12艘，其中4艘将配属未来航母战斗群。它舰长160米、宽18米，排水量超过7000吨，作战性能居解放军海军主力舰只之首。除了导弹驱逐舰外，054A新型导弹护卫舰的建造速度也同样让外界吃惊。" +
				"《简氏防务周刊》称，扬州舰和邯郸舰已交付中国海军，它们分别是054A型导弹护卫舰的第19和第20艘。在上海和广州的造船厂中，各自还在建造两艘同级护卫舰。054A型护卫舰的首舰于2008年服役，它被视为中国第一种区域防空型护卫舰，" +
				"外形采用隐身设计，并配备有新型垂直发射系统。它曾参加过国际远航活动、索马里反海盗等，为中国海军累积了可观的远洋经验。对于中国的军舰更新速度，西方一直保持警惕。美国海军报告认为，中国海军造舰速度已经远超其他国家，" +
				"以现有速度扩充下去，很可能在2020年超过美国海军。不过有分析认为，无论是现有舰队组成还是每年更新的舰艇类型，中国海军的更新换代暂时还处于“补旧账”阶段，远谈不上超过美国海军。";
		String result = NlpirMethod.NLPIR_GetNewWords(content, 100, true);
		AdduserS(result);
		System.out.println(result);
		
	}

	/**
	 * 测试文本路径新词(有时文本太短，没有新词)
	 */
	//@Test
	public void testFileNewWords(){
		String result = NlpirMethod.NLPIR_GetFileNewWords("test/source.txt", 100, true);
		System.out.println(result);
	}

	/**
	 * 测试添加用户自定义词
	 */
	//@Test
	public void testAddUserWord(){
		int flag1 = NlpirMethod.NLPIR_AddUserWord("卫星网 user");
		System.out.println(flag1);
		
		int flag2 = NlpirMethod.NLPIR_SaveTheUsrDic();
		System.out.println(flag2);
		
		String content = "据俄罗斯卫星网8月11日发布美国《国家利益》杂志刊登的文章称，中国购买俄制苏-27第四代战机，为本国空军翻开了现代史的页章。" +
				"从那时起，中国空军日益强大。中国空军长期以来落后于像美国这样的世界大国，从2008年起中国开始研制堪舆美国F-22猛禽战机和F-35闪电-II相媲美的第五代战机J-20和J-31，" +
				"不仅用它们装备本国空军，而且还在国际市场销售。它让中国具有了远程打击的能力，能达到西太平洋的任何地点。J-31可能成为J-20的有力补充，是理想的战机，能在西太平洋切断重要地区。" +
				"J-31升空后，完全能应对美国的F-35。这些战机能从根本上改变中国同美国以及同台湾地区冲突的走向。如果中国大陆通过台湾海峡进攻台湾(解放军每年都要进行这方面的演练)，" +
				"因为拥有最先进的战机而具有的空中优势是解放军进攻取胜的关键因素。这无疑应当引起美国的不安，无论是从战略上，还是从战术上以及从机动性上，美国《国家利益》警告。";
		String result = NlpirMethod.NLPIR_ParagraphProcess(content, 1);
		System.out.println(result);
	}

	/**
	 * 测试删除用户自定义词
	 */
	//@Test
	public void testDelUsrWord(){
		int flag1 = NlpirMethod.NLPIR_DelUsrWord("国家利益");
		System.out.println(flag1);
		
		int flag2 = NlpirMethod.NLPIR_SaveTheUsrDic();
		System.out.println(flag2);
		
		String content = "据俄罗斯卫星网8月11日发布美国《国家利益》杂志刊登的文章称，中国购买俄制苏-27第四代战机，为本国空军翻开了现代史的页章。" +
				"从那时起，中国空军日益强大。中国空军长期以来落后于像美国这样的世界大国，从2008年起中国开始研制堪舆美国F-22猛禽战机和F-35闪电-II相媲美的第五代战机J-20和J-31，" +
				"不仅用它们装备本国空军，而且还在国际市场销售。它让中国具有了远程打击的能力，能达到西太平洋的任何地点。J-31可能成为J-20的有力补充，是理想的战机，能在西太平洋切断重要地区。" +
				"J-31升空后，完全能应对美国的F-35。这些战机能从根本上改变中国同美国以及同台湾地区冲突的走向。如果中国大陆通过台湾海峡进攻台湾(解放军每年都要进行这方面的演练)，" +
				"因为拥有最先进的战机而具有的空中优势是解放军进攻取胜的关键因素。这无疑应当引起美国的不安，无论是从战略上，还是从战术上以及从机动性上，美国《国家利益》警告。";
		String result = NlpirMethod.NLPIR_ParagraphProcess(content, 1);
		System.out.println(result);
	}

	/**
	 * 测试导入用户词典
	 */
	//@Test
	public void testImportUserDict(){
		int flag = NlpirMethod.NLPIR_ImportUserDict("dict/kkk.txt", true);
//		int flag1 = NlpirMethod.NLPIR_ImportUserDict("dict/ns.txt", true);
		System.out.println(flag);
//		System.out.println(flag1);
	}

	/**
	 * 测试导入关键词黑名单
	 */
	//@Test
	public void testImportKeyBlack(){
		int flag = NlpirMethod.NLPIR_ImportKeyBlackList("dict/black_dict.txt");
		System.out.println(flag);
	}

	/**
	 * 测试文章指纹码
	 */
	//@Test
	public void testFingerPrint(){
		String content = "日前，网友上传了052D型驱逐舰173号长沙舰在蓝色水面上航行照片。有网友猜测，长沙舰已经交付南海舰队，是中国海军已列装的第二艘，同时也是最新一艘的052D型神盾级驱逐舰。" +
				"新闻延伸：英国《简氏防务周刊》近日再次谈及中国海军更新换代的热点话题，报道称，中国第二艘052D型导弹驱逐舰长沙舰于7月中旬服役，并已加入解放军南海舰队，预计将部署到海南岛亚龙湾基地。" +
				"它是这种中国最先进驱逐舰的第二艘，首舰昆明舰于2014年3月服役，并进行了一系列广泛的系统测试。报道称“052D与之前的型号相比，武器系统的主要变化是更换了新型相控阵雷达和通用型垂直发射系统，" +
				"后者可以同时容纳防空导弹、反潜导弹、反舰导弹和巡航导弹。因此需要花费较长时间进行密集测试。”让西方吃惊的是这种新型驱逐舰的建造速度。据称第七艘052D型驱逐舰已于7月下水，江南造船厂的船台上还在建造第八和第九艘。" +
				"052D型驱逐舰的建造规模已达到12艘，其中4艘将配属未来航母战斗群。它舰长160米、宽18米，排水量超过7000吨，作战性能居解放军海军主力舰只之首。除了导弹驱逐舰外，054A新型导弹护卫舰的建造速度也同样让外界吃惊。" +
				"《简氏防务周刊》称，扬州舰和邯郸舰已交付中国海军，它们分别是054A型导弹护卫舰的第19和第20艘。在上海和广州的造船厂中，各自还在建造两艘同级护卫舰。054A型护卫舰的首舰于2008年服役，它被视为中国第一种区域防空型护卫舰，" +
				"外形采用隐身设计，并配备有新型垂直发射系统。它曾参加过国际远航活动、索马里反海盗等，为中国海军累积了可观的远洋经验。对于中国的军舰更新速度，西方一直保持警惕。美国海军报告认为，中国海军造舰速度已经远超其他国家，" +
				"以现有速度扩充下去，很可能在2020年超过美国海军。不过有分析认为，无论是现有舰队组成还是每年更新的舰艇类型，中国海军的更新换代暂时还处于“补旧账”阶段，远谈不上超过美国海军。";
		long flag = NlpirMethod.NLPIR_FingerPrint(content);
		System.out.println(flag);
	}

	/**
	 * 测试单词词性
	 */
	//@Test
	public void testWordPOS(){
		String result = NlpirMethod.NLPIR_GetWordPOS("中国");
		System.out.println(result);
	}

	/**
	 * 测试是否在词库中
	 */
	//@Test
	public void testIsWord(){
		int flag = NlpirMethod.NLPIR_IsWord("中国");
		System.out.println(flag);
	}

	/**
	 * 测试文本词频
	 */
	//@Test
	public void testWordFreq(){
		String content="很古很古的时候，西北天际忽然塌了一角，天一开口，狂风大作，雨雪冰雹，倾渴\n" + 
				"不止，地上成了洪流冰川世界。玉皇大帝急忙派女娲下凡炼石补天。\n" + 
				"女娲牵着金牛，驮着金磨、金锅，来到浮山。白天，金牛拉磨碎石，女娲升火冶炼，\n" + 
				"辛苦劳累，倒也不觉什么。可是到了晚上，寒气袭人，冷得女娲和金牛不能入睡休息。金牛就给女娲出了个主意，去天上带个行宫下来。于是女娲和金牛偷偷回到天宫，把王母娘娘的逍遥宫驮下来，放在现在平定城西八十里路的地方，准备晚上住宿。谁知那宫一\n" + 
				"落凡界，金碧辉煌， 闪闪发光。女娲怕被王母娘娘看见，就摘下自己的翡翠玉冠，吹口仙气，那冠帽立刻变大，罩在逍遥宫上。晚上女娲和金牛就住在里面，不冷不热，倒也舒适。白天女娲和金牛去浮山炼石时，女娲总担心丢掉王母娘娘的逍遥宫。金牛又出主意让女娲用锁将石门锁上。 就这样， 女娲白天和金牛出去上浮山炼石， 晚上用钥匙打开\n" + 
				"锁子，回宫休息。七七四十九天头上，五色彩石炼好了，女娲便用锁将石门锁好，她一个人去找\"撑天柱\"去了。找啊找，在海里找到大螯。那大整的腿很长，她要将大整的腿折下来作为撑天柱，大鳌不让，打起来，女娲打败了大鳌，折了鳌腿。女娲没1到，她和大鳌搏斗时，将开锁的钥匙掉到海里了。\n" + 
				"女娲用鳌腿撑住天，用炼好的五彩石把天补好了，准备打开石门上的锁，牵金牛驮行宫向玉皇大帝交旨，可是找不到开锁的钥匙了，只好自己回天宫去。这么一来，就在上艾留下她的翡翠玉冠，玉冠下盖着王母娘娘的逍遥宫。那给女娲出主意的金牛，再回不到天宫，着急了，就拉着金磨在里面转呀转呀，转个不停。\n" + 
				"据说，王母娘娘丢了逍遥宫，查实是女娲偷的，便罚女娲下凡造人。女娲创造了人给人讲了她丢钥匙的事，让人帮她找钥匙，人才知道那像帽一样的山是女娲的翡翠玉冠\n" + 
				"";
		String content1 = "据俄罗斯卫星网8月11日发布美国《国家利益》杂志刊登的文章称，中国购买俄制苏-27第四代战机，为本国空军翻开了现代史的页章。" +
				"从那时起，中国空军日益强大。中国空军长期以来落后于像美国这样的世界大国，从2008年起中国开始研制堪舆美国F-22猛禽战机和F-35闪电-II相媲美的第五代战机J-20和J-31，" +
				"不仅用它们装备本国空军，而且还在国际市场销售。它让中国具有了远程打击的能力，能达到西太平洋的任何地点。J-31可能成为J-20的有力补充，是理想的战机，能在西太平洋切断重要地区。" +
				"J-31升空后，完全能应对美国的F-35。这些战机能从根本上改变中国同美国以及同台湾地区冲突的走向。如果中国大陆通过台湾海峡进攻台湾(解放军每年都要进行这方面的演练)，" +
				"因为拥有最先进的战机而具有的空中优势是解放军进攻取胜的关键因素。这无疑应当引起美国的不安，无论是从战略上，还是从战术上以及从机动性上，美国《国家利益》警告。";
		String result = NlpirMethod.NLPIR_WordFreqStat(content);
		System.out.println(result);
	}

	/**
	 * 测试文本路径词频
	 */
	//@Test
	public void testFileWordFreq(){
		String result = NlpirMethod.NLPIR_FileWordFreqStat("test/source.txt");
		System.out.println(result);
	}

	/**
	 * 测试英文单词原型
	 */
	//@Test
	public void testEngWordOrign(){
		String result = NlpirMethod.NLPIR_GetEngWordOrign("got");
		System.out.println(result);
	}
	/*
	 * 添加用户词典以字符串的方式/
	 */
	public  void AdduserS(String userWord) {
		NlpirMethod.NLPIR_AddUserWord(userWord);
	}
   /*
    * 添加用户词典以文本的方式/
    * 导入用户自定义词典
	 * 
	 * @param dictFileName
	 *            用户词典的路径
	 * @param bOverwrite
	 *            是否删除原有的自定义用户词典，true：删除；false：不删除
	 * @return 导入用户单词个数 备注：系统会自动处理重复词的问题
	 */
	public static void AdduserF(String dictFileName,boolean bOverwrite) {
		NlpirMethod.NLPIR_ImportUserDict(dictFileName, bOverwrite);
	}
	/**
	 * 保存用户自定义词(保存到文件中)
	 * 
	 * @return 1：成功；0：失败
	 */
	public void  SaveTheUsrDic() {
		NlpirMethod.NLPIR_SaveTheUsrDic();
	}
	public void Exit() {
		boolean flag=NlpirMethod.NLPIR_Exit();
		System.out.println(flag);
	}
}