package com.stip.net.example;

import java.util.ArrayList;
import java.util.List;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;

public class RefundRecordsExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public RefundRecordsExample() {
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

        public Criteria andRefundIdIsNull() {
            addCriterion("refundRecords.refund_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundIdIsNotNull() {
            addCriterion("refundRecords.refund_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundIdEqualTo(String value) {
            addCriterion("refundRecords.refund_id =", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotEqualTo(String value) {
            addCriterion("refundRecords.refund_id <>", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThan(String value) {
            addCriterion("refundRecords.refund_id >", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThanOrEqualTo(String value) {
            addCriterion("refundRecords.refund_id >=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThan(String value) {
            addCriterion("refundRecords.refund_id <", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThanOrEqualTo(String value) {
            addCriterion("refundRecords.refund_id <=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLike(String value) {
            addCriterion("refundRecords.refund_id like", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotLike(String value) {
            addCriterion("refundRecords.refund_id not like", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdIn(List<String> values) {
            addCriterion("refundRecords.refund_id in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotIn(List<String> values) {
            addCriterion("refundRecords.refund_id not in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdBetween(String value1, String value2) {
            addCriterion("refundRecords.refund_id between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotBetween(String value1, String value2) {
            addCriterion("refundRecords.refund_id not between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andWxRefundIdIsNull() {
            addCriterion("refundRecords.wx_refund_id is null");
            return (Criteria) this;
        }

        public Criteria andWxRefundIdIsNotNull() {
            addCriterion("refundRecords.wx_refund_id is not null");
            return (Criteria) this;
        }

        public Criteria andWxRefundIdEqualTo(String value) {
            addCriterion("refundRecords.wx_refund_id =", value, "wxRefundId");
            return (Criteria) this;
        }

        public Criteria andWxRefundIdNotEqualTo(String value) {
            addCriterion("refundRecords.wx_refund_id <>", value, "wxRefundId");
            return (Criteria) this;
        }

        public Criteria andWxRefundIdGreaterThan(String value) {
            addCriterion("refundRecords.wx_refund_id >", value, "wxRefundId");
            return (Criteria) this;
        }

        public Criteria andWxRefundIdGreaterThanOrEqualTo(String value) {
            addCriterion("refundRecords.wx_refund_id >=", value, "wxRefundId");
            return (Criteria) this;
        }

        public Criteria andWxRefundIdLessThan(String value) {
            addCriterion("refundRecords.wx_refund_id <", value, "wxRefundId");
            return (Criteria) this;
        }

        public Criteria andWxRefundIdLessThanOrEqualTo(String value) {
            addCriterion("refundRecords.wx_refund_id <=", value, "wxRefundId");
            return (Criteria) this;
        }

        public Criteria andWxRefundIdLike(String value) {
            addCriterion("refundRecords.wx_refund_id like", value, "wxRefundId");
            return (Criteria) this;
        }

        public Criteria andWxRefundIdNotLike(String value) {
            addCriterion("refundRecords.wx_refund_id not like", value, "wxRefundId");
            return (Criteria) this;
        }

        public Criteria andWxRefundIdIn(List<String> values) {
            addCriterion("refundRecords.wx_refund_id in", values, "wxRefundId");
            return (Criteria) this;
        }

        public Criteria andWxRefundIdNotIn(List<String> values) {
            addCriterion("refundRecords.wx_refund_id not in", values, "wxRefundId");
            return (Criteria) this;
        }

        public Criteria andWxRefundIdBetween(String value1, String value2) {
            addCriterion("refundRecords.wx_refund_id between", value1, value2, "wxRefundId");
            return (Criteria) this;
        }

        public Criteria andWxRefundIdNotBetween(String value1, String value2) {
            addCriterion("refundRecords.wx_refund_id not between", value1, value2, "wxRefundId");
            return (Criteria) this;
        }

        public Criteria andNonceStrIsNull() {
            addCriterion("refundRecords.nonce_str is null");
            return (Criteria) this;
        }

        public Criteria andNonceStrIsNotNull() {
            addCriterion("refundRecords.nonce_str is not null");
            return (Criteria) this;
        }

        public Criteria andNonceStrEqualTo(String value) {
            addCriterion("refundRecords.nonce_str =", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrNotEqualTo(String value) {
            addCriterion("refundRecords.nonce_str <>", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrGreaterThan(String value) {
            addCriterion("refundRecords.nonce_str >", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrGreaterThanOrEqualTo(String value) {
            addCriterion("refundRecords.nonce_str >=", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrLessThan(String value) {
            addCriterion("refundRecords.nonce_str <", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrLessThanOrEqualTo(String value) {
            addCriterion("refundRecords.nonce_str <=", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrLike(String value) {
            addCriterion("refundRecords.nonce_str like", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrNotLike(String value) {
            addCriterion("refundRecords.nonce_str not like", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrIn(List<String> values) {
            addCriterion("refundRecords.nonce_str in", values, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrNotIn(List<String> values) {
            addCriterion("refundRecords.nonce_str not in", values, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrBetween(String value1, String value2) {
            addCriterion("refundRecords.nonce_str between", value1, value2, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrNotBetween(String value1, String value2) {
            addCriterion("refundRecords.nonce_str not between", value1, value2, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoIsNull() {
            addCriterion("refundRecords.out_refund_no is null");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoIsNotNull() {
            addCriterion("refundRecords.out_refund_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoEqualTo(String value) {
            addCriterion("refundRecords.out_refund_no =", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotEqualTo(String value) {
            addCriterion("refundRecords.out_refund_no <>", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoGreaterThan(String value) {
            addCriterion("refundRecords.out_refund_no >", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoGreaterThanOrEqualTo(String value) {
            addCriterion("refundRecords.out_refund_no >=", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoLessThan(String value) {
            addCriterion("refundRecords.out_refund_no <", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoLessThanOrEqualTo(String value) {
            addCriterion("refundRecords.out_refund_no <=", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoLike(String value) {
            addCriterion("refundRecords.out_refund_no like", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotLike(String value) {
            addCriterion("refundRecords.out_refund_no not like", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoIn(List<String> values) {
            addCriterion("refundRecords.out_refund_no in", values, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotIn(List<String> values) {
            addCriterion("refundRecords.out_refund_no not in", values, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoBetween(String value1, String value2) {
            addCriterion("refundRecords.out_refund_no between", value1, value2, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotBetween(String value1, String value2) {
            addCriterion("refundRecords.out_refund_no not between", value1, value2, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("refundRecords.out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("refundRecords.out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("refundRecords.out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("refundRecords.out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("refundRecords.out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("refundRecords.out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("refundRecords.out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("refundRecords.out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("refundRecords.out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("refundRecords.out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("refundRecords.out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("refundRecords.out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("refundRecords.out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("refundRecords.out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIsNull() {
            addCriterion("refundRecords.refund_fee is null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIsNotNull() {
            addCriterion("refundRecords.refund_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeEqualTo(String value) {
            addCriterion("refundRecords.refund_fee =", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotEqualTo(String value) {
            addCriterion("refundRecords.refund_fee <>", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeGreaterThan(String value) {
            addCriterion("refundRecords.refund_fee >", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeGreaterThanOrEqualTo(String value) {
            addCriterion("refundRecords.refund_fee >=", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLessThan(String value) {
            addCriterion("refundRecords.refund_fee <", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLessThanOrEqualTo(String value) {
            addCriterion("refundRecords.refund_fee <=", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLike(String value) {
            addCriterion("refundRecords.refund_fee like", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotLike(String value) {
            addCriterion("refundRecords.refund_fee not like", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIn(List<String> values) {
            addCriterion("refundRecords.refund_fee in", values, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotIn(List<String> values) {
            addCriterion("refundRecords.refund_fee not in", values, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeBetween(String value1, String value2) {
            addCriterion("refundRecords.refund_fee between", value1, value2, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotBetween(String value1, String value2) {
            addCriterion("refundRecords.refund_fee not between", value1, value2, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundDescIsNull() {
            addCriterion("refundRecords.refund_desc is null");
            return (Criteria) this;
        }

        public Criteria andRefundDescIsNotNull() {
            addCriterion("refundRecords.refund_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRefundDescEqualTo(String value) {
            addCriterion("refundRecords.refund_desc =", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescNotEqualTo(String value) {
            addCriterion("refundRecords.refund_desc <>", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescGreaterThan(String value) {
            addCriterion("refundRecords.refund_desc >", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescGreaterThanOrEqualTo(String value) {
            addCriterion("refundRecords.refund_desc >=", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescLessThan(String value) {
            addCriterion("refundRecords.refund_desc <", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescLessThanOrEqualTo(String value) {
            addCriterion("refundRecords.refund_desc <=", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescLike(String value) {
            addCriterion("refundRecords.refund_desc like", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescNotLike(String value) {
            addCriterion("refundRecords.refund_desc not like", value, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescIn(List<String> values) {
            addCriterion("refundRecords.refund_desc in", values, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescNotIn(List<String> values) {
            addCriterion("refundRecords.refund_desc not in", values, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescBetween(String value1, String value2) {
            addCriterion("refundRecords.refund_desc between", value1, value2, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andRefundDescNotBetween(String value1, String value2) {
            addCriterion("refundRecords.refund_desc not between", value1, value2, "refundDesc");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("refundRecords.openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("refundRecords.openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("refundRecords.openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("refundRecords.openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("refundRecords.openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("refundRecords.openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("refundRecords.openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("refundRecords.openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("refundRecords.openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("refundRecords.openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("refundRecords.openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("refundRecords.openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("refundRecords.openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("refundRecords.openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refundRecords.refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refundRecords.refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(String value) {
            addCriterion("refundRecords.refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(String value) {
            addCriterion("refundRecords.refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(String value) {
            addCriterion("refundRecords.refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(String value) {
            addCriterion("refundRecords.refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(String value) {
            addCriterion("refundRecords.refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(String value) {
            addCriterion("refundRecords.refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLike(String value) {
            addCriterion("refundRecords.refund_status like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotLike(String value) {
            addCriterion("refundRecords.refund_status not like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<String> values) {
            addCriterion("refundRecords.refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<String> values) {
            addCriterion("refundRecords.refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(String value1, String value2) {
            addCriterion("refundRecords.refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(String value1, String value2) {
            addCriterion("refundRecords.refund_status not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("refundRecords.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("refundRecords.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("refundRecords.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("refundRecords.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("refundRecords.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("refundRecords.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("refundRecords.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("refundRecords.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("refundRecords.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("refundRecords.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("refundRecords.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("refundRecords.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("refundRecords.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("refundRecords.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}