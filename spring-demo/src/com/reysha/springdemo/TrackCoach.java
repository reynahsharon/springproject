package com.reysha.springdemo;

public class TrackCoach implements Coach {
	// define a private field for the dependency
		private FortuneService fortuneService;
		public TrackCoach() {
			
		}
  @Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Track: Run a hard 5k";
	}

public TrackCoach(FortuneService fortuneService) {
	this.fortuneService = fortuneService;
}

@Override
public String getDailyFortune() {
	// TODO Auto-generated method stub
	return "Just Do It:" +fortuneService.getFortune();
}

}
