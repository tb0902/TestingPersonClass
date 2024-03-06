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
        name = "";
        age = Integer.MAX_VALUE;

    }

    // This is the default constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void setWearsGlasses(boolean wearsGlasses) {
        this.wearsGlasses = wearsGlasses;
    }

    public void setHasPets(boolean hasPets) {
        this.hasPets = hasPets;
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

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public boolean getWearsGlasses() {
        return wearsGlasses;
    }

    public boolean getHasPets() {
        return hasPets;
    }
}