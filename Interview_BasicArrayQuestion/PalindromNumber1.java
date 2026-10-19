package Interview_BasicArrayQuestion;

public class PalindromNumber1 {
	public static void main(String[] args) {
		
		int num = 12321;
		int target = num;
		int rev = 0;
		
		while(num > 0)
		{	
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if(target==rev)
		{
			System.out.println("true :"+target);
		}
		else
		{
			System.out.println("false :"+target);
		}	
	}

}
