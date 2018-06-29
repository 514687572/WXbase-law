package com.stip.net.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;

public class CashBalanceRecordsExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public CashBalanceRecordsExample() {
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

        public Criteria andCbrIdIsNull() {
            addCriterion("cashBalanceRecords.cbr_id is null");
            return (Criteria) this;
        }

        public Criteria andCbrIdIsNotNull() {
            addCriterion("cashBalanceRecords.cbr_id is not null");
            return (Criteria) this;
        }

        public Criteria andCbrIdEqualTo(String value) {
            addCriterion("cashBalanceRecords.cbr_id =", value, "cbrId");
            return (Criteria) this;
        }

        public Criteria andCbrIdNotEqualTo(String value) {
            addCriterion("cashBalanceRecords.cbr_id <>", value, "cbrId");
            return (Criteria) this;
        }

        public Criteria andCbrIdGreaterThan(String value) {
            addCriterion("cashBalanceRecords.cbr_id >", value, "cbrId");
            return (Criteria) this;
        }

        public Criteria andCbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("cashBalanceRecords.cbr_id >=", value, "cbrId");
            return (Criteria) this;
        }

        public Criteria andCbrIdLessThan(String value) {
            addCriterion("cashBalanceRecords.cbr_id <", value, "cbrId");
            return (Criteria) this;
        }

        public Criteria andCbrIdLessThanOrEqualTo(String value) {
            addCriterion("cashBalanceRecords.cbr_id <=", value, "cbrId");
            return (Criteria) this;
        }

        public Criteria andCbrIdLike(String value) {
            addCriterion("cashBalanceRecords.cbr_id like", value, "cbrId");
            return (Criteria) this;
        }

        public Criteria andCbrIdNotLike(String value) {
            addCriterion("cashBalanceRecords.cbr_id not like", value, "cbrId");
            return (Criteria) this;
        }

        public Criteria andCbrIdIn(List<String> values) {
            addCriterion("cashBalanceRecords.cbr_id in", values, "cbrId");
            return (Criteria) this;
        }

        public Criteria andCbrIdNotIn(List<String> values) {
            addCriterion("cashBalanceRecords.cbr_id not in", values, "cbrId");
            return (Criteria) this;
        }

        public Criteria andCbrIdBetween(String value1, String value2) {
            addCriterion("cashBalanceRecords.cbr_id between", value1, value2, "cbrId");
            return (Criteria) this;
        }

        public Criteria andCbrIdNotBetween(String value1, String value2) {
            addCriterion("cashBalanceRecords.cbr_id not between", value1, value2, "cbrId");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("cashBalanceRecords.out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("cashBalanceRecords.out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("cashBalanceRecords.out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("cashBalanceRecords.out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("cashBalanceRecords.out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("cashBalanceRecords.out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("cashBalanceRecords.out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("cashBalanceRecords.out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("cashBalanceRecords.out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("cashBalanceRecords.out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("cashBalanceRecords.out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("cashBalanceRecords.out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("cashBalanceRecords.out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("cashBalanceRecords.out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("cashBalanceRecords.openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("cashBalanceRecords.openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("cashBalanceRecords.openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("cashBalanceRecords.openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("cashBalanceRecords.openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("cashBalanceRecords.openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("cashBalanceRecords.openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("cashBalanceRecords.openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("cashBalanceRecords.openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("cashBalanceRecords.openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("cashBalanceRecords.openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("cashBalanceRecords.openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("cashBalanceRecords.openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("cashBalanceRecords.openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("cashBalanceRecords.amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("cashBalanceRecords.amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("cashBalanceRecords.amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("cashBalanceRecords.amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("cashBalanceRecords.amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("cashBalanceRecords.amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("cashBalanceRecords.amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("cashBalanceRecords.amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("cashBalanceRecords.amount like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("cashBalanceRecords.amount not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("cashBalanceRecords.amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("cashBalanceRecords.amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("cashBalanceRecords.amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("cashBalanceRecords.amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andCbrDescIsNull() {
            addCriterion("cashBalanceRecords.cbr_desc is null");
            return (Criteria) this;
        }

        public Criteria andCbrDescIsNotNull() {
            addCriterion("cashBalanceRecords.cbr_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCbrDescEqualTo(String value) {
            addCriterion("cashBalanceRecords.cbr_desc =", value, "cbrDesc");
            return (Criteria) this;
        }

        public Criteria andCbrDescNotEqualTo(String value) {
            addCriterion("cashBalanceRecords.cbr_desc <>", value, "cbrDesc");
            return (Criteria) this;
        }

        public Criteria andCbrDescGreaterThan(String value) {
            addCriterion("cashBalanceRecords.cbr_desc >", value, "cbrDesc");
            return (Criteria) this;
        }

        public Criteria andCbrDescGreaterThanOrEqualTo(String value) {
            addCriterion("cashBalanceRecords.cbr_desc >=", value, "cbrDesc");
            return (Criteria) this;
        }

        public Criteria andCbrDescLessThan(String value) {
            addCriterion("cashBalanceRecords.cbr_desc <", value, "cbrDesc");
            return (Criteria) this;
        }

        public Criteria andCbrDescLessThanOrEqualTo(String value) {
            addCriterion("cashBalanceRecords.cbr_desc <=", value, "cbrDesc");
            return (Criteria) this;
        }

        public Criteria andCbrDescLike(String value) {
            addCriterion("cashBalanceRecords.cbr_desc like", value, "cbrDesc");
            return (Criteria) this;
        }

        public Criteria andCbrDescNotLike(String value) {
            addCriterion("cashBalanceRecords.cbr_desc not like", value, "cbrDesc");
            return (Criteria) this;
        }

        public Criteria andCbrDescIn(List<String> values) {
            addCriterion("cashBalanceRecords.cbr_desc in", values, "cbrDesc");
            return (Criteria) this;
        }

        public Criteria andCbrDescNotIn(List<String> values) {
            addCriterion("cashBalanceRecords.cbr_desc not in", values, "cbrDesc");
            return (Criteria) this;
        }

        public Criteria andCbrDescBetween(String value1, String value2) {
            addCriterion("cashBalanceRecords.cbr_desc between", value1, value2, "cbrDesc");
            return (Criteria) this;
        }

        public Criteria andCbrDescNotBetween(String value1, String value2) {
            addCriterion("cashBalanceRecords.cbr_desc not between", value1, value2, "cbrDesc");
            return (Criteria) this;
        }

        public Criteria andCbrStatusIsNull() {
            addCriterion("cashBalanceRecords.cbr_status is null");
            return (Criteria) this;
        }

        public Criteria andCbrStatusIsNotNull() {
            addCriterion("cashBalanceRecords.cbr_status is not null");
            return (Criteria) this;
        }

        public Criteria andCbrStatusEqualTo(String value) {
            addCriterion("cashBalanceRecords.cbr_status =", value, "cbrStatus");
            return (Criteria) this;
        }

        public Criteria andCbrStatusNotEqualTo(String value) {
            addCriterion("cashBalanceRecords.cbr_status <>", value, "cbrStatus");
            return (Criteria) this;
        }

        public Criteria andCbrStatusGreaterThan(String value) {
            addCriterion("cashBalanceRecords.cbr_status >", value, "cbrStatus");
            return (Criteria) this;
        }

        public Criteria andCbrStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cashBalanceRecords.cbr_status >=", value, "cbrStatus");
            return (Criteria) this;
        }

        public Criteria andCbrStatusLessThan(String value) {
            addCriterion("cashBalanceRecords.cbr_status <", value, "cbrStatus");
            return (Criteria) this;
        }

        public Criteria andCbrStatusLessThanOrEqualTo(String value) {
            addCriterion("cashBalanceRecords.cbr_status <=", value, "cbrStatus");
            return (Criteria) this;
        }

        public Criteria andCbrStatusLike(String value) {
            addCriterion("cashBalanceRecords.cbr_status like", value, "cbrStatus");
            return (Criteria) this;
        }

        public Criteria andCbrStatusNotLike(String value) {
            addCriterion("cashBalanceRecords.cbr_status not like", value, "cbrStatus");
            return (Criteria) this;
        }

        public Criteria andCbrStatusIn(List<String> values) {
            addCriterion("cashBalanceRecords.cbr_status in", values, "cbrStatus");
            return (Criteria) this;
        }

        public Criteria andCbrStatusNotIn(List<String> values) {
            addCriterion("cashBalanceRecords.cbr_status not in", values, "cbrStatus");
            return (Criteria) this;
        }

        public Criteria andCbrStatusBetween(String value1, String value2) {
            addCriterion("cashBalanceRecords.cbr_status between", value1, value2, "cbrStatus");
            return (Criteria) this;
        }

        public Criteria andCbrStatusNotBetween(String value1, String value2) {
            addCriterion("cashBalanceRecords.cbr_status not between", value1, value2, "cbrStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("cashBalanceRecords.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("cashBalanceRecords.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("cashBalanceRecords.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("cashBalanceRecords.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("cashBalanceRecords.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cashBalanceRecords.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("cashBalanceRecords.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cashBalanceRecords.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("cashBalanceRecords.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("cashBalanceRecords.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("cashBalanceRecords.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cashBalanceRecords.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("cashBalanceRecords.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("cashBalanceRecords.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("cashBalanceRecords.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("cashBalanceRecords.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("cashBalanceRecords.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("cashBalanceRecords.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("cashBalanceRecords.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("cashBalanceRecords.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("cashBalanceRecords.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("cashBalanceRecords.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("cashBalanceRecords.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("cashBalanceRecords.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("cashBalanceRecords.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("cashBalanceRecords.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}