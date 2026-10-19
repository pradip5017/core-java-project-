package Interview_BasicArrayQuestion;

public class Factorial {
	public static void main(String[] args) {
		
		int n = 3;
		float fact = 1 ;
		
		for(int i=1; i<=n; i++)
		{
			fact = fact *i;
		}
		System.out.println("Num :"+n);
		System.out.println("Fact :"+fact);
	}

}
