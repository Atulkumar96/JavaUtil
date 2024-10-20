package com.ecom.javautil.functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ClientUsesLambdaExpression {
    public static void main(String[] args) {
        System.out.println("Start () -> { Lambda Expressions to implement Functional Interface }");

        // Lambda Expressions to implement Functional Interface - Bird, Consumer, Supplier, Function, Predicate
        //1. Lambda Expression implements our Bird Functional Interface as () -> {}
        Bird eagleBird = (String BirdType) -> System.out.println(BirdType+" can fly");

        eagleBird.canFly("1. Eagle");

        //2. Provided by Java: Consumer Functional Interface accepts 1 argument and returns nothing
        Consumer<String> consumer = (String message) -> System.out.println(message);
        consumer.accept("2. Hello, this is a message from consumer");

        //3. Provided by Java: Supplier Functional Interface accepts 0 argument and returns a value
        Supplier<String> supplier = () -> { return "3. Hello, this is a message from Supplier"; };
        System.out.println(supplier.get());

        //4. Provided by Java: Function Functional Interface accepts 1 argument and returns a value
        Function<Integer, String> function = (Integer number) -> { return "4. Number passed: "+number; };
        System.out.println(function.apply(4));

        //5. Provided by Java: Predicate Functional Interface accepts 1 argument and returns boolean
        Predicate<Integer> predicate = (Integer number) -> {
            return number % 2 == 0;
        };
        System.out.println("5. Number passed to check even or odd: "+predicate.test(12)); //false

        System.out.println("End () -> { Lambda Expressions to implement Functional Interface }");
        System.out.println();
    }
}
