package com.stip.net.example;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogContentExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public BlogContentExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("userStock.cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("userStock.cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Long value) {
            addCriterion("userStock.cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Long value) {
            addCriterion("userStock.cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Long value) {
            addCriterion("userStock.cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("userStock.cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Long value) {
            addCriterion("userStock.cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("userStock.cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Long> values) {
            addCriterion("userStock.cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Long> values) {
            addCriterion("userStock.cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("userStock.cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("userStock.cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("userStock.title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("userStock.title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("userStock.title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("userStock.title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("userStock.title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("userStock.title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("userStock.title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("userStock.title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("userStock.title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("userStock.title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("userStock.title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("userStock.title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("userStock.title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("userStock.title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSlugIsNull() {
            addCriterion("userStock.slug is null");
            return (Criteria) this;
        }

        public Criteria andSlugIsNotNull() {
            addCriterion("userStock.slug is not null");
            return (Criteria) this;
        }

        public Criteria andSlugEqualTo(String value) {
            addCriterion("userStock.slug =", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugNotEqualTo(String value) {
            addCriterion("userStock.slug <>", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugGreaterThan(String value) {
            addCriterion("userStock.slug >", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugGreaterThanOrEqualTo(String value) {
            addCriterion("userStock.slug >=", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugLessThan(String value) {
            addCriterion("userStock.slug <", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugLessThanOrEqualTo(String value) {
            addCriterion("userStock.slug <=", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugLike(String value) {
            addCriterion("userStock.slug like", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugNotLike(String value) {
            addCriterion("userStock.slug not like", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugIn(List<String> values) {
            addCriterion("userStock.slug in", values, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugNotIn(List<String> values) {
            addCriterion("userStock.slug not in", values, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugBetween(String value1, String value2) {
            addCriterion("userStock.slug between", value1, value2, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugNotBetween(String value1, String value2) {
            addCriterion("userStock.slug not between", value1, value2, "slug");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("userStock.created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("userStock.created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Long value) {
            addCriterion("userStock.created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Long value) {
            addCriterion("userStock.created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Long value) {
            addCriterion("userStock.created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Long value) {
            addCriterion("userStock.created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Long value) {
            addCriterion("userStock.created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Long value) {
            addCriterion("userStock.created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Long> values) {
            addCriterion("userStock.created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Long> values) {
            addCriterion("userStock.created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Long value1, Long value2) {
            addCriterion("userStock.created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Long value1, Long value2) {
            addCriterion("userStock.created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("userStock.modified is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("userStock.modified is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(Long value) {
            addCriterion("userStock.modified =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(Long value) {
            addCriterion("userStock.modified <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(Long value) {
            addCriterion("userStock.modified >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Long value) {
            addCriterion("userStock.modified >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(Long value) {
            addCriterion("userStock.modified <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Long value) {
            addCriterion("userStock.modified <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<Long> values) {
            addCriterion("userStock.modified in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<Long> values) {
            addCriterion("userStock.modified not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(Long value1, Long value2) {
            addCriterion("userStock.modified between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(Long value1, Long value2) {
            addCriterion("userStock.modified not between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("userStock.type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("userStock.type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("userStock.type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("userStock.type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("userStock.type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("userStock.type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("userStock.type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("userStock.type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("userStock.type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("userStock.type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("userStock.type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("userStock.type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("userStock.type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("userStock.type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("userStock.tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("userStock.tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("userStock.tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("userStock.tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("userStock.tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("userStock.tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("userStock.tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("userStock.tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("userStock.tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("userStock.tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("userStock.tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("userStock.tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("userStock.tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("userStock.tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andCategoriesIsNull() {
            addCriterion("userStock.categories is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesIsNotNull() {
            addCriterion("userStock.categories is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesEqualTo(String value) {
            addCriterion("userStock.categories =", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotEqualTo(String value) {
            addCriterion("userStock.categories <>", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesGreaterThan(String value) {
            addCriterion("userStock.categories >", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesGreaterThanOrEqualTo(String value) {
            addCriterion("userStock.categories >=", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLessThan(String value) {
            addCriterion("userStock.categories <", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLessThanOrEqualTo(String value) {
            addCriterion("userStock.categories <=", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLike(String value) {
            addCriterion("userStock.categories like", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotLike(String value) {
            addCriterion("userStock.categories not like", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesIn(List<String> values) {
            addCriterion("userStock.categories in", values, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotIn(List<String> values) {
            addCriterion("userStock.categories not in", values, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesBetween(String value1, String value2) {
            addCriterion("userStock.categories between", value1, value2, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotBetween(String value1, String value2) {
            addCriterion("userStock.categories not between", value1, value2, "categories");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("userStock.hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("userStock.hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(Integer value) {
            addCriterion("userStock.hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Integer value) {
            addCriterion("userStock.hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Integer value) {
            addCriterion("userStock.hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("userStock.hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Integer value) {
            addCriterion("userStock.hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Integer value) {
            addCriterion("userStock.hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Integer> values) {
            addCriterion("userStock.hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Integer> values) {
            addCriterion("userStock.hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Integer value1, Integer value2) {
            addCriterion("userStock.hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("userStock.hits not between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andCommentsNumIsNull() {
            addCriterion("userStock.comments_num is null");
            return (Criteria) this;
        }

        public Criteria andCommentsNumIsNotNull() {
            addCriterion("userStock.comments_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsNumEqualTo(Integer value) {
            addCriterion("userStock.comments_num =", value, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumNotEqualTo(Integer value) {
            addCriterion("userStock.comments_num <>", value, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumGreaterThan(Integer value) {
            addCriterion("userStock.comments_num >", value, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("userStock.comments_num >=", value, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumLessThan(Integer value) {
            addCriterion("userStock.comments_num <", value, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumLessThanOrEqualTo(Integer value) {
            addCriterion("userStock.comments_num <=", value, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumIn(List<Integer> values) {
            addCriterion("userStock.comments_num in", values, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumNotIn(List<Integer> values) {
            addCriterion("userStock.comments_num not in", values, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumBetween(Integer value1, Integer value2) {
            addCriterion("userStock.comments_num between", value1, value2, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("userStock.comments_num not between", value1, value2, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andAllowCommentIsNull() {
            addCriterion("userStock.allow_comment is null");
            return (Criteria) this;
        }

        public Criteria andAllowCommentIsNotNull() {
            addCriterion("userStock.allow_comment is not null");
            return (Criteria) this;
        }

        public Criteria andAllowCommentEqualTo(Integer value) {
            addCriterion("userStock.allow_comment =", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentNotEqualTo(Integer value) {
            addCriterion("userStock.allow_comment <>", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentGreaterThan(Integer value) {
            addCriterion("userStock.allow_comment >", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("userStock.allow_comment >=", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentLessThan(Integer value) {
            addCriterion("userStock.allow_comment <", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentLessThanOrEqualTo(Integer value) {
            addCriterion("userStock.allow_comment <=", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentIn(List<Integer> values) {
            addCriterion("userStock.allow_comment in", values, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentNotIn(List<Integer> values) {
            addCriterion("userStock.allow_comment not in", values, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentBetween(Integer value1, Integer value2) {
            addCriterion("userStock.allow_comment between", value1, value2, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("userStock.allow_comment not between", value1, value2, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowPingIsNull() {
            addCriterion("userStock.allow_ping is null");
            return (Criteria) this;
        }

        public Criteria andAllowPingIsNotNull() {
            addCriterion("userStock.allow_ping is not null");
            return (Criteria) this;
        }

        public Criteria andAllowPingEqualTo(Integer value) {
            addCriterion("userStock.allow_ping =", value, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingNotEqualTo(Integer value) {
            addCriterion("userStock.allow_ping <>", value, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingGreaterThan(Integer value) {
            addCriterion("userStock.allow_ping >", value, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingGreaterThanOrEqualTo(Integer value) {
            addCriterion("userStock.allow_ping >=", value, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingLessThan(Integer value) {
            addCriterion("userStock.allow_ping <", value, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingLessThanOrEqualTo(Integer value) {
            addCriterion("userStock.allow_ping <=", value, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingIn(List<Integer> values) {
            addCriterion("userStock.allow_ping in", values, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingNotIn(List<Integer> values) {
            addCriterion("userStock.allow_ping not in", values, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingBetween(Integer value1, Integer value2) {
            addCriterion("userStock.allow_ping between", value1, value2, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingNotBetween(Integer value1, Integer value2) {
            addCriterion("userStock.allow_ping not between", value1, value2, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowFeedIsNull() {
            addCriterion("userStock.allow_feed is null");
            return (Criteria) this;
        }

        public Criteria andAllowFeedIsNotNull() {
            addCriterion("userStock.allow_feed is not null");
            return (Criteria) this;
        }

        public Criteria andAllowFeedEqualTo(Integer value) {
            addCriterion("userStock.allow_feed =", value, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedNotEqualTo(Integer value) {
            addCriterion("userStock.allow_feed <>", value, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedGreaterThan(Integer value) {
            addCriterion("userStock.allow_feed >", value, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("userStock.allow_feed >=", value, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedLessThan(Integer value) {
            addCriterion("userStock.allow_feed <", value, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedLessThanOrEqualTo(Integer value) {
            addCriterion("userStock.allow_feed <=", value, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedIn(List<Integer> values) {
            addCriterion("userStock.allow_feed in", values, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedNotIn(List<Integer> values) {
            addCriterion("userStock.allow_feed not in", values, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedBetween(Integer value1, Integer value2) {
            addCriterion("userStock.allow_feed between", value1, value2, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedNotBetween(Integer value1, Integer value2) {
            addCriterion("userStock.allow_feed not between", value1, value2, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("userStock.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("userStock.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("userStock.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("userStock.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("userStock.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("userStock.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("userStock.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("userStock.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("userStock.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("userStock.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("userStock.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("userStock.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("userStock.author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("userStock.author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("userStock.author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("userStock.author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("userStock.author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("userStock.author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("userStock.author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("userStock.author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("userStock.author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("userStock.author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("userStock.author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("userStock.author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("userStock.author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("userStock.author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andGtmCreateIsNull() {
            addCriterion("userStock.gtm_create is null");
            return (Criteria) this;
        }

        public Criteria andGtmCreateIsNotNull() {
            addCriterion("userStock.gtm_create is not null");
            return (Criteria) this;
        }

        public Criteria andGtmCreateEqualTo(Date value) {
            addCriterion("userStock.gtm_create =", value, "gtmCreate");
            return (Criteria) this;
        }

        public Criteria andGtmCreateNotEqualTo(Date value) {
            addCriterion("userStock.gtm_create <>", value, "gtmCreate");
            return (Criteria) this;
        }

        public Criteria andGtmCreateGreaterThan(Date value) {
            addCriterion("userStock.gtm_create >", value, "gtmCreate");
            return (Criteria) this;
        }

        public Criteria andGtmCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("userStock.gtm_create >=", value, "gtmCreate");
            return (Criteria) this;
        }

        public Criteria andGtmCreateLessThan(Date value) {
            addCriterion("userStock.gtm_create <", value, "gtmCreate");
            return (Criteria) this;
        }

        public Criteria andGtmCreateLessThanOrEqualTo(Date value) {
            addCriterion("userStock.gtm_create <=", value, "gtmCreate");
            return (Criteria) this;
        }

        public Criteria andGtmCreateIn(List<Date> values) {
            addCriterion("userStock.gtm_create in", values, "gtmCreate");
            return (Criteria) this;
        }

        public Criteria andGtmCreateNotIn(List<Date> values) {
            addCriterion("userStock.gtm_create not in", values, "gtmCreate");
            return (Criteria) this;
        }

        public Criteria andGtmCreateBetween(Date value1, Date value2) {
            addCriterion("userStock.gtm_create between", value1, value2, "gtmCreate");
            return (Criteria) this;
        }

        public Criteria andGtmCreateNotBetween(Date value1, Date value2) {
            addCriterion("userStock.gtm_create not between", value1, value2, "gtmCreate");
            return (Criteria) this;
        }

        public Criteria andGtmModifiedIsNull() {
            addCriterion("userStock.gtm_modified is null");
            return (Criteria) this;
        }

        public Criteria andGtmModifiedIsNotNull() {
            addCriterion("userStock.gtm_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGtmModifiedEqualTo(Date value) {
            addCriterion("userStock.gtm_modified =", value, "gtmModified");
            return (Criteria) this;
        }

        public Criteria andGtmModifiedNotEqualTo(Date value) {
            addCriterion("userStock.gtm_modified <>", value, "gtmModified");
            return (Criteria) this;
        }

        public Criteria andGtmModifiedGreaterThan(Date value) {
            addCriterion("userStock.gtm_modified >", value, "gtmModified");
            return (Criteria) this;
        }

        public Criteria andGtmModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("userStock.gtm_modified >=", value, "gtmModified");
            return (Criteria) this;
        }

        public Criteria andGtmModifiedLessThan(Date value) {
            addCriterion("userStock.gtm_modified <", value, "gtmModified");
            return (Criteria) this;
        }

        public Criteria andGtmModifiedLessThanOrEqualTo(Date value) {
            addCriterion("userStock.gtm_modified <=", value, "gtmModified");
            return (Criteria) this;
        }

        public Criteria andGtmModifiedIn(List<Date> values) {
            addCriterion("userStock.gtm_modified in", values, "gtmModified");
            return (Criteria) this;
        }

        public Criteria andGtmModifiedNotIn(List<Date> values) {
            addCriterion("userStock.gtm_modified not in", values, "gtmModified");
            return (Criteria) this;
        }

        public Criteria andGtmModifiedBetween(Date value1, Date value2) {
            addCriterion("userStock.gtm_modified between", value1, value2, "gtmModified");
            return (Criteria) this;
        }

        public Criteria andGtmModifiedNotBetween(Date value1, Date value2) {
            addCriterion("userStock.gtm_modified not between", value1, value2, "gtmModified");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}