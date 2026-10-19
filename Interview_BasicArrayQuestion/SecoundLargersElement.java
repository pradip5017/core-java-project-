package Interview_BasicArrayQuestion;

public class SecoundLargersElement {
	public static void main(String[] args) {
		
		int arr[]= {2,4,6,9,8,4,6,2,5,8};
		
//		int num=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<  arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
//					
				}
			}
		}
//		System.out.println(arr[1]);
		for(int n : arr)
		{
			System.out.print(n+" ");
		}
	}

}
