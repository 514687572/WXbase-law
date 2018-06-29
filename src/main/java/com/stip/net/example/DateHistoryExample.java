package com.stip.net.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;

public class DateHistoryExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public DateHistoryExample() {
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

        public Criteria andHisIdIsNull() {
            addCriterion("dateHistory.HIS_ID is null");
            return (Criteria) this;
        }

        public Criteria andHisIdIsNotNull() {
            addCriterion("dateHistory.HIS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHisIdEqualTo(String value) {
            addCriterion("dateHistory.HIS_ID =", value, "hisId");
            return (Criteria) this;
        }

        public Criteria andHisIdNotEqualTo(String value) {
            addCriterion("dateHistory.HIS_ID <>", value, "hisId");
            return (Criteria) this;
        }

        public Criteria andHisIdGreaterThan(String value) {
            addCriterion("dateHistory.HIS_ID >", value, "hisId");
            return (Criteria) this;
        }

        public Criteria andHisIdGreaterThanOrEqualTo(String value) {
            addCriterion("dateHistory.HIS_ID >=", value, "hisId");
            return (Criteria) this;
        }

        public Criteria andHisIdLessThan(String value) {
            addCriterion("dateHistory.HIS_ID <", value, "hisId");
            return (Criteria) this;
        }

        public Criteria andHisIdLessThanOrEqualTo(String value) {
            addCriterion("dateHistory.HIS_ID <=", value, "hisId");
            return (Criteria) this;
        }

        public Criteria andHisIdLike(String value) {
            addCriterion("dateHistory.HIS_ID like", value, "hisId");
            return (Criteria) this;
        }

        public Criteria andHisIdNotLike(String value) {
            addCriterion("dateHistory.HIS_ID not like", value, "hisId");
            return (Criteria) this;
        }

        public Criteria andHisIdIn(List<String> values) {
            addCriterion("dateHistory.HIS_ID in", values, "hisId");
            return (Criteria) this;
        }

        public Criteria andHisIdNotIn(List<String> values) {
            addCriterion("dateHistory.HIS_ID not in", values, "hisId");
            return (Criteria) this;
        }

        public Criteria andHisIdBetween(String value1, String value2) {
            addCriterion("dateHistory.HIS_ID between", value1, value2, "hisId");
            return (Criteria) this;
        }

        public Criteria andHisIdNotBetween(String value1, String value2) {
            addCriterion("dateHistory.HIS_ID not between", value1, value2, "hisId");
            return (Criteria) this;
        }

        public Criteria andDateIdIsNull() {
            addCriterion("dateHistory.DATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDateIdIsNotNull() {
            addCriterion("dateHistory.DATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDateIdEqualTo(String value) {
            addCriterion("dateHistory.DATE_ID =", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotEqualTo(String value) {
            addCriterion("dateHistory.DATE_ID <>", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThan(String value) {
            addCriterion("dateHistory.DATE_ID >", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThanOrEqualTo(String value) {
            addCriterion("dateHistory.DATE_ID >=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThan(String value) {
            addCriterion("dateHistory.DATE_ID <", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThanOrEqualTo(String value) {
            addCriterion("dateHistory.DATE_ID <=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLike(String value) {
            addCriterion("dateHistory.DATE_ID like", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotLike(String value) {
            addCriterion("dateHistory.DATE_ID not like", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdIn(List<String> values) {
            addCriterion("dateHistory.DATE_ID in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotIn(List<String> values) {
            addCriterion("dateHistory.DATE_ID not in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdBetween(String value1, String value2) {
            addCriterion("dateHistory.DATE_ID between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotBetween(String value1, String value2) {
            addCriterion("dateHistory.DATE_ID not between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andHisDateTimeIsNull() {
            addCriterion("dateHistory.HIS_DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andHisDateTimeIsNotNull() {
            addCriterion("dateHistory.HIS_DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andHisDateTimeEqualTo(Date value) {
            addCriterion("dateHistory.HIS_DATE_TIME =", value, "hisDateTime");
            return (Criteria) this;
        }

        public Criteria andHisDateTimeNotEqualTo(Date value) {
            addCriterion("dateHistory.HIS_DATE_TIME <>", value, "hisDateTime");
            return (Criteria) this;
        }

        public Criteria andHisDateTimeGreaterThan(Date value) {
            addCriterion("dateHistory.HIS_DATE_TIME >", value, "hisDateTime");
            return (Criteria) this;
        }

        public Criteria andHisDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dateHistory.HIS_DATE_TIME >=", value, "hisDateTime");
            return (Criteria) this;
        }

        public Criteria andHisDateTimeLessThan(Date value) {
            addCriterion("dateHistory.HIS_DATE_TIME <", value, "hisDateTime");
            return (Criteria) this;
        }

        public Criteria andHisDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dateHistory.HIS_DATE_TIME <=", value, "hisDateTime");
            return (Criteria) this;
        }

        public Criteria andHisDateTimeIn(List<Date> values) {
            addCriterion("dateHistory.HIS_DATE_TIME in", values, "hisDateTime");
            return (Criteria) this;
        }

        public Criteria andHisDateTimeNotIn(List<Date> values) {
            addCriterion("dateHistory.HIS_DATE_TIME not in", values, "hisDateTime");
            return (Criteria) this;
        }

        public Criteria andHisDateTimeBetween(Date value1, Date value2) {
            addCriterion("dateHistory.HIS_DATE_TIME between", value1, value2, "hisDateTime");
            return (Criteria) this;
        }

        public Criteria andHisDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dateHistory.HIS_DATE_TIME not between", value1, value2, "hisDateTime");
            return (Criteria) this;
        }

        public Criteria andHisTitleIsNull() {
            addCriterion("dateHistory.HIS_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andHisTitleIsNotNull() {
            addCriterion("dateHistory.HIS_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andHisTitleEqualTo(String value) {
            addCriterion("dateHistory.HIS_TITLE =", value, "hisTitle");
            return (Criteria) this;
        }

        public Criteria andHisTitleNotEqualTo(String value) {
            addCriterion("dateHistory.HIS_TITLE <>", value, "hisTitle");
            return (Criteria) this;
        }

        public Criteria andHisTitleGreaterThan(String value) {
            addCriterion("dateHistory.HIS_TITLE >", value, "hisTitle");
            return (Criteria) this;
        }

        public Criteria andHisTitleGreaterThanOrEqualTo(String value) {
            addCriterion("dateHistory.HIS_TITLE >=", value, "hisTitle");
            return (Criteria) this;
        }

        public Criteria andHisTitleLessThan(String value) {
            addCriterion("dateHistory.HIS_TITLE <", value, "hisTitle");
            return (Criteria) this;
        }

        public Criteria andHisTitleLessThanOrEqualTo(String value) {
            addCriterion("dateHistory.HIS_TITLE <=", value, "hisTitle");
            return (Criteria) this;
        }

        public Criteria andHisTitleLike(String value) {
            addCriterion("dateHistory.HIS_TITLE like", value, "hisTitle");
            return (Criteria) this;
        }

        public Criteria andHisTitleNotLike(String value) {
            addCriterion("dateHistory.HIS_TITLE not like", value, "hisTitle");
            return (Criteria) this;
        }

        public Criteria andHisTitleIn(List<String> values) {
            addCriterion("dateHistory.HIS_TITLE in", values, "hisTitle");
            return (Criteria) this;
        }

        public Criteria andHisTitleNotIn(List<String> values) {
            addCriterion("dateHistory.HIS_TITLE not in", values, "hisTitle");
            return (Criteria) this;
        }

        public Criteria andHisTitleBetween(String value1, String value2) {
            addCriterion("dateHistory.HIS_TITLE between", value1, value2, "hisTitle");
            return (Criteria) this;
        }

        public Criteria andHisTitleNotBetween(String value1, String value2) {
            addCriterion("dateHistory.HIS_TITLE not between", value1, value2, "hisTitle");
            return (Criteria) this;
        }

        public Criteria andHisImagesIsNull() {
            addCriterion("dateHistory.HIS_IMAGES is null");
            return (Criteria) this;
        }

        public Criteria andHisImagesIsNotNull() {
            addCriterion("dateHistory.HIS_IMAGES is not null");
            return (Criteria) this;
        }

        public Criteria andHisImagesEqualTo(String value) {
            addCriterion("dateHistory.HIS_IMAGES =", value, "hisImages");
            return (Criteria) this;
        }

        public Criteria andHisImagesNotEqualTo(String value) {
            addCriterion("dateHistory.HIS_IMAGES <>", value, "hisImages");
            return (Criteria) this;
        }

        public Criteria andHisImagesGreaterThan(String value) {
            addCriterion("dateHistory.HIS_IMAGES >", value, "hisImages");
            return (Criteria) this;
        }

        public Criteria andHisImagesGreaterThanOrEqualTo(String value) {
            addCriterion("dateHistory.HIS_IMAGES >=", value, "hisImages");
            return (Criteria) this;
        }

        public Criteria andHisImagesLessThan(String value) {
            addCriterion("dateHistory.HIS_IMAGES <", value, "hisImages");
            return (Criteria) this;
        }

        public Criteria andHisImagesLessThanOrEqualTo(String value) {
            addCriterion("dateHistory.HIS_IMAGES <=", value, "hisImages");
            return (Criteria) this;
        }

        public Criteria andHisImagesLike(String value) {
            addCriterion("dateHistory.HIS_IMAGES like", value, "hisImages");
            return (Criteria) this;
        }

        public Criteria andHisImagesNotLike(String value) {
            addCriterion("dateHistory.HIS_IMAGES not like", value, "hisImages");
            return (Criteria) this;
        }

        public Criteria andHisImagesIn(List<String> values) {
            addCriterion("dateHistory.HIS_IMAGES in", values, "hisImages");
            return (Criteria) this;
        }

        public Criteria andHisImagesNotIn(List<String> values) {
            addCriterion("dateHistory.HIS_IMAGES not in", values, "hisImages");
            return (Criteria) this;
        }

        public Criteria andHisImagesBetween(String value1, String value2) {
            addCriterion("dateHistory.HIS_IMAGES between", value1, value2, "hisImages");
            return (Criteria) this;
        }

        public Criteria andHisImagesNotBetween(String value1, String value2) {
            addCriterion("dateHistory.HIS_IMAGES not between", value1, value2, "hisImages");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("dateHistory.CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("dateHistory.CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("dateHistory.CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("dateHistory.CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("dateHistory.CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dateHistory.CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("dateHistory.CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dateHistory.CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("dateHistory.CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("dateHistory.CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("dateHistory.CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dateHistory.CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("dateHistory.UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("dateHistory.UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("dateHistory.UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("dateHistory.UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("dateHistory.UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dateHistory.UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("dateHistory.UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dateHistory.UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("dateHistory.UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("dateHistory.UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("dateHistory.UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dateHistory.UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andHisStatusIsNull() {
            addCriterion("dateHistory.HIS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andHisStatusIsNotNull() {
            addCriterion("dateHistory.HIS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andHisStatusEqualTo(String value) {
            addCriterion("dateHistory.HIS_STATUS =", value, "hisStatus");
            return (Criteria) this;
        }

        public Criteria andHisStatusNotEqualTo(String value) {
            addCriterion("dateHistory.HIS_STATUS <>", value, "hisStatus");
            return (Criteria) this;
        }

        public Criteria andHisStatusGreaterThan(String value) {
            addCriterion("dateHistory.HIS_STATUS >", value, "hisStatus");
            return (Criteria) this;
        }

        public Criteria andHisStatusGreaterThanOrEqualTo(String value) {
            addCriterion("dateHistory.HIS_STATUS >=", value, "hisStatus");
            return (Criteria) this;
        }

        public Criteria andHisStatusLessThan(String value) {
            addCriterion("dateHistory.HIS_STATUS <", value, "hisStatus");
            return (Criteria) this;
        }

        public Criteria andHisStatusLessThanOrEqualTo(String value) {
            addCriterion("dateHistory.HIS_STATUS <=", value, "hisStatus");
            return (Criteria) this;
        }

        public Criteria andHisStatusLike(String value) {
            addCriterion("dateHistory.HIS_STATUS like", value, "hisStatus");
            return (Criteria) this;
        }

        public Criteria andHisStatusNotLike(String value) {
            addCriterion("dateHistory.HIS_STATUS not like", value, "hisStatus");
            return (Criteria) this;
        }

        public Criteria andHisStatusIn(List<String> values) {
            addCriterion("dateHistory.HIS_STATUS in", values, "hisStatus");
            return (Criteria) this;
        }

        public Criteria andHisStatusNotIn(List<String> values) {
            addCriterion("dateHistory.HIS_STATUS not in", values, "hisStatus");
            return (Criteria) this;
        }

        public Criteria andHisStatusBetween(String value1, String value2) {
            addCriterion("dateHistory.HIS_STATUS between", value1, value2, "hisStatus");
            return (Criteria) this;
        }

        public Criteria andHisStatusNotBetween(String value1, String value2) {
            addCriterion("dateHistory.HIS_STATUS not between", value1, value2, "hisStatus");
            return (Criteria) this;
        }

        public Criteria andIsVisibleIsNull() {
            addCriterion("dateHistory.IS_VISIBLE is null");
            return (Criteria) this;
        }

        public Criteria andIsVisibleIsNotNull() {
            addCriterion("dateHistory.IS_VISIBLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsVisibleEqualTo(String value) {
            addCriterion("dateHistory.IS_VISIBLE =", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotEqualTo(String value) {
            addCriterion("dateHistory.IS_VISIBLE <>", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleGreaterThan(String value) {
            addCriterion("dateHistory.IS_VISIBLE >", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleGreaterThanOrEqualTo(String value) {
            addCriterion("dateHistory.IS_VISIBLE >=", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleLessThan(String value) {
            addCriterion("dateHistory.IS_VISIBLE <", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleLessThanOrEqualTo(String value) {
            addCriterion("dateHistory.IS_VISIBLE <=", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleLike(String value) {
            addCriterion("dateHistory.IS_VISIBLE like", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotLike(String value) {
            addCriterion("dateHistory.IS_VISIBLE not like", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleIn(List<String> values) {
            addCriterion("dateHistory.IS_VISIBLE in", values, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotIn(List<String> values) {
            addCriterion("dateHistory.IS_VISIBLE not in", values, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleBetween(String value1, String value2) {
            addCriterion("dateHistory.IS_VISIBLE between", value1, value2, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotBetween(String value1, String value2) {
            addCriterion("dateHistory.IS_VISIBLE not between", value1, value2, "isVisible");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("dateHistory.REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("dateHistory.REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("dateHistory.REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("dateHistory.REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("dateHistory.REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("dateHistory.REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("dateHistory.REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("dateHistory.REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("dateHistory.REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("dateHistory.REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("dateHistory.REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("dateHistory.REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("dateHistory.REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("dateHistory.REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkoIsNull() {
            addCriterion("dateHistory.REMARKO is null");
            return (Criteria) this;
        }

        public Criteria andRemarkoIsNotNull() {
            addCriterion("dateHistory.REMARKO is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkoEqualTo(String value) {
            addCriterion("dateHistory.REMARKO =", value, "remarko");
            return (Criteria) this;
        }

        public Criteria andRemarkoNotEqualTo(String value) {
            addCriterion("dateHistory.REMARKO <>", value, "remarko");
            return (Criteria) this;
        }

        public Criteria andRemarkoGreaterThan(String value) {
            addCriterion("dateHistory.REMARKO >", value, "remarko");
            return (Criteria) this;
        }

        public Criteria andRemarkoGreaterThanOrEqualTo(String value) {
            addCriterion("dateHistory.REMARKO >=", value, "remarko");
            return (Criteria) this;
        }

        public Criteria andRemarkoLessThan(String value) {
            addCriterion("dateHistory.REMARKO <", value, "remarko");
            return (Criteria) this;
        }

        public Criteria andRemarkoLessThanOrEqualTo(String value) {
            addCriterion("dateHistory.REMARKO <=", value, "remarko");
            return (Criteria) this;
        }

        public Criteria andRemarkoLike(String value) {
            addCriterion("dateHistory.REMARKO like", value, "remarko");
            return (Criteria) this;
        }

        public Criteria andRemarkoNotLike(String value) {
            addCriterion("dateHistory.REMARKO not like", value, "remarko");
            return (Criteria) this;
        }

        public Criteria andRemarkoIn(List<String> values) {
            addCriterion("dateHistory.REMARKO in", values, "remarko");
            return (Criteria) this;
        }

        public Criteria andRemarkoNotIn(List<String> values) {
            addCriterion("dateHistory.REMARKO not in", values, "remarko");
            return (Criteria) this;
        }

        public Criteria andRemarkoBetween(String value1, String value2) {
            addCriterion("dateHistory.REMARKO between", value1, value2, "remarko");
            return (Criteria) this;
        }

        public Criteria andRemarkoNotBetween(String value1, String value2) {
            addCriterion("dateHistory.REMARKO not between", value1, value2, "remarko");
            return (Criteria) this;
        }

        public Criteria andRemarktIsNull() {
            addCriterion("dateHistory.REMARKT is null");
            return (Criteria) this;
        }

        public Criteria andRemarktIsNotNull() {
            addCriterion("dateHistory.REMARKT is not null");
            return (Criteria) this;
        }

        public Criteria andRemarktEqualTo(String value) {
            addCriterion("dateHistory.REMARKT =", value, "remarkt");
            return (Criteria) this;
        }

        public Criteria andRemarktNotEqualTo(String value) {
            addCriterion("dateHistory.REMARKT <>", value, "remarkt");
            return (Criteria) this;
        }

        public Criteria andRemarktGreaterThan(String value) {
            addCriterion("dateHistory.REMARKT >", value, "remarkt");
            return (Criteria) this;
        }

        public Criteria andRemarktGreaterThanOrEqualTo(String value) {
            addCriterion("dateHistory.REMARKT >=", value, "remarkt");
            return (Criteria) this;
        }

        public Criteria andRemarktLessThan(String value) {
            addCriterion("dateHistory.REMARKT <", value, "remarkt");
            return (Criteria) this;
        }

        public Criteria andRemarktLessThanOrEqualTo(String value) {
            addCriterion("dateHistory.REMARKT <=", value, "remarkt");
            return (Criteria) this;
        }

        public Criteria andRemarktLike(String value) {
            addCriterion("dateHistory.REMARKT like", value, "remarkt");
            return (Criteria) this;
        }

        public Criteria andRemarktNotLike(String value) {
            addCriterion("dateHistory.REMARKT not like", value, "remarkt");
            return (Criteria) this;
        }

        public Criteria andRemarktIn(List<String> values) {
            addCriterion("dateHistory.REMARKT in", values, "remarkt");
            return (Criteria) this;
        }

        public Criteria andRemarktNotIn(List<String> values) {
            addCriterion("dateHistory.REMARKT not in", values, "remarkt");
            return (Criteria) this;
        }

        public Criteria andRemarktBetween(String value1, String value2) {
            addCriterion("dateHistory.REMARKT between", value1, value2, "remarkt");
            return (Criteria) this;
        }

        public Criteria andRemarktNotBetween(String value1, String value2) {
            addCriterion("dateHistory.REMARKT not between", value1, value2, "remarkt");
            return (Criteria) this;
        }

        public Criteria andRemarkthIsNull() {
            addCriterion("dateHistory.REMARKTH is null");
            return (Criteria) this;
        }

        public Criteria andRemarkthIsNotNull() {
            addCriterion("dateHistory.REMARKTH is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkthEqualTo(String value) {
            addCriterion("dateHistory.REMARKTH =", value, "remarkth");
            return (Criteria) this;
        }

        public Criteria andRemarkthNotEqualTo(String value) {
            addCriterion("dateHistory.REMARKTH <>", value, "remarkth");
            return (Criteria) this;
        }

        public Criteria andRemarkthGreaterThan(String value) {
            addCriterion("dateHistory.REMARKTH >", value, "remarkth");
            return (Criteria) this;
        }

        public Criteria andRemarkthGreaterThanOrEqualTo(String value) {
            addCriterion("dateHistory.REMARKTH >=", value, "remarkth");
            return (Criteria) this;
        }

        public Criteria andRemarkthLessThan(String value) {
            addCriterion("dateHistory.REMARKTH <", value, "remarkth");
            return (Criteria) this;
        }

        public Criteria andRemarkthLessThanOrEqualTo(String value) {
            addCriterion("dateHistory.REMARKTH <=", value, "remarkth");
            return (Criteria) this;
        }

        public Criteria andRemarkthLike(String value) {
            addCriterion("dateHistory.REMARKTH like", value, "remarkth");
            return (Criteria) this;
        }

        public Criteria andRemarkthNotLike(String value) {
            addCriterion("dateHistory.REMARKTH not like", value, "remarkth");
            return (Criteria) this;
        }

        public Criteria andRemarkthIn(List<String> values) {
            addCriterion("dateHistory.REMARKTH in", values, "remarkth");
            return (Criteria) this;
        }

        public Criteria andRemarkthNotIn(List<String> values) {
            addCriterion("dateHistory.REMARKTH not in", values, "remarkth");
            return (Criteria) this;
        }

        public Criteria andRemarkthBetween(String value1, String value2) {
            addCriterion("dateHistory.REMARKTH between", value1, value2, "remarkth");
            return (Criteria) this;
        }

        public Criteria andRemarkthNotBetween(String value1, String value2) {
            addCriterion("dateHistory.REMARKTH not between", value1, value2, "remarkth");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}