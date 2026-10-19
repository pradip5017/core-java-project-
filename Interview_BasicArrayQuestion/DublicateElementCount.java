package Interview_BasicArrayQuestion;

public class DublicateElementCount {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,2,3,4,4,3,5,6,3,2,3,5,3};
		
		int count;
		for(int i=0; i<arr.length; i++)
		{
			count =1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j] =-1;
				}
			}
			if(arr[i]!= -1)
				System.out.println(arr[i]+" occure "+count+" Times");
		}
	}

}
