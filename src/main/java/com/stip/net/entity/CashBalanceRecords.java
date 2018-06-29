package com.stip.net.entity;

import java.io.Serializable;
import java.util.Date;

import com.stip.mybatis.generator.plugin.BaseModel;

public class CashBalanceRecords extends BaseModel<String> implements Serializable {
    private String cbrId;

    private String outTradeNo;

    private String openid;

    private String amount;

    private String cbrDesc;

    private String cbrStatus;

    private Date createTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getCbrId() {
        return cbrId;
    }

    public void setCbrId(String cbrId) {
        this.cbrId = cbrId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCbrDesc() {
        return cbrDesc;
    }

    public void setCbrDesc(String cbrDesc) {
        this.cbrDesc = cbrDesc;
    }

    public String getCbrStatus() {
        return cbrStatus;
    }

    public void setCbrStatus(String cbrStatus) {
        this.cbrStatus = cbrStatus;
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
        sb.append(", cbrId=").append(cbrId);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", openid=").append(openid);
        sb.append(", amount=").append(amount);
        sb.append(", cbrDesc=").append(cbrDesc);
        sb.append(", cbrStatus=").append(cbrStatus);
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
        CashBalanceRecords other = (CashBalanceRecords) that;
        return (this.getCbrId() == null ? other.getCbrId() == null : this.getCbrId().equals(other.getCbrId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCbrId() == null) ? 0 : getCbrId().hashCode());
        return result;
    }
}