	package Array;
	
	import java.util.Scanner;
	
	public class Taking_array_from_user {
		public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
			
			int size;
			System.out.println("Enter the size of an array=");
			
			size =sc.nextInt();
			
			int a []= new int [size];
			
			
			
			System.out.println("Enter the value of A=");
			
			for(int i=0; i<a.length; i++)
			{
				a[i]= sc.nextInt();
	//			System.out.println(a[i]);
			}
			
			System.out.println("Array Elements: ");
			
			for(int i=0; i<a.length; i++)
			{
				System.out.println(a[i]);
			}
			
		}
	
	}