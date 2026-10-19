package Interview_BasicArrayQuestion;

public class SecoundLargestValue_With_Sorting3 {
	public static void main(String[] args) {
		int arr[]= {41,2,3,55,24,54,586,5,23,5,34};
		
		int first = 0;
		int secound =0;
		
		for(int n : arr)
		{
			if(n > first)
			{
				secound = first;
				first = n;
			}else if(n > secound && n!=first)
			{
				secound = n;
			}
		}
		System.out.println("First Highest Element :"+first);
		System.out.println("Secound Highest element:"+secound);
	}

}
