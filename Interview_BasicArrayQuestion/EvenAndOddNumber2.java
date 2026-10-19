package Interview_BasicArrayQuestion;

public class EvenAndOddNumber2 {
	public static void main(String args[])
	{
		int arr[]= {23,21,23,22,45,34,32,36,89};
		int leader =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>leader)
			{
				leader =+ arr[i];
				System.out.print(leader+" ");
			}
		}
	
	}

}
