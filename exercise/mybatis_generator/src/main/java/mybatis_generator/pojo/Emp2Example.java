package mybatis_generator.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emp2Example {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    public Emp2Example() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andEMPNOIsNull() {
            addCriterion("EMPNO is null");
            return (Criteria) this;
        }

        public Criteria andEMPNOIsNotNull() {
            addCriterion("EMPNO is not null");
            return (Criteria) this;
        }

        public Criteria andEMPNOEqualTo(Short value) {
            addCriterion("EMPNO =", value, "EMPNO");
            return (Criteria) this;
        }

        public Criteria andEMPNONotEqualTo(Short value) {
            addCriterion("EMPNO <>", value, "EMPNO");
            return (Criteria) this;
        }

        public Criteria andEMPNOGreaterThan(Short value) {
            addCriterion("EMPNO >", value, "EMPNO");
            return (Criteria) this;
        }

        public Criteria andEMPNOGreaterThanOrEqualTo(Short value) {
            addCriterion("EMPNO >=", value, "EMPNO");
            return (Criteria) this;
        }

        public Criteria andEMPNOLessThan(Short value) {
            addCriterion("EMPNO <", value, "EMPNO");
            return (Criteria) this;
        }

        public Criteria andEMPNOLessThanOrEqualTo(Short value) {
            addCriterion("EMPNO <=", value, "EMPNO");
            return (Criteria) this;
        }

        public Criteria andEMPNOIn(List<Short> values) {
            addCriterion("EMPNO in", values, "EMPNO");
            return (Criteria) this;
        }

        public Criteria andEMPNONotIn(List<Short> values) {
            addCriterion("EMPNO not in", values, "EMPNO");
            return (Criteria) this;
        }

        public Criteria andEMPNOBetween(Short value1, Short value2) {
            addCriterion("EMPNO between", value1, value2, "EMPNO");
            return (Criteria) this;
        }

        public Criteria andEMPNONotBetween(Short value1, Short value2) {
            addCriterion("EMPNO not between", value1, value2, "EMPNO");
            return (Criteria) this;
        }

        public Criteria andENAMEIsNull() {
            addCriterion("ENAME is null");
            return (Criteria) this;
        }

        public Criteria andENAMEIsNotNull() {
            addCriterion("ENAME is not null");
            return (Criteria) this;
        }

        public Criteria andENAMEEqualTo(String value) {
            addCriterion("ENAME =", value, "ENAME");
            return (Criteria) this;
        }

        public Criteria andENAMENotEqualTo(String value) {
            addCriterion("ENAME <>", value, "ENAME");
            return (Criteria) this;
        }

        public Criteria andENAMEGreaterThan(String value) {
            addCriterion("ENAME >", value, "ENAME");
            return (Criteria) this;
        }

        public Criteria andENAMEGreaterThanOrEqualTo(String value) {
            addCriterion("ENAME >=", value, "ENAME");
            return (Criteria) this;
        }

        public Criteria andENAMELessThan(String value) {
            addCriterion("ENAME <", value, "ENAME");
            return (Criteria) this;
        }

        public Criteria andENAMELessThanOrEqualTo(String value) {
            addCriterion("ENAME <=", value, "ENAME");
            return (Criteria) this;
        }

        public Criteria andENAMELike(String value) {
            addCriterion("ENAME like", value, "ENAME");
            return (Criteria) this;
        }

        public Criteria andENAMENotLike(String value) {
            addCriterion("ENAME not like", value, "ENAME");
            return (Criteria) this;
        }

        public Criteria andENAMEIn(List<String> values) {
            addCriterion("ENAME in", values, "ENAME");
            return (Criteria) this;
        }

        public Criteria andENAMENotIn(List<String> values) {
            addCriterion("ENAME not in", values, "ENAME");
            return (Criteria) this;
        }

        public Criteria andENAMEBetween(String value1, String value2) {
            addCriterion("ENAME between", value1, value2, "ENAME");
            return (Criteria) this;
        }

        public Criteria andENAMENotBetween(String value1, String value2) {
            addCriterion("ENAME not between", value1, value2, "ENAME");
            return (Criteria) this;
        }

        public Criteria andJOBIsNull() {
            addCriterion("JOB is null");
            return (Criteria) this;
        }

        public Criteria andJOBIsNotNull() {
            addCriterion("JOB is not null");
            return (Criteria) this;
        }

        public Criteria andJOBEqualTo(String value) {
            addCriterion("JOB =", value, "JOB");
            return (Criteria) this;
        }

        public Criteria andJOBNotEqualTo(String value) {
            addCriterion("JOB <>", value, "JOB");
            return (Criteria) this;
        }

        public Criteria andJOBGreaterThan(String value) {
            addCriterion("JOB >", value, "JOB");
            return (Criteria) this;
        }

        public Criteria andJOBGreaterThanOrEqualTo(String value) {
            addCriterion("JOB >=", value, "JOB");
            return (Criteria) this;
        }

        public Criteria andJOBLessThan(String value) {
            addCriterion("JOB <", value, "JOB");
            return (Criteria) this;
        }

        public Criteria andJOBLessThanOrEqualTo(String value) {
            addCriterion("JOB <=", value, "JOB");
            return (Criteria) this;
        }

        public Criteria andJOBLike(String value) {
            addCriterion("JOB like", value, "JOB");
            return (Criteria) this;
        }

        public Criteria andJOBNotLike(String value) {
            addCriterion("JOB not like", value, "JOB");
            return (Criteria) this;
        }

        public Criteria andJOBIn(List<String> values) {
            addCriterion("JOB in", values, "JOB");
            return (Criteria) this;
        }

        public Criteria andJOBNotIn(List<String> values) {
            addCriterion("JOB not in", values, "JOB");
            return (Criteria) this;
        }

        public Criteria andJOBBetween(String value1, String value2) {
            addCriterion("JOB between", value1, value2, "JOB");
            return (Criteria) this;
        }

        public Criteria andJOBNotBetween(String value1, String value2) {
            addCriterion("JOB not between", value1, value2, "JOB");
            return (Criteria) this;
        }

        public Criteria andHIREDATEIsNull() {
            addCriterion("HIREDATE is null");
            return (Criteria) this;
        }

        public Criteria andHIREDATEIsNotNull() {
            addCriterion("HIREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andHIREDATEEqualTo(Date value) {
            addCriterion("HIREDATE =", value, "HIREDATE");
            return (Criteria) this;
        }

        public Criteria andHIREDATENotEqualTo(Date value) {
            addCriterion("HIREDATE <>", value, "HIREDATE");
            return (Criteria) this;
        }

        public Criteria andHIREDATEGreaterThan(Date value) {
            addCriterion("HIREDATE >", value, "HIREDATE");
            return (Criteria) this;
        }

        public Criteria andHIREDATEGreaterThanOrEqualTo(Date value) {
            addCriterion("HIREDATE >=", value, "HIREDATE");
            return (Criteria) this;
        }

        public Criteria andHIREDATELessThan(Date value) {
            addCriterion("HIREDATE <", value, "HIREDATE");
            return (Criteria) this;
        }

        public Criteria andHIREDATELessThanOrEqualTo(Date value) {
            addCriterion("HIREDATE <=", value, "HIREDATE");
            return (Criteria) this;
        }

        public Criteria andHIREDATEIn(List<Date> values) {
            addCriterion("HIREDATE in", values, "HIREDATE");
            return (Criteria) this;
        }

        public Criteria andHIREDATENotIn(List<Date> values) {
            addCriterion("HIREDATE not in", values, "HIREDATE");
            return (Criteria) this;
        }

        public Criteria andHIREDATEBetween(Date value1, Date value2) {
            addCriterion("HIREDATE between", value1, value2, "HIREDATE");
            return (Criteria) this;
        }

        public Criteria andHIREDATENotBetween(Date value1, Date value2) {
            addCriterion("HIREDATE not between", value1, value2, "HIREDATE");
            return (Criteria) this;
        }

        public Criteria andSALIsNull() {
            addCriterion("SAL is null");
            return (Criteria) this;
        }

        public Criteria andSALIsNotNull() {
            addCriterion("SAL is not null");
            return (Criteria) this;
        }

        public Criteria andSALEqualTo(BigDecimal value) {
            addCriterion("SAL =", value, "SAL");
            return (Criteria) this;
        }

        public Criteria andSALNotEqualTo(BigDecimal value) {
            addCriterion("SAL <>", value, "SAL");
            return (Criteria) this;
        }

        public Criteria andSALGreaterThan(BigDecimal value) {
            addCriterion("SAL >", value, "SAL");
            return (Criteria) this;
        }

        public Criteria andSALGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SAL >=", value, "SAL");
            return (Criteria) this;
        }

        public Criteria andSALLessThan(BigDecimal value) {
            addCriterion("SAL <", value, "SAL");
            return (Criteria) this;
        }

        public Criteria andSALLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SAL <=", value, "SAL");
            return (Criteria) this;
        }

        public Criteria andSALIn(List<BigDecimal> values) {
            addCriterion("SAL in", values, "SAL");
            return (Criteria) this;
        }

        public Criteria andSALNotIn(List<BigDecimal> values) {
            addCriterion("SAL not in", values, "SAL");
            return (Criteria) this;
        }

        public Criteria andSALBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAL between", value1, value2, "SAL");
            return (Criteria) this;
        }

        public Criteria andSALNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAL not between", value1, value2, "SAL");
            return (Criteria) this;
        }

        public Criteria andCOMMIsNull() {
            addCriterion("COMM is null");
            return (Criteria) this;
        }

        public Criteria andCOMMIsNotNull() {
            addCriterion("COMM is not null");
            return (Criteria) this;
        }

        public Criteria andCOMMEqualTo(BigDecimal value) {
            addCriterion("COMM =", value, "COMM");
            return (Criteria) this;
        }

        public Criteria andCOMMNotEqualTo(BigDecimal value) {
            addCriterion("COMM <>", value, "COMM");
            return (Criteria) this;
        }

        public Criteria andCOMMGreaterThan(BigDecimal value) {
            addCriterion("COMM >", value, "COMM");
            return (Criteria) this;
        }

        public Criteria andCOMMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMM >=", value, "COMM");
            return (Criteria) this;
        }

        public Criteria andCOMMLessThan(BigDecimal value) {
            addCriterion("COMM <", value, "COMM");
            return (Criteria) this;
        }

        public Criteria andCOMMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMM <=", value, "COMM");
            return (Criteria) this;
        }

        public Criteria andCOMMIn(List<BigDecimal> values) {
            addCriterion("COMM in", values, "COMM");
            return (Criteria) this;
        }

        public Criteria andCOMMNotIn(List<BigDecimal> values) {
            addCriterion("COMM not in", values, "COMM");
            return (Criteria) this;
        }

        public Criteria andCOMMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMM between", value1, value2, "COMM");
            return (Criteria) this;
        }

        public Criteria andCOMMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMM not between", value1, value2, "COMM");
            return (Criteria) this;
        }

        public Criteria andDEPTNOIsNull() {
            addCriterion("DEPTNO is null");
            return (Criteria) this;
        }

        public Criteria andDEPTNOIsNotNull() {
            addCriterion("DEPTNO is not null");
            return (Criteria) this;
        }

        public Criteria andDEPTNOEqualTo(Short value) {
            addCriterion("DEPTNO =", value, "DEPTNO");
            return (Criteria) this;
        }

        public Criteria andDEPTNONotEqualTo(Short value) {
            addCriterion("DEPTNO <>", value, "DEPTNO");
            return (Criteria) this;
        }

        public Criteria andDEPTNOGreaterThan(Short value) {
            addCriterion("DEPTNO >", value, "DEPTNO");
            return (Criteria) this;
        }

        public Criteria andDEPTNOGreaterThanOrEqualTo(Short value) {
            addCriterion("DEPTNO >=", value, "DEPTNO");
            return (Criteria) this;
        }

        public Criteria andDEPTNOLessThan(Short value) {
            addCriterion("DEPTNO <", value, "DEPTNO");
            return (Criteria) this;
        }

        public Criteria andDEPTNOLessThanOrEqualTo(Short value) {
            addCriterion("DEPTNO <=", value, "DEPTNO");
            return (Criteria) this;
        }

        public Criteria andDEPTNOIn(List<Short> values) {
            addCriterion("DEPTNO in", values, "DEPTNO");
            return (Criteria) this;
        }

        public Criteria andDEPTNONotIn(List<Short> values) {
            addCriterion("DEPTNO not in", values, "DEPTNO");
            return (Criteria) this;
        }

        public Criteria andDEPTNOBetween(Short value1, Short value2) {
            addCriterion("DEPTNO between", value1, value2, "DEPTNO");
            return (Criteria) this;
        }

        public Criteria andDEPTNONotBetween(Short value1, Short value2) {
            addCriterion("DEPTNO not between", value1, value2, "DEPTNO");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DA104.EMP2
     *
     * @mbg.generated do_not_delete_during_merge Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DA104.EMP2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
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