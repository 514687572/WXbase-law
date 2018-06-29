package com.stip.net.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;

public class PraiseRecordsExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public PraiseRecordsExample() {
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

        public Criteria andDrIdIsNull() {
            addCriterion("praiseRecords.dr_id is null");
            return (Criteria) this;
        }

        public Criteria andDrIdIsNotNull() {
            addCriterion("praiseRecords.dr_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrIdEqualTo(String value) {
            addCriterion("praiseRecords.dr_id =", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotEqualTo(String value) {
            addCriterion("praiseRecords.dr_id <>", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdGreaterThan(String value) {
            addCriterion("praiseRecords.dr_id >", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdGreaterThanOrEqualTo(String value) {
            addCriterion("praiseRecords.dr_id >=", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdLessThan(String value) {
            addCriterion("praiseRecords.dr_id <", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdLessThanOrEqualTo(String value) {
            addCriterion("praiseRecords.dr_id <=", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdLike(String value) {
            addCriterion("praiseRecords.dr_id like", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotLike(String value) {
            addCriterion("praiseRecords.dr_id not like", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdIn(List<String> values) {
            addCriterion("praiseRecords.dr_id in", values, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotIn(List<String> values) {
            addCriterion("praiseRecords.dr_id not in", values, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdBetween(String value1, String value2) {
            addCriterion("praiseRecords.dr_id between", value1, value2, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotBetween(String value1, String value2) {
            addCriterion("praiseRecords.dr_id not between", value1, value2, "drId");
            return (Criteria) this;
        }

        public Criteria andDateIdIsNull() {
            addCriterion("praiseRecords.date_id is null");
            return (Criteria) this;
        }

        public Criteria andDateIdIsNotNull() {
            addCriterion("praiseRecords.date_id is not null");
            return (Criteria) this;
        }

        public Criteria andDateIdEqualTo(String value) {
            addCriterion("praiseRecords.date_id =", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotEqualTo(String value) {
            addCriterion("praiseRecords.date_id <>", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThan(String value) {
            addCriterion("praiseRecords.date_id >", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThanOrEqualTo(String value) {
            addCriterion("praiseRecords.date_id >=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThan(String value) {
            addCriterion("praiseRecords.date_id <", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThanOrEqualTo(String value) {
            addCriterion("praiseRecords.date_id <=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLike(String value) {
            addCriterion("praiseRecords.date_id like", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotLike(String value) {
            addCriterion("praiseRecords.date_id not like", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdIn(List<String> values) {
            addCriterion("praiseRecords.date_id in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotIn(List<String> values) {
            addCriterion("praiseRecords.date_id not in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdBetween(String value1, String value2) {
            addCriterion("praiseRecords.date_id between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotBetween(String value1, String value2) {
            addCriterion("praiseRecords.date_id not between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("praiseRecords.user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("praiseRecords.user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("praiseRecords.user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("praiseRecords.user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("praiseRecords.user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("praiseRecords.user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("praiseRecords.user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("praiseRecords.user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("praiseRecords.user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("praiseRecords.user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("praiseRecords.user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("praiseRecords.user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("praiseRecords.user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("praiseRecords.user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("praiseRecords.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("praiseRecords.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("praiseRecords.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("praiseRecords.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("praiseRecords.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("praiseRecords.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("praiseRecords.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("praiseRecords.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("praiseRecords.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("praiseRecords.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("praiseRecords.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("praiseRecords.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPraiseCountIsNull() {
            addCriterion("praiseRecords.praise_count is null");
            return (Criteria) this;
        }

        public Criteria andPraiseCountIsNotNull() {
            addCriterion("praiseRecords.praise_count is not null");
            return (Criteria) this;
        }

        public Criteria andPraiseCountEqualTo(String value) {
            addCriterion("praiseRecords.praise_count =", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotEqualTo(String value) {
            addCriterion("praiseRecords.praise_count <>", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountGreaterThan(String value) {
            addCriterion("praiseRecords.praise_count >", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountGreaterThanOrEqualTo(String value) {
            addCriterion("praiseRecords.praise_count >=", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountLessThan(String value) {
            addCriterion("praiseRecords.praise_count <", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountLessThanOrEqualTo(String value) {
            addCriterion("praiseRecords.praise_count <=", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountLike(String value) {
            addCriterion("praiseRecords.praise_count like", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotLike(String value) {
            addCriterion("praiseRecords.praise_count not like", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountIn(List<String> values) {
            addCriterion("praiseRecords.praise_count in", values, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotIn(List<String> values) {
            addCriterion("praiseRecords.praise_count not in", values, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountBetween(String value1, String value2) {
            addCriterion("praiseRecords.praise_count between", value1, value2, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotBetween(String value1, String value2) {
            addCriterion("praiseRecords.praise_count not between", value1, value2, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("praiseRecords.type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("praiseRecords.type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("praiseRecords.type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("praiseRecords.type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("praiseRecords.type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("praiseRecords.type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("praiseRecords.type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("praiseRecords.type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("praiseRecords.type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("praiseRecords.type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("praiseRecords.type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("praiseRecords.type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("praiseRecords.type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("praiseRecords.type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andGiftListIsNull() {
            addCriterion("praiseRecords.gift_list is null");
            return (Criteria) this;
        }

        public Criteria andGiftListIsNotNull() {
            addCriterion("praiseRecords.gift_list is not null");
            return (Criteria) this;
        }

        public Criteria andGiftListEqualTo(String value) {
            addCriterion("praiseRecords.gift_list =", value, "giftList");
            return (Criteria) this;
        }

        public Criteria andGiftListNotEqualTo(String value) {
            addCriterion("praiseRecords.gift_list <>", value, "giftList");
            return (Criteria) this;
        }

        public Criteria andGiftListGreaterThan(String value) {
            addCriterion("praiseRecords.gift_list >", value, "giftList");
            return (Criteria) this;
        }

        public Criteria andGiftListGreaterThanOrEqualTo(String value) {
            addCriterion("praiseRecords.gift_list >=", value, "giftList");
            return (Criteria) this;
        }

        public Criteria andGiftListLessThan(String value) {
            addCriterion("praiseRecords.gift_list <", value, "giftList");
            return (Criteria) this;
        }

        public Criteria andGiftListLessThanOrEqualTo(String value) {
            addCriterion("praiseRecords.gift_list <=", value, "giftList");
            return (Criteria) this;
        }

        public Criteria andGiftListLike(String value) {
            addCriterion("praiseRecords.gift_list like", value, "giftList");
            return (Criteria) this;
        }

        public Criteria andGiftListNotLike(String value) {
            addCriterion("praiseRecords.gift_list not like", value, "giftList");
            return (Criteria) this;
        }

        public Criteria andGiftListIn(List<String> values) {
            addCriterion("praiseRecords.gift_list in", values, "giftList");
            return (Criteria) this;
        }

        public Criteria andGiftListNotIn(List<String> values) {
            addCriterion("praiseRecords.gift_list not in", values, "giftList");
            return (Criteria) this;
        }

        public Criteria andGiftListBetween(String value1, String value2) {
            addCriterion("praiseRecords.gift_list between", value1, value2, "giftList");
            return (Criteria) this;
        }

        public Criteria andGiftListNotBetween(String value1, String value2) {
            addCriterion("praiseRecords.gift_list not between", value1, value2, "giftList");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("praiseRecords.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("praiseRecords.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("praiseRecords.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("praiseRecords.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("praiseRecords.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("praiseRecords.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("praiseRecords.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("praiseRecords.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("praiseRecords.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("praiseRecords.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("praiseRecords.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("praiseRecords.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("praiseRecords.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("praiseRecords.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}