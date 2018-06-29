package com.stip.net.entity;

import java.io.Serializable;
import java.util.Date;

import com.stip.mybatis.generator.plugin.BaseModel;

public class PraiseRecords extends BaseModel<String> implements Serializable {
    private String drId;

    private String dateId;

    private String userId;

    private Date updateTime;

    private String praiseCount;

    private String type;

    private String giftList;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getDrId() {
        return drId;
    }

    public void setDrId(String drId) {
        this.drId = drId;
    }

    public String getDateId() {
        return dateId;
    }

    public void setDateId(String dateId) {
        this.dateId = dateId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGiftList() {
        return giftList;
    }

    public void setGiftList(String giftList) {
        this.giftList = giftList;
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
        sb.append(", drId=").append(drId);
        sb.append(", dateId=").append(dateId);
        sb.append(", userId=").append(userId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", praiseCount=").append(praiseCount);
        sb.append(", type=").append(type);
        sb.append(", giftList=").append(giftList);
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
        PraiseRecords other = (PraiseRecords) that;
        return (this.getDrId() == null ? other.getDrId() == null : this.getDrId().equals(other.getDrId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDrId() == null) ? 0 : getDrId().hashCode());
        return result;
    }
}