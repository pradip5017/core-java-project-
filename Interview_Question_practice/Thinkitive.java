package Interview_Question_practice;
//Remove duplicate characters from string : "programming
public class Thinkitive {
	public static void main(String args[])
	{
		String s1 = "programming";
		
		int arr[]=new int [222];
		
		for(int i=0; i<s1.length(); i++) {
			
			arr[s1.charAt(i)] = arr[s1.charAt(i)]+1;
		}
		int max =-1;
		char c =' ';
		
		for(int i=0; i<s1.length(); i++)
		{
			if(max < arr[s1.charAt(i)])
			{
				max = arr[s1.charAt(i)];
				c=s1.charAt(i);
			}
		}
		System.out.println(c);
				
	}

}
