package com.stip.net.entity;

import java.io.Serializable;

import com.stip.mybatis.generator.plugin.BaseModel;

public class RefundRecords extends BaseModel<String> implements Serializable {
    private String refundId;

    private String wxRefundId;

    private String nonceStr;

    private String outRefundNo;

    private String outTradeNo;

    private String refundFee;

    private String refundDesc;

    private String openid;

    private String refundStatus;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getWxRefundId() {
        return wxRefundId;
    }

    public void setWxRefundId(String wxRefundId) {
        this.wxRefundId = wxRefundId;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getOutRefundNo() {
        return outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(String refundFee) {
        this.refundFee = refundFee;
    }

    public String getRefundDesc() {
        return refundDesc;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
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
        sb.append(", refundId=").append(refundId);
        sb.append(", wxRefundId=").append(wxRefundId);
        sb.append(", nonceStr=").append(nonceStr);
        sb.append(", outRefundNo=").append(outRefundNo);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", refundFee=").append(refundFee);
        sb.append(", refundDesc=").append(refundDesc);
        sb.append(", openid=").append(openid);
        sb.append(", refundStatus=").append(refundStatus);
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
        RefundRecords other = (RefundRecords) that;
        return (this.getRefundId() == null ? other.getRefundId() == null : this.getRefundId().equals(other.getRefundId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRefundId() == null) ? 0 : getRefundId().hashCode());
        return result;
    }
}