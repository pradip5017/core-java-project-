	package Interview_Question_practice;
	import java.util.Scanner;
	public class InputArray {
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			
			int num ;
			
			System.out.println("Enter number of Array..");
			
			num = sc.nextInt();
			int a[] = new int  [num];
			
			System.out.println(" Enter Array Element");
			for(int i=0; i<num; i++)
			{
				a[i]= sc.nextInt();
			}
			
			System.out.println("Array Element..!!");
			for(int i=0; i<num; i++)
			{
				System.out.println(a[i]);
			}
		}
	
	}
