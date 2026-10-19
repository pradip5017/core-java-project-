package StringClass;

public class NumberRotation {
	public static void main(String args[])
	{
		int num = 1212;
	
		
		int lastDigit = num %10;
		int remaining = num /10;
		int rotation = lastDigit * 100 +remaining;
		
		System.out.println(lastDigit);
		System.out.println(remaining);
		System.out.println(rotation);
		
		
	}

}
