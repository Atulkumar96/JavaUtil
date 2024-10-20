package com.ecom.javautil.streams;

import java.util.Arrays;

public class SumOfEvenNumbersFromCollection {

    //sum of even numbers from collection using for loop
    public static int sumOfEvenNumbers(int[] numbers) {
        int sumOfEvenNumbers = 0;

        for(int number : numbers) {
            if(number % 2 == 0) {
                sumOfEvenNumbers += number;
            }
        }
        return sumOfEvenNumbers;
    }

    //Using Streams
    public static int sumOfEvenNumbersUsingStreams(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .sum();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Sum of even numbers from collection: "+sumOfEvenNumbers(numbers));
        System.out.println("Sum of even numbers from collection using streams: "+sumOfEvenNumbersUsingStreams(numbers));

    }
}

/*
Summary
1. Stream API is introduced in Java8 to process collections of objects.
2. Stream API provides a functional approach to process collections of objects.
3. Stream API provides a set of classes and interfaces to process collections of objects.
4. Streams provides a more readable, concise and expressive way to perform operations on collections.
5. Streams performs operations on collections like filter, map, reduce, find, match, sort, etc.
   without modifying the original collection, and returns a new collection.
6. Streams are lazy-loaded, intermediate operations are not executed until a terminal operation is invoked.
7. Streams are divided into two types: Intermediate Operations and Terminal Operations.
8. Intermediate Operations are filter, map, flatMap, distinct, sorted, limit, skip, etc.
9. Terminal Operations are forEach, collect, reduce, count, findFirst, findAny, anyMatch, allMatch, noneMatch, etc.
10. Streams can be processed in parallel using parallelStream() method. Thus efficient for large collections.
 */
