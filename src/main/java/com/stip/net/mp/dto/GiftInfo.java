package com.stip.net.mp.dto;

import java.util.Date;

import com.stip.net.utils.TimeUtils;

public class GiftInfo {
	private String outOrderNo;

	private String outOpenId;

	private String inOpenId;

	private String dateId;

	private Integer giftId;

	private String status;

	private Date createTime;
	
	private String strTime;

	private String giftName;

	private String giftPrice;

	private String giftImage;

	private Integer giftOrder;

	private String giftDesc;
	
	private String headimgurl;
	
	private String nickname;

	public String getOutOrderNo() {
		return outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutOpenId() {
		return outOpenId;
	}

	public void setOutOpenId(String outOpenId) {
		this.outOpenId = outOpenId;
	}

	public String getInOpenId() {
		return inOpenId;
	}

	public void setInOpenId(String inOpenId) {
		this.inOpenId = inOpenId;
	}

	public String getDateId() {
		return dateId;
	}

	public void setDateId(String dateId) {
		this.dateId = dateId;
	}

	public Integer getGiftId() {
		return giftId;
	}

	public void setGiftId(Integer giftId) {
		this.giftId = giftId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
		this.strTime=TimeUtils.dateToString(createTime, "yyyy-MM-dd");
	}

	public String getGiftName() {
		return giftName;
	}

	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}

	public String getGiftPrice() {
		return giftPrice;
	}

	public void setGiftPrice(String giftPrice) {
		this.giftPrice = giftPrice;
	}

	public String getGiftImage() {
		return giftImage;
	}

	public void setGiftImage(String giftImage) {
		this.giftImage = giftImage;
	}

	public Integer getGiftOrder() {
		return giftOrder;
	}

	public void setGiftOrder(Integer giftOrder) {
		this.giftOrder = giftOrder;
	}

	public String getGiftDesc() {
		return giftDesc;
	}

	public void setGiftDesc(String giftDesc) {
		this.giftDesc = giftDesc;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getStrTime() {
		return strTime;
	}

	public void setStrTime(String strTime) {
		this.strTime = strTime;
	}
	
}
