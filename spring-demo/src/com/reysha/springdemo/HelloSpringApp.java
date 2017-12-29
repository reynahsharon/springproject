package com.reysha.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// load the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//context.refresh();
		//retrieve the bean from spring container
		Coach theCoach=context.getBean("myCoach", Coach.class);
		
		// call mthods on the bean
		System.out.println(theCoach.getDailyWorkout());
		 

				//lets call our new mtd for fortunes
				System.out.println(theCoach.getDailyFortune());
				
		// close the context
		context.close();
	}

}
