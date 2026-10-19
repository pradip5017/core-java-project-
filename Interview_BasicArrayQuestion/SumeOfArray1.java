package Interview_BasicArrayQuestion;

public class SumeOfArray1 {
	public static void main(String[] args) {
		int arr[]= {2,4,7,9,5,8,3,6};
		
		int sum =0;
		int mul =1;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum +arr[i];
			mul = mul * arr[i];
		}
		System.out.println("addition "+sum);
		System.out.println("Multiplication :"+mul);
		double div= sum = sum / arr.length;
		System.out.println("Division :"+div);
				
	}

}
