package scannerClass;

// array inpute value for user
	import java.util.Scanner;
public class array_use_Input_Value_practic {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter User Elements");
		
		num = sc.nextInt();
		
		int a []= new int[num];
		
		System.out.println("Enter User Numbers");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("User numbers is");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
