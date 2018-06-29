package com.stip.net.entity;

import java.io.Serializable;
import java.util.Date;

import com.stip.mybatis.generator.plugin.BaseModel;

public class UserWallet extends BaseModel<String> implements Serializable {
    private String walletId;

    private String openId;

    private String balance;

    private Date updateTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        sb.append(", walletId=").append(walletId);
        sb.append(", openId=").append(openId);
        sb.append(", balance=").append(balance);
        sb.append(", updateTime=").append(updateTime);
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
        UserWallet other = (UserWallet) that;
        return (this.getWalletId() == null ? other.getWalletId() == null : this.getWalletId().equals(other.getWalletId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWalletId() == null) ? 0 : getWalletId().hashCode());
        return result;
    }
}