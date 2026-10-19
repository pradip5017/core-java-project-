package Interview_Question_practice;

public class Multiplication_Questio_in_Array1 {
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5};  //1-2= -1, -1-3=-4, -4-4=-8, -8-5=-13
		int add=0;
		int mult =1;
		for(int i=0; i<arr.length; i++)
		{
			
			add = add +arr[i];
			mult  *= arr[i];
		}
		System.out.println("Addition : "+add);
		System.out.println("Multiplication :"+mult);
		double avarage = add / arr.length;
		System.out.println("Avarage :"+avarage);
	
		
		
	}

}
