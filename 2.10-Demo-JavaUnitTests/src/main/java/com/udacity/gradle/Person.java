package com.udacity.gradle;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCardNumber(String cardNumber) throws NumberFormatException{
	
	String[] numberSets = cardNumber.split("-");

	try{
		int firstDigits = Integer.parseInt(numberSets[0]);
		return firstDigits;
	}catch(NumberFormatException nfe){
		System.out.println("Produced nfe");
		throw nfe;
	}	
	//return 0;
    }
}
