package Interview_BasicArrayQuestion;

public class ReverseWord1 {
	public static void main(String[] args) {
		
		String s1 ="pradip Rathod";
	
		String arr[]=s1.split(" ");
		
		for(String wold : arr)
		{
			String revers =" ";
			for(int i=wold.length()-1; i>=0; i--)
			{
				revers = revers +wold.charAt(i);
			}
			System.out.print(revers);
		}
	}

}
