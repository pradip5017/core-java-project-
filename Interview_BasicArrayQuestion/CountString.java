package Interview_BasicArrayQuestion;

public class CountString {
	public static void main(String args[])
	{ 
	
		
		String s1 = "Pradip Ankush Rathod";
		int count =0;
		for(int i=0; i<s1.length(); i++)
		{
//			if(s1.charAt(i)!=' ') // not count space of String 
//			{
				count++; // count String with Space of String 
//			}
		}
		
		System.out.println("Total Count :"+count);
	}
}
