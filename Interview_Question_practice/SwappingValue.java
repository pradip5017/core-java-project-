package Interview_Question_practice;

public class SwappingValue {
	public static void main(String args[])
	{
		int a =10;  //a =20
		int b = 20;  // b=10
		
	
		//swappin of two number
		a=a+b;  //30
		b=a-b;  //10
		a=a-b;	//20
		
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	}
}
