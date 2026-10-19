package Interview_Question_practice;

public class Addition_of_array2 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};  //1+2=3,3+3=6, 6+4=10; 10+5=15
									//2*3=6, 6*4=24, 24*5=120
		int num = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			num = num +arr[i];
			
		}
		System.out.println(num);
		double avarage = num / arr.length;
		System.out.println(avarage);
		
		
	}

}
