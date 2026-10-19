package Interview_BasicArrayQuestion;
// dublicate element in two array
public class UniqueValuein_2Array {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6};
		int b[]= {9,8,7,6,5,4};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j =0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
