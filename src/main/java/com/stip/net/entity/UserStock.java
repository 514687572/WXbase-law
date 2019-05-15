package com.stip.net.entity;

import com.stip.mybatis.generator.plugin.BaseModel;
import java.io.Serializable;

public class UserStock extends BaseModel<Integer> implements Serializable {
    private Integer stockId;

    private String stockName;

    private String stockCode;

    private String userOpenId;

    private String remark;

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

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getUserOpenId() {
        return userOpenId;
    }

    public void setUserOpenId(String userOpenId) {
        this.userOpenId = userOpenId;
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
        sb.append(", stockCode=").append(stockCode);
        sb.append(", userOpenId=").append(userOpenId);
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
        UserStock other = (UserStock) that;
        return (this.getStockId() == null ? other.getStockId() == null : this.getStockId().equals(other.getStockId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStockId() == null) ? 0 : getStockId().hashCode());
        return result;
    }
}