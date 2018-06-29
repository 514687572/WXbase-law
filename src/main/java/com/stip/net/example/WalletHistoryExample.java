package com.stip.net.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;

public class WalletHistoryExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public WalletHistoryExample() {
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

        public Criteria andHistoryIdIsNull() {
            addCriterion("walletHistory.history_id is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIdIsNotNull() {
            addCriterion("walletHistory.history_id is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryIdEqualTo(String value) {
            addCriterion("walletHistory.history_id =", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotEqualTo(String value) {
            addCriterion("walletHistory.history_id <>", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdGreaterThan(String value) {
            addCriterion("walletHistory.history_id >", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("walletHistory.history_id >=", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLessThan(String value) {
            addCriterion("walletHistory.history_id <", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLessThanOrEqualTo(String value) {
            addCriterion("walletHistory.history_id <=", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLike(String value) {
            addCriterion("walletHistory.history_id like", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotLike(String value) {
            addCriterion("walletHistory.history_id not like", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdIn(List<String> values) {
            addCriterion("walletHistory.history_id in", values, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotIn(List<String> values) {
            addCriterion("walletHistory.history_id not in", values, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdBetween(String value1, String value2) {
            addCriterion("walletHistory.history_id between", value1, value2, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotBetween(String value1, String value2) {
            addCriterion("walletHistory.history_id not between", value1, value2, "historyId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("walletHistory.open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("walletHistory.open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("walletHistory.open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("walletHistory.open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("walletHistory.open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("walletHistory.open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("walletHistory.open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("walletHistory.open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("walletHistory.open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("walletHistory.open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("walletHistory.open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("walletHistory.open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("walletHistory.open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("walletHistory.open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("walletHistory.balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("walletHistory.balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(String value) {
            addCriterion("walletHistory.balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(String value) {
            addCriterion("walletHistory.balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(String value) {
            addCriterion("walletHistory.balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("walletHistory.balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(String value) {
            addCriterion("walletHistory.balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(String value) {
            addCriterion("walletHistory.balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLike(String value) {
            addCriterion("walletHistory.balance like", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotLike(String value) {
            addCriterion("walletHistory.balance not like", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<String> values) {
            addCriterion("walletHistory.balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<String> values) {
            addCriterion("walletHistory.balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(String value1, String value2) {
            addCriterion("walletHistory.balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(String value1, String value2) {
            addCriterion("walletHistory.balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceChangeIsNull() {
            addCriterion("walletHistory.balance_change is null");
            return (Criteria) this;
        }

        public Criteria andBalanceChangeIsNotNull() {
            addCriterion("walletHistory.balance_change is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceChangeEqualTo(String value) {
            addCriterion("walletHistory.balance_change =", value, "balanceChange");
            return (Criteria) this;
        }

        public Criteria andBalanceChangeNotEqualTo(String value) {
            addCriterion("walletHistory.balance_change <>", value, "balanceChange");
            return (Criteria) this;
        }

        public Criteria andBalanceChangeGreaterThan(String value) {
            addCriterion("walletHistory.balance_change >", value, "balanceChange");
            return (Criteria) this;
        }

        public Criteria andBalanceChangeGreaterThanOrEqualTo(String value) {
            addCriterion("walletHistory.balance_change >=", value, "balanceChange");
            return (Criteria) this;
        }

        public Criteria andBalanceChangeLessThan(String value) {
            addCriterion("walletHistory.balance_change <", value, "balanceChange");
            return (Criteria) this;
        }

        public Criteria andBalanceChangeLessThanOrEqualTo(String value) {
            addCriterion("walletHistory.balance_change <=", value, "balanceChange");
            return (Criteria) this;
        }

        public Criteria andBalanceChangeLike(String value) {
            addCriterion("walletHistory.balance_change like", value, "balanceChange");
            return (Criteria) this;
        }

        public Criteria andBalanceChangeNotLike(String value) {
            addCriterion("walletHistory.balance_change not like", value, "balanceChange");
            return (Criteria) this;
        }

        public Criteria andBalanceChangeIn(List<String> values) {
            addCriterion("walletHistory.balance_change in", values, "balanceChange");
            return (Criteria) this;
        }

        public Criteria andBalanceChangeNotIn(List<String> values) {
            addCriterion("walletHistory.balance_change not in", values, "balanceChange");
            return (Criteria) this;
        }

        public Criteria andBalanceChangeBetween(String value1, String value2) {
            addCriterion("walletHistory.balance_change between", value1, value2, "balanceChange");
            return (Criteria) this;
        }

        public Criteria andBalanceChangeNotBetween(String value1, String value2) {
            addCriterion("walletHistory.balance_change not between", value1, value2, "balanceChange");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("walletHistory.type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("walletHistory.type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("walletHistory.type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("walletHistory.type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("walletHistory.type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("walletHistory.type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("walletHistory.type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("walletHistory.type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("walletHistory.type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("walletHistory.type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("walletHistory.type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("walletHistory.type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("walletHistory.type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("walletHistory.type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("walletHistory.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("walletHistory.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("walletHistory.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("walletHistory.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("walletHistory.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("walletHistory.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("walletHistory.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("walletHistory.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("walletHistory.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("walletHistory.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("walletHistory.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("walletHistory.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("walletHistory.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("walletHistory.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("walletHistory.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("walletHistory.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("walletHistory.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("walletHistory.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("walletHistory.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("walletHistory.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("walletHistory.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("walletHistory.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("walletHistory.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("walletHistory.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("walletHistory.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("walletHistory.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("walletHistory.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("walletHistory.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("walletHistory.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("walletHistory.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("walletHistory.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("walletHistory.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("walletHistory.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("walletHistory.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("walletHistory.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("walletHistory.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("walletHistory.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("walletHistory.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("walletHistory.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("walletHistory.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}