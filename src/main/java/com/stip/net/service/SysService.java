package com.stip.net.service;

import java.util.List;

import javax.annotation.Resource;

import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.stip.net.dao.BirthdaySecretDao;
import com.stip.net.dao.DictionaryDao;
import com.stip.net.entity.BirthdaySecret;
import com.stip.net.entity.Dictionary;
import com.stip.net.example.BirthdaySecretExample;
import com.stip.net.example.DictionaryExample;
import com.stip.net.utils.GrnerateUUID;

import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.plugin.berkeley.BreadthCrawler;

@Service
public class SysService extends BreadthCrawler {
	@Resource
	public DictionaryDao dictionaryDao;
	@Resource
	public BirthdaySecretDao birthdaySecretDao;

	public Dictionary getDicByKey(String key) {
		DictionaryExample example = new DictionaryExample();
		example.createCriteria().andDicKeyEqualTo(key);
		List<Dictionary> dicList = dictionaryDao.selectByExample(example);

		if (dicList != null && dicList.size() > 0) {
			return dicList.get(0);
		} else {
			return null;
		}
	}
	
	public BirthdaySecret getBirthdaySecretByKey(String key) {
		BirthdaySecretExample example = new BirthdaySecretExample();
		example.createCriteria().andSecretDateKeyEqualTo(key);
		List<BirthdaySecret> dicList = birthdaySecretDao.selectByExample(example);
		
		if (dicList != null && dicList.size() > 0) {
			return dicList.get(0);
		} else {
			return null;
		}
	}

	public void insertUser(Dictionary dic) {
		dictionaryDao.insert(dic);
	}

	public void updateByPrimaryKey(Dictionary dic) {
		dictionaryDao.updateByPrimaryKey(dic);
	}

	public SysService(String crawlPath, boolean autoParse) {
		super(crawlPath, autoParse);
	}
	
	public SysService() {
		super("crawler", true);
	}

