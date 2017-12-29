package com.reysha.springdemo;

public class CricketCoach implements Coach{
	//add new fields for email id and team
	private String emailAddress;
	private String team;
	
	//create sette mtds for theemailid and name
	
	//private FortuneService fortuneService;
	 public String getEmailAddress() {
		return emailAddress;
	}
	 
	 private RandomFortuneService randomFortuneService;
	 
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket: inside setter mtd for email addr");

		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("Cricket: inside setter mtd for team");

		this.team = team;
	}
	@Override
		public String getDailyWorkout() {
			// TODO Auto-generated method stub
			return "Cricket: Hit 100 runs daily";
		}
// create a no arg constructor
	 public CricketCoach()
	 {
		 System.out.println("CricketCoach: inside no arg constructor");
	 }
//	//our setter mtd called by spring when they inject dependency 
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("Cricket: inside setter mtd for fortuneservice");
//		this.fortuneService = fortuneService;
//	}
	
//	@Override
//	public String getDailyFortune() {
//		// TODO Auto-generated method stub
//		return fortuneService.getFortune();
//	}
//	
	//our setter mtd called by spring when they inject dependency 
		public void setRandomFortuneService(RandomFortuneService randomFortuneService) {
			System.out.println("Cricket: inside setter mtd for random fortuneservice");
			this.randomFortuneService = randomFortuneService;
		}
		
		@Override
		public String getDailyFortune() {
			// TODO Auto-generated method stub
			return randomFortuneService.getFortune();
		}
}
