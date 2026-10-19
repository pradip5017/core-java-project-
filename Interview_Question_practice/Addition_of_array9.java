package Interview_Question_practice;

public class Addition_of_array9 {

	public static void main(String args[])
	{
		int arr[]= {12,34,6,1,2,3};
		
		int sum= 0;
		int mul =1;
		
		for(int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
			mul = mul * arr[i];
		}
		System.out.println("Addition of Arrays:"+sum);
		System.out.println("Multipication of Arrays:"+mul);
		
		int avag = sum = sum / arr.length;
		System.out.println("Avarage :"+avag);

		
	}
}
