package com.jsp.pojo;

public class testtestcfg {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("configurefile.xml");
		Student student= factory.getBean("Kapil",Student.class);
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAge());
	}


}
