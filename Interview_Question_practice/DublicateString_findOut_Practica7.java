package Interview_Question_practice;
import java.util.*;
public class DublicateString_findOut_Practica7 {
	public static void main (String args[])
	{
	
		String s1 = "Hrushikesh";
		
		String reverse =" ";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			reverse = reverse +s1.charAt(i);
		}
		System.out.println(reverse);
	}
}