	/*
	 * 可以往next中添加希望后续爬取的任务，任务可以是URL或者CrawlDatum
	 * 爬虫不会重复爬取任务，从2.20版之后，爬虫根据CrawlDatum的key去重，而不是URL
	 * 因此如果希望重复爬取某个URL，只要将CrawlDatum的key设置为一个历史中不存在的值即可 例如增量爬取，可以使用 爬取时间+URL作为key。
	 * 
	 * 新版本中，可以直接通过 page.select(css选择器)方法来抽取网页中的信息，等价于
	 * page.getDoc().select(css选择器)方法，page.getDoc()获取到的是Jsoup中的
	 * Document对象，细节请参考Jsoup教程
	 */
	@Override
	public synchronized  void visit(Page page, CrawlDatums next) {
		BirthdaySecret bir = new BirthdaySecret();
		String title = page.select("div[class=show_box]").select("h1").first().text();
		String[] e = page.select("div[class=show_box]").select("div[class=mbdesc]").select("p").first().text().split(" 　　");
		bir.setSecretId(GrnerateUUID.getUUID());
		String[] m2 = e[0].split(" ");
		System.out.println(m2[0].replaceAll("　　", ""));
		System.out.println(m2[1]);
		bir.setSecretTitle(m2[1]);
		bir.setSecretDateKey(m2[0].replaceAll("　　", "").replace("月", "-").replace("日", ""));
		bir.setSecretDateValue(m2[0].replaceAll("　　", ""));

		String[] m3 = e[1].split("：");
		bir.setSecretPosition(m3[1]);
		String[] n4 = e[2].split("：");
		bir.setSecretStar(n4[1]);

		String d2 = page.select("h2[id=mybr1]").first().text();
		System.out.println(d2);

		boolean as=false;
		Elements a = page.select("div[class=mbdesc]").get(1).select("p");
		int p = a.size();
		String book = "";
/*		for (int i = 0; i < p; i++) {
			String b = a.get(i).text();
			if (b.replaceAll("　　", "").startsWith("幸运数字和守护星")) {
				as=true;
				System.out.println(b);
				i++;
				System.out.println(a.get(i).text());
				bir.setSecretNum(a.get(i).text());
			} else if ("健康".equals(b.replaceAll("　　", ""))) {
				System.out.println(b);
				i++;
				System.out.println(a.get(i).text());
				bir.setSecretHealthy(a.get(i).text());
			} else if ("建议".equals(b.replaceAll("　　", ""))) {
				System.out.println(b);
				i++;
				System.out.println(a.get(i).text());
				bir.setSecretAdvice(a.get(i).text());
			} else if ("塔罗牌".equals(b.replaceAll("　　", ""))) {
				System.out.println(b);
				i++;
				System.out.println(a.get(i).text());
				bir.setSecretTarot(a.get(i).text());
			} else if ("静思语".equals(b.replaceAll("　　", ""))) {
				System.out.println(b);
				i++;
				System.out.println(a.get(i).text());
				bir.setSecretTs(a.get(i).text());
			} else if ("优点".equals(b.replaceAll("　　", ""))) {
				System.out.println(b);
				i++;
				System.out.println(a.get(i).text());
				bir.setSecretGood(a.get(i).text());
			} else if ("缺点".equals(b.replaceAll("　　", ""))) {
				System.out.println(b);
				i++;
				System.out.println(a.get(i).text());
				bir.setSecretBad(a.get(i).text());
			} else {
				book += b + "just_split";
				System.out.println(book);
			}
		}
		
		bir.setSecretBook(book);*/
		

		if(!as) {
			for (int i = 0; i < p; i++) {
				String b = a.get(i).text().replaceAll("　　", "");
				if (b.startsWith("幸运数字和守护星")) {
					bir.setSecretNum(b.split("幸运数字和守护星")[1]);
				} else if (b.startsWith("健康")) {
					bir.setSecretHealthy(b.split("健康")[1]);
				} else if (b.startsWith("建议")) {
					bir.setSecretAdvice(b.split("建议")[1]);
				} else if (b.startsWith("塔罗牌")) {
					bir.setSecretTarot(b.split("塔罗牌 ")[1]);
				} else if (b.startsWith("静思语")) {
					bir.setSecretTs(b.split("静思语")[1]);
				} else if (b.startsWith("优点")) {
					bir.setSecretGood(b.split("优点")[1]);
				} else if (b.startsWith("缺点")) {
					bir.setSecretBad(b.split("缺点")[1]);
				} else {
					book += b + "just_split";
					System.out.println(book);
				}
			}
		
			bir.setSecretBook(book);
		}

		String d4 = page.select("h2[id=mybr2]").first().text();
		System.out.println(d4);

		Elements a1 = page.select("div[class=mbdesc]").get(2).select("p");
		int p1 = a1.size();
		for (int i = 0; i < p1; i++) {
			String b1 = a1.get(i).text();
			if (b1.replaceAll("　　", "").startsWith("生日花：")) {
				String[] j3 = b1.split("：");
				bir.setSecretFlower(j3[1]);
				i++;
				System.out.println(a1.get(i).text());
				String f="";
				f += a1.get(i).text() + "just_split";
				i++;
				f += a1.get(i).text() + "just_split";
				bir.setSecretFlowerDesc(f);
			}
			if (b1.replaceAll("　　", "").startsWith("花语：")) {
				String[] j3 = b1.split("：");
				bir.setSecretFlowerLan(j3[1]);
				i++;
				System.out.println(a1.get(i).text());
				bir.setSecretFlowerLanDesc(a1.get(i).text());
			} else {
				System.out.println(b1);
			}
		}

		String d5 = page.select("h2[id=mybr3]").first().text();
		System.out.println(d5);

		Elements a2 = page.select("div[class=mbdesc]").get(3).select("p");
		int p2 = a2.size();
		for (int i = 0; i < p2; i++) {
			String b2 = a2.get(i).text();
			if (b2.replaceAll("　　", "").startsWith("诞生石：")) {
				String[] j3 = b2.split("：");
				bir.setSecretStone(j3[1]);
				i++;
				String f="";
				f += a2.get(i).text() + "just_split";
				i++;
				f += a2.get(i).text() + "just_split";
				bir.setSecretStoneDesc(f);
			}
			if (b2.replaceAll("　　", "").endsWith("的传说")) {
				i++;
				bir.setSecretStoneLegend(a2.get(i).text());
			} else {
				System.out.println(b2);
			}
		}

		String d6 = page.select("h2[id=mybr4]").first().text();
		System.out.println(d6);

		Elements a3 = page.select("div[class=mbdesc]").get(4).select("p");
		int p3 = a3.size();
		for (int i = 0; i < p3; i++) {
			String[] b3 = a3.get(i).text().split("：");
			if(b3[0].replaceAll("　　", "").endsWith("巧克力")) {
				bir.setSecretChoco(b3[1]);
			}else if(b3[0].replaceAll("　　", "").endsWith("朱古力")) {
				bir.setSecretChoco(b3[1]);
			}else if(b3[0].replaceAll("　　", "").endsWith("成份")) {
				bir.setSecretChococ(b3[1]);
			}else if(b3[0].replaceAll("　　", "").endsWith("特性")) {
				bir.setSecretChocoChar(b3[1]);
			}else if(b3[0].replaceAll("　　", "").endsWith("生日占卜")) {
				bir.setSecretChocoDesc(b3[1]);
			}else if(b3[0].replaceAll("　　", "").endsWith("巧克力蜜语")) {
				bir.setSecretChocoLan(b3[1]);
			}else if(b3[0].replaceAll("　　", "").endsWith("朱古力蜜语")) {
				bir.setSecretChocoLan(b3[1]);
			}
		}

		String d7 = page.select("h2[id=mybr5]").first().text();
		System.out.println(d7);

		Elements a4 = page.select("div[class=mbdesc]").get(5).select("p");
		int p4 = a4.size();
		String f="";
		for (int i = 0; i < p4; i++) {
			if(i==15) {
				break;
			}
			String[] b4 = a4.get(i).text().split(" 　　");
			for (int j = 0; j < b4.length; j++) {
				System.out.println(b4[j].replaceAll("　　", ""));
				f += b4[j].replaceAll("　　", "") + "just_split";
			}
		}
		
		bir.setSecretCelebrity(f);

		String d8 = page.select("h2[id=mybr6]").first().text();
		System.out.println(d8);

		Elements a5 = page.select("div[class=mbdesc]").get(6).select("p");
		int p5 = a5.size();
		String m="";
		for (int i = 0; i < p5; i++) {
			String[] b5 = a5.get(i).text().split(" 　　");
			for (int j = 0; j < b5.length; j++) {
				System.out.println(b5[j].replaceAll("　　", ""));
				m += b5[j].replaceAll("　　", "") + "just_split";
			}
		}
		bir.setSecretCelebrityD(f);
		
		birthdaySecretDao.insert(bir);
	}


}
