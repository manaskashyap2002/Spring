package com.jsp.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.pojo.Person;

public class Mainclass {
	public static void main(String[] args) {
		BeanFactory factory= new ClassPathXmlApplicationContext("configuration.xml");
		Person person=(Person) factory.getBean("myPerson");
		person.display();
		
	}

}
