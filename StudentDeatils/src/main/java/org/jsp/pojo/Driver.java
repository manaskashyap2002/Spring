package org.jsp.pojo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
		BeanFactory Factory = new ClassPathXmlApplicationContext("Second_proj.xml");
		Student student = Factory.getBean("myStudent",Student.class);
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAge());
	}
}
