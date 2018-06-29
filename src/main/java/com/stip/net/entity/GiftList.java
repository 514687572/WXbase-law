package com.stip.net.entity;

import java.io.Serializable;
import java.util.Date;

import com.stip.mybatis.generator.plugin.BaseModel;

public class GiftList extends BaseModel<Integer> implements Serializable {
    private Integer giftId;

    private String giftName;

    private String giftPrice;

    private String giftImage;

    private Integer giftOrder;

    private String giftDesc;

    private Date createTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getGiftPrice() {
        return giftPrice;
    }

    public void setGiftPrice(String giftPrice) {
        this.giftPrice = giftPrice;
    }

    public String getGiftImage() {
        return giftImage;
    }

    public void setGiftImage(String giftImage) {
        this.giftImage = giftImage;
    }

    public Integer getGiftOrder() {
        return giftOrder;
    }

    public void setGiftOrder(Integer giftOrder) {
        this.giftOrder = giftOrder;
    }

    public String getGiftDesc() {
        return giftDesc;
    }

    public void setGiftDesc(String giftDesc) {
        this.giftDesc = giftDesc;
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
        sb.append(", giftId=").append(giftId);
        sb.append(", giftName=").append(giftName);
        sb.append(", giftPrice=").append(giftPrice);
        sb.append(", giftImage=").append(giftImage);
        sb.append(", giftOrder=").append(giftOrder);
        sb.append(", giftDesc=").append(giftDesc);
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
        GiftList other = (GiftList) that;
        return (this.getGiftId() == null ? other.getGiftId() == null : this.getGiftId().equals(other.getGiftId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGiftId() == null) ? 0 : getGiftId().hashCode());
        return result;
    }
}