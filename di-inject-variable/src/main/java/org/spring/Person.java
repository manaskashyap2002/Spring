package org.spring;

public class Person {
	  private Mobile mobile;
	  public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	public void  Use() {
		System.out.println("Person is using phone");
		mobile.Ring();
	}
      
	

	
}
