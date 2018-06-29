package com.stip.net.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;

public class UserWalletExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public UserWalletExample() {
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

        public Criteria andWalletIdIsNull() {
            addCriterion("userWallet.wallet_id is null");
            return (Criteria) this;
        }

        public Criteria andWalletIdIsNotNull() {
            addCriterion("userWallet.wallet_id is not null");
            return (Criteria) this;
        }

        public Criteria andWalletIdEqualTo(String value) {
            addCriterion("userWallet.wallet_id =", value, "walletId");
            return (Criteria) this;
        }

        public Criteria andWalletIdNotEqualTo(String value) {
            addCriterion("userWallet.wallet_id <>", value, "walletId");
            return (Criteria) this;
        }

        public Criteria andWalletIdGreaterThan(String value) {
            addCriterion("userWallet.wallet_id >", value, "walletId");
            return (Criteria) this;
        }

        public Criteria andWalletIdGreaterThanOrEqualTo(String value) {
            addCriterion("userWallet.wallet_id >=", value, "walletId");
            return (Criteria) this;
        }

        public Criteria andWalletIdLessThan(String value) {
            addCriterion("userWallet.wallet_id <", value, "walletId");
            return (Criteria) this;
        }

        public Criteria andWalletIdLessThanOrEqualTo(String value) {
            addCriterion("userWallet.wallet_id <=", value, "walletId");
            return (Criteria) this;
        }

        public Criteria andWalletIdLike(String value) {
            addCriterion("userWallet.wallet_id like", value, "walletId");
            return (Criteria) this;
        }

        public Criteria andWalletIdNotLike(String value) {
            addCriterion("userWallet.wallet_id not like", value, "walletId");
            return (Criteria) this;
        }

        public Criteria andWalletIdIn(List<String> values) {
            addCriterion("userWallet.wallet_id in", values, "walletId");
            return (Criteria) this;
        }

        public Criteria andWalletIdNotIn(List<String> values) {
            addCriterion("userWallet.wallet_id not in", values, "walletId");
            return (Criteria) this;
        }

        public Criteria andWalletIdBetween(String value1, String value2) {
            addCriterion("userWallet.wallet_id between", value1, value2, "walletId");
            return (Criteria) this;
        }

        public Criteria andWalletIdNotBetween(String value1, String value2) {
            addCriterion("userWallet.wallet_id not between", value1, value2, "walletId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("userWallet.open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("userWallet.open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("userWallet.open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("userWallet.open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("userWallet.open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("userWallet.open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("userWallet.open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("userWallet.open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("userWallet.open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("userWallet.open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("userWallet.open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("userWallet.open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("userWallet.open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("userWallet.open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("userWallet.balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("userWallet.balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(String value) {
            addCriterion("userWallet.balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(String value) {
            addCriterion("userWallet.balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(String value) {
            addCriterion("userWallet.balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("userWallet.balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(String value) {
            addCriterion("userWallet.balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(String value) {
            addCriterion("userWallet.balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLike(String value) {
            addCriterion("userWallet.balance like", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotLike(String value) {
            addCriterion("userWallet.balance not like", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<String> values) {
            addCriterion("userWallet.balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<String> values) {
            addCriterion("userWallet.balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(String value1, String value2) {
            addCriterion("userWallet.balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(String value1, String value2) {
            addCriterion("userWallet.balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("userWallet.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("userWallet.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("userWallet.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("userWallet.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("userWallet.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userWallet.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("userWallet.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("userWallet.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("userWallet.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("userWallet.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("userWallet.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("userWallet.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("userWallet.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("userWallet.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("userWallet.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("userWallet.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("userWallet.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("userWallet.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("userWallet.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("userWallet.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("userWallet.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("userWallet.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("userWallet.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("userWallet.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("userWallet.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("userWallet.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}