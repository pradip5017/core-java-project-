package Interview_BasicArrayQuestion;

public class SumOfArrayNumber1 {
	public static void main(String[] args) {
		
	
	int arr[]= {2,3,4,5,6,8};
	
	int sum =0;
	int mul =1;
	for(int i=0; i<arr.length; i++)
	{
		
		sum = sum +arr[i];
		mul = mul * arr[i];
	}
	System.out.println("Addition :"+sum);
	System.out.println("Multiplication :"+mul);
	
	double avarage = sum = sum / arr.length;
	System.out.println("Avarage of Array :"+avarage);
}
}
