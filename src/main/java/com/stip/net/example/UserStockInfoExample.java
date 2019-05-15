package com.stip.net.example;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserStockInfoExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public UserStockInfoExample() {
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

        public Criteria andAppealIdIsNull() {
            addCriterion("userStockInfo.appeal_id is null");
            return (Criteria) this;
        }

        public Criteria andAppealIdIsNotNull() {
            addCriterion("userStockInfo.appeal_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppealIdEqualTo(Integer value) {
            addCriterion("userStockInfo.appeal_id =", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotEqualTo(Integer value) {
            addCriterion("userStockInfo.appeal_id <>", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdGreaterThan(Integer value) {
            addCriterion("userStockInfo.appeal_id >", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userStockInfo.appeal_id >=", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdLessThan(Integer value) {
            addCriterion("userStockInfo.appeal_id <", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdLessThanOrEqualTo(Integer value) {
            addCriterion("userStockInfo.appeal_id <=", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdIn(List<Integer> values) {
            addCriterion("userStockInfo.appeal_id in", values, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotIn(List<Integer> values) {
            addCriterion("userStockInfo.appeal_id not in", values, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdBetween(Integer value1, Integer value2) {
            addCriterion("userStockInfo.appeal_id between", value1, value2, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userStockInfo.appeal_id not between", value1, value2, "appealId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdIsNull() {
            addCriterion("userStockInfo.user_open_id is null");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdIsNotNull() {
            addCriterion("userStockInfo.user_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdEqualTo(String value) {
            addCriterion("userStockInfo.user_open_id =", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotEqualTo(String value) {
            addCriterion("userStockInfo.user_open_id <>", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdGreaterThan(String value) {
            addCriterion("userStockInfo.user_open_id >", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("userStockInfo.user_open_id >=", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdLessThan(String value) {
            addCriterion("userStockInfo.user_open_id <", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdLessThanOrEqualTo(String value) {
            addCriterion("userStockInfo.user_open_id <=", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdLike(String value) {
            addCriterion("userStockInfo.user_open_id like", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotLike(String value) {
            addCriterion("userStockInfo.user_open_id not like", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdIn(List<String> values) {
            addCriterion("userStockInfo.user_open_id in", values, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotIn(List<String> values) {
            addCriterion("userStockInfo.user_open_id not in", values, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdBetween(String value1, String value2) {
            addCriterion("userStockInfo.user_open_id between", value1, value2, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotBetween(String value1, String value2) {
            addCriterion("userStockInfo.user_open_id not between", value1, value2, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andStockNumIsNull() {
            addCriterion("userStockInfo.stock_num is null");
            return (Criteria) this;
        }

        public Criteria andStockNumIsNotNull() {
            addCriterion("userStockInfo.stock_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockNumEqualTo(Integer value) {
            addCriterion("userStockInfo.stock_num =", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotEqualTo(Integer value) {
            addCriterion("userStockInfo.stock_num <>", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThan(Integer value) {
            addCriterion("userStockInfo.stock_num >", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("userStockInfo.stock_num >=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThan(Integer value) {
            addCriterion("userStockInfo.stock_num <", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThanOrEqualTo(Integer value) {
            addCriterion("userStockInfo.stock_num <=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumIn(List<Integer> values) {
            addCriterion("userStockInfo.stock_num in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotIn(List<Integer> values) {
            addCriterion("userStockInfo.stock_num not in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumBetween(Integer value1, Integer value2) {
            addCriterion("userStockInfo.stock_num between", value1, value2, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotBetween(Integer value1, Integer value2) {
            addCriterion("userStockInfo.stock_num not between", value1, value2, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("userStockInfo.stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("userStockInfo.stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("userStockInfo.stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("userStockInfo.stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("userStockInfo.stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("userStockInfo.stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("userStockInfo.stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("userStockInfo.stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("userStockInfo.stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("userStockInfo.stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("userStockInfo.stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("userStockInfo.stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("userStockInfo.stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("userStockInfo.stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNull() {
            addCriterion("userStockInfo.stock_name is null");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNotNull() {
            addCriterion("userStockInfo.stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualTo(String value) {
            addCriterion("userStockInfo.stock_name =", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualTo(String value) {
            addCriterion("userStockInfo.stock_name <>", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThan(String value) {
            addCriterion("userStockInfo.stock_name >", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("userStockInfo.stock_name >=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThan(String value) {
            addCriterion("userStockInfo.stock_name <", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualTo(String value) {
            addCriterion("userStockInfo.stock_name <=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLike(String value) {
            addCriterion("userStockInfo.stock_name like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotLike(String value) {
            addCriterion("userStockInfo.stock_name not like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameIn(List<String> values) {
            addCriterion("userStockInfo.stock_name in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotIn(List<String> values) {
            addCriterion("userStockInfo.stock_name not in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameBetween(String value1, String value2) {
            addCriterion("userStockInfo.stock_name between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotBetween(String value1, String value2) {
            addCriterion("userStockInfo.stock_name not between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andOutMoneyIsNull() {
            addCriterion("userStockInfo.out_money is null");
            return (Criteria) this;
        }

        public Criteria andOutMoneyIsNotNull() {
            addCriterion("userStockInfo.out_money is not null");
            return (Criteria) this;
        }

        public Criteria andOutMoneyEqualTo(String value) {
            addCriterion("userStockInfo.out_money =", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyNotEqualTo(String value) {
            addCriterion("userStockInfo.out_money <>", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyGreaterThan(String value) {
            addCriterion("userStockInfo.out_money >", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("userStockInfo.out_money >=", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyLessThan(String value) {
            addCriterion("userStockInfo.out_money <", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyLessThanOrEqualTo(String value) {
            addCriterion("userStockInfo.out_money <=", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyLike(String value) {
            addCriterion("userStockInfo.out_money like", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyNotLike(String value) {
            addCriterion("userStockInfo.out_money not like", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyIn(List<String> values) {
            addCriterion("userStockInfo.out_money in", values, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyNotIn(List<String> values) {
            addCriterion("userStockInfo.out_money not in", values, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyBetween(String value1, String value2) {
            addCriterion("userStockInfo.out_money between", value1, value2, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyNotBetween(String value1, String value2) {
            addCriterion("userStockInfo.out_money not between", value1, value2, "outMoney");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("userStockInfo.user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userStockInfo.user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userStockInfo.user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userStockInfo.user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userStockInfo.user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userStockInfo.user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userStockInfo.user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userStockInfo.user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userStockInfo.user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userStockInfo.user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userStockInfo.user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userStockInfo.user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userStockInfo.user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userStockInfo.user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("userStockInfo.user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("userStockInfo.user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("userStockInfo.user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("userStockInfo.user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("userStockInfo.user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("userStockInfo.user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("userStockInfo.user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("userStockInfo.user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("userStockInfo.user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("userStockInfo.user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("userStockInfo.user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("userStockInfo.user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("userStockInfo.user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("userStockInfo.user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("userStockInfo.user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("userStockInfo.user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("userStockInfo.user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("userStockInfo.user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("userStockInfo.user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("userStockInfo.user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("userStockInfo.user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("userStockInfo.user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("userStockInfo.user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("userStockInfo.user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("userStockInfo.user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("userStockInfo.user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("userStockInfo.user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("userStockInfo.user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("userStockInfo.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("userStockInfo.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("userStockInfo.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("userStockInfo.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("userStockInfo.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userStockInfo.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("userStockInfo.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("userStockInfo.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("userStockInfo.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("userStockInfo.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("userStockInfo.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("userStockInfo.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("userStockInfo.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("userStockInfo.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("userStockInfo.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("userStockInfo.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("userStockInfo.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("userStockInfo.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("userStockInfo.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("userStockInfo.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("userStockInfo.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("userStockInfo.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("userStockInfo.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("userStockInfo.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("userStockInfo.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("userStockInfo.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}