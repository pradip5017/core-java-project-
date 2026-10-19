package Interview_Question_practice;

import java.util.Arrays;

public class ReversArray {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6,7};
		int b = a.length;
		for(int i=0; i<a.length; i++ )
			
		{
			for(int j=a.length-1; j>=0; j--)
			{
				int t=a[i]; 
				 a[i]=a[j];
				 a[j]=t;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
