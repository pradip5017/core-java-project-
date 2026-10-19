package Interview_BasicArrayQuestion;
// Revers String charector and 
// Reverse String world
public class StringCharectorCount1 {
	public static void main(String[] args) {
//		
//		String s1 ="pradip rathod";
//		int count =0;
//		for(int i=0; i<s1.length(); i++)
//		{
//			count++;
//		}
//		System.out.println("Count :"+count);
	
	
		String s1 = "Hrushikesh Rajput";
		
		String arr[]= s1.split(" ");
		for(String num : arr)
		{
			String result ="";
			for(int i= num.length()-1; i>=0; i--)
			{
				result = result + num.charAt(i);
			}
			System.out.print(result+" ");
		}
	
	}

}
