package com.wangjie.spring.feilong;

import java.io.Serializable;

/**
 * Created by 26297 on 2016/12/30.
 */
public class Employee implements Serializable {
	public String name;
	public String address;
	public transient int SSN;
	public int number;
	public void mailCheck()
	{
		System.out.println("Mailing a check to " + name
				+ " " + address);
	}
}
