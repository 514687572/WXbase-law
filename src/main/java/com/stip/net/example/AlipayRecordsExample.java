package com.stip.net.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;

public class AlipayRecordsExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public AlipayRecordsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("alipayRecords.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("alipayRecords.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("alipayRecords.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("alipayRecords.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("alipayRecords.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("alipayRecords.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("alipayRecords.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("alipayRecords.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("alipayRecords.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("alipayRecords.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("alipayRecords.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("alipayRecords.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNull() {
            addCriterion("alipayRecords.gift_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNotNull() {
            addCriterion("alipayRecords.gift_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIdEqualTo(Integer value) {
            addCriterion("alipayRecords.gift_id =", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotEqualTo(Integer value) {
            addCriterion("alipayRecords.gift_id <>", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThan(Integer value) {
            addCriterion("alipayRecords.gift_id >", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("alipayRecords.gift_id >=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThan(Integer value) {
            addCriterion("alipayRecords.gift_id <", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThanOrEqualTo(Integer value) {
            addCriterion("alipayRecords.gift_id <=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIn(List<Integer> values) {
            addCriterion("alipayRecords.gift_id in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotIn(List<Integer> values) {
            addCriterion("alipayRecords.gift_id not in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdBetween(Integer value1, Integer value2) {
            addCriterion("alipayRecords.gift_id between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotBetween(Integer value1, Integer value2) {
            addCriterion("alipayRecords.gift_id not between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("alipayRecords.open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("alipayRecords.open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("alipayRecords.open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("alipayRecords.open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("alipayRecords.open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("alipayRecords.open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("alipayRecords.open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("alipayRecords.open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("alipayRecords.open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("alipayRecords.open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("alipayRecords.open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("alipayRecords.open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("alipayRecords.open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("alipayRecords.open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andDateIdIsNull() {
            addCriterion("alipayRecords.date_id is null");
            return (Criteria) this;
        }

        public Criteria andDateIdIsNotNull() {
            addCriterion("alipayRecords.date_id is not null");
            return (Criteria) this;
        }

        public Criteria andDateIdEqualTo(String value) {
            addCriterion("alipayRecords.date_id =", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotEqualTo(String value) {
            addCriterion("alipayRecords.date_id <>", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThan(String value) {
            addCriterion("alipayRecords.date_id >", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThanOrEqualTo(String value) {
            addCriterion("alipayRecords.date_id >=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThan(String value) {
            addCriterion("alipayRecords.date_id <", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThanOrEqualTo(String value) {
            addCriterion("alipayRecords.date_id <=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLike(String value) {
            addCriterion("alipayRecords.date_id like", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotLike(String value) {
            addCriterion("alipayRecords.date_id not like", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdIn(List<String> values) {
            addCriterion("alipayRecords.date_id in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotIn(List<String> values) {
            addCriterion("alipayRecords.date_id not in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdBetween(String value1, String value2) {
            addCriterion("alipayRecords.date_id between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotBetween(String value1, String value2) {
            addCriterion("alipayRecords.date_id not between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdIsNull() {
            addCriterion("alipayRecords.prepay_id is null");
            return (Criteria) this;
        }

        public Criteria andPrepayIdIsNotNull() {
            addCriterion("alipayRecords.prepay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrepayIdEqualTo(String value) {
            addCriterion("alipayRecords.prepay_id =", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdNotEqualTo(String value) {
            addCriterion("alipayRecords.prepay_id <>", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdGreaterThan(String value) {
            addCriterion("alipayRecords.prepay_id >", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdGreaterThanOrEqualTo(String value) {
            addCriterion("alipayRecords.prepay_id >=", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdLessThan(String value) {
            addCriterion("alipayRecords.prepay_id <", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdLessThanOrEqualTo(String value) {
            addCriterion("alipayRecords.prepay_id <=", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdLike(String value) {
            addCriterion("alipayRecords.prepay_id like", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdNotLike(String value) {
            addCriterion("alipayRecords.prepay_id not like", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdIn(List<String> values) {
            addCriterion("alipayRecords.prepay_id in", values, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdNotIn(List<String> values) {
            addCriterion("alipayRecords.prepay_id not in", values, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdBetween(String value1, String value2) {
            addCriterion("alipayRecords.prepay_id between", value1, value2, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdNotBetween(String value1, String value2) {
            addCriterion("alipayRecords.prepay_id not between", value1, value2, "prepayId");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("alipayRecords.out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("alipayRecords.out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("alipayRecords.out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("alipayRecords.out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("alipayRecords.out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("alipayRecords.out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("alipayRecords.out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("alipayRecords.out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("alipayRecords.out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("alipayRecords.out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("alipayRecords.out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("alipayRecords.out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("alipayRecords.out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("alipayRecords.out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("alipayRecords.amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("alipayRecords.amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("alipayRecords.amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("alipayRecords.amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("alipayRecords.amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("alipayRecords.amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("alipayRecords.amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("alipayRecords.amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("alipayRecords.amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("alipayRecords.amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("alipayRecords.amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("alipayRecords.amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("alipayRecords.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("alipayRecords.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("alipayRecords.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("alipayRecords.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("alipayRecords.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("alipayRecords.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("alipayRecords.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("alipayRecords.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("alipayRecords.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("alipayRecords.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("alipayRecords.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("alipayRecords.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("alipayRecords.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("alipayRecords.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("alipayRecords.created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("alipayRecords.created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("alipayRecords.created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("alipayRecords.created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("alipayRecords.created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("alipayRecords.created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("alipayRecords.created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("alipayRecords.created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("alipayRecords.created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("alipayRecords.created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("alipayRecords.created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("alipayRecords.created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("alipayRecords.updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("alipayRecords.updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("alipayRecords.updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("alipayRecords.updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("alipayRecords.updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("alipayRecords.updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("alipayRecords.updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("alipayRecords.updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("alipayRecords.updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("alipayRecords.updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("alipayRecords.updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("alipayRecords.updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andOrderDesIsNull() {
            addCriterion("alipayRecords.order_des is null");
            return (Criteria) this;
        }

        public Criteria andOrderDesIsNotNull() {
            addCriterion("alipayRecords.order_des is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDesEqualTo(String value) {
            addCriterion("alipayRecords.order_des =", value, "orderDes");
            return (Criteria) this;
        }

        public Criteria andOrderDesNotEqualTo(String value) {
            addCriterion("alipayRecords.order_des <>", value, "orderDes");
            return (Criteria) this;
        }

        public Criteria andOrderDesGreaterThan(String value) {
            addCriterion("alipayRecords.order_des >", value, "orderDes");
            return (Criteria) this;
        }

        public Criteria andOrderDesGreaterThanOrEqualTo(String value) {
            addCriterion("alipayRecords.order_des >=", value, "orderDes");
            return (Criteria) this;
        }

        public Criteria andOrderDesLessThan(String value) {
            addCriterion("alipayRecords.order_des <", value, "orderDes");
            return (Criteria) this;
        }

        public Criteria andOrderDesLessThanOrEqualTo(String value) {
            addCriterion("alipayRecords.order_des <=", value, "orderDes");
            return (Criteria) this;
        }

        public Criteria andOrderDesLike(String value) {
            addCriterion("alipayRecords.order_des like", value, "orderDes");
            return (Criteria) this;
        }

        public Criteria andOrderDesNotLike(String value) {
            addCriterion("alipayRecords.order_des not like", value, "orderDes");
            return (Criteria) this;
        }

        public Criteria andOrderDesIn(List<String> values) {
            addCriterion("alipayRecords.order_des in", values, "orderDes");
            return (Criteria) this;
        }

        public Criteria andOrderDesNotIn(List<String> values) {
            addCriterion("alipayRecords.order_des not in", values, "orderDes");
            return (Criteria) this;
        }

        public Criteria andOrderDesBetween(String value1, String value2) {
            addCriterion("alipayRecords.order_des between", value1, value2, "orderDes");
            return (Criteria) this;
        }

        public Criteria andOrderDesNotBetween(String value1, String value2) {
            addCriterion("alipayRecords.order_des not between", value1, value2, "orderDes");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("alipayRecords.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("alipayRecords.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("alipayRecords.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("alipayRecords.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("alipayRecords.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("alipayRecords.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("alipayRecords.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("alipayRecords.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("alipayRecords.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("alipayRecords.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("alipayRecords.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("alipayRecords.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("alipayRecords.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("alipayRecords.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}