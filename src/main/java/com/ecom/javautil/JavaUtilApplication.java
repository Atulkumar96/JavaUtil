package com.ecom.javautil;

import com.ecom.javautil.functionalInterface.Bird;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer; //Provided by Java: Consumer Functional Interface accepts 1 argument and returns nothing
import java.util.function.Supplier; //Provided by Java: Supplier Functional Interface accepts 0 argument and returns a value
import java.util.function.Function; //Provided by Java: Function Functional Interface accepts 1 argument and returns a value
import java.util.function.Predicate; //Provided by Java: Predicate Functional Interface accepts 1 argument and returns boolean

//@SpringBootApplication
public class JavaUtilApplication {

    public static void main(String[] args) {
        //SpringApplication.run(JavaUtilApplication.class, args);
        List<Integer> list = Arrays.asList(1,3,7,0,4);
        list.stream().sorted((a,b) -> (b-a)).forEach(System.out::print);


    }

}
