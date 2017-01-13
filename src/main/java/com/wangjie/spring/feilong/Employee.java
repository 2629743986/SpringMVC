package com.wangjie.spring.feilong;

import org.junit.Test;

import java.io.Serializable;

/**
 * Created by 26297 on 2016/12/30.
 */
public class Employee implements Serializable {
	public String name;
	public String address;
	public transient int SSN;
	public int number;

	@Test
	public void mailCheck()
	{

		int a = 2;
		String b = "123";

		switch (b) {
			case "3":
				System.out.println("23");
				break;
			case "2":
				System.out.println("2");
				System.out.println("3244");
				break;
			default:
				System.out.println("22222");
		}
	}


}
