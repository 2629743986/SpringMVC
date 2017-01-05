package com.wangjie.spring.feilong;

/**
 * 在编译时期,是无法知道K和V具体是什么类型,只有在运行时才会真正
 * 根据类型来构造和分配内存
 *
 * 泛型提供了编译时类型安全监测机制,该机制允许程序员在编译时
 * 检测到非法的类型
 * 泛型的本职是参数化类型,也就是说所操作的数据类型被注定为一个参数
 * Created by 26297 on 2016/12/30.
 */
public class GenericParadigm<K,V> {

	private K key;
	private V value;

	public GenericParadigm(K k,V v){
		key=k;
		value=v;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}


