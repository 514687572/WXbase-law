package com.stip.net.entity;

import java.io.Serializable;
import java.util.Date;

import com.stip.mybatis.generator.plugin.BaseModel;

public class DateHistory extends BaseModel<String> implements Serializable {
    private String hisId;

    private String dateId;

    private Date hisDateTime;

    private String hisTitle;

    private String hisImages;

    private Date createTime;

    private Date updateTime;

    private String hisStatus;

    private String isVisible;

    private String remark;

    private String remarko;

    private String remarkt;

    private String remarkth;

    private static final long serialVersionUID = 1L;

    public String getHisId() {
        return hisId;
    }

    public void setHisId(String hisId) {
        this.hisId = hisId;
    }

    public String getDateId() {
        return dateId;
    }

    public void setDateId(String dateId) {
        this.dateId = dateId;
    }

    public Date getHisDateTime() {
        return hisDateTime;
    }

    public void setHisDateTime(Date hisDateTime) {
        this.hisDateTime = hisDateTime;
    }

    public String getHisTitle() {
        return hisTitle;
    }

    public void setHisTitle(String hisTitle) {
        this.hisTitle = hisTitle;
    }

    public String getHisImages() {
        return hisImages;
    }

    public void setHisImages(String hisImages) {
        this.hisImages = hisImages;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getHisStatus() {
        return hisStatus;
    }

    public void setHisStatus(String hisStatus) {
        this.hisStatus = hisStatus;
    }

    public String getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(String isVisible) {
        this.isVisible = isVisible;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemarko() {
        return remarko;
    }

    public void setRemarko(String remarko) {
        this.remarko = remarko;
    }

    public String getRemarkt() {
        return remarkt;
    }

    public void setRemarkt(String remarkt) {
        this.remarkt = remarkt;
    }

    public String getRemarkth() {
        return remarkth;
    }

    public void setRemarkth(String remarkth) {
        this.remarkth = remarkth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hisId=").append(hisId);
        sb.append(", dateId=").append(dateId);
        sb.append(", hisDateTime=").append(hisDateTime);
        sb.append(", hisTitle=").append(hisTitle);
        sb.append(", hisImages=").append(hisImages);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", hisStatus=").append(hisStatus);
        sb.append(", isVisible=").append(isVisible);
        sb.append(", remark=").append(remark);
        sb.append(", remarko=").append(remarko);
        sb.append(", remarkt=").append(remarkt);
        sb.append(", remarkth=").append(remarkth);
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
        DateHistory other = (DateHistory) that;
        return (this.getHisId() == null ? other.getHisId() == null : this.getHisId().equals(other.getHisId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHisId() == null) ? 0 : getHisId().hashCode());
        return result;
    }
}