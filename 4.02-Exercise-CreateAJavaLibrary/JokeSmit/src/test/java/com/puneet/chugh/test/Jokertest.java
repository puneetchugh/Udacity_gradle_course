package com.puneet.chugh.test;

import com.puneet.chugh.JokeSmith;
import org.junit.Test;
public class Jokertest{

        @Test
        public void test(){
                JokeSmith joke = new JokeSmith();
                assert joke.getJoke().length() != 0;
        }
}
