package com.udacity.gradle.jokes;

public class Joker {
    public String getJoke() {
        return "This is totally a funny joke";
    }

    public static void main(String[] args){
	
	Joker joker = new Joker();
	System.out.println(joker.getJoke());
    }
}
