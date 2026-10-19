package Interview_BasicArrayQuestion;

public class FactorialQuesion {
	public static void main(String[] args) {
		
		int num = 20;
		int fact = 1;
		
		for(int i=0; i<=num;  i++)
		{
			fact = fact * i;
		}
		System.out.println("Factoriam :"+num+" is :"+fact);
	}

}
