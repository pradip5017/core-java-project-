package Interview_BasicArrayQuestion;
//dublicate Charector find out in String
public class DublicateElementCount3 {
	public static void main(String[] args) {
		
		int arr[]= {1,4,6,8,8,4,5,7,9,0,4,5,7,3};
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
				System.out.println("Occur :"+arr[i]+" count :"+count);
			}
		}
		

	}

}