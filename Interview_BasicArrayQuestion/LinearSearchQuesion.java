package Interview_BasicArrayQuestion;
//find out 7 number index values
import java.util.*;
public class LinearSearchQuesion {

	 class User
	  {
		  static void put(int arr[] , int target)
		  {
			  boolean bl = true;
			  for(int i=0; i<arr.length; i++)
				{

					if(arr[i]==target)
					{
					
						System.out.println("Index Size :"+i);
						 boolean b1 = false;
					}
		  }
			  if(bl==true)
			  {
				  System.out.println("Number not Found :");
			  }
		  }
		static void put(char ar[], char target)
		{
			for(int i=0; i<ar.length; i++)
			{
				boolean bl = false;
				if(ar[i]==target)
				{
					System.out.println("Charector :"+i);
					 bl = true;
				}
				if(bl==true)
				{
					System.out.println("Charector not Found:");
				}
			}
			
		}
	}
	
	
	public  static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int arr[]= {1,2,3,4,5,6,7,9,45,35,25,53};
		System.out.print("Enter Index values:");
//		int target = 7;
		int target = sc.nextInt();
		User.put(arr, target);
		
		char ar[]= {'a','b','c','d', 'e','f'};
		
		System.out.print("Enter Charector :");
		 char target1 = sc.next().charAt(0);
		 
		 User.put(ar, target1);
		 
	}	
}
