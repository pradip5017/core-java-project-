package Interview_BasicArrayQuestion;

public class SecoundLargestValueWithout_Sorting {
	public static void main(String[] args) {
		int arr[]= {22,34,65,75,89,23,53};
		
		int first = Integer.MIN_VALUE;
		int secound = Integer.MAX_VALUE;
		
		for(Integer num : arr)
		{
			if(num > first)
			{
			secound = first;
			first = num;
		}
		else if(num > first && num != secound)
		{
			first = num;
		}
		}
		System.out.println(first);
		System.out.println(secound);
	}

}
