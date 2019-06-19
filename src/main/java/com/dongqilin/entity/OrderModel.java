package com.dongqilin.entity;

import javax.persistence.*;

@Table(name = "t_order")
public class OrderModel {
    /**
     * 用户id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 订单号
     */
    @Column(name = "order_number")
    private String orderNumber;

    /**
     * i的
     */
    private Integer uid;

    /**
     * zhi夫价格
     */
    @Column(name = "pay_price")
    private Double payPrice;

    @Column(name = "is_pay")
    private Byte isPay;

    @Column(name = "pay_time")
    private Integer payTime;

    @Column(name = "is_ship")
    private Byte isShip;

    @Column(name = "ship_time")
    private Integer shipTime;

    @Column(name = "is_receipt")
    private Byte isReceipt;

    @Column(name = "receipt_time")
    private Integer receiptTime;

    @Column(name = "ship_nmber")
    private String shipNmber;

    private Byte status;

    @Column(name = "create_time")
    private Integer createTime;

    @Column(name = "update_time")
    private Integer updateTime;

    /**
     * 获取用户id
     *
     * @return id - 用户id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户id
     *
     * @param id 用户id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取订单号
     *
     * @return order_number - 订单号
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * 设置订单号
     *
     * @param orderNumber 订单号
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    /**
     * 获取i的
     *
     * @return uid - i的
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置i的
     *
     * @param uid i的
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取zhi夫价格
     *
     * @return pay_price - zhi夫价格
     */
    public Double getPayPrice() {
        return payPrice;
    }

    /**
     * 设置zhi夫价格
     *
     * @param payPrice zhi夫价格
     */
    public void setPayPrice(Double payPrice) {
        this.payPrice = payPrice;
    }

    /**
     * @return is_pay
     */
    public Byte getIsPay() {
        return isPay;
    }

    /**
     * @param isPay
     */
    public void setIsPay(Byte isPay) {
        this.isPay = isPay;
    }

    /**
     * @return pay_time
     */
    public Integer getPayTime() {
        return payTime;
    }

    /**
     * @param payTime
     */
    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    /**
     * @return is_ship
     */
    public Byte getIsShip() {
        return isShip;
    }

    /**
     * @param isShip
     */
    public void setIsShip(Byte isShip) {
        this.isShip = isShip;
    }

    /**
     * @return ship_time
     */
    public Integer getShipTime() {
        return shipTime;
    }

    /**
     * @param shipTime
     */
    public void setShipTime(Integer shipTime) {
        this.shipTime = shipTime;
    }

    /**
     * @return is_receipt
     */
    public Byte getIsReceipt() {
        return isReceipt;
    }

    /**
     * @param isReceipt
     */
    public void setIsReceipt(Byte isReceipt) {
        this.isReceipt = isReceipt;
    }

    /**
     * @return receipt_time
     */
    public Integer getReceiptTime() {
        return receiptTime;
    }

    /**
     * @param receiptTime
     */
    public void setReceiptTime(Integer receiptTime) {
        this.receiptTime = receiptTime;
    }

    /**
     * @return ship_nmber
     */
    public String getShipNmber() {
        return shipNmber;
    }

    /**
     * @param shipNmber
     */
    public void setShipNmber(String shipNmber) {
        this.shipNmber = shipNmber == null ? null : shipNmber.trim();
    }

    /**
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return create_time
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}