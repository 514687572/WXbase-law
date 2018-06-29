package com.stip.net.entity;

import java.io.Serializable;
import java.util.Date;

import com.stip.mybatis.generator.plugin.BaseModel;

public class DateList extends BaseModel<String> implements Serializable {
    private String dateId;

    private String dateTitle;

    private String dateType;

    private String remindType;

    private String repetRemind;

    private Date dateTime;

    private Date lunarDate;

    private String lunarCh;

    private String attentionDate;

    private Date createTime;

    private String userId;

    private String openId;

    private Boolean gc;

    private Date nextRemindTime;

    private String dateBg;

    private String remark;

    private String remark1;

    private String remark2;

    private String remark3;

    private String remarko;

    private String remarkt;

    private String remarkth;

	public String startYear;

	public String middYear;

	public String endYear;

	public String middDay;

    private static final long serialVersionUID = 1L;

    public String getDateId() {
        return dateId;
    }

    public void setDateId(String dateId) {
        this.dateId = dateId;
    }

    public String getDateTitle() {
        return dateTitle;
    }

    public void setDateTitle(String dateTitle) {
        this.dateTitle = dateTitle;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getRemindType() {
        return remindType;
    }

    public void setRemindType(String remindType) {
        this.remindType = remindType;
    }

    public String getRepetRemind() {
        return repetRemind;
    }

    public void setRepetRemind(String repetRemind) {
        this.repetRemind = repetRemind;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Date getLunarDate() {
        return lunarDate;
    }

    public void setLunarDate(Date lunarDate) {
        this.lunarDate = lunarDate;
    }

    public String getLunarCh() {
        return lunarCh;
    }

    public void setLunarCh(String lunarCh) {
        this.lunarCh = lunarCh;
    }

    public String getAttentionDate() {
        return attentionDate;
    }

    public void setAttentionDate(String attentionDate) {
        this.attentionDate = attentionDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Boolean getGc() {
        return gc;
    }

    public void setGc(Boolean gc) {
        this.gc = gc;
    }

    public Date getNextRemindTime() {
        return nextRemindTime;
    }

    public void setNextRemindTime(Date nextRemindTime) {
        this.nextRemindTime = nextRemindTime;
    }

    public String getDateBg() {
        return dateBg;
    }

    public void setDateBg(String dateBg) {
        this.dateBg = dateBg;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3;
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
        sb.append(", dateId=").append(dateId);
        sb.append(", dateTitle=").append(dateTitle);
        sb.append(", dateType=").append(dateType);
        sb.append(", remindType=").append(remindType);
        sb.append(", repetRemind=").append(repetRemind);
        sb.append(", dateTime=").append(dateTime);
        sb.append(", lunarDate=").append(lunarDate);
        sb.append(", lunarCh=").append(lunarCh);
        sb.append(", attentionDate=").append(attentionDate);
        sb.append(", createTime=").append(createTime);
        sb.append(", userId=").append(userId);
        sb.append(", openId=").append(openId);
        sb.append(", gc=").append(gc);
        sb.append(", nextRemindTime=").append(nextRemindTime);
        sb.append(", dateBg=").append(dateBg);
        sb.append(", remark=").append(remark);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", remark3=").append(remark3);
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
        DateList other = (DateList) that;
        return (this.getDateId() == null ? other.getDateId() == null : this.getDateId().equals(other.getDateId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDateId() == null) ? 0 : getDateId().hashCode());
        return result;
    }

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getMiddYear() {
		return middYear;
	}

	public void setMiddYear(String middYear) {
		this.middYear = middYear;
	}

	public String getEndYear() {
		return endYear;
	}

	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}

	public String getMiddDay() {
		return middDay;
	}

	public void setMiddDay(String middDay) {
		this.middDay = middDay;
	}
	
}