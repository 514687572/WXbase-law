package com.stip.net.example;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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
            addCriterion("sysUser.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("sysUser.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("sysUser.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("sysUser.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("sysUser.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("sysUser.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("sysUser.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("sysUser.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("sysUser.id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("sysUser.id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("sysUser.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("sysUser.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("sysUser.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("sysUser.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("sysUser.openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("sysUser.openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("sysUser.openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("sysUser.openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("sysUser.openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("sysUser.openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("sysUser.openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("sysUser.openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("sysUser.openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("sysUser.openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("sysUser.openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("sysUser.openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("sysUser.openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("sysUser.openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidIsNull() {
            addCriterion("sysUser.app_openid is null");
            return (Criteria) this;
        }

        public Criteria andAppOpenidIsNotNull() {
            addCriterion("sysUser.app_openid is not null");
            return (Criteria) this;
        }

        public Criteria andAppOpenidEqualTo(String value) {
            addCriterion("sysUser.app_openid =", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidNotEqualTo(String value) {
            addCriterion("sysUser.app_openid <>", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidGreaterThan(String value) {
            addCriterion("sysUser.app_openid >", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("sysUser.app_openid >=", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidLessThan(String value) {
            addCriterion("sysUser.app_openid <", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidLessThanOrEqualTo(String value) {
            addCriterion("sysUser.app_openid <=", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidLike(String value) {
            addCriterion("sysUser.app_openid like", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidNotLike(String value) {
            addCriterion("sysUser.app_openid not like", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidIn(List<String> values) {
            addCriterion("sysUser.app_openid in", values, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidNotIn(List<String> values) {
            addCriterion("sysUser.app_openid not in", values, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidBetween(String value1, String value2) {
            addCriterion("sysUser.app_openid between", value1, value2, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidNotBetween(String value1, String value2) {
            addCriterion("sysUser.app_openid not between", value1, value2, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("sysUser.nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("sysUser.nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("sysUser.nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("sysUser.nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("sysUser.nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("sysUser.nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("sysUser.nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("sysUser.nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("sysUser.nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("sysUser.nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("sysUser.nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("sysUser.nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("sysUser.nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("sysUser.nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("sysUser.city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("sysUser.city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("sysUser.city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("sysUser.city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("sysUser.city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("sysUser.city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("sysUser.city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("sysUser.city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("sysUser.city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("sysUser.city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("sysUser.city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("sysUser.city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("sysUser.city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("sysUser.city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("sysUser.province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("sysUser.province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("sysUser.province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("sysUser.province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("sysUser.province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("sysUser.province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("sysUser.province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("sysUser.province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("sysUser.province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("sysUser.province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("sysUser.province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("sysUser.province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("sysUser.province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("sysUser.province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("sysUser.country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("sysUser.country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("sysUser.country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("sysUser.country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("sysUser.country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("sysUser.country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("sysUser.country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("sysUser.country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("sysUser.country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("sysUser.country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("sysUser.country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("sysUser.country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("sysUser.country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("sysUser.country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIsNull() {
            addCriterion("sysUser.headimgurl is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIsNotNull() {
            addCriterion("sysUser.headimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlEqualTo(String value) {
            addCriterion("sysUser.headimgurl =", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotEqualTo(String value) {
            addCriterion("sysUser.headimgurl <>", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThan(String value) {
            addCriterion("sysUser.headimgurl >", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("sysUser.headimgurl >=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThan(String value) {
            addCriterion("sysUser.headimgurl <", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThanOrEqualTo(String value) {
            addCriterion("sysUser.headimgurl <=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLike(String value) {
            addCriterion("sysUser.headimgurl like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotLike(String value) {
            addCriterion("sysUser.headimgurl not like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIn(List<String> values) {
            addCriterion("sysUser.headimgurl in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotIn(List<String> values) {
            addCriterion("sysUser.headimgurl not in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlBetween(String value1, String value2) {
            addCriterion("sysUser.headimgurl between", value1, value2, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotBetween(String value1, String value2) {
            addCriterion("sysUser.headimgurl not between", value1, value2, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("sysUser.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("sysUser.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("sysUser.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("sysUser.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("sysUser.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sysUser.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("sysUser.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("sysUser.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("sysUser.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("sysUser.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("sysUser.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("sysUser.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("sysUser.gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("sysUser.gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("sysUser.gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("sysUser.gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("sysUser.gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("sysUser.gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("sysUser.gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("sysUser.gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("sysUser.gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("sysUser.gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("sysUser.gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("sysUser.gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("sysUser.gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("sysUser.gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAvatarurlIsNull() {
            addCriterion("sysUser.avatarUrl is null");
            return (Criteria) this;
        }

        public Criteria andAvatarurlIsNotNull() {
            addCriterion("sysUser.avatarUrl is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarurlEqualTo(String value) {
            addCriterion("sysUser.avatarUrl =", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlNotEqualTo(String value) {
            addCriterion("sysUser.avatarUrl <>", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlGreaterThan(String value) {
            addCriterion("sysUser.avatarUrl >", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlGreaterThanOrEqualTo(String value) {
            addCriterion("sysUser.avatarUrl >=", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlLessThan(String value) {
            addCriterion("sysUser.avatarUrl <", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlLessThanOrEqualTo(String value) {
            addCriterion("sysUser.avatarUrl <=", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlLike(String value) {
            addCriterion("sysUser.avatarUrl like", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlNotLike(String value) {
            addCriterion("sysUser.avatarUrl not like", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlIn(List<String> values) {
            addCriterion("sysUser.avatarUrl in", values, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlNotIn(List<String> values) {
            addCriterion("sysUser.avatarUrl not in", values, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlBetween(String value1, String value2) {
            addCriterion("sysUser.avatarUrl between", value1, value2, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlNotBetween(String value1, String value2) {
            addCriterion("sysUser.avatarUrl not between", value1, value2, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNull() {
            addCriterion("sysUser.unionId is null");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNotNull() {
            addCriterion("sysUser.unionId is not null");
            return (Criteria) this;
        }

        public Criteria andUnionidEqualTo(String value) {
            addCriterion("sysUser.unionId =", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotEqualTo(String value) {
            addCriterion("sysUser.unionId <>", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThan(String value) {
            addCriterion("sysUser.unionId >", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("sysUser.unionId >=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThan(String value) {
            addCriterion("sysUser.unionId <", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThanOrEqualTo(String value) {
            addCriterion("sysUser.unionId <=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLike(String value) {
            addCriterion("sysUser.unionId like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotLike(String value) {
            addCriterion("sysUser.unionId not like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidIn(List<String> values) {
            addCriterion("sysUser.unionId in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotIn(List<String> values) {
            addCriterion("sysUser.unionId not in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidBetween(String value1, String value2) {
            addCriterion("sysUser.unionId between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotBetween(String value1, String value2) {
            addCriterion("sysUser.unionId not between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andWatermarkIsNull() {
            addCriterion("sysUser.watermark is null");
            return (Criteria) this;
        }

        public Criteria andWatermarkIsNotNull() {
            addCriterion("sysUser.watermark is not null");
            return (Criteria) this;
        }

        public Criteria andWatermarkEqualTo(String value) {
            addCriterion("sysUser.watermark =", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkNotEqualTo(String value) {
            addCriterion("sysUser.watermark <>", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkGreaterThan(String value) {
            addCriterion("sysUser.watermark >", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkGreaterThanOrEqualTo(String value) {
            addCriterion("sysUser.watermark >=", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkLessThan(String value) {
            addCriterion("sysUser.watermark <", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkLessThanOrEqualTo(String value) {
            addCriterion("sysUser.watermark <=", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkLike(String value) {
            addCriterion("sysUser.watermark like", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkNotLike(String value) {
            addCriterion("sysUser.watermark not like", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkIn(List<String> values) {
            addCriterion("sysUser.watermark in", values, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkNotIn(List<String> values) {
            addCriterion("sysUser.watermark not in", values, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkBetween(String value1, String value2) {
            addCriterion("sysUser.watermark between", value1, value2, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkNotBetween(String value1, String value2) {
            addCriterion("sysUser.watermark not between", value1, value2, "watermark");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("sysUser.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("sysUser.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("sysUser.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("sysUser.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("sysUser.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sysUser.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("sysUser.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("sysUser.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("sysUser.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("sysUser.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("sysUser.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("sysUser.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("sysUser.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("sysUser.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}