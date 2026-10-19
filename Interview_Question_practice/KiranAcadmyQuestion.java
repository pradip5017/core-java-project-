package Interview_Question_practice;

public class KiranAcadmyQuestion {
	public static void main(String[] args) {
		
		String s1 ="I am Pradip Rathod @ pune";
		
		String str[]= s1.split(" ");
		
		
			System.out.println("How many Space in String :"+str.length);
		
			for(int i=0; i<str.length; i++)
			{
				System.out.println("Word:"+str[i]);
			}
			
	}

}
