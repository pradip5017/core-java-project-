package Interview_Question_practice;

public class ReverseString_Practical4 {
	public static void main(String arga[])
	{
		String s1 = "Wellcome";
		String reverse = " ";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			reverse = reverse + s1.charAt(i);
		}
		System.out.println(reverse);
	}

}
