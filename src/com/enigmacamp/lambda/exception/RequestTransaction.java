package com.enigmacamp.lambda.exception;

public class RequestTransaction {
    private String productName;
    private Integer qty;

    public RequestTransaction(String productName, Integer qty) {
        this.productName = productName;
        this.qty = qty;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "RequestTransaction{" +
                "productName='" + productName + '\'' +
                ", qty=" + qty +
                '}';
    }
}
