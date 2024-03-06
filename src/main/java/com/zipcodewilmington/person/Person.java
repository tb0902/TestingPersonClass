package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private char middleInitial;
    private int heightInches;
    private String favoriteFood;
    private boolean wearsGlasses;
    private boolean hasPets;
// the above defines the STATE of the person.

    public Person() {

    }
    public Person(String name, int age) {
       this.name = name;
       this.age = age;
    // This is the default constructor
    }

// the above INITIALIZES the variables DEFINED in the state.
    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }
// Below is the constructor with everything else

// Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
// Getters
    public String getName() {

        return name;
    }

    public Integer getAge() {

        return age;
    }

    public char getMiddleInitial() {

        return middleInitial;
    }

    public Integer getHeightInches() {

        return heightInches;
    }
}