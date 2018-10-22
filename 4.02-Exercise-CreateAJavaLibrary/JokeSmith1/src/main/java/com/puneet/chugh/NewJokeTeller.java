package com.puneet.chugh;

import com.example.puneetchugh.modulejoke.MyClass;

public class NewJokeTeller{

    public String getJoke(){
        JokeSmith jokeSmith = new JokeSmith();
        MyClass myClass = new MyClass();
        return "How many blondes does it take to screw in a lightbulb? Need to know ASAP.\n" +
                "\n" +
                "@RobinMcCauley";
    }
}