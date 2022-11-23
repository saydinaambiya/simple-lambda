package com.enigmacamp.lambda.lambConCollection;

import com.enigmacamp.lambda.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("saydina");
        arrayList.add("ambiya");
        arrayList.add("rizki");

        /*
        foreach
         */
        Consumer<String> stringConsumer = data -> System.out.println(data);
        arrayList.forEach(stringConsumer);

        Collection<String> collection = Arrays.asList("a","b","c");
        collection.stream().forEach(coll -> System.out.println(coll));

        List<Integer> numbers = Arrays.asList(1,3,4,2,5,3,2,9);
//        numbers.stream().map(n->n*2).forEach(n-> System.out.println(numbers));

//        List<Integer> collect = numbers.stream().map(n->n*2).collect(Collectors.toList());
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("saydina",19));
        students.add(new Student("ambiya", 20));

//        students.stream().forEach(data -> System.out.println(data));
        System.out.println("filter");
        students.stream().filter(student -> student.getName().startsWith("a")).forEach(name-> System.out.println(name));


    }
}
