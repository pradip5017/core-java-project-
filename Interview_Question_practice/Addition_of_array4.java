package Interview_Question_practice;

public class Addition_of_array4 {

	public static void main(String args[])
	{
		int arr[]= {1,4,6,8,9,4,6,27,89};
		int sum =0;
		int mul =1;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum +arr[i];
			mul = mul *arr[i];			
		}
		System.out.println("Sum of Array :"+sum);
		System.out.println("Multiplicatio of Array :"+mul);
		
		double avarage = sum = sum /arr.length;
		System.out.println("Division of Array :"+avarage);
	}
	
	
}
