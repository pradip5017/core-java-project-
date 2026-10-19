package Interview_Question_practice;
import java.util.Scanner;
public class InputArray_practice {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Enter array Element..!!");
		num= sc.nextInt();				
		System.out.println("Enter array number");
		int x[]= new int[num];
		
		for(int i=0; i<num; i++)
		{
			x[i]= sc.nextInt();
		}
		
		System.out.println("Array Element is ..!!");
		for(int i=0; i<num; i++)
		{
			System.out.print(x[i]+" ");
		}
	}
	
}
