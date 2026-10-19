package Interview_BasicArrayQuestion;

public class EvenAndOddNumber {
	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,6,78,9};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] %2 ==0)
			{
				System.out.println("Even Number :"+arr[i]);
			}
			else
			{
				System.out.println("Odd Number :"+arr[i]);
			}
		}
	}

}
