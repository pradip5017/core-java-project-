package Interview_BasicArrayQuestion;
// find out missing element in array - like 1 4 6 10 12 
public class missingNumberInArray {

	public static void main(String[] args) {
		
		int arr[]= {2,3,5,7,8,9,11,13};
		
		int num = 13;
		for(int i=1; i<=num; i++)
		{
			boolean b1 = false;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[j]==i)
				{
					b1 = true;
					break;
				}
			}
			if(!b1)
			{
				System.out.print(i+" ");
			}
		}
	}
}
