package Interview_Question_practice;

public class Addition_of_array3 {

	public static void main(String args[])
	{
		int arr[]= {2,3,4,5,6,3,5};
		
		int sum =0;
		int mul = 1;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum +arr[i];
			mul = mul *arr[i];
		}
		System.out.println("Addition of Array :"+sum);
		double avarage = sum/ arr.length;
		System.out.println("Division of Array :"+avarage);
		
		System.out.println("Multiplication of Array :"+mul);
	}
}
