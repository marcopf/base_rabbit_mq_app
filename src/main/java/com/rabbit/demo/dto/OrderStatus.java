package com.rabbit.demo.dto;

public class OrderStatus {
    private Order order;
    private String status;
    private String message;

    @Override
    public String toString() {
        return "OrderStatus{" +
                "order=" + order +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public OrderStatus() {
    }

    public OrderStatus(Order order, String status, String message) {
        this.order = order;
        this.status = status;
        this.message = message;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Order getOrder() {
        return order;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
