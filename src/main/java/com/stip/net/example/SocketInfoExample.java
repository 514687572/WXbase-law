package com.stip.net.example;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SocketInfoExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public SocketInfoExample() {
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

        public Criteria andStockIdIsNull() {
            addCriterion("socketInfo.stock_id is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("socketInfo.stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(Integer value) {
            addCriterion("socketInfo.stock_id =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(Integer value) {
            addCriterion("socketInfo.stock_id <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(Integer value) {
            addCriterion("socketInfo.stock_id >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("socketInfo.stock_id >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(Integer value) {
            addCriterion("socketInfo.stock_id <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("socketInfo.stock_id <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<Integer> values) {
            addCriterion("socketInfo.stock_id in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<Integer> values) {
            addCriterion("socketInfo.stock_id not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(Integer value1, Integer value2) {
            addCriterion("socketInfo.stock_id between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("socketInfo.stock_id not between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNull() {
            addCriterion("socketInfo.stock_name is null");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNotNull() {
            addCriterion("socketInfo.stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualTo(String value) {
            addCriterion("socketInfo.stock_name =", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualTo(String value) {
            addCriterion("socketInfo.stock_name <>", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThan(String value) {
            addCriterion("socketInfo.stock_name >", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("socketInfo.stock_name >=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThan(String value) {
            addCriterion("socketInfo.stock_name <", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualTo(String value) {
            addCriterion("socketInfo.stock_name <=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLike(String value) {
            addCriterion("socketInfo.stock_name like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotLike(String value) {
            addCriterion("socketInfo.stock_name not like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameIn(List<String> values) {
            addCriterion("socketInfo.stock_name in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotIn(List<String> values) {
            addCriterion("socketInfo.stock_name not in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameBetween(String value1, String value2) {
            addCriterion("socketInfo.stock_name between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotBetween(String value1, String value2) {
            addCriterion("socketInfo.stock_name not between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNumIsNull() {
            addCriterion("socketInfo.stock_num is null");
            return (Criteria) this;
        }

        public Criteria andStockNumIsNotNull() {
            addCriterion("socketInfo.stock_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockNumEqualTo(String value) {
            addCriterion("socketInfo.stock_num =", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotEqualTo(String value) {
            addCriterion("socketInfo.stock_num <>", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThan(String value) {
            addCriterion("socketInfo.stock_num >", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThanOrEqualTo(String value) {
            addCriterion("socketInfo.stock_num >=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThan(String value) {
            addCriterion("socketInfo.stock_num <", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThanOrEqualTo(String value) {
            addCriterion("socketInfo.stock_num <=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLike(String value) {
            addCriterion("socketInfo.stock_num like", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotLike(String value) {
            addCriterion("socketInfo.stock_num not like", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumIn(List<String> values) {
            addCriterion("socketInfo.stock_num in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotIn(List<String> values) {
            addCriterion("socketInfo.stock_num not in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumBetween(String value1, String value2) {
            addCriterion("socketInfo.stock_num between", value1, value2, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotBetween(String value1, String value2) {
            addCriterion("socketInfo.stock_num not between", value1, value2, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockRemarkIsNull() {
            addCriterion("socketInfo.stock_remark is null");
            return (Criteria) this;
        }

        public Criteria andStockRemarkIsNotNull() {
            addCriterion("socketInfo.stock_remark is not null");
            return (Criteria) this;
        }

        public Criteria andStockRemarkEqualTo(String value) {
            addCriterion("socketInfo.stock_remark =", value, "stockRemark");
            return (Criteria) this;
        }

        public Criteria andStockRemarkNotEqualTo(String value) {
            addCriterion("socketInfo.stock_remark <>", value, "stockRemark");
            return (Criteria) this;
        }

        public Criteria andStockRemarkGreaterThan(String value) {
            addCriterion("socketInfo.stock_remark >", value, "stockRemark");
            return (Criteria) this;
        }

        public Criteria andStockRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("socketInfo.stock_remark >=", value, "stockRemark");
            return (Criteria) this;
        }

        public Criteria andStockRemarkLessThan(String value) {
            addCriterion("socketInfo.stock_remark <", value, "stockRemark");
            return (Criteria) this;
        }

        public Criteria andStockRemarkLessThanOrEqualTo(String value) {
            addCriterion("socketInfo.stock_remark <=", value, "stockRemark");
            return (Criteria) this;
        }

        public Criteria andStockRemarkLike(String value) {
            addCriterion("socketInfo.stock_remark like", value, "stockRemark");
            return (Criteria) this;
        }

        public Criteria andStockRemarkNotLike(String value) {
            addCriterion("socketInfo.stock_remark not like", value, "stockRemark");
            return (Criteria) this;
        }

        public Criteria andStockRemarkIn(List<String> values) {
            addCriterion("socketInfo.stock_remark in", values, "stockRemark");
            return (Criteria) this;
        }

        public Criteria andStockRemarkNotIn(List<String> values) {
            addCriterion("socketInfo.stock_remark not in", values, "stockRemark");
            return (Criteria) this;
        }

        public Criteria andStockRemarkBetween(String value1, String value2) {
            addCriterion("socketInfo.stock_remark between", value1, value2, "stockRemark");
            return (Criteria) this;
        }

        public Criteria andStockRemarkNotBetween(String value1, String value2) {
            addCriterion("socketInfo.stock_remark not between", value1, value2, "stockRemark");
            return (Criteria) this;
        }

        public Criteria andStockEndTimeIsNull() {
            addCriterion("socketInfo.stock_end_time is null");
            return (Criteria) this;
        }

        public Criteria andStockEndTimeIsNotNull() {
            addCriterion("socketInfo.stock_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andStockEndTimeEqualTo(Date value) {
            addCriterion("socketInfo.stock_end_time =", value, "stockEndTime");
            return (Criteria) this;
        }

        public Criteria andStockEndTimeNotEqualTo(Date value) {
            addCriterion("socketInfo.stock_end_time <>", value, "stockEndTime");
            return (Criteria) this;
        }

        public Criteria andStockEndTimeGreaterThan(Date value) {
            addCriterion("socketInfo.stock_end_time >", value, "stockEndTime");
            return (Criteria) this;
        }

        public Criteria andStockEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("socketInfo.stock_end_time >=", value, "stockEndTime");
            return (Criteria) this;
        }

        public Criteria andStockEndTimeLessThan(Date value) {
            addCriterion("socketInfo.stock_end_time <", value, "stockEndTime");
            return (Criteria) this;
        }

        public Criteria andStockEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("socketInfo.stock_end_time <=", value, "stockEndTime");
            return (Criteria) this;
        }

        public Criteria andStockEndTimeIn(List<Date> values) {
            addCriterion("socketInfo.stock_end_time in", values, "stockEndTime");
            return (Criteria) this;
        }

        public Criteria andStockEndTimeNotIn(List<Date> values) {
            addCriterion("socketInfo.stock_end_time not in", values, "stockEndTime");
            return (Criteria) this;
        }

        public Criteria andStockEndTimeBetween(Date value1, Date value2) {
            addCriterion("socketInfo.stock_end_time between", value1, value2, "stockEndTime");
            return (Criteria) this;
        }

        public Criteria andStockEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("socketInfo.stock_end_time not between", value1, value2, "stockEndTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("socketInfo.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("socketInfo.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("socketInfo.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("socketInfo.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("socketInfo.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("socketInfo.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("socketInfo.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("socketInfo.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("socketInfo.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("socketInfo.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("socketInfo.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("socketInfo.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOptUserIsNull() {
            addCriterion("socketInfo.opt_user is null");
            return (Criteria) this;
        }

        public Criteria andOptUserIsNotNull() {
            addCriterion("socketInfo.opt_user is not null");
            return (Criteria) this;
        }

        public Criteria andOptUserEqualTo(String value) {
            addCriterion("socketInfo.opt_user =", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserNotEqualTo(String value) {
            addCriterion("socketInfo.opt_user <>", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserGreaterThan(String value) {
            addCriterion("socketInfo.opt_user >", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserGreaterThanOrEqualTo(String value) {
            addCriterion("socketInfo.opt_user >=", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserLessThan(String value) {
            addCriterion("socketInfo.opt_user <", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserLessThanOrEqualTo(String value) {
            addCriterion("socketInfo.opt_user <=", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserLike(String value) {
            addCriterion("socketInfo.opt_user like", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserNotLike(String value) {
            addCriterion("socketInfo.opt_user not like", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserIn(List<String> values) {
            addCriterion("socketInfo.opt_user in", values, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserNotIn(List<String> values) {
            addCriterion("socketInfo.opt_user not in", values, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserBetween(String value1, String value2) {
            addCriterion("socketInfo.opt_user between", value1, value2, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserNotBetween(String value1, String value2) {
            addCriterion("socketInfo.opt_user not between", value1, value2, "optUser");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("socketInfo.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("socketInfo.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("socketInfo.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("socketInfo.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("socketInfo.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("socketInfo.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("socketInfo.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("socketInfo.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("socketInfo.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("socketInfo.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("socketInfo.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("socketInfo.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("socketInfo.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("socketInfo.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStockNameOrCodeLike(String value) {
            addCriterion(" (socketInfo.stock_name like '%"+value+"%' or socketInfo.stock_num like '%"+value+"%')");
            return (Criteria) this;
        }

    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}