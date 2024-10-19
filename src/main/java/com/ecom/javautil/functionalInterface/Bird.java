package com.ecom.javautil.functionalInterface;

@FunctionalInterface //Functional Interface annotation validates functional interface having "only one abstract method"
public interface Bird {
    void canFly(String birdType); //One Abstract method declaration

    //void canRun(); //Functional Interface should have only one abstract method declared above

    String toString(); //Object class method is allowed in functional interface

    //From Java8: Interface can have "default and static method implementation"
    default void canSwim() {
        System.out.println("Bird can swim");
    } //default method is allowed in functional interface

    static void canWalk() {
        System.out.println("Bird can walk");
    } //static method is allowed in functional interface

}

         /*Summary
1. Functional Interface is an interface with only one abstract method.
2. @FunctionalInterface annotation is used to validate the interface as functional interface.
3. From Java8 onwards: Interface can have "default and static method implementation"
4. Object class methods, default methods and static methods are allowed in functional interface.
          */

/*
Static variables
Use the static variable for the property that is common to all objects of the class.
For example, the company name of employees, the college name of students, etc.

Static Methods
Use Static methods to access and changing the value of static variables.

We only have nested static classes in Java. We can't have a top-level class as static class.
 */
