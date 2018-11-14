package com.dongqilin.entity;

public class Order {
    private Integer id;

    private Integer userId;

    private String orderNumber;

    private Integer uid;

    private Double payPrice;

    private Byte isPay;

    private Integer payTime;

    private Byte isShip;

    private Integer shipTime;

    private Byte isReceipt;

    private Integer receiptTime;

    private String shipNmber;

    private Byte status;

    private Integer createTime;

    private Integer updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Double payPrice) {
        this.payPrice = payPrice;
    }

    public Byte getIsPay() {
        return isPay;
    }

    public void setIsPay(Byte isPay) {
        this.isPay = isPay;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public Byte getIsShip() {
        return isShip;
    }

    public void setIsShip(Byte isShip) {
        this.isShip = isShip;
    }

    public Integer getShipTime() {
        return shipTime;
    }

    public void setShipTime(Integer shipTime) {
        this.shipTime = shipTime;
    }

    public Byte getIsReceipt() {
        return isReceipt;
    }

    public void setIsReceipt(Byte isReceipt) {
        this.isReceipt = isReceipt;
    }

    public Integer getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(Integer receiptTime) {
        this.receiptTime = receiptTime;
    }

    public String getShipNmber() {
        return shipNmber;
    }

    public void setShipNmber(String shipNmber) {
        this.shipNmber = shipNmber == null ? null : shipNmber.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}