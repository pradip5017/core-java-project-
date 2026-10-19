package Abstraction;
import java.util.*;
public class PlainGrom {
	public static void main(String args[])
	
	{
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		
		int temp[]= a;
		a=b;
		b=temp;
		
		System.out.print("A Array:");
		for(int x :a)
		{
			System.out.print(x+" ");
		}
		System.out.print("\nB Array:");
		for(int x:b)
		{
			System.out.print(x+" ");
		}
		
	}

}