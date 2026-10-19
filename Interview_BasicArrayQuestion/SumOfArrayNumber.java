package Interview_BasicArrayQuestion;

public class SumOfArrayNumber {
	public static void main(String[] args) {
		int arr[]= {1,2,5,-8,9,-5,7};
		int sum =0;
		int mul =1;
		int sub = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum +arr[i];
			mul = mul * arr[i];
			sub = sub - arr[i];
		}
		System.out.println("sum of Array:"+sum);
		System.out.println("Multiplication of Array :"+mul);
		System.out.println("Subtraction of Array:"+sub);
		
		double avarage = sum = sum / arr.length;
		System.out.println("Avarage :"+avarage);
	}

}
