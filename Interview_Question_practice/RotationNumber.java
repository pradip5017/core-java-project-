package Interview_Question_practice;

public class RotationNumber {

	public static void main(String args[])
	
	{
		int num = 121;
		
		int lastDigit =num %10; // get last index
		
		int remaining = num /10;   //remove last index
	
		int rotal = lastDigit * 100 + remaining;
		
		System.out.println(rotal);
		System.out.println(lastDigit);
		System.out.println(remaining);
	}
}
