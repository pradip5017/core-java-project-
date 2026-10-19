package Interview_Question_practice;

public class DuplicateStringData {
	public static void main(String args[])
	{
		String s1  ="pradip";
		
		String s2 = new String();
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2 +=s1.charAt(i); 
		}
			
			
				if(s1.equals(s2))
				{
					System.out.println("True : ");
					
				}else
				{
					System.out.println("False :");
				}
				System.out.println(s2);
						
	}

}
