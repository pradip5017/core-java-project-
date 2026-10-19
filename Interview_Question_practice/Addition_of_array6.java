package Interview_Question_practice;

public class Addition_of_array6 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		
		int add = 0;
		int mult = 1;
		
		for(int i=0; i<arr.length; i++)
		{
			 add = add +arr[i];
			 mult = mult *arr[i];
		}
		System.out.println("Addition is :"+add);
		System.out.println("Multiplication = "+mult);
		
		double avarage = add / arr.length;
	
		System.out.println("Avarage :"+avarage);
	}

}
