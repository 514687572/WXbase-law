package com.stip.net.entity;

import com.stip.mybatis.generator.plugin.BaseModel;
import com.stip.net.utils.TimeUtils;

import java.io.Serializable;
import java.util.Date;

public class UserStockInfo extends BaseModel<Integer> implements Serializable {
    private Integer appealId;

    private String userOpenId;

    private Integer stockNum;

    private String stockCode;

    private String stockName;

    private String outMoney;

    private String userName;

    private String userPhone;

    private String userAddress;

    private Date createTime;

    private String fmCreateTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getAppealId() {
        return appealId;
    }

    public void setAppealId(Integer appealId) {
        this.appealId = appealId;
    }

    public String getUserOpenId() {
        return userOpenId;
    }

    public void setUserOpenId(String userOpenId) {
        this.userOpenId = userOpenId;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getOutMoney() {
        return outMoney;
    }

    public void setOutMoney(String outMoney) {
        this.outMoney = outMoney;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
        this.fmCreateTime = TimeUtils.dateToString(createTime,"yyyy-MM-dd");
    }

    public String getFmCreateTime() {
        return fmCreateTime;
    }

    public void setFmCreateTime(String fmCreateTime) {
        this.fmCreateTime = fmCreateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", appealId=").append(appealId);
        sb.append(", userOpenId=").append(userOpenId);
        sb.append(", stockNum=").append(stockNum);
        sb.append(", stockCode=").append(stockCode);
        sb.append(", stockName=").append(stockName);
        sb.append(", outMoney=").append(outMoney);
        sb.append(", userName=").append(userName);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userAddress=").append(userAddress);
        sb.append(", createTime=").append(createTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserStockInfo other = (UserStockInfo) that;
        return (this.getAppealId() == null ? other.getAppealId() == null : this.getAppealId().equals(other.getAppealId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAppealId() == null) ? 0 : getAppealId().hashCode());
        return result;
    }
}