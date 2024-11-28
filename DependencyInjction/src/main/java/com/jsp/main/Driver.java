package com.jsp.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.pojo.Student;
public class Driver {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("NewFile.xml");
		Student student= factory.getBean("Kapil",Student.class);
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAge());
	}
}
