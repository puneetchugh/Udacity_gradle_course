package com.udacity.gradle.test;

import com.udacity.gradle.Person;
import org.junit.Test;

public class PersonTest {
    @Test
    public void test() {
        Person person = new Person("Jeremy");
        assert person.getName().equals("Jeremy");
       
    }

    @Test//(expected = NumberFormatException.class)
    public void testMethod(){
	Person person = new Person("Jeremy");
	assert 2468 == person.getCardNumber("2468-1234-5678-9012");
    }

    @Test(expected = NumberFormatException.class)
    public void testMethod1(){
	Person person = new Person("Jeremy");
	person.getCardNumber("abcd-1234-5678-9012");
    }

}
