package com.enigmacamp.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        Printable printable = new SimplePrint();
//        printable.print("Enigma");
//        Printable printable = (String message) -> {
//            System.out.println(message);
//        };
//        printable.print("Enigma");
//
//        MesinHitung mesinHitung = (a, b) -> a * b;
//        int result = mesinHitung.hitung(2,2);
//        System.out.println(result);
//        Predicate<String> isAlongWord = w -> w.length()>5;
//        String word = "EnigmaCamp";
//        boolean test = isAlongWord.test(word);
//        Student student = new Student();
//        student.setName("Andra");
//        Consumer<Student> studentConsumer = student1 -> student1.setName(student.getName().toUpperCase());
//        studentConsumer.accept(student);
//        System.out.println(student);
//        changeName(student, studentConsumer);
    }

    public static void changeName(Student student, Consumer consumer) {
        consumer.accept(student);
    }


}
