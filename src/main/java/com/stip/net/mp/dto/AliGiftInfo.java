package com.stip.net.mp.dto;

import java.util.Date;

import com.stip.net.utils.TimeUtils;

public class AliGiftInfo {

    private Integer giftId;

    private String openId;

    private String dateId;

    private String prepayId;

    private String outTradeNo;

    private Integer amount;

    private String status;

    private Date createdAt;
    
    private String strTime;

    private Date updatedAt;

	private String giftName;

	private String giftPrice;

	private String giftImage;

	public String getStrTime() {
		return strTime;
	}

	public void setStrTime(String strTime) {
		this.strTime = strTime;
	}

	private Integer giftOrder;

	private String giftDesc;
	
	private String nickname;
	
	private String headimgurl;
	
	private String out_order_no;

	public Integer getGiftId() {
		return giftId;
	}

	public void setGiftId(Integer giftId) {
		this.giftId = giftId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getDateId() {
		return dateId;
	}

	public void setDateId(String dateId) {
		this.dateId = dateId;
	}

	public String getPrepayId() {
		return prepayId;
	}

	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
		this.strTime=TimeUtils.dateToString(createdAt, "yyyy-MM-dd");
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public String getOut_order_no() {
		return out_order_no;
	}

	public void setOut_order_no(String out_order_no) {
		this.out_order_no = out_order_no;
	}
	
}
