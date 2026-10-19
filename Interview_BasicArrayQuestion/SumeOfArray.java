package Interview_BasicArrayQuestion;

public class SumeOfArray {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7};
		
		int sum =0;
		int mul =1;
		
		
		for(int i=0; i<arr.length; i++)
		{
			sum = sum +arr[i];
			mul= mul * arr[i];
		}
		System.out.println("Sum of array :"+sum);
		System.out.println("Multiplication of array :"+mul);
		double avarage = sum = sum / arr.length;
		System.out.println("Avarage of arrays: "+avarage);
	}
}
