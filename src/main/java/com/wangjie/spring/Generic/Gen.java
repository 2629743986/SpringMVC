package com.wangjie.spring.Generic;

/**
 * Created by 26297 on 2016/12/30.
 */
public class Gen<T> {
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	public static void main(String[] args){
		Gen<String> gen=new Gen<String>();
		gen.setObj("abc");

	}
}
