package Interview_Question_practice;
import java.util.*;

// remove Dublicate Element String
public class Thinkitive1 {
	public static void main(String arr[])
	
	{
		String s1 ="Programming";
		String result ="";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(result.indexOf(ch)==-1)
			{
				result +=ch;
				
			}
		}
		System.out.println(result);
	}
}
