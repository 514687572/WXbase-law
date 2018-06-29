package com.stip.net.entity;

import java.io.Serializable;
import java.util.Date;

import com.stip.mybatis.generator.plugin.BaseModel;

public class DatePraise extends BaseModel<String> implements Serializable {
    private String dpId;

    private String dateId;

    private Date updateTime;

    private String praiseCount;

    private String giftCount;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getDpId() {
        return dpId;
    }

    public void setDpId(String dpId) {
        this.dpId = dpId;
    }

    public String getDateId() {
        return dateId;
    }

    public void setDateId(String dateId) {
        this.dateId = dateId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(String praiseCount) {
        this.praiseCount = praiseCount;
    }

    public String getGiftCount() {
        return giftCount;
    }

    public void setGiftCount(String giftCount) {
        this.giftCount = giftCount;
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
        sb.append(", dpId=").append(dpId);
        sb.append(", dateId=").append(dateId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", praiseCount=").append(praiseCount);
        sb.append(", giftCount=").append(giftCount);
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
        DatePraise other = (DatePraise) that;
        return (this.getDpId() == null ? other.getDpId() == null : this.getDpId().equals(other.getDpId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDpId() == null) ? 0 : getDpId().hashCode());
        return result;
    }
}