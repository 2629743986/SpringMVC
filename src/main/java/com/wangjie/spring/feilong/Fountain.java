package com.wangjie.spring.feilong;

import java.util.Arrays;

/**
 * N=6
 * R=10
 * X={1,7,15,20,30,50}
 * Created by 26297 on 2016/12/29.
 */
public class Fountain {
/*
* 给定一些灯(N),每个灯的的照射范围都是固定的,
* 点亮最少的灯,使得全部都被灯光照到
* */
	public static final int N=6;
	public static final int R=10;
	public static final int[] X={1,7,15,20,30,50};
	public static void main(String[] args){

		//先排序
		Arrays.sort(X);
		//转换成区间问题
		 int[][] interval={{-9,17},{-3,17},{5,25},{10,30},{20,40},{40,60}};


	}
}
