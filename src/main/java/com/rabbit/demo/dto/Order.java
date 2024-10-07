package com.rabbit.demo.dto;

public class Order {
    public String order_id;
    public Integer qty;
    public String name;
    public double price;

    public Order() {
    }

    public Order(String order_id, Integer qty, String name, double price) {
        this.order_id = order_id;
        this.qty = qty;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id='" + order_id + '\'' +
                ", qty=" + qty +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrder_id() {
        return order_id;
    }

    public Integer getQty() {
        return qty;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
