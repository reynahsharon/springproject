package com.reysha.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	
	String[] rf = {"You can take a break of 5 minutes", "You can take a break of 30 minutes", "You can take a break of 1 hour"};


	@Override
	public String getFortune() {
		Random random = new Random();
		int index = random.nextInt(rf.length);
		return rf[index];
	}

}
