package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Armor;
import com.revature.beans.Hero;

public class Application {
	public static void main(String[] args) {

		ApplicationContext applicationContext = 
					new ClassPathXmlApplicationContext("beans.xml");
		
		Hero dylan = applicationContext.getBean(Hero.class);
		System.out.println(dylan);
		
		Hero dylan2 = applicationContext.getBean(Hero.class);
		System.out.println(dylan2 == dylan);
		
	}
}
