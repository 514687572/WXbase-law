package com.stip.net.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;

public class MuserExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public MuserExample() {
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
            addCriterion("muser.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("muser.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("muser.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("muser.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("muser.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("muser.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("muser.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("muser.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("muser.id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("muser.id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("muser.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("muser.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("muser.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("muser.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("muser.openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("muser.openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("muser.openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("muser.openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("muser.openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("muser.openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("muser.openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("muser.openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("muser.openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("muser.openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("muser.openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("muser.openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("muser.openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("muser.openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidIsNull() {
            addCriterion("muser.app_openid is null");
            return (Criteria) this;
        }

        public Criteria andAppOpenidIsNotNull() {
            addCriterion("muser.app_openid is not null");
            return (Criteria) this;
        }

        public Criteria andAppOpenidEqualTo(String value) {
            addCriterion("muser.app_openid =", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidNotEqualTo(String value) {
            addCriterion("muser.app_openid <>", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidGreaterThan(String value) {
            addCriterion("muser.app_openid >", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("muser.app_openid >=", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidLessThan(String value) {
            addCriterion("muser.app_openid <", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidLessThanOrEqualTo(String value) {
            addCriterion("muser.app_openid <=", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidLike(String value) {
            addCriterion("muser.app_openid like", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidNotLike(String value) {
            addCriterion("muser.app_openid not like", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidIn(List<String> values) {
            addCriterion("muser.app_openid in", values, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidNotIn(List<String> values) {
            addCriterion("muser.app_openid not in", values, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidBetween(String value1, String value2) {
            addCriterion("muser.app_openid between", value1, value2, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidNotBetween(String value1, String value2) {
            addCriterion("muser.app_openid not between", value1, value2, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("muser.nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("muser.nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("muser.nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("muser.nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("muser.nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("muser.nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("muser.nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("muser.nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("muser.nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("muser.nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("muser.nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("muser.nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("muser.nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("muser.nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("muser.city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("muser.city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("muser.city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("muser.city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("muser.city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("muser.city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("muser.city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("muser.city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("muser.city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("muser.city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("muser.city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("muser.city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("muser.city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("muser.city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("muser.province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("muser.province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("muser.province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("muser.province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("muser.province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("muser.province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("muser.province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("muser.province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("muser.province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("muser.province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("muser.province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("muser.province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("muser.province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("muser.province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("muser.country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("muser.country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("muser.country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("muser.country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("muser.country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("muser.country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("muser.country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("muser.country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("muser.country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("muser.country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("muser.country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("muser.country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("muser.country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("muser.country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIsNull() {
            addCriterion("muser.headimgurl is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIsNotNull() {
            addCriterion("muser.headimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlEqualTo(String value) {
            addCriterion("muser.headimgurl =", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotEqualTo(String value) {
            addCriterion("muser.headimgurl <>", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThan(String value) {
            addCriterion("muser.headimgurl >", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("muser.headimgurl >=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThan(String value) {
            addCriterion("muser.headimgurl <", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThanOrEqualTo(String value) {
            addCriterion("muser.headimgurl <=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLike(String value) {
            addCriterion("muser.headimgurl like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotLike(String value) {
            addCriterion("muser.headimgurl not like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIn(List<String> values) {
            addCriterion("muser.headimgurl in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotIn(List<String> values) {
            addCriterion("muser.headimgurl not in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlBetween(String value1, String value2) {
            addCriterion("muser.headimgurl between", value1, value2, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotBetween(String value1, String value2) {
            addCriterion("muser.headimgurl not between", value1, value2, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("muser.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("muser.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("muser.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("muser.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("muser.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("muser.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("muser.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("muser.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("muser.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("muser.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("muser.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("muser.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("muser.gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("muser.gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("muser.gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("muser.gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("muser.gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("muser.gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("muser.gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("muser.gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("muser.gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("muser.gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("muser.gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("muser.gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("muser.gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("muser.gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAvatarurlIsNull() {
            addCriterion("muser.avatarUrl is null");
            return (Criteria) this;
        }

        public Criteria andAvatarurlIsNotNull() {
            addCriterion("muser.avatarUrl is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarurlEqualTo(String value) {
            addCriterion("muser.avatarUrl =", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlNotEqualTo(String value) {
            addCriterion("muser.avatarUrl <>", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlGreaterThan(String value) {
            addCriterion("muser.avatarUrl >", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlGreaterThanOrEqualTo(String value) {
            addCriterion("muser.avatarUrl >=", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlLessThan(String value) {
            addCriterion("muser.avatarUrl <", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlLessThanOrEqualTo(String value) {
            addCriterion("muser.avatarUrl <=", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlLike(String value) {
            addCriterion("muser.avatarUrl like", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlNotLike(String value) {
            addCriterion("muser.avatarUrl not like", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlIn(List<String> values) {
            addCriterion("muser.avatarUrl in", values, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlNotIn(List<String> values) {
            addCriterion("muser.avatarUrl not in", values, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlBetween(String value1, String value2) {
            addCriterion("muser.avatarUrl between", value1, value2, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlNotBetween(String value1, String value2) {
            addCriterion("muser.avatarUrl not between", value1, value2, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNull() {
            addCriterion("muser.unionId is null");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNotNull() {
            addCriterion("muser.unionId is not null");
            return (Criteria) this;
        }

        public Criteria andUnionidEqualTo(String value) {
            addCriterion("muser.unionId =", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotEqualTo(String value) {
            addCriterion("muser.unionId <>", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThan(String value) {
            addCriterion("muser.unionId >", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("muser.unionId >=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThan(String value) {
            addCriterion("muser.unionId <", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThanOrEqualTo(String value) {
            addCriterion("muser.unionId <=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLike(String value) {
            addCriterion("muser.unionId like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotLike(String value) {
            addCriterion("muser.unionId not like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidIn(List<String> values) {
            addCriterion("muser.unionId in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotIn(List<String> values) {
            addCriterion("muser.unionId not in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidBetween(String value1, String value2) {
            addCriterion("muser.unionId between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotBetween(String value1, String value2) {
            addCriterion("muser.unionId not between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andWatermarkIsNull() {
            addCriterion("muser.watermark is null");
            return (Criteria) this;
        }

        public Criteria andWatermarkIsNotNull() {
            addCriterion("muser.watermark is not null");
            return (Criteria) this;
        }

        public Criteria andWatermarkEqualTo(String value) {
            addCriterion("muser.watermark =", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkNotEqualTo(String value) {
            addCriterion("muser.watermark <>", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkGreaterThan(String value) {
            addCriterion("muser.watermark >", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkGreaterThanOrEqualTo(String value) {
            addCriterion("muser.watermark >=", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkLessThan(String value) {
            addCriterion("muser.watermark <", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkLessThanOrEqualTo(String value) {
            addCriterion("muser.watermark <=", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkLike(String value) {
            addCriterion("muser.watermark like", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkNotLike(String value) {
            addCriterion("muser.watermark not like", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkIn(List<String> values) {
            addCriterion("muser.watermark in", values, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkNotIn(List<String> values) {
            addCriterion("muser.watermark not in", values, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkBetween(String value1, String value2) {
            addCriterion("muser.watermark between", value1, value2, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkNotBetween(String value1, String value2) {
            addCriterion("muser.watermark not between", value1, value2, "watermark");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("muser.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("muser.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("muser.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("muser.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("muser.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("muser.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("muser.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("muser.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("muser.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("muser.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("muser.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("muser.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("muser.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("muser.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

		public Criteria andEqualTOpenid(String openid) {
	    	  addCriterion(" (muser.openid='"+openid+"' or muser.app_openid='"+openid+"')");
	    	  return (Criteria) this;
	    }
    }
}