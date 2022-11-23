package com.enigmacamp.lambda.exception;

import java.util.List;

public class ServiceTransaction {
    private List<RequestTransaction> requestTransactionList;

    public List<RequestTransaction> getRequestTransactionList() {
        return requestTransactionList;
    }

    public void createTrx(RequestTransaction requestTransaction){
        if (requestTransaction.getQty()<=0||requestTransaction.getProductName().isBlank()){
            throw new ValidationException("Pesanan tidak valid");
        }else {
            requestTransactionList.add(requestTransaction);
        }
    }
}
