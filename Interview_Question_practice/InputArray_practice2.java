package Interview_Question_practice;
import java.util.*;
public class InputArray_practice2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Enter Array Elements");
		num=sc.nextInt();
		
		
		int x[]= new int[num];
		System.out.println("Enter the Array Numbers..!!");
		
		for( int i=0; i<num; i++)
		{
			x[i] = sc.nextInt();
		}
		
		System.out.println("Your Array Numbers..!!");
		for(int i=0; i<num; i++)
		{
			System.out.println(x[i]);
		}
	}

}
