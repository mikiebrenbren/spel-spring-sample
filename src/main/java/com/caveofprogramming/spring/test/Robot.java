package com.caveofprogramming.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//SPEL spring
@Component
public class Robot {
	
	private int id = 0;
	private String speech = "hello";
	
	public void speak() {
		System.out.println(id + ": " + speech);
	}

    @Autowired
	public void setId(@Value("#{randomText.getText().length()}")int id) {
		this.id = id;
	}

    //TODO: different ways of using SPEL spring
//    @Autowired
//	public void setSpeech(@Value("#{randomText.getText()}")String speech) {
//		this.speech = speech;
//	}
//
//    @Autowired //instantiating classs in spel
//    public void setSpeech(@Value("#{new java.util.Date().toString()}")String speech) {
//        this.speech = speech;
//    }

    @Autowired  //calling a static method inside spel
    public void setSpeech(@Value("#{T(Math).PI}")String speech) {
        this.speech = speech;
    }


    //operators are spelled out in Spel ie || is or etc.  look up spel in spring for
    //more details
	
}
