package com.stip.net.utils;

import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.plugin.berkeley.BreadthCrawler;
import cn.edu.hfut.dmic.webcollector.util.Config;
import cn.edu.hfut.dmic.webcollector.util.FileUtils;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
 
/**
 * WebCollector抓取图片的例子
 * @author hu
 */
public class GetImages extends BreadthCrawler {
 
    //用于保存图片的文件夹
    File downloadDir;
     
    //原子性int，用于生成图片文件名
    AtomicInteger imageId;
     
    /**
     * 
     * @param crawlPath 用于维护URL的文件夹
     * @param downloadPath 用于保存图片的文件夹
     */
    public GetImages(String crawlPath, String downloadPath) {
        super(crawlPath, true);
        downloadDir = new File(downloadPath);
        if(!downloadDir.exists()){
            downloadDir.mkdirs();
        }
        computeImageId();
    }
 
    @Override
    public void visit(Page page, CrawlDatums next) {
        //根据http头中的Content-Type信息来判断当前资源是网页还是图片
        String contentType = page.contentType();
        System.out.println("*********************************************************"+contentType);
        if(contentType==null){
            return;
        }else if (contentType.contains("html")) {
            //如果是网页，则抽取其中包含图片的URL，放入后续任务
            Elements imgs = page.select("img[src]");
            for (Element img : imgs) {
                String imgSrc = img.attr("abs:src");
                next.add(imgSrc);
            }
             
        } else if (contentType.startsWith("image")) {
            //如果是图片，直接下载
            String extensionName=contentType.split("/")[1];
            String imageFileName="988"+imageId.incrementAndGet()+"."+extensionName;
            File imageFile=new File(downloadDir,imageFileName);
            try {
                FileUtils.write(imageFile, page.content());
                System.out.println("保存图片 "+page.url()+" 到 "+imageFile.getAbsolutePath());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
 
    }
 
/*    public static void main(String[] args) throws Exception {
    	for(int i=28841;i<1000000;i++) {
    		
        GetImages demoImageCrawler = new GetImages("craw2", "download");
        //添加种子URL
        demoImageCrawler.addSeed("https://www.620aa.com/htm/pic3/"+i+".htm");
        //限定爬取范围
        demoImageCrawler.addRegex("https://www.620aa.com/htm/pic3/"+i+".htm");
        
        //设置为断点爬取，否则每次开启爬虫都会重新爬取
        demoImageCrawler.setResumable(true);
        demoImageCrawler.setThreads(30);
        Config.MAX_RECEIVE_SIZE = 1000 * 1000 * 10;
        demoImageCrawler.start(3);
    	}
    }*/
    
    public static void main(String[] args) throws Exception {
    		for(int i=1;i<=339779;i++) {
    			GetImages demoImageCrawler = new GetImages("craw10", "headicon");
    			//添加种子URL
    			demoImageCrawler.addSeed("http://www.woyaogexing.com/touxiang/nan/index_"+i+".html");
    			//限定爬取范围
    			demoImageCrawler.addRegex("http://www.woyaogexing.com/touxiang/nan/index_"+i+".html");
    			
    			//设置为断点爬取，否则每次开启爬虫都会重新爬取
    			demoImageCrawler.setResumable(true);
    			demoImageCrawler.setThreads(30);
    			Config.MAX_RECEIVE_SIZE = 1000 * 1000 * 10;
    			demoImageCrawler.start(3);
    		}
    }
     
    public void computeImageId(){
        int maxId=-1;
        for(File imageFile:downloadDir.listFiles()){
            String fileName=imageFile.getName();
            String idStr=fileName.split("\\.")[0];
            int id=Integer.valueOf(idStr);
            if(id>maxId){
                maxId=id;
            }
        }
        imageId=new AtomicInteger(maxId);
    }
 
}