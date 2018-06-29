package com.stip.net.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;

public class GiftListExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public GiftListExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        super.clear();
        oredCriteria.clear();
    }

    protected abstract static class GeneratedCriteria extends BaseCriteria {

        public Criteria andGiftIdIsNull() {
            addCriterion("giftList.gift_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNotNull() {
            addCriterion("giftList.gift_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIdEqualTo(Integer value) {
            addCriterion("giftList.gift_id =", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotEqualTo(Integer value) {
            addCriterion("giftList.gift_id <>", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThan(Integer value) {
            addCriterion("giftList.gift_id >", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("giftList.gift_id >=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThan(Integer value) {
            addCriterion("giftList.gift_id <", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThanOrEqualTo(Integer value) {
            addCriterion("giftList.gift_id <=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIn(List<Integer> values) {
            addCriterion("giftList.gift_id in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotIn(List<Integer> values) {
            addCriterion("giftList.gift_id not in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdBetween(Integer value1, Integer value2) {
            addCriterion("giftList.gift_id between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotBetween(Integer value1, Integer value2) {
            addCriterion("giftList.gift_id not between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftNameIsNull() {
            addCriterion("giftList.gift_name is null");
            return (Criteria) this;
        }

        public Criteria andGiftNameIsNotNull() {
            addCriterion("giftList.gift_name is not null");
            return (Criteria) this;
        }

        public Criteria andGiftNameEqualTo(String value) {
            addCriterion("giftList.gift_name =", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotEqualTo(String value) {
            addCriterion("giftList.gift_name <>", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThan(String value) {
            addCriterion("giftList.gift_name >", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThanOrEqualTo(String value) {
            addCriterion("giftList.gift_name >=", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThan(String value) {
            addCriterion("giftList.gift_name <", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThanOrEqualTo(String value) {
            addCriterion("giftList.gift_name <=", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLike(String value) {
            addCriterion("giftList.gift_name like", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotLike(String value) {
            addCriterion("giftList.gift_name not like", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameIn(List<String> values) {
            addCriterion("giftList.gift_name in", values, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotIn(List<String> values) {
            addCriterion("giftList.gift_name not in", values, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameBetween(String value1, String value2) {
            addCriterion("giftList.gift_name between", value1, value2, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotBetween(String value1, String value2) {
            addCriterion("giftList.gift_name not between", value1, value2, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftPriceIsNull() {
            addCriterion("giftList.gift_price is null");
            return (Criteria) this;
        }

        public Criteria andGiftPriceIsNotNull() {
            addCriterion("giftList.gift_price is not null");
            return (Criteria) this;
        }

        public Criteria andGiftPriceEqualTo(String value) {
            addCriterion("giftList.gift_price =", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceNotEqualTo(String value) {
            addCriterion("giftList.gift_price <>", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceGreaterThan(String value) {
            addCriterion("giftList.gift_price >", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceGreaterThanOrEqualTo(String value) {
            addCriterion("giftList.gift_price >=", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceLessThan(String value) {
            addCriterion("giftList.gift_price <", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceLessThanOrEqualTo(String value) {
            addCriterion("giftList.gift_price <=", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceLike(String value) {
            addCriterion("giftList.gift_price like", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceNotLike(String value) {
            addCriterion("giftList.gift_price not like", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceIn(List<String> values) {
            addCriterion("giftList.gift_price in", values, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceNotIn(List<String> values) {
            addCriterion("giftList.gift_price not in", values, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceBetween(String value1, String value2) {
            addCriterion("giftList.gift_price between", value1, value2, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceNotBetween(String value1, String value2) {
            addCriterion("giftList.gift_price not between", value1, value2, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftImageIsNull() {
            addCriterion("giftList.gift_image is null");
            return (Criteria) this;
        }

        public Criteria andGiftImageIsNotNull() {
            addCriterion("giftList.gift_image is not null");
            return (Criteria) this;
        }

        public Criteria andGiftImageEqualTo(String value) {
            addCriterion("giftList.gift_image =", value, "giftImage");
            return (Criteria) this;
        }

        public Criteria andGiftImageNotEqualTo(String value) {
            addCriterion("giftList.gift_image <>", value, "giftImage");
            return (Criteria) this;
        }

        public Criteria andGiftImageGreaterThan(String value) {
            addCriterion("giftList.gift_image >", value, "giftImage");
            return (Criteria) this;
        }

        public Criteria andGiftImageGreaterThanOrEqualTo(String value) {
            addCriterion("giftList.gift_image >=", value, "giftImage");
            return (Criteria) this;
        }

        public Criteria andGiftImageLessThan(String value) {
            addCriterion("giftList.gift_image <", value, "giftImage");
            return (Criteria) this;
        }

        public Criteria andGiftImageLessThanOrEqualTo(String value) {
            addCriterion("giftList.gift_image <=", value, "giftImage");
            return (Criteria) this;
        }

        public Criteria andGiftImageLike(String value) {
            addCriterion("giftList.gift_image like", value, "giftImage");
            return (Criteria) this;
        }

        public Criteria andGiftImageNotLike(String value) {
            addCriterion("giftList.gift_image not like", value, "giftImage");
            return (Criteria) this;
        }

        public Criteria andGiftImageIn(List<String> values) {
            addCriterion("giftList.gift_image in", values, "giftImage");
            return (Criteria) this;
        }

        public Criteria andGiftImageNotIn(List<String> values) {
            addCriterion("giftList.gift_image not in", values, "giftImage");
            return (Criteria) this;
        }

        public Criteria andGiftImageBetween(String value1, String value2) {
            addCriterion("giftList.gift_image between", value1, value2, "giftImage");
            return (Criteria) this;
        }

        public Criteria andGiftImageNotBetween(String value1, String value2) {
            addCriterion("giftList.gift_image not between", value1, value2, "giftImage");
            return (Criteria) this;
        }

        public Criteria andGiftOrderIsNull() {
            addCriterion("giftList.gift_order is null");
            return (Criteria) this;
        }

        public Criteria andGiftOrderIsNotNull() {
            addCriterion("giftList.gift_order is not null");
            return (Criteria) this;
        }

        public Criteria andGiftOrderEqualTo(Integer value) {
            addCriterion("giftList.gift_order =", value, "giftOrder");
            return (Criteria) this;
        }

        public Criteria andGiftOrderNotEqualTo(Integer value) {
            addCriterion("giftList.gift_order <>", value, "giftOrder");
            return (Criteria) this;
        }

        public Criteria andGiftOrderGreaterThan(Integer value) {
            addCriterion("giftList.gift_order >", value, "giftOrder");
            return (Criteria) this;
        }

        public Criteria andGiftOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("giftList.gift_order >=", value, "giftOrder");
            return (Criteria) this;
        }

        public Criteria andGiftOrderLessThan(Integer value) {
            addCriterion("giftList.gift_order <", value, "giftOrder");
            return (Criteria) this;
        }

        public Criteria andGiftOrderLessThanOrEqualTo(Integer value) {
            addCriterion("giftList.gift_order <=", value, "giftOrder");
            return (Criteria) this;
        }

        public Criteria andGiftOrderIn(List<Integer> values) {
            addCriterion("giftList.gift_order in", values, "giftOrder");
            return (Criteria) this;
        }

        public Criteria andGiftOrderNotIn(List<Integer> values) {
            addCriterion("giftList.gift_order not in", values, "giftOrder");
            return (Criteria) this;
        }

        public Criteria andGiftOrderBetween(Integer value1, Integer value2) {
            addCriterion("giftList.gift_order between", value1, value2, "giftOrder");
            return (Criteria) this;
        }

        public Criteria andGiftOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("giftList.gift_order not between", value1, value2, "giftOrder");
            return (Criteria) this;
        }

        public Criteria andGiftDescIsNull() {
            addCriterion("giftList.gift_desc is null");
            return (Criteria) this;
        }

        public Criteria andGiftDescIsNotNull() {
            addCriterion("giftList.gift_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGiftDescEqualTo(String value) {
            addCriterion("giftList.gift_desc =", value, "giftDesc");
            return (Criteria) this;
        }

        public Criteria andGiftDescNotEqualTo(String value) {
            addCriterion("giftList.gift_desc <>", value, "giftDesc");
            return (Criteria) this;
        }

        public Criteria andGiftDescGreaterThan(String value) {
            addCriterion("giftList.gift_desc >", value, "giftDesc");
            return (Criteria) this;
        }

        public Criteria andGiftDescGreaterThanOrEqualTo(String value) {
            addCriterion("giftList.gift_desc >=", value, "giftDesc");
            return (Criteria) this;
        }

        public Criteria andGiftDescLessThan(String value) {
            addCriterion("giftList.gift_desc <", value, "giftDesc");
            return (Criteria) this;
        }

        public Criteria andGiftDescLessThanOrEqualTo(String value) {
            addCriterion("giftList.gift_desc <=", value, "giftDesc");
            return (Criteria) this;
        }

        public Criteria andGiftDescLike(String value) {
            addCriterion("giftList.gift_desc like", value, "giftDesc");
            return (Criteria) this;
        }

        public Criteria andGiftDescNotLike(String value) {
            addCriterion("giftList.gift_desc not like", value, "giftDesc");
            return (Criteria) this;
        }

        public Criteria andGiftDescIn(List<String> values) {
            addCriterion("giftList.gift_desc in", values, "giftDesc");
            return (Criteria) this;
        }

        public Criteria andGiftDescNotIn(List<String> values) {
            addCriterion("giftList.gift_desc not in", values, "giftDesc");
            return (Criteria) this;
        }

        public Criteria andGiftDescBetween(String value1, String value2) {
            addCriterion("giftList.gift_desc between", value1, value2, "giftDesc");
            return (Criteria) this;
        }

        public Criteria andGiftDescNotBetween(String value1, String value2) {
            addCriterion("giftList.gift_desc not between", value1, value2, "giftDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("giftList.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("giftList.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("giftList.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("giftList.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("giftList.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("giftList.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("giftList.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("giftList.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("giftList.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("giftList.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("giftList.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("giftList.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("giftList.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("giftList.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("giftList.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("giftList.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("giftList.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("giftList.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("giftList.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("giftList.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("giftList.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("giftList.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("giftList.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("giftList.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("giftList.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("giftList.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}