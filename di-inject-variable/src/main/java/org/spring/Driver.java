package org.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
       public static void main(String[] args) {
    	   BeanFactory factory= new ClassPathXmlApplicationContext("Second_proj.xml");
           Person person = (Person) factory.getBean("personBean");
           person.Use();
    	   
	}
}
