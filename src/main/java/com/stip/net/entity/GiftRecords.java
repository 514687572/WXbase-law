package com.stip.net.entity;

import java.io.Serializable;
import java.util.Date;

import com.stip.mybatis.generator.plugin.BaseModel;

public class GiftRecords extends BaseModel<String> implements Serializable {
    private String recordId;

    private String outOrderNo;

    private String outOpenId;

    private String inOpenId;

    private String dateId;

    private Integer giftId;

    private String status;

    private Date createTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

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
        sb.append(", recordId=").append(recordId);
        sb.append(", outOrderNo=").append(outOrderNo);
        sb.append(", outOpenId=").append(outOpenId);
        sb.append(", inOpenId=").append(inOpenId);
        sb.append(", dateId=").append(dateId);
        sb.append(", giftId=").append(giftId);
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
        GiftRecords other = (GiftRecords) that;
        return (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        return result;
    }
}