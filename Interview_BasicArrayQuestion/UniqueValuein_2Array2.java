package Interview_BasicArrayQuestion;

public class UniqueValuein_2Array2 {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,7};
		int b[]= {3,4,7,8,9,2};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					
					System.out.print(b[j]+" ");
				}
			}
		}
	}

}
