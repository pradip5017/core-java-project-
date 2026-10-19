package Interview_Question_practice;

public class Multiplication_Questio_in_Array5 {
	public static void main(String args[])
	{
		int arr[]= {1,2,4,6};
		
		int mult =1;
		int add=0;
		for(int i=0; i<arr.length; i++)
		{
			add = add +arr[i];
			mult = mult *arr[i];
		}
		System.out.println("Addition :"+add);
		System.out.println("multiplication :"+mult);
		
		double  avarage = add /arr.length;
		System.out.println("Avarage :"+avarage);
	}

}
