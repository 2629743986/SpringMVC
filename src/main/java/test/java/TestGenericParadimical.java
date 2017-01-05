package test.java;

import com.wangjie.spring.feilong.Employee;
import com.wangjie.spring.feilong.GenericParadigm;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by 26297 on 2016/12/30.
 */
public class TestGenericParadimical {

	@org.junit.Test
	public void testGP(){
		GenericParadigm<String ,String> c1=
				new GenericParadigm<String, String>("Bary","Alen");

	}

	public static <T> void out(T t){
		System.out.println(t);
	}

	@org.junit.Test
	public void testOut(){
		out("I am the falsh");
	}

	public static <T> void outMore(T... args){
		for(T t: args)
			System.out.println(t);
	}
	@org.junit.Test
	public void testOutMore(){
		outMore("I","Love","You");
	}

	public static <T extends Comparable<T>> T maximun(T x,T y){
		T max=x;
		if(y.compareTo(max)>0){
			max=y;
		}
		return max;
	}


	@org.junit.Test
	public void testSerialize(){
		Employee e=new Employee();
		e.name = "Reyan Ali";
		e.address = "Phokka Kuan, Ambehta Peer";
		e.SSN = 11122333;
		e.number = 101;

		try {
			FileOutputStream fileOut=
					new FileOutputStream("G:\\Maven\\jiejie2016-SpringMvc-master\\SpringMvc\\src\\main\\resources\\tmp\\employee.ser");
			ObjectOutputStream out=
					new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in /tmp/employee.ser");
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}


	@org.junit.Test
	public void testMore(){

	}
}
