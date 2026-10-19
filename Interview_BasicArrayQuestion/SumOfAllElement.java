package Interview_BasicArrayQuestion;

public class SumOfAllElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int sum = 0;
		int mul =1;
		int sub=0;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum +arr[i];
			mul=mul *arr[i];
			
			sub = sub - arr[i];
		}
		System.out.println("Addition :"+sum);
		System.out.println("Multiplication :"+mul);
		System.out.println("Subtraction :"+sub);
		
		double div = sum = sum / arr.length;
		System.out.println("Division :"+div);
	}
}
