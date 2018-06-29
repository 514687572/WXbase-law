package com.stip.net.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;

public class GiftRecordsExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public GiftRecordsExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("giftRecords.record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("giftRecords.record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(String value) {
            addCriterion("giftRecords.record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(String value) {
            addCriterion("giftRecords.record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(String value) {
            addCriterion("giftRecords.record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("giftRecords.record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(String value) {
            addCriterion("giftRecords.record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(String value) {
            addCriterion("giftRecords.record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLike(String value) {
            addCriterion("giftRecords.record_id like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotLike(String value) {
            addCriterion("giftRecords.record_id not like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<String> values) {
            addCriterion("giftRecords.record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<String> values) {
            addCriterion("giftRecords.record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(String value1, String value2) {
            addCriterion("giftRecords.record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(String value1, String value2) {
            addCriterion("giftRecords.record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoIsNull() {
            addCriterion("giftRecords.out_order_no is null");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoIsNotNull() {
            addCriterion("giftRecords.out_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoEqualTo(String value) {
            addCriterion("giftRecords.out_order_no =", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotEqualTo(String value) {
            addCriterion("giftRecords.out_order_no <>", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoGreaterThan(String value) {
            addCriterion("giftRecords.out_order_no >", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("giftRecords.out_order_no >=", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoLessThan(String value) {
            addCriterion("giftRecords.out_order_no <", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoLessThanOrEqualTo(String value) {
            addCriterion("giftRecords.out_order_no <=", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoLike(String value) {
            addCriterion("giftRecords.out_order_no like", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotLike(String value) {
            addCriterion("giftRecords.out_order_no not like", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoIn(List<String> values) {
            addCriterion("giftRecords.out_order_no in", values, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotIn(List<String> values) {
            addCriterion("giftRecords.out_order_no not in", values, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoBetween(String value1, String value2) {
            addCriterion("giftRecords.out_order_no between", value1, value2, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotBetween(String value1, String value2) {
            addCriterion("giftRecords.out_order_no not between", value1, value2, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOpenIdIsNull() {
            addCriterion("giftRecords.out_open_id is null");
            return (Criteria) this;
        }

        public Criteria andOutOpenIdIsNotNull() {
            addCriterion("giftRecords.out_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutOpenIdEqualTo(String value) {
            addCriterion("giftRecords.out_open_id =", value, "outOpenId");
            return (Criteria) this;
        }

        public Criteria andOutOpenIdNotEqualTo(String value) {
            addCriterion("giftRecords.out_open_id <>", value, "outOpenId");
            return (Criteria) this;
        }

        public Criteria andOutOpenIdGreaterThan(String value) {
            addCriterion("giftRecords.out_open_id >", value, "outOpenId");
            return (Criteria) this;
        }

        public Criteria andOutOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("giftRecords.out_open_id >=", value, "outOpenId");
            return (Criteria) this;
        }

        public Criteria andOutOpenIdLessThan(String value) {
            addCriterion("giftRecords.out_open_id <", value, "outOpenId");
            return (Criteria) this;
        }

        public Criteria andOutOpenIdLessThanOrEqualTo(String value) {
            addCriterion("giftRecords.out_open_id <=", value, "outOpenId");
            return (Criteria) this;
        }

        public Criteria andOutOpenIdLike(String value) {
            addCriterion("giftRecords.out_open_id like", value, "outOpenId");
            return (Criteria) this;
        }

        public Criteria andOutOpenIdNotLike(String value) {
            addCriterion("giftRecords.out_open_id not like", value, "outOpenId");
            return (Criteria) this;
        }

        public Criteria andOutOpenIdIn(List<String> values) {
            addCriterion("giftRecords.out_open_id in", values, "outOpenId");
            return (Criteria) this;
        }

        public Criteria andOutOpenIdNotIn(List<String> values) {
            addCriterion("giftRecords.out_open_id not in", values, "outOpenId");
            return (Criteria) this;
        }

        public Criteria andOutOpenIdBetween(String value1, String value2) {
            addCriterion("giftRecords.out_open_id between", value1, value2, "outOpenId");
            return (Criteria) this;
        }

        public Criteria andOutOpenIdNotBetween(String value1, String value2) {
            addCriterion("giftRecords.out_open_id not between", value1, value2, "outOpenId");
            return (Criteria) this;
        }

        public Criteria andInOpenIdIsNull() {
            addCriterion("giftRecords.in_open_id is null");
            return (Criteria) this;
        }

        public Criteria andInOpenIdIsNotNull() {
            addCriterion("giftRecords.in_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andInOpenIdEqualTo(String value) {
            addCriterion("giftRecords.in_open_id =", value, "inOpenId");
            return (Criteria) this;
        }

        public Criteria andInOpenIdNotEqualTo(String value) {
            addCriterion("giftRecords.in_open_id <>", value, "inOpenId");
            return (Criteria) this;
        }

        public Criteria andInOpenIdGreaterThan(String value) {
            addCriterion("giftRecords.in_open_id >", value, "inOpenId");
            return (Criteria) this;
        }

        public Criteria andInOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("giftRecords.in_open_id >=", value, "inOpenId");
            return (Criteria) this;
        }

        public Criteria andInOpenIdLessThan(String value) {
            addCriterion("giftRecords.in_open_id <", value, "inOpenId");
            return (Criteria) this;
        }

        public Criteria andInOpenIdLessThanOrEqualTo(String value) {
            addCriterion("giftRecords.in_open_id <=", value, "inOpenId");
            return (Criteria) this;
        }

        public Criteria andInOpenIdLike(String value) {
            addCriterion("giftRecords.in_open_id like", value, "inOpenId");
            return (Criteria) this;
        }

        public Criteria andInOpenIdNotLike(String value) {
            addCriterion("giftRecords.in_open_id not like", value, "inOpenId");
            return (Criteria) this;
        }

        public Criteria andInOpenIdIn(List<String> values) {
            addCriterion("giftRecords.in_open_id in", values, "inOpenId");
            return (Criteria) this;
        }

        public Criteria andInOpenIdNotIn(List<String> values) {
            addCriterion("giftRecords.in_open_id not in", values, "inOpenId");
            return (Criteria) this;
        }

        public Criteria andInOpenIdBetween(String value1, String value2) {
            addCriterion("giftRecords.in_open_id between", value1, value2, "inOpenId");
            return (Criteria) this;
        }

        public Criteria andInOpenIdNotBetween(String value1, String value2) {
            addCriterion("giftRecords.in_open_id not between", value1, value2, "inOpenId");
            return (Criteria) this;
        }

        public Criteria andDateIdIsNull() {
            addCriterion("giftRecords.date_id is null");
            return (Criteria) this;
        }

        public Criteria andDateIdIsNotNull() {
            addCriterion("giftRecords.date_id is not null");
            return (Criteria) this;
        }

        public Criteria andDateIdEqualTo(String value) {
            addCriterion("giftRecords.date_id =", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotEqualTo(String value) {
            addCriterion("giftRecords.date_id <>", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThan(String value) {
            addCriterion("giftRecords.date_id >", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThanOrEqualTo(String value) {
            addCriterion("giftRecords.date_id >=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThan(String value) {
            addCriterion("giftRecords.date_id <", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThanOrEqualTo(String value) {
            addCriterion("giftRecords.date_id <=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLike(String value) {
            addCriterion("giftRecords.date_id like", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotLike(String value) {
            addCriterion("giftRecords.date_id not like", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdIn(List<String> values) {
            addCriterion("giftRecords.date_id in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotIn(List<String> values) {
            addCriterion("giftRecords.date_id not in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdBetween(String value1, String value2) {
            addCriterion("giftRecords.date_id between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotBetween(String value1, String value2) {
            addCriterion("giftRecords.date_id not between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNull() {
            addCriterion("giftRecords.gift_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNotNull() {
            addCriterion("giftRecords.gift_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIdEqualTo(Integer value) {
            addCriterion("giftRecords.gift_id =", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotEqualTo(Integer value) {
            addCriterion("giftRecords.gift_id <>", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThan(Integer value) {
            addCriterion("giftRecords.gift_id >", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("giftRecords.gift_id >=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThan(Integer value) {
            addCriterion("giftRecords.gift_id <", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThanOrEqualTo(Integer value) {
            addCriterion("giftRecords.gift_id <=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIn(List<Integer> values) {
            addCriterion("giftRecords.gift_id in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotIn(List<Integer> values) {
            addCriterion("giftRecords.gift_id not in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdBetween(Integer value1, Integer value2) {
            addCriterion("giftRecords.gift_id between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotBetween(Integer value1, Integer value2) {
            addCriterion("giftRecords.gift_id not between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("giftRecords.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("giftRecords.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("giftRecords.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("giftRecords.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("giftRecords.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("giftRecords.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("giftRecords.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("giftRecords.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("giftRecords.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("giftRecords.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("giftRecords.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("giftRecords.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("giftRecords.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("giftRecords.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("giftRecords.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("giftRecords.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("giftRecords.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("giftRecords.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("giftRecords.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("giftRecords.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("giftRecords.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("giftRecords.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("giftRecords.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("giftRecords.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("giftRecords.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("giftRecords.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("giftRecords.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("giftRecords.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("giftRecords.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("giftRecords.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("giftRecords.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("giftRecords.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("giftRecords.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("giftRecords.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("giftRecords.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("giftRecords.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("giftRecords.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("giftRecords.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("giftRecords.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("giftRecords.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}