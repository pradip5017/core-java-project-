package Interview_BasicArrayQuestion;

public class ReverseWord {
	public static void main(String[] args) {
		
		String s1 ="pradip Rathod";
		
		String arr[]=s1.split(" ");
		
		for(String wold : arr)
		{
		for(int i=wold.length()-1; i>=0; i--)
		{
			System.out.print(wold.charAt(i));
		}
		System.out.print(" ");
		}
	}

}
