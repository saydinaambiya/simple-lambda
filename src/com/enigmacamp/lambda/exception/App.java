package com.enigmacamp.lambda.exception;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4};
//        Scanner scanner = new Scanner(System.in);
//        try {
//            for (int i = 0; i < 5; i++) {
//                System.out.printf("Masukkan bilangan ke - %d: ", i);
//                numbers[i] = scanner.nextInt();
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            getNumber(4);
//        }catch (MyException e){
//            System.out.println(e.getMessage());
//        }
        RequestTransaction requestTransaction = new RequestTransaction("Shampoo",10);
        ServiceTransaction serviceTransaction = new ServiceTransaction();
        try {
            serviceTransaction.createTrx(requestTransaction);
        }catch (ValidationException | NullPointerException e){
            System.out.println(e);
        }
        System.out.println(serviceTransaction.getRequestTransactionList());
    }


    static int getNumber(int idx){
        int[] numbers = {1,3,4};
        if (idx<0||idx>=numbers.length){
            throw new MyException("Index diluar batas array");
        }
        return numbers[idx];
    }
}
