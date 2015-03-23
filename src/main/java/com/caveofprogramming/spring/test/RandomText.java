package com.caveofprogramming.spring.test;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by michaelbrennan on 3/22/15.
 */
@Component
public class RandomText {

    private static String[] text = {
            "I'll be back",
            "Get to the choppa!",
            "Hello robut!!"
    };


    public String getText(){
        Random random = new Random();
//        return null;
        return text[random.nextInt(text.length)];
    }
}
