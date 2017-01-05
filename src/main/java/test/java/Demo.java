package test.java;

/**
 * Created by 26297 on 2017/1/3.
 */
class Father{
	//static int k ;
	/*static (
			k = 5;
			System.out.println(k);
			)*/
	int i = 1;
	void printI(){
		System.out.println(i);
	}
	{
		i = 2;
		System.out.println(i);
	}
	Father(){
		i = 3;
		System.out.println(i);
	}

}

class Son extends Father{
	int j;
	{
		i = 4;
		System.out.println(i);
	}

	Son(){
		i = 5;
		System.out.println(i);
	}
}
/* static  {
	 k = 6;
	 System.out.println(k );
 }
 }*/
public class Demo{


	public static void main(String[] args){

		Son s = new Son();
		s.printI();

	}
}