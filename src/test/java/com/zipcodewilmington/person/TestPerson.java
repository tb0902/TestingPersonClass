package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMiddleInitial() {
        // Given
        Person person = new Person();
        char expected = 'b';

        // When
        person.setMiddleInitial(expected);

        // Then
        char actual = person.getMiddleInitial();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHeightInches() {
        // Given
        Person person = new Person();
        Integer expected = 72;

        // When
        person.setHeightInches(expected);

        // Then
        Integer actual = person.getHeightInches();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFavoriteFood() {
        // Given
        Person person = new Person();
        String expected = "Pizza";

        // When
        person.setFavoriteFood(expected);

        // Then
        String actual = person.getFavoriteFood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWearsGlasses() {
        // Given
        Person person = new Person();
        Boolean expected = true;

        // When
        person.setWearsGlasses(expected);

        // Then
        Boolean actual = person.getWearsGlasses();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHasPets() {
        // Given
        Person person = new Person();
        boolean expected = false;

        // When
        person.setHasPets(expected);

        // Then
        Boolean actual = person.getHasPets();
        Assert.assertEquals(expected, actual);
    }
}