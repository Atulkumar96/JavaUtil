package com.ecom.javautil.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 6, 7, 8, 9, 10, 1, 2, 3, 4);

        //Even numbers from list using stream().filter() and collected in a list;
        List<Integer> filteredEvenList = list.stream().filter((n) -> n % 2 == 0).toList();

        //Remove last comma from the list
        filteredEvenList.toString().replace(", ]", "]");
        System.out.println("Filtered even numbers list: " + filteredEvenList);

        //print even numbers from list using stream().filter() and forEach() to print
        list.stream().filter((num) -> num % 2 == 0).forEach((num) -> System.out.print(num + ","));

        //stream().map() to square each element of the list
        //map() transforms each element of the stream by taking a function as an argument
        List<Integer> mappedList = filteredEvenList.stream().map(x -> x * x).toList();
        System.out.println("\nMapped list: " + mappedList);

        //stream().map().sorted() to sort the list
        List<Integer> sorted_filteredEvenList = filteredEvenList.stream().map(x -> x * x).sorted().toList();
        System.out.println("Sorted Mapped list: " + sorted_filteredEvenList);

        //stream().map().sorted((a,b) -> (b - a)) to sort the list in descending order
        List<Integer> descending_mappedList = filteredEvenList.stream().map(x -> x * x).sorted((x,y) -> (y-x)).toList();
        System.out.println("Descending Sorted Mapped list: " + descending_mappedList);

        //stream().limit(3) to limit the list to 3 numbers
        List<Integer> list_limitedto3Nos = descending_mappedList.stream().limit(3).toList();
        System.out.println("Stream list limited to 3 numbers: " + list_limitedto3Nos);

        //skip() to skip the numbers from the list from the first
        List<Integer> list_skippedFromFirst = list_limitedto3Nos.stream().skip(1).toList();
        System.out.println("Stream list skip() from first: " + list_skippedFromFirst);

        //Stream.iterate() to print numbers from 0 to 100 not infinite stream as limit is applied and skip the first number
        Stream.iterate(0, n -> n + 1)
                .limit(101)
                .skip(1) //skip the first number 0
                .forEach(num -> System.out.print(num + ","));

        //Get distinct/unique numbers from the list
        List<Integer> listWithDuplicates = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
        List<Integer> listWithDistinct = listWithDuplicates
                .stream() //convert list to stream
                .distinct() //distinct() returns a stream of distinct elements
                .toList(); //collect the stream to a list

        System.out.println("\nList with duplicates: " + listWithDuplicates);
        System.out.println("List with distinct numbers: " + listWithDistinct);

//Terminal operations
// count(), sum(), average(), max(), min(), toList(), findFirst(), findAny(),
// anyMatch(), allMatch(), noneMatch(), forEach(), collect(), reduce(), etc.

        //Terminal operation to get the sum of the list
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of the list: " + sum);

        //Terminal operation to get the average of the list
        double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Average of the list: " + avg);

        //Terminal operation to get the count of the list
        long count = list.stream().count();

        //Terminal operation to get the max of the list
        int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("Max of the list: " + max);

        //Terminal operation to get the min of the list
        int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("Min of the list: " + min);

        //Terminal operation to get the first element of the list
        int first = list.stream().findFirst().get();
        System.out.println("First element of the list: " + first);

        //Terminal operation to get the last element of the list
        //reduce() is used to reduce the elements of the stream to a single value
        //reduce() takes a BinaryOperator as an argument
        //BinaryOperator is a functional interface that takes two arguments and returns a single value
        //reduce() takes two arguments, first argument is the initial value and second argument is a lambda expression
        //reduce() returns an Optional
        //Optional is a container object that may or may not contain a non-null value
        //Optional.get() returns the value if present, otherwise throws NoSuchElementException
        int last = list.stream().reduce((firstElement, secondElement) -> secondElement).get();
        System.out.println("Last element of the list: " + last);
    }
}

/*
Summary
- Stream API is introduced in Java8 to process collections of objects.
- Stream API provides a functional approach to process collections of objects.
 */

/*
        Intermediate Operations
        - Intermediate operations are operations that are applied to the stream and return a new stream.
        - Intermediate operations are lazy-loaded, which means they are not executed until a terminal operation is invoked.
        - Intermediate operations are filter, map, flatMap, distinct, sorted, limit, skip, etc.
        - Intermediate operations are used to transform the elements of the stream.
        - Intermediate operations are used to filter the elements of the stream.
        - Intermediate operations are used to sort the elements of the stream.
        - Intermediate operations are used to limit the elements of the stream.
        - Intermediate operations are used to skip the elements of the stream.
        - Intermediate operations are used to get distinct elements from the stream.

        Terminal Operations
        - Terminal operations are operations that are applied to the stream and return a result.
        - Terminal operations are executed only when a terminal operation is invoked.
        - Terminal operations are forEach, collect, reduce, count, findFirst, findAny, anyMatch, allMatch, noneMatch, etc.
        - Terminal operations are used to perform a final operation on the stream.
        - Terminal operations are used to collect the elements of the stream.
        - Terminal operations are used to reduce the elements of the stream.
        - Terminal operations are used to count the elements of the stream.
        - Terminal operations are used to find the first element of the stream.
        - Terminal operations are used to find any element of the stream.
        - Terminal operations are used to check if any element of the stream matches the condition.
        - Terminal operations are used to check if all elements of the stream match the condition.
        - Terminal operations are used to check if none of the elements of the stream match the condition.
*/
