package Interview_BasicArrayQuestion;

public class CountCharectorInString4 {
	public static void main(String[] args) {
		int arr[]= {1,9,2,4,2,3,1,6,4,7,1,5,7,8,9};
		int count;
		for(int i=0; i<arr.length; i++)
		{
			count =1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=-1;
					
				}
			}
			if(arr[i]!=-1)
			{
				System.out.println("Occure :"+arr[i]+" count :"+count);
			}
		}
	}

}
