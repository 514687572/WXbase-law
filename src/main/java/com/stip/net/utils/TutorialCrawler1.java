package com.stip.net.utils;

import org.jsoup.select.Elements;

import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.plugin.berkeley.BreadthCrawler;

public class TutorialCrawler1 extends BreadthCrawler {

    public TutorialCrawler1(String crawlPath, boolean autoParse) {
        super(crawlPath, autoParse);
    }

    /*
        可以往next中添加希望后续爬取的任务，任务可以是URL或者CrawlDatum
        爬虫不会重复爬取任务，从2.20版之后，爬虫根据CrawlDatum的key去重，而不是URL
        因此如果希望重复爬取某个URL，只要将CrawlDatum的key设置为一个历史中不存在的值即可
        例如增量爬取，可以使用 爬取时间+URL作为key。

        新版本中，可以直接通过 page.select(css选择器)方法来抽取网页中的信息，等价于
        page.getDoc().select(css选择器)方法，page.getDoc()获取到的是Jsoup中的
        Document对象，细节请参考Jsoup教程
    */
    @Override
    public void visit(Page page, CrawlDatums next) {
            String title = page.select("div[class=show_box]").select("h1").first().text();
            String[] e = page.select("div[class=show_box]").select("div[class=mbdesc]").select("p").first().text().split(" 　　");
            System.out.println(title);
            String[] m2=e[0].split(" ");
            System.out.println(m2[0].replaceAll("　　", ""));
            System.out.println(m2[1]);
            
            String[] m3=e[1].split("：");
        	for(int j=0;j<m3.length;j++) {
        		System.out.println(m3[j]);
        	}
        	String[] n4=e[2].split("：");
        	for(int j=0;j<n4.length;j++) {
        		System.out.println(n4[j]);
        	}
        	
        	String d2= page.select("h2[id=mybr1]").first().text();
            System.out.println(d2);
            
            Elements a=page.select("div[class=mbdesc]").get(1).select("p");
            int p= a.size();
            String book="";
            for(int i=0;i<p;i++) {
            	String b=a.get(i).text();
            	if("幸运数字和守护星".equals(b.replaceAll("　　", ""))) {
            		System.out.println(b);
            		i++;
            		System.out.println(a.get(i).text());
            	}else if("健康".equals(b.replaceAll("　　", ""))) {
            		System.out.println(b);
            		i++;
            		System.out.println(a.get(i).text());
            	}else if("建议".equals(b.replaceAll("　　", ""))) {
            		System.out.println(b);
            		i++;
            		System.out.println(a.get(i).text());
            	}else if("塔罗牌".equals(b.replaceAll("　　", ""))) {
            		System.out.println(b);
            		i++;
            		System.out.println(a.get(i).text());
            	}else if("静思语".equals(b.replaceAll("　　", ""))) {
            		System.out.println(b);
            		i++;
            		System.out.println(a.get(i).text());
            	}else if("优点".equals(b.replaceAll("　　", ""))) {
            		System.out.println(b);
            		i++;
            		System.out.println(a.get(i).text());
            	}else if("缺点".equals(b.replaceAll("　　", ""))) {
            		System.out.println(b);
            		i++;
            		System.out.println(a.get(i).text());
            	}else {
            		book+=b+"just_split";
            		System.out.println(book);
            	}
            }
            
            String d4= page.select("h2[id=mybr2]").first().text();
            System.out.println(d4);
            
            Elements a1=page.select("div[class=mbdesc]").get(2).select("p");
            int p1= a1.size();
            for(int i=0;i<p1;i++) {
            	String b1=a1.get(i).text();
            	if(b1.replaceAll("　　", "").startsWith("生日花：")) {
            		String[] j3=b1.split("：");
                	for(int j=0;j<j3.length;j++) {
                		System.out.println(j3[j]);
                	}
            		i++;
            		System.out.println(a1.get(i).text());
            		i++;
            		System.out.println(a1.get(i).text());
            	}if(b1.replaceAll("　　", "").startsWith("花语：")) {
            		String[] j3=b1.split("：");
                	for(int j=0;j<j3.length;j++) {
                		System.out.println(j3[j]);
                	}
            		i++;
            		System.out.println(a1.get(i).text());
            	}else {
            		System.out.println(b1);
            	}
            }
            
            String d5= page.select("h2[id=mybr3]").first().text();
            System.out.println(d5);
            
            Elements a2=page.select("div[class=mbdesc]").get(3).select("p");
            int p2= a2.size();
            for(int i=0;i<p2;i++) {
            	String b2=a2.get(i).text();
            	if(b2.replaceAll("　　", "").startsWith("诞生石：")) {
            		String[] j3=b2.split("：");
                	for(int j=0;j<j3.length;j++) {
                		System.out.println(j3[j]);
                	}
            		i++;
            		System.out.println(a2.get(i).text());
            		i++;
            		System.out.println(a2.get(i).text());
            	}if(b2.replaceAll("　　", "").endsWith("的传说")) {
            		String[] j3=b2.split("：");
                	for(int j=0;j<j3.length;j++) {
                		System.out.println(j3[j]);
                	}
            		i++;
            		System.out.println(a2.get(i).text());
            	}else {
            		System.out.println(b2);
            	}
            }
            
            String d6= page.select("h2[id=mybr4]").first().text();
            System.out.println(d6);
            
            Elements a3=page.select("div[class=mbdesc]").get(4).select("p");
            int p3= a3.size();
            for(int i=0;i<p3;i++) {
            	String[] b3=a3.get(i).text().split("：");
            	for(int j=0;j<b3.length;j++) {
            		System.out.println(b3[j]);
            	}
            }
            
            String d7= page.select("h2[id=mybr5]").first().text();
            System.out.println(d7);
            
            Elements a4=page.select("div[class=mbdesc]").get(5).select("p");
            int p4= a4.size();
            for(int i=0;i<p4;i++) {
            	String[] b4=a4.get(i).text().split(" 　　");
            	for(int j=0;j<b4.length;j++) {
            		System.out.println(b4[j].replaceAll("　　", ""));
            	}
            }
            
            String d8= page.select("h2[id=mybr6]").first().text();
            System.out.println(d8);
            
            Elements a5=page.select("div[class=mbdesc]").get(6).select("p");
            int p5= a5.size();
            for(int i=0;i<p5;i++) {
            	String[] b5=a5.get(i).text().split(" 　　");
            	for(int j=0;j<b5.length;j++) {
            		System.out.println(b5[j].replaceAll("　　", ""));
            	}
            }
    }

    public static void main(String[] args) throws Exception {
    	for(int i=0;i<365;i++) {
    		String url="http://m.fututa.com/baike/a"+(29+i)+"/";
    		
    		TutorialCrawler1 crawler = new TutorialCrawler1("crawler"+i, true);
    		crawler.addSeed(url);
    		
    		/*可以设置每个线程visit的间隔，这里是毫秒*/
    		//crawler.setVisitInterval(1000);
    		/*可以设置http请求重试的间隔，这里是毫秒*/
    		//crawler.setRetryInterval(1000);
    		
    		crawler.setThreads(30);
    		crawler.start(2);
    	}
    }

}
