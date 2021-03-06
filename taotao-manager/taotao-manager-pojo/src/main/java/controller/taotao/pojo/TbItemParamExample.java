package controller.taotao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbItemParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbItemParamExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
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
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andItemCatIdIsNull() {
            addCriterion("ITEM_CAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemCatIdIsNotNull() {
            addCriterion("ITEM_CAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemCatIdEqualTo(String value) {
            addCriterion("ITEM_CAT_ID =", value, "itemCatId");
            return (Criteria) this;
        }

        public Criteria andItemCatIdNotEqualTo(String value) {
            addCriterion("ITEM_CAT_ID <>", value, "itemCatId");
            return (Criteria) this;
        }

        public Criteria andItemCatIdGreaterThan(String value) {
            addCriterion("ITEM_CAT_ID >", value, "itemCatId");
            return (Criteria) this;
        }

        public Criteria andItemCatIdGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_CAT_ID >=", value, "itemCatId");
            return (Criteria) this;
        }

        public Criteria andItemCatIdLessThan(String value) {
            addCriterion("ITEM_CAT_ID <", value, "itemCatId");
            return (Criteria) this;
        }

        public Criteria andItemCatIdLessThanOrEqualTo(String value) {
            addCriterion("ITEM_CAT_ID <=", value, "itemCatId");
            return (Criteria) this;
        }

        public Criteria andItemCatIdLike(String value) {
            addCriterion("ITEM_CAT_ID like", value, "itemCatId");
            return (Criteria) this;
        }

        public Criteria andItemCatIdNotLike(String value) {
            addCriterion("ITEM_CAT_ID not like", value, "itemCatId");
            return (Criteria) this;
        }

        public Criteria andItemCatIdIn(List<String> values) {
            addCriterion("ITEM_CAT_ID in", values, "itemCatId");
            return (Criteria) this;
        }

        public Criteria andItemCatIdNotIn(List<String> values) {
            addCriterion("ITEM_CAT_ID not in", values, "itemCatId");
            return (Criteria) this;
        }

        public Criteria andItemCatIdBetween(String value1, String value2) {
            addCriterion("ITEM_CAT_ID between", value1, value2, "itemCatId");
            return (Criteria) this;
        }

        public Criteria andItemCatIdNotBetween(String value1, String value2) {
            addCriterion("ITEM_CAT_ID not between", value1, value2, "itemCatId");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("CREATED is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("CREATED =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("CREATED <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("CREATED >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("CREATED <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("CREATED <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("CREATED in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("CREATED not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("CREATED between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("CREATED not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("UPDATED is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("UPDATED is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("UPDATED =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("UPDATED <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("UPDATED >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("UPDATED <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("UPDATED in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("UPDATED not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("UPDATED between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andParamDataIsNull() {
            addCriterion("PARAM_DATA is null");
            return (Criteria) this;
        }

        public Criteria andParamDataIsNotNull() {
            addCriterion("PARAM_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andParamDataEqualTo(String value) {
            addCriterion("PARAM_DATA =", value, "paramData");
            return (Criteria) this;
        }

        public Criteria andParamDataNotEqualTo(String value) {
            addCriterion("PARAM_DATA <>", value, "paramData");
            return (Criteria) this;
        }

        public Criteria andParamDataGreaterThan(String value) {
            addCriterion("PARAM_DATA >", value, "paramData");
            return (Criteria) this;
        }

        public Criteria andParamDataGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_DATA >=", value, "paramData");
            return (Criteria) this;
        }

        public Criteria andParamDataLessThan(String value) {
            addCriterion("PARAM_DATA <", value, "paramData");
            return (Criteria) this;
        }

        public Criteria andParamDataLessThanOrEqualTo(String value) {
            addCriterion("PARAM_DATA <=", value, "paramData");
            return (Criteria) this;
        }

        public Criteria andParamDataLike(String value) {
            addCriterion("PARAM_DATA like", value, "paramData");
            return (Criteria) this;
        }

        public Criteria andParamDataNotLike(String value) {
            addCriterion("PARAM_DATA not like", value, "paramData");
            return (Criteria) this;
        }

        public Criteria andParamDataIn(List<String> values) {
            addCriterion("PARAM_DATA in", values, "paramData");
            return (Criteria) this;
        }

        public Criteria andParamDataNotIn(List<String> values) {
            addCriterion("PARAM_DATA not in", values, "paramData");
            return (Criteria) this;
        }

        public Criteria andParamDataBetween(String value1, String value2) {
            addCriterion("PARAM_DATA between", value1, value2, "paramData");
            return (Criteria) this;
        }

        public Criteria andParamDataNotBetween(String value1, String value2) {
            addCriterion("PARAM_DATA not between", value1, value2, "paramData");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}