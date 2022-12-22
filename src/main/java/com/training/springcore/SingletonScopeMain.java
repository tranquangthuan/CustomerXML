package com.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.components.PersonSingleton;

public class SingletonScopeMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		PersonSingleton person1 = applicationContext.getBean("personSingleton", PersonSingleton.class);
		person1.setName("Name A");
		PersonSingleton person2 = applicationContext.getBean("personSingleton", PersonSingleton.class);
		System.out.println(person1.getName());
		System.out.println(person2.getName());

		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}
