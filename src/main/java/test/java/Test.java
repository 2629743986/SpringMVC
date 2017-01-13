package test.java;

import com.wangjie.spring.model.User;

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

	@org.junit.Test
	public void testGeneric() {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("abc");
		for (String object : list) {
			object = "55";
		}

		int a = 0;
	}

	@org.junit.Test
	public void testGeneric2() {
		List<User> list = new ArrayList<User>();
		list.add(new User("1"));
		list.add(new User("2"));
		list.add(new User("3"));
		System.out.println("888");
		System.out.println(list);
		/*for (User user : list){
			user= new User("4");
		}*/
		System.out.println(list);
		int a = 0;
	}

	interface Info<T>{
		public T getVar();
	}

	class InfoImpl<T> implements Info<T>{
		private T var;
		public InfoImpl(T var){
			this.setVar(var);
		}

		public T getVar(){
			return this.var;
		}

		public void setVar(T var) {
			this.var = var;
		}
	}












}
