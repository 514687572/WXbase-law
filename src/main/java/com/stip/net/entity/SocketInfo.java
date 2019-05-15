package com.stip.net.entity;

import com.stip.mybatis.generator.plugin.BaseModel;
import com.stip.net.utils.TimeUtils;

import java.io.Serializable;
import java.util.Date;

public class SocketInfo extends BaseModel<Integer> implements Serializable {
    private Integer stockId;

    private String stockName;

    private String stockNum;

    private String stockRemark;

    private Date stockEndTime;

    private Date createTime;

    private String optUser;

    private String remark;

    private String fmStockEndTime;

    private static final long serialVersionUID = 1L;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockNum() {
        return stockNum;
    }

    public void setStockNum(String stockNum) {
        this.stockNum = stockNum;
    }

    public String getStockRemark() {
        return stockRemark;
    }

    public void setStockRemark(String stockRemark) {
        this.stockRemark = stockRemark;
    }

    public Date getStockEndTime() {
        return stockEndTime;
    }

    public void setStockEndTime(Date stockEndTime) {
        this.stockEndTime = stockEndTime;
        this.fmStockEndTime = TimeUtils.dateToString(stockEndTime,"yyyy-MM-dd");
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOptUser() {
        return optUser;
    }

    public void setOptUser(String optUser) {
        this.optUser = optUser;
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
        sb.append(", stockId=").append(stockId);
        sb.append(", stockName=").append(stockName);
        sb.append(", stockNum=").append(stockNum);
        sb.append(", stockRemark=").append(stockRemark);
        sb.append(", stockEndTime=").append(stockEndTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", optUser=").append(optUser);
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
        SocketInfo other = (SocketInfo) that;
        return (this.getStockId() == null ? other.getStockId() == null : this.getStockId().equals(other.getStockId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStockId() == null) ? 0 : getStockId().hashCode());
        return result;
    }

    public String getFmStockEndTime() {
        return fmStockEndTime;
    }

}