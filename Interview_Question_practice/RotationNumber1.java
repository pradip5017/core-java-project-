package Interview_Question_practice;

public class RotationNumber1 {
	public static void main(String[] args) {
//		int num =121;
//		int lastDigit = num %10;
//		int remaining = num /10;
//		
//		int rotat = lastDigit * 100 + remaining;
//		
//		System.out.println(lastDigit);
//		System.out.println(remaining);
//		System.out.println(rotat);
		
		int num = 121;
		
		int result = num % 10;
		
		int remaining = num /10;
		
		int rotate = result * 100 +remaining ;
		
		System.out.println(result);
		System.out.println(remaining);
		System.out.println(rotate);
		
	}
}
