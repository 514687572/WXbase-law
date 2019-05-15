package com.stip.net.utils;

public class Constantutils {
	public static String wxapp_appid="wx581efbf4924a6b9e";
	public static String flower_wxapp_appid="wxcb46903b66fe73e6";
	public static String wxapp_appsecret = "ff11b4fadf1962e7364526c968454055";
	public static String wxapp_token = "d3r34rt45t54AApp";
	public static String wxapp_aeskey = "uVlRsSIhSSVRXR5bCJCaqlXjiK8z11dEGSPC4dYM6Cd";
	public static String wx_appsecret = "1ba5e3f72fd665787ab75dfe28cb3eee";
	public static String wx_appid = "wxd648cfd0204906c1";
	public static String wx_token = "d3r34rt45t54AA";
	public static String wx_aeskey = "nKtLNLkBE4FjYRucib59Z2ycFh4hCYFvgIxNJrnyrfL";
	public static String APIKEY = "54f9ecea72674c15b6883623c71bcfd1";
	
	public static String url="https://open.weixin.qq.com/connect/oauth2/authorize?appid="+wx_appid+"&redirect_uri=http%3A%2F%2Fweixinmap.com%2Fwechat%2Fportal%2Fauth&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect";
	public static String add_url="https://open.weixin.qq.com/connect/oauth2/authorize?appid="+wx_appid+"&redirect_uri=http%3A%2F%2Fweixinmap.com%2Fwechat%2Fportal%2Fauth&response_type=code&scope=snsapi_userinfo&state=addDate#wechat_redirect";
	public static String message_url="https://open.weixin.qq.com/connect/oauth2/authorize?appid="+wx_appid+"&redirect_uri=http%3A%2F%2Fweixinmap.com%2Fwechat%2Fportal%2Fauth&response_type=code&scope=snsapi_userinfo&state=message#wechat_redirect";

	public static String ADD_DATE="addDate";
	public static String STATE="STATE";
	public static String message="message";
	public static String gh_id="gh_8d883a26372c";
	public static String temp_id="b0qafm7fzv8r62KLtRSWbpoPpTEtBv2-7CV8s7fuaqM";
	public static String transfer_customer_service="transfer_customer_service";
	
	//阿里云API的外网域名  
    public static final String ENDPOINT = "oss-cn-qingdao.aliyuncs.com";  
    //阿里云API的密钥Access Key ID  
    public static final String ACCESS_KEY_ID = "LTAI1vWBqPBxZKNe";  
    //阿里云API的密钥Access Key Secret  
    public static final String ACCESS_KEY_SECRET = "H13EvdZjarSZR0abMPRjPjKvVO3q2b";  
    //阿里云API的bucket名称  
    public static final String BACKET_NAME = "jnrzs";  
    //阿里云API的文件夹名称  
    public static final String FOLDER="his/"; 
    public static final String BG_FOLDER="datebg/"; 
	
	public static final String SENSITIVE_PATH1 = "com/stip/net/utils/eroticism.txt";// 热敏词汇地址
	public static final String SENSITIVE_PATH2 = "com/stip/net/utils/heresy.txt";// 热敏词汇地址
	public static final String SENSITIVE_PATH3 = "com/stip/net/utils/political.txt";// 热敏词汇地址
	public static final String SENSITIVE_PATH4 = "com/stip/net/utils/politician.txt";// 热敏词汇地址
	public static final String SENSITIVE_other = "com/stip/net/utils/other.txt";// 其他
	
	
	public static final String DATE_PRAISE = "praise";// 点赞
	public static final String DATE_GIFT = "gift";// 礼物
	
	public static final String BIRTHDAY = "birthday";// 生日
	public static final String LOVE = "love";// 爱情
	public static final String NEW = "new";// baby
	public static final String SECRET = "secret";// 生日密码
	
	public static final String remindTypeo = "不重复";// 不重复
	
	public static final String GETURL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+ Constantutils.wx_appid + "&secret=" + Constantutils.wx_appsecret; // 获取access_token的
	public static final String APPGETURL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+ Constantutils.wxapp_appid + "&secret=" + Constantutils.wxapp_appsecret; // 获取access_token的
	public static String send_templatemsg_url = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";
	public static String industry_id1 = "1"; // 行业id
	public static String industry_id2 = "2";// 行业id
	public static String setURL = "https://api.weixin.qq.com/cgi-bin/template/api_set_industry";
	public static String sendUrl = "https://api.weixin.qq.com/cgi-bin/message/template/send"; // 发送模版信息
	public static String custom_sendUrl = "https://api.weixin.qq.com/cgi-bin/message/custom/send"; // 客服发送模版信息
	public static String weixin_Url = "https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzIyMjY4MDAzOQ==&scene=124#wechat_redirect";
	public static String weixin_Url_other = "http://mp.weixin.qq.com/s/a9q_DH1soiBBp1uqoZzvAw";
	public static String pic_weixin_Url = "https://weixinmap.com/images/20180109112817.png";
	public static String getmaUrl = "https://api.weixin.qq.com/cgi-bin/media/get?access_token=";
	public static String imagesUrlHeader = "http://jnrzs.oss-cn-qingdao.aliyuncs.com";
	public static String kefuurl = "https://api.weixin.qq.com/cgi-bin/customservice/getonlinekflist";
	
	// 统一下提现地址
	public static String UNIFIED_FEEDBACK_URL = "https://api.mch.weixin.qq.com/mmpaymkttransfers/promotion/transfers";
	
	public static final String CERTIFICATE_PATH = "com/stip/net/utils/apiclient_cert.p12";// 微信支付证书
	
	/**
	 * 小程序消息模板
	 */
	public static String app_temp_id="FffSouKNxRoCEASeGQHFrZh-XxdHCkSOvKrf3AykShY";
	/**
	 * 无纪念日记录
	 * 小程序消息模板
	 */
	public static String noRecords_temp_id="JN22SRjAZMxrdbBG7OeycQVZnvi8wMY5n9ew9fDCyDo";
	
	public static String app_sendUrl = "https://api.weixin.qq.com/cgi-bin/message/wxopen/template/send"; // 发送模版信息
	
	public static String ADMIN_USER = "o5zEWwEkOF33kHVzy9p8njjteQo4"; // 运营人员账户
	
	public static String ADMIN_USER_OPEN = "open"; 

}
