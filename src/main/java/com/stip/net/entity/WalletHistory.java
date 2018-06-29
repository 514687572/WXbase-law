package com.stip.net.entity;

import java.io.Serializable;
import java.util.Date;

import com.stip.mybatis.generator.plugin.BaseModel;

public class WalletHistory extends BaseModel<String> implements Serializable {
    private String historyId;

    private String openId;

    private String balance;

    private String balanceChange;

    private String type;

    private String status;

    private Date createTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getHistoryId() {
        return historyId;
    }

    public void setHistoryId(String historyId) {
        this.historyId = historyId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getBalanceChange() {
        return balanceChange;
    }

    public void setBalanceChange(String balanceChange) {
        this.balanceChange = balanceChange;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        sb.append(", historyId=").append(historyId);
        sb.append(", openId=").append(openId);
        sb.append(", balance=").append(balance);
        sb.append(", balanceChange=").append(balanceChange);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
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
        WalletHistory other = (WalletHistory) that;
        return (this.getHistoryId() == null ? other.getHistoryId() == null : this.getHistoryId().equals(other.getHistoryId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHistoryId() == null) ? 0 : getHistoryId().hashCode());
        return result;
    }
}