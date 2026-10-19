package Interview_Question_practice;
import java.util.*;
public class DublicateRemoveString {
	public static void main(String args[])
	{
		// remove dublicate Charector..!!
		/*
		String s1 ="madam";
		
		String result ="";
		
		for(int  i=0; i<s1.length(); i++)
		{
			char ch =s1.charAt(i);
			if(result.indexOf(ch)==-1)
			{
				result += ch;
			}
		}
		System.out.println(result);
		*/
		
		
		//...................................
		// find dublicate Charector in string
		
		/*
		String s1 ="programming";
		
		String result = "";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(s1.indexOf(ch)!= s1.lastIndexOf(ch))
			{
			if(result.indexOf(ch)==-1)
			{
				result +=ch;
			}
			}
		}
		System.out.println(result);	
		*/
		
		
		//.......................
		// PairSume of Two number and sum = 10; 
		/*
		int arr[]= {2,3,5,7,8,9,3,1,6,7};  //k =10
		
		int target =10;
		int count =0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i]+" + "+arr[j]+" = "+target);
					count++;
				}
			}
		}
		System.out.println("Count Of Sum :"+count);
		*/
		
		
		
		// pattern 
		/*
		int n =5;
		

		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		
		
		//....................
		// swap a 2 array
		
		/*
		int a[]= {1,2,3,4,5};
		int b[]= {9,8,7,6,5};
		
		int temp[]= a;
		a =b;
		b = temp;
		
		System.out.print("A Array:");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		System.out.print("\nB Array:");
		for(int x:b)
		{
			System.out.print(x+" ");
		}
		*/
		
		
		//....................
		//find out highest repeated charector 
		
		/*
		String s1 = "loredmidsjfhskjhdfidjf";
		
		int arr[]= new int[222];
		for(int i=0; i<s1.length(); i++)
		{
			arr[s1.charAt(i)]= arr[s1.charAt(i)]+1;
		}
		int max =-1;
		char c =' ';
		for(int i=0; i<s1.length(); i++)
		{
			if(max < arr[s1.charAt(i)])
			{
				max = arr[s1.charAt(i)];
				c= s1.charAt(i);
			}
		}
		System.out.println("Multiple Charector :"+c);
		System.out.println("Maximum :"+max);
		*/
		
		//  palindrom 
		
		int num = 12321;
		
		int temp = num ;
		
		int rev =0;
		
		while( num > 0)
		{
			rev = rev * 10 + num %10;
			num = num /10;
		}
		if(temp == rev)
		{
			System.out.println("True :"+temp);
		}
		else
		{
		System.out.println("False :"+temp);
		}
	}
}
