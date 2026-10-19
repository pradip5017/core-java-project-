package Interview_Question_practice;

public class Multiplication_Questio_in_Array {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		int mult = 1;
		for(Integer num :arr )
		{
			mult *= num;
		}
		System.out.println(mult);
		
	}

}
