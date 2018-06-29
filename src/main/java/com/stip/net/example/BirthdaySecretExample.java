package com.stip.net.example;

import java.util.ArrayList;
import java.util.List;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;

public class BirthdaySecretExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public BirthdaySecretExample() {
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

        public Criteria andSecretIdIsNull() {
            addCriterion("birthdaySecret.secret_id is null");
            return (Criteria) this;
        }

        public Criteria andSecretIdIsNotNull() {
            addCriterion("birthdaySecret.secret_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecretIdEqualTo(String value) {
            addCriterion("birthdaySecret.secret_id =", value, "secretId");
            return (Criteria) this;
        }

        public Criteria andSecretIdNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_id <>", value, "secretId");
            return (Criteria) this;
        }

        public Criteria andSecretIdGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_id >", value, "secretId");
            return (Criteria) this;
        }

        public Criteria andSecretIdGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_id >=", value, "secretId");
            return (Criteria) this;
        }

        public Criteria andSecretIdLessThan(String value) {
            addCriterion("birthdaySecret.secret_id <", value, "secretId");
            return (Criteria) this;
        }

        public Criteria andSecretIdLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_id <=", value, "secretId");
            return (Criteria) this;
        }

        public Criteria andSecretIdLike(String value) {
            addCriterion("birthdaySecret.secret_id like", value, "secretId");
            return (Criteria) this;
        }

        public Criteria andSecretIdNotLike(String value) {
            addCriterion("birthdaySecret.secret_id not like", value, "secretId");
            return (Criteria) this;
        }

        public Criteria andSecretIdIn(List<String> values) {
            addCriterion("birthdaySecret.secret_id in", values, "secretId");
            return (Criteria) this;
        }

        public Criteria andSecretIdNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_id not in", values, "secretId");
            return (Criteria) this;
        }

        public Criteria andSecretIdBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_id between", value1, value2, "secretId");
            return (Criteria) this;
        }

        public Criteria andSecretIdNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_id not between", value1, value2, "secretId");
            return (Criteria) this;
        }

        public Criteria andSecretDateKeyIsNull() {
            addCriterion("birthdaySecret.secret_date_key is null");
            return (Criteria) this;
        }

        public Criteria andSecretDateKeyIsNotNull() {
            addCriterion("birthdaySecret.secret_date_key is not null");
            return (Criteria) this;
        }

        public Criteria andSecretDateKeyEqualTo(String value) {
            addCriterion("birthdaySecret.secret_date_key =", value, "secretDateKey");
            return (Criteria) this;
        }

        public Criteria andSecretDateKeyNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_date_key <>", value, "secretDateKey");
            return (Criteria) this;
        }

        public Criteria andSecretDateKeyGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_date_key >", value, "secretDateKey");
            return (Criteria) this;
        }

        public Criteria andSecretDateKeyGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_date_key >=", value, "secretDateKey");
            return (Criteria) this;
        }

        public Criteria andSecretDateKeyLessThan(String value) {
            addCriterion("birthdaySecret.secret_date_key <", value, "secretDateKey");
            return (Criteria) this;
        }

        public Criteria andSecretDateKeyLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_date_key <=", value, "secretDateKey");
            return (Criteria) this;
        }

        public Criteria andSecretDateKeyLike(String value) {
            addCriterion("birthdaySecret.secret_date_key like", value, "secretDateKey");
            return (Criteria) this;
        }

        public Criteria andSecretDateKeyNotLike(String value) {
            addCriterion("birthdaySecret.secret_date_key not like", value, "secretDateKey");
            return (Criteria) this;
        }

        public Criteria andSecretDateKeyIn(List<String> values) {
            addCriterion("birthdaySecret.secret_date_key in", values, "secretDateKey");
            return (Criteria) this;
        }

        public Criteria andSecretDateKeyNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_date_key not in", values, "secretDateKey");
            return (Criteria) this;
        }

        public Criteria andSecretDateKeyBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_date_key between", value1, value2, "secretDateKey");
            return (Criteria) this;
        }

        public Criteria andSecretDateKeyNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_date_key not between", value1, value2, "secretDateKey");
            return (Criteria) this;
        }

        public Criteria andSecretDateValueIsNull() {
            addCriterion("birthdaySecret.secret_date_value is null");
            return (Criteria) this;
        }

        public Criteria andSecretDateValueIsNotNull() {
            addCriterion("birthdaySecret.secret_date_value is not null");
            return (Criteria) this;
        }

        public Criteria andSecretDateValueEqualTo(String value) {
            addCriterion("birthdaySecret.secret_date_value =", value, "secretDateValue");
            return (Criteria) this;
        }

        public Criteria andSecretDateValueNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_date_value <>", value, "secretDateValue");
            return (Criteria) this;
        }

        public Criteria andSecretDateValueGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_date_value >", value, "secretDateValue");
            return (Criteria) this;
        }

        public Criteria andSecretDateValueGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_date_value >=", value, "secretDateValue");
            return (Criteria) this;
        }

        public Criteria andSecretDateValueLessThan(String value) {
            addCriterion("birthdaySecret.secret_date_value <", value, "secretDateValue");
            return (Criteria) this;
        }

        public Criteria andSecretDateValueLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_date_value <=", value, "secretDateValue");
            return (Criteria) this;
        }

        public Criteria andSecretDateValueLike(String value) {
            addCriterion("birthdaySecret.secret_date_value like", value, "secretDateValue");
            return (Criteria) this;
        }

        public Criteria andSecretDateValueNotLike(String value) {
            addCriterion("birthdaySecret.secret_date_value not like", value, "secretDateValue");
            return (Criteria) this;
        }

        public Criteria andSecretDateValueIn(List<String> values) {
            addCriterion("birthdaySecret.secret_date_value in", values, "secretDateValue");
            return (Criteria) this;
        }

        public Criteria andSecretDateValueNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_date_value not in", values, "secretDateValue");
            return (Criteria) this;
        }

        public Criteria andSecretDateValueBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_date_value between", value1, value2, "secretDateValue");
            return (Criteria) this;
        }

        public Criteria andSecretDateValueNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_date_value not between", value1, value2, "secretDateValue");
            return (Criteria) this;
        }

        public Criteria andSecretTitleIsNull() {
            addCriterion("birthdaySecret.secret_title is null");
            return (Criteria) this;
        }

        public Criteria andSecretTitleIsNotNull() {
            addCriterion("birthdaySecret.secret_title is not null");
            return (Criteria) this;
        }

        public Criteria andSecretTitleEqualTo(String value) {
            addCriterion("birthdaySecret.secret_title =", value, "secretTitle");
            return (Criteria) this;
        }

        public Criteria andSecretTitleNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_title <>", value, "secretTitle");
            return (Criteria) this;
        }

        public Criteria andSecretTitleGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_title >", value, "secretTitle");
            return (Criteria) this;
        }

        public Criteria andSecretTitleGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_title >=", value, "secretTitle");
            return (Criteria) this;
        }

        public Criteria andSecretTitleLessThan(String value) {
            addCriterion("birthdaySecret.secret_title <", value, "secretTitle");
            return (Criteria) this;
        }

        public Criteria andSecretTitleLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_title <=", value, "secretTitle");
            return (Criteria) this;
        }

        public Criteria andSecretTitleLike(String value) {
            addCriterion("birthdaySecret.secret_title like", value, "secretTitle");
            return (Criteria) this;
        }

        public Criteria andSecretTitleNotLike(String value) {
            addCriterion("birthdaySecret.secret_title not like", value, "secretTitle");
            return (Criteria) this;
        }

        public Criteria andSecretTitleIn(List<String> values) {
            addCriterion("birthdaySecret.secret_title in", values, "secretTitle");
            return (Criteria) this;
        }

        public Criteria andSecretTitleNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_title not in", values, "secretTitle");
            return (Criteria) this;
        }

        public Criteria andSecretTitleBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_title between", value1, value2, "secretTitle");
            return (Criteria) this;
        }

        public Criteria andSecretTitleNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_title not between", value1, value2, "secretTitle");
            return (Criteria) this;
        }

        public Criteria andSecretPositionIsNull() {
            addCriterion("birthdaySecret.secret_position is null");
            return (Criteria) this;
        }

        public Criteria andSecretPositionIsNotNull() {
            addCriterion("birthdaySecret.secret_position is not null");
            return (Criteria) this;
        }

        public Criteria andSecretPositionEqualTo(String value) {
            addCriterion("birthdaySecret.secret_position =", value, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_position <>", value, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_position >", value, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_position >=", value, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionLessThan(String value) {
            addCriterion("birthdaySecret.secret_position <", value, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_position <=", value, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionLike(String value) {
            addCriterion("birthdaySecret.secret_position like", value, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionNotLike(String value) {
            addCriterion("birthdaySecret.secret_position not like", value, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionIn(List<String> values) {
            addCriterion("birthdaySecret.secret_position in", values, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_position not in", values, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_position between", value1, value2, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_position not between", value1, value2, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretStarIsNull() {
            addCriterion("birthdaySecret.secret_star is null");
            return (Criteria) this;
        }

        public Criteria andSecretStarIsNotNull() {
            addCriterion("birthdaySecret.secret_star is not null");
            return (Criteria) this;
        }

        public Criteria andSecretStarEqualTo(String value) {
            addCriterion("birthdaySecret.secret_star =", value, "secretStar");
            return (Criteria) this;
        }

        public Criteria andSecretStarNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_star <>", value, "secretStar");
            return (Criteria) this;
        }

        public Criteria andSecretStarGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_star >", value, "secretStar");
            return (Criteria) this;
        }

        public Criteria andSecretStarGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_star >=", value, "secretStar");
            return (Criteria) this;
        }

        public Criteria andSecretStarLessThan(String value) {
            addCriterion("birthdaySecret.secret_star <", value, "secretStar");
            return (Criteria) this;
        }

        public Criteria andSecretStarLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_star <=", value, "secretStar");
            return (Criteria) this;
        }

        public Criteria andSecretStarLike(String value) {
            addCriterion("birthdaySecret.secret_star like", value, "secretStar");
            return (Criteria) this;
        }

        public Criteria andSecretStarNotLike(String value) {
            addCriterion("birthdaySecret.secret_star not like", value, "secretStar");
            return (Criteria) this;
        }

        public Criteria andSecretStarIn(List<String> values) {
            addCriterion("birthdaySecret.secret_star in", values, "secretStar");
            return (Criteria) this;
        }

        public Criteria andSecretStarNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_star not in", values, "secretStar");
            return (Criteria) this;
        }

        public Criteria andSecretStarBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_star between", value1, value2, "secretStar");
            return (Criteria) this;
        }

        public Criteria andSecretStarNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_star not between", value1, value2, "secretStar");
            return (Criteria) this;
        }

        public Criteria andSecretBookIsNull() {
            addCriterion("birthdaySecret.secret_book is null");
            return (Criteria) this;
        }

        public Criteria andSecretBookIsNotNull() {
            addCriterion("birthdaySecret.secret_book is not null");
            return (Criteria) this;
        }

        public Criteria andSecretBookEqualTo(String value) {
            addCriterion("birthdaySecret.secret_book =", value, "secretBook");
            return (Criteria) this;
        }

        public Criteria andSecretBookNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_book <>", value, "secretBook");
            return (Criteria) this;
        }

        public Criteria andSecretBookGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_book >", value, "secretBook");
            return (Criteria) this;
        }

        public Criteria andSecretBookGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_book >=", value, "secretBook");
            return (Criteria) this;
        }

        public Criteria andSecretBookLessThan(String value) {
            addCriterion("birthdaySecret.secret_book <", value, "secretBook");
            return (Criteria) this;
        }

        public Criteria andSecretBookLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_book <=", value, "secretBook");
            return (Criteria) this;
        }

        public Criteria andSecretBookLike(String value) {
            addCriterion("birthdaySecret.secret_book like", value, "secretBook");
            return (Criteria) this;
        }

        public Criteria andSecretBookNotLike(String value) {
            addCriterion("birthdaySecret.secret_book not like", value, "secretBook");
            return (Criteria) this;
        }

        public Criteria andSecretBookIn(List<String> values) {
            addCriterion("birthdaySecret.secret_book in", values, "secretBook");
            return (Criteria) this;
        }

        public Criteria andSecretBookNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_book not in", values, "secretBook");
            return (Criteria) this;
        }

        public Criteria andSecretBookBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_book between", value1, value2, "secretBook");
            return (Criteria) this;
        }

        public Criteria andSecretBookNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_book not between", value1, value2, "secretBook");
            return (Criteria) this;
        }

        public Criteria andSecretNumIsNull() {
            addCriterion("birthdaySecret.secret_num is null");
            return (Criteria) this;
        }

        public Criteria andSecretNumIsNotNull() {
            addCriterion("birthdaySecret.secret_num is not null");
            return (Criteria) this;
        }

        public Criteria andSecretNumEqualTo(String value) {
            addCriterion("birthdaySecret.secret_num =", value, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_num <>", value, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_num >", value, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_num >=", value, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumLessThan(String value) {
            addCriterion("birthdaySecret.secret_num <", value, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_num <=", value, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumLike(String value) {
            addCriterion("birthdaySecret.secret_num like", value, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumNotLike(String value) {
            addCriterion("birthdaySecret.secret_num not like", value, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumIn(List<String> values) {
            addCriterion("birthdaySecret.secret_num in", values, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_num not in", values, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_num between", value1, value2, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_num not between", value1, value2, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretHealthyIsNull() {
            addCriterion("birthdaySecret.secret_healthy is null");
            return (Criteria) this;
        }

        public Criteria andSecretHealthyIsNotNull() {
            addCriterion("birthdaySecret.secret_healthy is not null");
            return (Criteria) this;
        }

        public Criteria andSecretHealthyEqualTo(String value) {
            addCriterion("birthdaySecret.secret_healthy =", value, "secretHealthy");
            return (Criteria) this;
        }

        public Criteria andSecretHealthyNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_healthy <>", value, "secretHealthy");
            return (Criteria) this;
        }

        public Criteria andSecretHealthyGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_healthy >", value, "secretHealthy");
            return (Criteria) this;
        }

        public Criteria andSecretHealthyGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_healthy >=", value, "secretHealthy");
            return (Criteria) this;
        }

        public Criteria andSecretHealthyLessThan(String value) {
            addCriterion("birthdaySecret.secret_healthy <", value, "secretHealthy");
            return (Criteria) this;
        }

        public Criteria andSecretHealthyLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_healthy <=", value, "secretHealthy");
            return (Criteria) this;
        }

        public Criteria andSecretHealthyLike(String value) {
            addCriterion("birthdaySecret.secret_healthy like", value, "secretHealthy");
            return (Criteria) this;
        }

        public Criteria andSecretHealthyNotLike(String value) {
            addCriterion("birthdaySecret.secret_healthy not like", value, "secretHealthy");
            return (Criteria) this;
        }

        public Criteria andSecretHealthyIn(List<String> values) {
            addCriterion("birthdaySecret.secret_healthy in", values, "secretHealthy");
            return (Criteria) this;
        }

        public Criteria andSecretHealthyNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_healthy not in", values, "secretHealthy");
            return (Criteria) this;
        }

        public Criteria andSecretHealthyBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_healthy between", value1, value2, "secretHealthy");
            return (Criteria) this;
        }

        public Criteria andSecretHealthyNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_healthy not between", value1, value2, "secretHealthy");
            return (Criteria) this;
        }

        public Criteria andSecretAdviceIsNull() {
            addCriterion("birthdaySecret.secret_advice is null");
            return (Criteria) this;
        }

        public Criteria andSecretAdviceIsNotNull() {
            addCriterion("birthdaySecret.secret_advice is not null");
            return (Criteria) this;
        }

        public Criteria andSecretAdviceEqualTo(String value) {
            addCriterion("birthdaySecret.secret_advice =", value, "secretAdvice");
            return (Criteria) this;
        }

        public Criteria andSecretAdviceNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_advice <>", value, "secretAdvice");
            return (Criteria) this;
        }

        public Criteria andSecretAdviceGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_advice >", value, "secretAdvice");
            return (Criteria) this;
        }

        public Criteria andSecretAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_advice >=", value, "secretAdvice");
            return (Criteria) this;
        }

        public Criteria andSecretAdviceLessThan(String value) {
            addCriterion("birthdaySecret.secret_advice <", value, "secretAdvice");
            return (Criteria) this;
        }

        public Criteria andSecretAdviceLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_advice <=", value, "secretAdvice");
            return (Criteria) this;
        }

        public Criteria andSecretAdviceLike(String value) {
            addCriterion("birthdaySecret.secret_advice like", value, "secretAdvice");
            return (Criteria) this;
        }

        public Criteria andSecretAdviceNotLike(String value) {
            addCriterion("birthdaySecret.secret_advice not like", value, "secretAdvice");
            return (Criteria) this;
        }

        public Criteria andSecretAdviceIn(List<String> values) {
            addCriterion("birthdaySecret.secret_advice in", values, "secretAdvice");
            return (Criteria) this;
        }

        public Criteria andSecretAdviceNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_advice not in", values, "secretAdvice");
            return (Criteria) this;
        }

        public Criteria andSecretAdviceBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_advice between", value1, value2, "secretAdvice");
            return (Criteria) this;
        }

        public Criteria andSecretAdviceNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_advice not between", value1, value2, "secretAdvice");
            return (Criteria) this;
        }

        public Criteria andSecretTarotIsNull() {
            addCriterion("birthdaySecret.secret_tarot is null");
            return (Criteria) this;
        }

        public Criteria andSecretTarotIsNotNull() {
            addCriterion("birthdaySecret.secret_tarot is not null");
            return (Criteria) this;
        }

        public Criteria andSecretTarotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_tarot =", value, "secretTarot");
            return (Criteria) this;
        }

        public Criteria andSecretTarotNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_tarot <>", value, "secretTarot");
            return (Criteria) this;
        }

        public Criteria andSecretTarotGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_tarot >", value, "secretTarot");
            return (Criteria) this;
        }

        public Criteria andSecretTarotGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_tarot >=", value, "secretTarot");
            return (Criteria) this;
        }

        public Criteria andSecretTarotLessThan(String value) {
            addCriterion("birthdaySecret.secret_tarot <", value, "secretTarot");
            return (Criteria) this;
        }

        public Criteria andSecretTarotLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_tarot <=", value, "secretTarot");
            return (Criteria) this;
        }

        public Criteria andSecretTarotLike(String value) {
            addCriterion("birthdaySecret.secret_tarot like", value, "secretTarot");
            return (Criteria) this;
        }

        public Criteria andSecretTarotNotLike(String value) {
            addCriterion("birthdaySecret.secret_tarot not like", value, "secretTarot");
            return (Criteria) this;
        }

        public Criteria andSecretTarotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_tarot in", values, "secretTarot");
            return (Criteria) this;
        }

        public Criteria andSecretTarotNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_tarot not in", values, "secretTarot");
            return (Criteria) this;
        }

        public Criteria andSecretTarotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_tarot between", value1, value2, "secretTarot");
            return (Criteria) this;
        }

        public Criteria andSecretTarotNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_tarot not between", value1, value2, "secretTarot");
            return (Criteria) this;
        }

        public Criteria andSecretTsIsNull() {
            addCriterion("birthdaySecret.secret_ts is null");
            return (Criteria) this;
        }

        public Criteria andSecretTsIsNotNull() {
            addCriterion("birthdaySecret.secret_ts is not null");
            return (Criteria) this;
        }

        public Criteria andSecretTsEqualTo(String value) {
            addCriterion("birthdaySecret.secret_ts =", value, "secretTs");
            return (Criteria) this;
        }

        public Criteria andSecretTsNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_ts <>", value, "secretTs");
            return (Criteria) this;
        }

        public Criteria andSecretTsGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_ts >", value, "secretTs");
            return (Criteria) this;
        }

        public Criteria andSecretTsGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_ts >=", value, "secretTs");
            return (Criteria) this;
        }

        public Criteria andSecretTsLessThan(String value) {
            addCriterion("birthdaySecret.secret_ts <", value, "secretTs");
            return (Criteria) this;
        }

        public Criteria andSecretTsLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_ts <=", value, "secretTs");
            return (Criteria) this;
        }

        public Criteria andSecretTsLike(String value) {
            addCriterion("birthdaySecret.secret_ts like", value, "secretTs");
            return (Criteria) this;
        }

        public Criteria andSecretTsNotLike(String value) {
            addCriterion("birthdaySecret.secret_ts not like", value, "secretTs");
            return (Criteria) this;
        }

        public Criteria andSecretTsIn(List<String> values) {
            addCriterion("birthdaySecret.secret_ts in", values, "secretTs");
            return (Criteria) this;
        }

        public Criteria andSecretTsNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_ts not in", values, "secretTs");
            return (Criteria) this;
        }

        public Criteria andSecretTsBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_ts between", value1, value2, "secretTs");
            return (Criteria) this;
        }

        public Criteria andSecretTsNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_ts not between", value1, value2, "secretTs");
            return (Criteria) this;
        }

        public Criteria andSecretGoodIsNull() {
            addCriterion("birthdaySecret.secret_good is null");
            return (Criteria) this;
        }

        public Criteria andSecretGoodIsNotNull() {
            addCriterion("birthdaySecret.secret_good is not null");
            return (Criteria) this;
        }

        public Criteria andSecretGoodEqualTo(String value) {
            addCriterion("birthdaySecret.secret_good =", value, "secretGood");
            return (Criteria) this;
        }

        public Criteria andSecretGoodNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_good <>", value, "secretGood");
            return (Criteria) this;
        }

        public Criteria andSecretGoodGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_good >", value, "secretGood");
            return (Criteria) this;
        }

        public Criteria andSecretGoodGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_good >=", value, "secretGood");
            return (Criteria) this;
        }

        public Criteria andSecretGoodLessThan(String value) {
            addCriterion("birthdaySecret.secret_good <", value, "secretGood");
            return (Criteria) this;
        }

        public Criteria andSecretGoodLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_good <=", value, "secretGood");
            return (Criteria) this;
        }

        public Criteria andSecretGoodLike(String value) {
            addCriterion("birthdaySecret.secret_good like", value, "secretGood");
            return (Criteria) this;
        }

        public Criteria andSecretGoodNotLike(String value) {
            addCriterion("birthdaySecret.secret_good not like", value, "secretGood");
            return (Criteria) this;
        }

        public Criteria andSecretGoodIn(List<String> values) {
            addCriterion("birthdaySecret.secret_good in", values, "secretGood");
            return (Criteria) this;
        }

        public Criteria andSecretGoodNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_good not in", values, "secretGood");
            return (Criteria) this;
        }

        public Criteria andSecretGoodBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_good between", value1, value2, "secretGood");
            return (Criteria) this;
        }

        public Criteria andSecretGoodNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_good not between", value1, value2, "secretGood");
            return (Criteria) this;
        }

        public Criteria andSecretBadIsNull() {
            addCriterion("birthdaySecret.secret_bad is null");
            return (Criteria) this;
        }

        public Criteria andSecretBadIsNotNull() {
            addCriterion("birthdaySecret.secret_bad is not null");
            return (Criteria) this;
        }

        public Criteria andSecretBadEqualTo(String value) {
            addCriterion("birthdaySecret.secret_bad =", value, "secretBad");
            return (Criteria) this;
        }

        public Criteria andSecretBadNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_bad <>", value, "secretBad");
            return (Criteria) this;
        }

        public Criteria andSecretBadGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_bad >", value, "secretBad");
            return (Criteria) this;
        }

        public Criteria andSecretBadGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_bad >=", value, "secretBad");
            return (Criteria) this;
        }

        public Criteria andSecretBadLessThan(String value) {
            addCriterion("birthdaySecret.secret_bad <", value, "secretBad");
            return (Criteria) this;
        }

        public Criteria andSecretBadLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_bad <=", value, "secretBad");
            return (Criteria) this;
        }

        public Criteria andSecretBadLike(String value) {
            addCriterion("birthdaySecret.secret_bad like", value, "secretBad");
            return (Criteria) this;
        }

        public Criteria andSecretBadNotLike(String value) {
            addCriterion("birthdaySecret.secret_bad not like", value, "secretBad");
            return (Criteria) this;
        }

        public Criteria andSecretBadIn(List<String> values) {
            addCriterion("birthdaySecret.secret_bad in", values, "secretBad");
            return (Criteria) this;
        }

        public Criteria andSecretBadNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_bad not in", values, "secretBad");
            return (Criteria) this;
        }

        public Criteria andSecretBadBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_bad between", value1, value2, "secretBad");
            return (Criteria) this;
        }

        public Criteria andSecretBadNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_bad not between", value1, value2, "secretBad");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerIsNull() {
            addCriterion("birthdaySecret.secret_flower is null");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerIsNotNull() {
            addCriterion("birthdaySecret.secret_flower is not null");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower =", value, "secretFlower");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower <>", value, "secretFlower");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_flower >", value, "secretFlower");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower >=", value, "secretFlower");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLessThan(String value) {
            addCriterion("birthdaySecret.secret_flower <", value, "secretFlower");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower <=", value, "secretFlower");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLike(String value) {
            addCriterion("birthdaySecret.secret_flower like", value, "secretFlower");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerNotLike(String value) {
            addCriterion("birthdaySecret.secret_flower not like", value, "secretFlower");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerIn(List<String> values) {
            addCriterion("birthdaySecret.secret_flower in", values, "secretFlower");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_flower not in", values, "secretFlower");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_flower between", value1, value2, "secretFlower");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_flower not between", value1, value2, "secretFlower");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerDescIsNull() {
            addCriterion("birthdaySecret.secret_flower_desc is null");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerDescIsNotNull() {
            addCriterion("birthdaySecret.secret_flower_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerDescEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_desc =", value, "secretFlowerDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerDescNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_desc <>", value, "secretFlowerDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerDescGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_flower_desc >", value, "secretFlowerDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerDescGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_desc >=", value, "secretFlowerDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerDescLessThan(String value) {
            addCriterion("birthdaySecret.secret_flower_desc <", value, "secretFlowerDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerDescLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_desc <=", value, "secretFlowerDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerDescLike(String value) {
            addCriterion("birthdaySecret.secret_flower_desc like", value, "secretFlowerDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerDescNotLike(String value) {
            addCriterion("birthdaySecret.secret_flower_desc not like", value, "secretFlowerDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerDescIn(List<String> values) {
            addCriterion("birthdaySecret.secret_flower_desc in", values, "secretFlowerDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerDescNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_flower_desc not in", values, "secretFlowerDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerDescBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_flower_desc between", value1, value2, "secretFlowerDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerDescNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_flower_desc not between", value1, value2, "secretFlowerDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanIsNull() {
            addCriterion("birthdaySecret.secret_flower_lan is null");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanIsNotNull() {
            addCriterion("birthdaySecret.secret_flower_lan is not null");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_lan =", value, "secretFlowerLan");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_lan <>", value, "secretFlowerLan");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_flower_lan >", value, "secretFlowerLan");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_lan >=", value, "secretFlowerLan");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanLessThan(String value) {
            addCriterion("birthdaySecret.secret_flower_lan <", value, "secretFlowerLan");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_lan <=", value, "secretFlowerLan");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanLike(String value) {
            addCriterion("birthdaySecret.secret_flower_lan like", value, "secretFlowerLan");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanNotLike(String value) {
            addCriterion("birthdaySecret.secret_flower_lan not like", value, "secretFlowerLan");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanIn(List<String> values) {
            addCriterion("birthdaySecret.secret_flower_lan in", values, "secretFlowerLan");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_flower_lan not in", values, "secretFlowerLan");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_flower_lan between", value1, value2, "secretFlowerLan");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_flower_lan not between", value1, value2, "secretFlowerLan");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanDescIsNull() {
            addCriterion("birthdaySecret.secret_flower_lan_desc is null");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanDescIsNotNull() {
            addCriterion("birthdaySecret.secret_flower_lan_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanDescEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_lan_desc =", value, "secretFlowerLanDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanDescNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_lan_desc <>", value, "secretFlowerLanDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanDescGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_flower_lan_desc >", value, "secretFlowerLanDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanDescGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_lan_desc >=", value, "secretFlowerLanDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanDescLessThan(String value) {
            addCriterion("birthdaySecret.secret_flower_lan_desc <", value, "secretFlowerLanDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanDescLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_lan_desc <=", value, "secretFlowerLanDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanDescLike(String value) {
            addCriterion("birthdaySecret.secret_flower_lan_desc like", value, "secretFlowerLanDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanDescNotLike(String value) {
            addCriterion("birthdaySecret.secret_flower_lan_desc not like", value, "secretFlowerLanDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanDescIn(List<String> values) {
            addCriterion("birthdaySecret.secret_flower_lan_desc in", values, "secretFlowerLanDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanDescNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_flower_lan_desc not in", values, "secretFlowerLanDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanDescBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_flower_lan_desc between", value1, value2, "secretFlowerLanDesc");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerLanDescNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_flower_lan_desc not between", value1, value2, "secretFlowerLanDesc");
            return (Criteria) this;
        }

        public Criteria andSecretStoneIsNull() {
            addCriterion("birthdaySecret.secret_stone is null");
            return (Criteria) this;
        }

        public Criteria andSecretStoneIsNotNull() {
            addCriterion("birthdaySecret.secret_stone is not null");
            return (Criteria) this;
        }

        public Criteria andSecretStoneEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone =", value, "secretStone");
            return (Criteria) this;
        }

        public Criteria andSecretStoneNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone <>", value, "secretStone");
            return (Criteria) this;
        }

        public Criteria andSecretStoneGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_stone >", value, "secretStone");
            return (Criteria) this;
        }

        public Criteria andSecretStoneGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone >=", value, "secretStone");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLessThan(String value) {
            addCriterion("birthdaySecret.secret_stone <", value, "secretStone");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone <=", value, "secretStone");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLike(String value) {
            addCriterion("birthdaySecret.secret_stone like", value, "secretStone");
            return (Criteria) this;
        }

        public Criteria andSecretStoneNotLike(String value) {
            addCriterion("birthdaySecret.secret_stone not like", value, "secretStone");
            return (Criteria) this;
        }

        public Criteria andSecretStoneIn(List<String> values) {
            addCriterion("birthdaySecret.secret_stone in", values, "secretStone");
            return (Criteria) this;
        }

        public Criteria andSecretStoneNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_stone not in", values, "secretStone");
            return (Criteria) this;
        }

        public Criteria andSecretStoneBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_stone between", value1, value2, "secretStone");
            return (Criteria) this;
        }

        public Criteria andSecretStoneNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_stone not between", value1, value2, "secretStone");
            return (Criteria) this;
        }

        public Criteria andSecretStoneDescIsNull() {
            addCriterion("birthdaySecret.secret_stone_desc is null");
            return (Criteria) this;
        }

        public Criteria andSecretStoneDescIsNotNull() {
            addCriterion("birthdaySecret.secret_stone_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSecretStoneDescEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone_desc =", value, "secretStoneDesc");
            return (Criteria) this;
        }

        public Criteria andSecretStoneDescNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone_desc <>", value, "secretStoneDesc");
            return (Criteria) this;
        }

        public Criteria andSecretStoneDescGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_stone_desc >", value, "secretStoneDesc");
            return (Criteria) this;
        }

        public Criteria andSecretStoneDescGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone_desc >=", value, "secretStoneDesc");
            return (Criteria) this;
        }

        public Criteria andSecretStoneDescLessThan(String value) {
            addCriterion("birthdaySecret.secret_stone_desc <", value, "secretStoneDesc");
            return (Criteria) this;
        }

        public Criteria andSecretStoneDescLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone_desc <=", value, "secretStoneDesc");
            return (Criteria) this;
        }

        public Criteria andSecretStoneDescLike(String value) {
            addCriterion("birthdaySecret.secret_stone_desc like", value, "secretStoneDesc");
            return (Criteria) this;
        }

        public Criteria andSecretStoneDescNotLike(String value) {
            addCriterion("birthdaySecret.secret_stone_desc not like", value, "secretStoneDesc");
            return (Criteria) this;
        }

        public Criteria andSecretStoneDescIn(List<String> values) {
            addCriterion("birthdaySecret.secret_stone_desc in", values, "secretStoneDesc");
            return (Criteria) this;
        }

        public Criteria andSecretStoneDescNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_stone_desc not in", values, "secretStoneDesc");
            return (Criteria) this;
        }

        public Criteria andSecretStoneDescBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_stone_desc between", value1, value2, "secretStoneDesc");
            return (Criteria) this;
        }

        public Criteria andSecretStoneDescNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_stone_desc not between", value1, value2, "secretStoneDesc");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLegendIsNull() {
            addCriterion("birthdaySecret.secret_stone_legend is null");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLegendIsNotNull() {
            addCriterion("birthdaySecret.secret_stone_legend is not null");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLegendEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone_legend =", value, "secretStoneLegend");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLegendNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone_legend <>", value, "secretStoneLegend");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLegendGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_stone_legend >", value, "secretStoneLegend");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLegendGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone_legend >=", value, "secretStoneLegend");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLegendLessThan(String value) {
            addCriterion("birthdaySecret.secret_stone_legend <", value, "secretStoneLegend");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLegendLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone_legend <=", value, "secretStoneLegend");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLegendLike(String value) {
            addCriterion("birthdaySecret.secret_stone_legend like", value, "secretStoneLegend");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLegendNotLike(String value) {
            addCriterion("birthdaySecret.secret_stone_legend not like", value, "secretStoneLegend");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLegendIn(List<String> values) {
            addCriterion("birthdaySecret.secret_stone_legend in", values, "secretStoneLegend");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLegendNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_stone_legend not in", values, "secretStoneLegend");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLegendBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_stone_legend between", value1, value2, "secretStoneLegend");
            return (Criteria) this;
        }

        public Criteria andSecretStoneLegendNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_stone_legend not between", value1, value2, "secretStoneLegend");
            return (Criteria) this;
        }

        public Criteria andSecretChocoIsNull() {
            addCriterion("birthdaySecret.secret_choco is null");
            return (Criteria) this;
        }

        public Criteria andSecretChocoIsNotNull() {
            addCriterion("birthdaySecret.secret_choco is not null");
            return (Criteria) this;
        }

        public Criteria andSecretChocoEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco =", value, "secretChoco");
            return (Criteria) this;
        }

        public Criteria andSecretChocoNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco <>", value, "secretChoco");
            return (Criteria) this;
        }

        public Criteria andSecretChocoGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_choco >", value, "secretChoco");
            return (Criteria) this;
        }

        public Criteria andSecretChocoGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco >=", value, "secretChoco");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLessThan(String value) {
            addCriterion("birthdaySecret.secret_choco <", value, "secretChoco");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco <=", value, "secretChoco");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLike(String value) {
            addCriterion("birthdaySecret.secret_choco like", value, "secretChoco");
            return (Criteria) this;
        }

        public Criteria andSecretChocoNotLike(String value) {
            addCriterion("birthdaySecret.secret_choco not like", value, "secretChoco");
            return (Criteria) this;
        }

        public Criteria andSecretChocoIn(List<String> values) {
            addCriterion("birthdaySecret.secret_choco in", values, "secretChoco");
            return (Criteria) this;
        }

        public Criteria andSecretChocoNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_choco not in", values, "secretChoco");
            return (Criteria) this;
        }

        public Criteria andSecretChocoBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_choco between", value1, value2, "secretChoco");
            return (Criteria) this;
        }

        public Criteria andSecretChocoNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_choco not between", value1, value2, "secretChoco");
            return (Criteria) this;
        }

        public Criteria andSecretChococIsNull() {
            addCriterion("birthdaySecret.secret_chococ is null");
            return (Criteria) this;
        }

        public Criteria andSecretChococIsNotNull() {
            addCriterion("birthdaySecret.secret_chococ is not null");
            return (Criteria) this;
        }

        public Criteria andSecretChococEqualTo(String value) {
            addCriterion("birthdaySecret.secret_chococ =", value, "secretChococ");
            return (Criteria) this;
        }

        public Criteria andSecretChococNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_chococ <>", value, "secretChococ");
            return (Criteria) this;
        }

        public Criteria andSecretChococGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_chococ >", value, "secretChococ");
            return (Criteria) this;
        }

        public Criteria andSecretChococGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_chococ >=", value, "secretChococ");
            return (Criteria) this;
        }

        public Criteria andSecretChococLessThan(String value) {
            addCriterion("birthdaySecret.secret_chococ <", value, "secretChococ");
            return (Criteria) this;
        }

        public Criteria andSecretChococLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_chococ <=", value, "secretChococ");
            return (Criteria) this;
        }

        public Criteria andSecretChococLike(String value) {
            addCriterion("birthdaySecret.secret_chococ like", value, "secretChococ");
            return (Criteria) this;
        }

        public Criteria andSecretChococNotLike(String value) {
            addCriterion("birthdaySecret.secret_chococ not like", value, "secretChococ");
            return (Criteria) this;
        }

        public Criteria andSecretChococIn(List<String> values) {
            addCriterion("birthdaySecret.secret_chococ in", values, "secretChococ");
            return (Criteria) this;
        }

        public Criteria andSecretChococNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_chococ not in", values, "secretChococ");
            return (Criteria) this;
        }

        public Criteria andSecretChococBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_chococ between", value1, value2, "secretChococ");
            return (Criteria) this;
        }

        public Criteria andSecretChococNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_chococ not between", value1, value2, "secretChococ");
            return (Criteria) this;
        }

        public Criteria andSecretChocoCharIsNull() {
            addCriterion("birthdaySecret.secret_choco_char is null");
            return (Criteria) this;
        }

        public Criteria andSecretChocoCharIsNotNull() {
            addCriterion("birthdaySecret.secret_choco_char is not null");
            return (Criteria) this;
        }

        public Criteria andSecretChocoCharEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco_char =", value, "secretChocoChar");
            return (Criteria) this;
        }

        public Criteria andSecretChocoCharNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco_char <>", value, "secretChocoChar");
            return (Criteria) this;
        }

        public Criteria andSecretChocoCharGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_choco_char >", value, "secretChocoChar");
            return (Criteria) this;
        }

        public Criteria andSecretChocoCharGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco_char >=", value, "secretChocoChar");
            return (Criteria) this;
        }

        public Criteria andSecretChocoCharLessThan(String value) {
            addCriterion("birthdaySecret.secret_choco_char <", value, "secretChocoChar");
            return (Criteria) this;
        }

        public Criteria andSecretChocoCharLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco_char <=", value, "secretChocoChar");
            return (Criteria) this;
        }

        public Criteria andSecretChocoCharLike(String value) {
            addCriterion("birthdaySecret.secret_choco_char like", value, "secretChocoChar");
            return (Criteria) this;
        }

        public Criteria andSecretChocoCharNotLike(String value) {
            addCriterion("birthdaySecret.secret_choco_char not like", value, "secretChocoChar");
            return (Criteria) this;
        }

        public Criteria andSecretChocoCharIn(List<String> values) {
            addCriterion("birthdaySecret.secret_choco_char in", values, "secretChocoChar");
            return (Criteria) this;
        }

        public Criteria andSecretChocoCharNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_choco_char not in", values, "secretChocoChar");
            return (Criteria) this;
        }

        public Criteria andSecretChocoCharBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_choco_char between", value1, value2, "secretChocoChar");
            return (Criteria) this;
        }

        public Criteria andSecretChocoCharNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_choco_char not between", value1, value2, "secretChocoChar");
            return (Criteria) this;
        }

        public Criteria andSecretChocoDescIsNull() {
            addCriterion("birthdaySecret.secret_choco_desc is null");
            return (Criteria) this;
        }

        public Criteria andSecretChocoDescIsNotNull() {
            addCriterion("birthdaySecret.secret_choco_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSecretChocoDescEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco_desc =", value, "secretChocoDesc");
            return (Criteria) this;
        }

        public Criteria andSecretChocoDescNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco_desc <>", value, "secretChocoDesc");
            return (Criteria) this;
        }

        public Criteria andSecretChocoDescGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_choco_desc >", value, "secretChocoDesc");
            return (Criteria) this;
        }

        public Criteria andSecretChocoDescGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco_desc >=", value, "secretChocoDesc");
            return (Criteria) this;
        }

        public Criteria andSecretChocoDescLessThan(String value) {
            addCriterion("birthdaySecret.secret_choco_desc <", value, "secretChocoDesc");
            return (Criteria) this;
        }

        public Criteria andSecretChocoDescLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco_desc <=", value, "secretChocoDesc");
            return (Criteria) this;
        }

        public Criteria andSecretChocoDescLike(String value) {
            addCriterion("birthdaySecret.secret_choco_desc like", value, "secretChocoDesc");
            return (Criteria) this;
        }

        public Criteria andSecretChocoDescNotLike(String value) {
            addCriterion("birthdaySecret.secret_choco_desc not like", value, "secretChocoDesc");
            return (Criteria) this;
        }

        public Criteria andSecretChocoDescIn(List<String> values) {
            addCriterion("birthdaySecret.secret_choco_desc in", values, "secretChocoDesc");
            return (Criteria) this;
        }

        public Criteria andSecretChocoDescNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_choco_desc not in", values, "secretChocoDesc");
            return (Criteria) this;
        }

        public Criteria andSecretChocoDescBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_choco_desc between", value1, value2, "secretChocoDesc");
            return (Criteria) this;
        }

        public Criteria andSecretChocoDescNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_choco_desc not between", value1, value2, "secretChocoDesc");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLanIsNull() {
            addCriterion("birthdaySecret.secret_choco_lan is null");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLanIsNotNull() {
            addCriterion("birthdaySecret.secret_choco_lan is not null");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLanEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco_lan =", value, "secretChocoLan");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLanNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco_lan <>", value, "secretChocoLan");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLanGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_choco_lan >", value, "secretChocoLan");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLanGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco_lan >=", value, "secretChocoLan");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLanLessThan(String value) {
            addCriterion("birthdaySecret.secret_choco_lan <", value, "secretChocoLan");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLanLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_choco_lan <=", value, "secretChocoLan");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLanLike(String value) {
            addCriterion("birthdaySecret.secret_choco_lan like", value, "secretChocoLan");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLanNotLike(String value) {
            addCriterion("birthdaySecret.secret_choco_lan not like", value, "secretChocoLan");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLanIn(List<String> values) {
            addCriterion("birthdaySecret.secret_choco_lan in", values, "secretChocoLan");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLanNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_choco_lan not in", values, "secretChocoLan");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLanBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_choco_lan between", value1, value2, "secretChocoLan");
            return (Criteria) this;
        }

        public Criteria andSecretChocoLanNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_choco_lan not between", value1, value2, "secretChocoLan");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityIsNull() {
            addCriterion("birthdaySecret.secret_celebrity is null");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityIsNotNull() {
            addCriterion("birthdaySecret.secret_celebrity is not null");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityEqualTo(String value) {
            addCriterion("birthdaySecret.secret_celebrity =", value, "secretCelebrity");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_celebrity <>", value, "secretCelebrity");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_celebrity >", value, "secretCelebrity");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_celebrity >=", value, "secretCelebrity");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityLessThan(String value) {
            addCriterion("birthdaySecret.secret_celebrity <", value, "secretCelebrity");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_celebrity <=", value, "secretCelebrity");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityLike(String value) {
            addCriterion("birthdaySecret.secret_celebrity like", value, "secretCelebrity");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityNotLike(String value) {
            addCriterion("birthdaySecret.secret_celebrity not like", value, "secretCelebrity");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityIn(List<String> values) {
            addCriterion("birthdaySecret.secret_celebrity in", values, "secretCelebrity");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_celebrity not in", values, "secretCelebrity");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_celebrity between", value1, value2, "secretCelebrity");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_celebrity not between", value1, value2, "secretCelebrity");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityDIsNull() {
            addCriterion("birthdaySecret.secret_celebrity_d is null");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityDIsNotNull() {
            addCriterion("birthdaySecret.secret_celebrity_d is not null");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityDEqualTo(String value) {
            addCriterion("birthdaySecret.secret_celebrity_d =", value, "secretCelebrityD");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityDNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_celebrity_d <>", value, "secretCelebrityD");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityDGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_celebrity_d >", value, "secretCelebrityD");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityDGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_celebrity_d >=", value, "secretCelebrityD");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityDLessThan(String value) {
            addCriterion("birthdaySecret.secret_celebrity_d <", value, "secretCelebrityD");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityDLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_celebrity_d <=", value, "secretCelebrityD");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityDLike(String value) {
            addCriterion("birthdaySecret.secret_celebrity_d like", value, "secretCelebrityD");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityDNotLike(String value) {
            addCriterion("birthdaySecret.secret_celebrity_d not like", value, "secretCelebrityD");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityDIn(List<String> values) {
            addCriterion("birthdaySecret.secret_celebrity_d in", values, "secretCelebrityD");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityDNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_celebrity_d not in", values, "secretCelebrityD");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityDBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_celebrity_d between", value1, value2, "secretCelebrityD");
            return (Criteria) this;
        }

        public Criteria andSecretCelebrityDNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_celebrity_d not between", value1, value2, "secretCelebrityD");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerPicIsNull() {
            addCriterion("birthdaySecret.secret_flower_pic is null");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerPicIsNotNull() {
            addCriterion("birthdaySecret.secret_flower_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerPicEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_pic =", value, "secretFlowerPic");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerPicNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_pic <>", value, "secretFlowerPic");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerPicGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_flower_pic >", value, "secretFlowerPic");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerPicGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_pic >=", value, "secretFlowerPic");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerPicLessThan(String value) {
            addCriterion("birthdaySecret.secret_flower_pic <", value, "secretFlowerPic");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerPicLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_flower_pic <=", value, "secretFlowerPic");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerPicLike(String value) {
            addCriterion("birthdaySecret.secret_flower_pic like", value, "secretFlowerPic");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerPicNotLike(String value) {
            addCriterion("birthdaySecret.secret_flower_pic not like", value, "secretFlowerPic");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerPicIn(List<String> values) {
            addCriterion("birthdaySecret.secret_flower_pic in", values, "secretFlowerPic");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerPicNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_flower_pic not in", values, "secretFlowerPic");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerPicBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_flower_pic between", value1, value2, "secretFlowerPic");
            return (Criteria) this;
        }

        public Criteria andSecretFlowerPicNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_flower_pic not between", value1, value2, "secretFlowerPic");
            return (Criteria) this;
        }

        public Criteria andSecretStonePicIsNull() {
            addCriterion("birthdaySecret.secret_stone_pic is null");
            return (Criteria) this;
        }

        public Criteria andSecretStonePicIsNotNull() {
            addCriterion("birthdaySecret.secret_stone_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSecretStonePicEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone_pic =", value, "secretStonePic");
            return (Criteria) this;
        }

        public Criteria andSecretStonePicNotEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone_pic <>", value, "secretStonePic");
            return (Criteria) this;
        }

        public Criteria andSecretStonePicGreaterThan(String value) {
            addCriterion("birthdaySecret.secret_stone_pic >", value, "secretStonePic");
            return (Criteria) this;
        }

        public Criteria andSecretStonePicGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone_pic >=", value, "secretStonePic");
            return (Criteria) this;
        }

        public Criteria andSecretStonePicLessThan(String value) {
            addCriterion("birthdaySecret.secret_stone_pic <", value, "secretStonePic");
            return (Criteria) this;
        }

        public Criteria andSecretStonePicLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.secret_stone_pic <=", value, "secretStonePic");
            return (Criteria) this;
        }

        public Criteria andSecretStonePicLike(String value) {
            addCriterion("birthdaySecret.secret_stone_pic like", value, "secretStonePic");
            return (Criteria) this;
        }

        public Criteria andSecretStonePicNotLike(String value) {
            addCriterion("birthdaySecret.secret_stone_pic not like", value, "secretStonePic");
            return (Criteria) this;
        }

        public Criteria andSecretStonePicIn(List<String> values) {
            addCriterion("birthdaySecret.secret_stone_pic in", values, "secretStonePic");
            return (Criteria) this;
        }

        public Criteria andSecretStonePicNotIn(List<String> values) {
            addCriterion("birthdaySecret.secret_stone_pic not in", values, "secretStonePic");
            return (Criteria) this;
        }

        public Criteria andSecretStonePicBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_stone_pic between", value1, value2, "secretStonePic");
            return (Criteria) this;
        }

        public Criteria andSecretStonePicNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.secret_stone_pic not between", value1, value2, "secretStonePic");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("birthdaySecret.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("birthdaySecret.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("birthdaySecret.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("birthdaySecret.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("birthdaySecret.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("birthdaySecret.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("birthdaySecret.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("birthdaySecret.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("birthdaySecret.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("birthdaySecret.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("birthdaySecret.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("birthdaySecret.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("birthdaySecret.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}