package com.stip.net.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;

public class DatePraiseExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public DatePraiseExample() {
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

        public Criteria andDpIdIsNull() {
            addCriterion("datePraise.dp_id is null");
            return (Criteria) this;
        }

        public Criteria andDpIdIsNotNull() {
            addCriterion("datePraise.dp_id is not null");
            return (Criteria) this;
        }

        public Criteria andDpIdEqualTo(String value) {
            addCriterion("datePraise.dp_id =", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdNotEqualTo(String value) {
            addCriterion("datePraise.dp_id <>", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdGreaterThan(String value) {
            addCriterion("datePraise.dp_id >", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdGreaterThanOrEqualTo(String value) {
            addCriterion("datePraise.dp_id >=", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdLessThan(String value) {
            addCriterion("datePraise.dp_id <", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdLessThanOrEqualTo(String value) {
            addCriterion("datePraise.dp_id <=", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdLike(String value) {
            addCriterion("datePraise.dp_id like", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdNotLike(String value) {
            addCriterion("datePraise.dp_id not like", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdIn(List<String> values) {
            addCriterion("datePraise.dp_id in", values, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdNotIn(List<String> values) {
            addCriterion("datePraise.dp_id not in", values, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdBetween(String value1, String value2) {
            addCriterion("datePraise.dp_id between", value1, value2, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdNotBetween(String value1, String value2) {
            addCriterion("datePraise.dp_id not between", value1, value2, "dpId");
            return (Criteria) this;
        }

        public Criteria andDateIdIsNull() {
            addCriterion("datePraise.date_id is null");
            return (Criteria) this;
        }

        public Criteria andDateIdIsNotNull() {
            addCriterion("datePraise.date_id is not null");
            return (Criteria) this;
        }

        public Criteria andDateIdEqualTo(String value) {
            addCriterion("datePraise.date_id =", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotEqualTo(String value) {
            addCriterion("datePraise.date_id <>", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThan(String value) {
            addCriterion("datePraise.date_id >", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThanOrEqualTo(String value) {
            addCriterion("datePraise.date_id >=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThan(String value) {
            addCriterion("datePraise.date_id <", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThanOrEqualTo(String value) {
            addCriterion("datePraise.date_id <=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLike(String value) {
            addCriterion("datePraise.date_id like", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotLike(String value) {
            addCriterion("datePraise.date_id not like", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdIn(List<String> values) {
            addCriterion("datePraise.date_id in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotIn(List<String> values) {
            addCriterion("datePraise.date_id not in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdBetween(String value1, String value2) {
            addCriterion("datePraise.date_id between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotBetween(String value1, String value2) {
            addCriterion("datePraise.date_id not between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("datePraise.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("datePraise.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("datePraise.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("datePraise.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("datePraise.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("datePraise.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("datePraise.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("datePraise.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("datePraise.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("datePraise.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("datePraise.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("datePraise.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPraiseCountIsNull() {
            addCriterion("datePraise.praise_count is null");
            return (Criteria) this;
        }

        public Criteria andPraiseCountIsNotNull() {
            addCriterion("datePraise.praise_count is not null");
            return (Criteria) this;
        }

        public Criteria andPraiseCountEqualTo(String value) {
            addCriterion("datePraise.praise_count =", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotEqualTo(String value) {
            addCriterion("datePraise.praise_count <>", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountGreaterThan(String value) {
            addCriterion("datePraise.praise_count >", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountGreaterThanOrEqualTo(String value) {
            addCriterion("datePraise.praise_count >=", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountLessThan(String value) {
            addCriterion("datePraise.praise_count <", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountLessThanOrEqualTo(String value) {
            addCriterion("datePraise.praise_count <=", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountLike(String value) {
            addCriterion("datePraise.praise_count like", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotLike(String value) {
            addCriterion("datePraise.praise_count not like", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountIn(List<String> values) {
            addCriterion("datePraise.praise_count in", values, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotIn(List<String> values) {
            addCriterion("datePraise.praise_count not in", values, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountBetween(String value1, String value2) {
            addCriterion("datePraise.praise_count between", value1, value2, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotBetween(String value1, String value2) {
            addCriterion("datePraise.praise_count not between", value1, value2, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountIsNull() {
            addCriterion("datePraise.gift_count is null");
            return (Criteria) this;
        }

        public Criteria andGiftCountIsNotNull() {
            addCriterion("datePraise.gift_count is not null");
            return (Criteria) this;
        }

        public Criteria andGiftCountEqualTo(String value) {
            addCriterion("datePraise.gift_count =", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountNotEqualTo(String value) {
            addCriterion("datePraise.gift_count <>", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountGreaterThan(String value) {
            addCriterion("datePraise.gift_count >", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountGreaterThanOrEqualTo(String value) {
            addCriterion("datePraise.gift_count >=", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountLessThan(String value) {
            addCriterion("datePraise.gift_count <", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountLessThanOrEqualTo(String value) {
            addCriterion("datePraise.gift_count <=", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountLike(String value) {
            addCriterion("datePraise.gift_count like", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountNotLike(String value) {
            addCriterion("datePraise.gift_count not like", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountIn(List<String> values) {
            addCriterion("datePraise.gift_count in", values, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountNotIn(List<String> values) {
            addCriterion("datePraise.gift_count not in", values, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountBetween(String value1, String value2) {
            addCriterion("datePraise.gift_count between", value1, value2, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountNotBetween(String value1, String value2) {
            addCriterion("datePraise.gift_count not between", value1, value2, "giftCount");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("datePraise.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("datePraise.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("datePraise.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("datePraise.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("datePraise.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("datePraise.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("datePraise.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("datePraise.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("datePraise.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("datePraise.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("datePraise.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("datePraise.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("datePraise.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("datePraise.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}