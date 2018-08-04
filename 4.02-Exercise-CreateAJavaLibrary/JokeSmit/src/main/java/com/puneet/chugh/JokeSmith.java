package com.puneet.chugh;

import java.lang.String;

import com.example.puneetchugh.modulejoke.MyClass;

public class JokeSmith{
	public String getJoke(){

		MyClass moduleJoke = new MyClass(); //Its from the other library ModuleJoke, added its dependency on this project's build.gradle dependency
		return "There was once a man named Odd. People made fun of him because of his name so he decided to keep his gravestone blank when he died.Now when people pass by the burial site, they point and say, That's odd.";
	}
}
