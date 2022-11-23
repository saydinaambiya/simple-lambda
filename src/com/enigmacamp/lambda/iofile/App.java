package com.enigmacamp.lambda.iofile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
//        Path path = Paths.get("/home/user/Documents/javaEnigma/java-lambda/src/com/enigmacamp/lambda/iofile/App.java");
//        boolean exists = Files.exists(path);
//        boolean regularFile = Files.isRegularFile(path);
//        System.out.println(exists);

//        String fileName = "pascal10_"+ UUID.randomUUID()+".txt";
////        Path folder = Paths.get("/home/user/Documents/");
//        Path newFile = Paths.get("/home/user/Documents/"+fileName);
//
//        try {
//            Files.createFile(newFile);
//            boolean existsNewFile = Files.exists(newFile);
//            System.out.println("Exist = "+existsNewFile);
//        }catch (IOException e){
//            throw new RuntimeException(e);
//        }

        String pathAddress = "pascal10_91cc1941-3e80-45e2-9fe7-5eeb158ef240.txt";
        Path path = Paths.get(pathAddress);
//        try {
//            Files.write(path,"Hello Enigma Camp\n".getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

            //get file STREAM
//        Stream<String> lines =null;
//
//        try {
//            lines = Files.lines(path);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //get file STRING
//        String lines = null;
//        try {
//            lines = Files.readString(path);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(lines);

        //get files list
        List<String> stringList = null;
        try {
            stringList = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String s : stringList) {
            System.out.println(s);
        }
        stringList.forEach(System.out::println);
        System.out.println(stringList.get(1));

    }
}
