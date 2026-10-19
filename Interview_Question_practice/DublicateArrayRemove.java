package Interview_Question_practice;
import java.util.*;
public class DublicateArrayRemove {
	public static void main(String[] args) {
		
	
//	int arr[]= {1,2,5,4,6,7,3,5,7,8,2,5,7};
		String str ="programming";
		String result ="";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(result.indexOf(ch)==-1)
			{
				result += ch;
			}
		}
		System.out.println(result);
}
}

