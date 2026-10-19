package Interview_Question_practice;

public class DublicateString_findOut_Practica16 {
	public static void main(String args[])
	{
		String s1 = "programming";

		int arr[]=new int[222];
		for(int i=0; i<s1.length(); i++)
		{
			arr[s1.charAt(i)]= arr[s1.charAt(i)]+1;
		}
		int max =-1;
		char ch =' ';
		for(int i=0; i<s1.length(); i++)
		{
			if(max < arr[s1.charAt(i)])
			{
				max = arr[s1.charAt(i)];
				ch = s1.charAt(i);
			}
		}
		System.out.println("Dublicate :"+ch);
		System.out.println("Max:"+max);
	}

}
