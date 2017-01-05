package test.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 26297 on 2016/12/28.
 */
public class Test {
	public static void main(String[] args){
		 String s="helloworld";
		String temp=s.substring(1,4);
		System.out.println(temp);
	}

	public static Object getStudent(){
		return new Object();
	}
	@org.junit.Test
	public void testStudent(){

	}
	interface Info<T>{
		public T getVar();
	}

	class InfoImpl<T> implements Info<T>{
		private T var;
		public InfoImpl(T var){
			this.setVar(var);
		}

		public void setVar(T var){
			this.var=var;
		}
		public T getVar(){
			return this.var;
		}
	}

	@org.junit.Test
	public void testGeneric(){
		List<String> list=new ArrayList<String>();
		list.add("abc");
		for (String object : list){
			System.out.println(object);

		}
	}












}
