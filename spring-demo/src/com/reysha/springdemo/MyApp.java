package com.reysha.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the obj
		//Coach theCoach=new BaseballCoach();
		Coach theCoach=new TrackCoach();

		//use the obj
		System.out.println(theCoach.getDailyWorkout());
	

	}

}
