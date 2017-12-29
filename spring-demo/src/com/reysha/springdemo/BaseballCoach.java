package com.reysha.springdemo;

public class BaseballCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout(){
		return "Baseball: Do daily 30 mins workout";

	}

	@Override
	public String getDailyFortune() {

		// use my FortuneSrvice to get a fortune
			
		return fortuneService.getFortune();
	}
}
