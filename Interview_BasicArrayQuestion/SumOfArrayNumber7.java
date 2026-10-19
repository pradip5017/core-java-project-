package Interview_BasicArrayQuestion;

public class SumOfArrayNumber7 {

	public static void main(String args[])
	{
		int arr[]= {1,3,5,6,8,9};
		
		int add =0;
		int mul =1;
		int sub =0;
		for(int i=0; i<arr.length; i++)
		{
			add = add +arr[i];
			mul = mul +arr[i];
			sub = sub +arr[i];
		}
		System.out.println("Addition :"+add);
		System.out.println("Multiplication:"+mul);
		System.out.println("Subtraction :"+sub);
		
		int avarage = add = add / arr.length;
		System.out.println("Avarage :"+avarage);
	}
}
