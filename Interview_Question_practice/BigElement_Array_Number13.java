package Interview_Question_practice;

public class BigElement_Array_Number13 {
	public static void main(String args[])
	{
		 int arr[]= {1,34,54,23,67,86,45,2,7,8};
		 
		 int max = arr[0];
		 for(int i=0; i<arr.length; i++)
			 
		 {
			 if(arr[i] > max)
			 {
				 max = arr[i];
			 }
		 }
		 System.out.println("Max Number :"+max);
	
	}

}
