package Interview_BasicArrayQuestion;

public class Missingnumber01 {
	public static void main(String[] args) {
		int arr[]= {3,0,1,2,5};
		int num = arr[arr.length-1];
		
		for(int i=0; i<=num; i++)
		{
			boolean found = false;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[j]==i)
				{
					found= true;
					break;
				}
				
			}
			if(!found)
			{
				System.out.print(i+" ");
			}
		}
	}

}
