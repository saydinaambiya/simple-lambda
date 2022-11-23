package com.enigmacamp.lambda;

public class SimplePrint implements Printable{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
