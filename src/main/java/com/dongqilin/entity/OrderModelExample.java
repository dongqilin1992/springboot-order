package com.dongqilin.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderModelExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("order_number like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("order_number not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(Double value) {
            addCriterion("pay_price =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(Double value) {
            addCriterion("pay_price <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(Double value) {
            addCriterion("pay_price >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pay_price >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(Double value) {
            addCriterion("pay_price <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(Double value) {
            addCriterion("pay_price <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<Double> values) {
            addCriterion("pay_price in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<Double> values) {
            addCriterion("pay_price not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(Double value1, Double value2) {
            addCriterion("pay_price between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(Double value1, Double value2) {
            addCriterion("pay_price not between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNull() {
            addCriterion("is_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNotNull() {
            addCriterion("is_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayEqualTo(Byte value) {
            addCriterion("is_pay =", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotEqualTo(Byte value) {
            addCriterion("is_pay <>", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThan(Byte value) {
            addCriterion("is_pay >", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_pay >=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThan(Byte value) {
            addCriterion("is_pay <", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThanOrEqualTo(Byte value) {
            addCriterion("is_pay <=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayIn(List<Byte> values) {
            addCriterion("is_pay in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotIn(List<Byte> values) {
            addCriterion("is_pay not in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayBetween(Byte value1, Byte value2) {
            addCriterion("is_pay between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotBetween(Byte value1, Byte value2) {
            addCriterion("is_pay not between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Integer value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Integer value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Integer value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Integer value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Integer> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Integer> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Integer value1, Integer value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andIsShipIsNull() {
            addCriterion("is_ship is null");
            return (Criteria) this;
        }

        public Criteria andIsShipIsNotNull() {
            addCriterion("is_ship is not null");
            return (Criteria) this;
        }

        public Criteria andIsShipEqualTo(Byte value) {
            addCriterion("is_ship =", value, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipNotEqualTo(Byte value) {
            addCriterion("is_ship <>", value, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipGreaterThan(Byte value) {
            addCriterion("is_ship >", value, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_ship >=", value, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipLessThan(Byte value) {
            addCriterion("is_ship <", value, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipLessThanOrEqualTo(Byte value) {
            addCriterion("is_ship <=", value, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipIn(List<Byte> values) {
            addCriterion("is_ship in", values, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipNotIn(List<Byte> values) {
            addCriterion("is_ship not in", values, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipBetween(Byte value1, Byte value2) {
            addCriterion("is_ship between", value1, value2, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipNotBetween(Byte value1, Byte value2) {
            addCriterion("is_ship not between", value1, value2, "isShip");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNull() {
            addCriterion("ship_time is null");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNotNull() {
            addCriterion("ship_time is not null");
            return (Criteria) this;
        }

        public Criteria andShipTimeEqualTo(Integer value) {
            addCriterion("ship_time =", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotEqualTo(Integer value) {
            addCriterion("ship_time <>", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThan(Integer value) {
            addCriterion("ship_time >", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_time >=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThan(Integer value) {
            addCriterion("ship_time <", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThanOrEqualTo(Integer value) {
            addCriterion("ship_time <=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeIn(List<Integer> values) {
            addCriterion("ship_time in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotIn(List<Integer> values) {
            addCriterion("ship_time not in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeBetween(Integer value1, Integer value2) {
            addCriterion("ship_time between", value1, value2, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_time not between", value1, value2, "shipTime");
            return (Criteria) this;
        }

        public Criteria andIsReceiptIsNull() {
            addCriterion("is_receipt is null");
            return (Criteria) this;
        }

        public Criteria andIsReceiptIsNotNull() {
            addCriterion("is_receipt is not null");
            return (Criteria) this;
        }

        public Criteria andIsReceiptEqualTo(Byte value) {
            addCriterion("is_receipt =", value, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptNotEqualTo(Byte value) {
            addCriterion("is_receipt <>", value, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptGreaterThan(Byte value) {
            addCriterion("is_receipt >", value, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_receipt >=", value, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptLessThan(Byte value) {
            addCriterion("is_receipt <", value, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptLessThanOrEqualTo(Byte value) {
            addCriterion("is_receipt <=", value, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptIn(List<Byte> values) {
            addCriterion("is_receipt in", values, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptNotIn(List<Byte> values) {
            addCriterion("is_receipt not in", values, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptBetween(Byte value1, Byte value2) {
            addCriterion("is_receipt between", value1, value2, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptNotBetween(Byte value1, Byte value2) {
            addCriterion("is_receipt not between", value1, value2, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIsNull() {
            addCriterion("receipt_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIsNotNull() {
            addCriterion("receipt_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeEqualTo(Integer value) {
            addCriterion("receipt_time =", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotEqualTo(Integer value) {
            addCriterion("receipt_time <>", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeGreaterThan(Integer value) {
            addCriterion("receipt_time >", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("receipt_time >=", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeLessThan(Integer value) {
            addCriterion("receipt_time <", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeLessThanOrEqualTo(Integer value) {
            addCriterion("receipt_time <=", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIn(List<Integer> values) {
            addCriterion("receipt_time in", values, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotIn(List<Integer> values) {
            addCriterion("receipt_time not in", values, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeBetween(Integer value1, Integer value2) {
            addCriterion("receipt_time between", value1, value2, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("receipt_time not between", value1, value2, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andShipNmberIsNull() {
            addCriterion("ship_nmber is null");
            return (Criteria) this;
        }

        public Criteria andShipNmberIsNotNull() {
            addCriterion("ship_nmber is not null");
            return (Criteria) this;
        }

        public Criteria andShipNmberEqualTo(String value) {
            addCriterion("ship_nmber =", value, "shipNmber");
            return (Criteria) this;
        }

        public Criteria andShipNmberNotEqualTo(String value) {
            addCriterion("ship_nmber <>", value, "shipNmber");
            return (Criteria) this;
        }

        public Criteria andShipNmberGreaterThan(String value) {
            addCriterion("ship_nmber >", value, "shipNmber");
            return (Criteria) this;
        }

        public Criteria andShipNmberGreaterThanOrEqualTo(String value) {
            addCriterion("ship_nmber >=", value, "shipNmber");
            return (Criteria) this;
        }

        public Criteria andShipNmberLessThan(String value) {
            addCriterion("ship_nmber <", value, "shipNmber");
            return (Criteria) this;
        }

        public Criteria andShipNmberLessThanOrEqualTo(String value) {
            addCriterion("ship_nmber <=", value, "shipNmber");
            return (Criteria) this;
        }

        public Criteria andShipNmberLike(String value) {
            addCriterion("ship_nmber like", value, "shipNmber");
            return (Criteria) this;
        }

        public Criteria andShipNmberNotLike(String value) {
            addCriterion("ship_nmber not like", value, "shipNmber");
            return (Criteria) this;
        }

        public Criteria andShipNmberIn(List<String> values) {
            addCriterion("ship_nmber in", values, "shipNmber");
            return (Criteria) this;
        }

        public Criteria andShipNmberNotIn(List<String> values) {
            addCriterion("ship_nmber not in", values, "shipNmber");
            return (Criteria) this;
        }

        public Criteria andShipNmberBetween(String value1, String value2) {
            addCriterion("ship_nmber between", value1, value2, "shipNmber");
            return (Criteria) this;
        }

        public Criteria andShipNmberNotBetween(String value1, String value2) {
            addCriterion("ship_nmber not between", value1, value2, "shipNmber");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Integer value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Integer value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Integer value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Integer value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Integer> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Integer> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Integer value1, Integer value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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