package com.ran.sample.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "saleorder")
public class SaleOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;
    private String item;
    private double amount;

    protected SaleOrder() {
    }

    public SaleOrder(String item, double amount) {
        this.item = item;
        this.amount = amount;
    }

    public long getOrderId() {
        return orderId;
    }

    public String getItem() {
        return item;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("SaleOrder [orderId=%d, item='%s', lastName='%s']", orderId, item, amount);
    }
}