package Interview_BasicArrayQuestion;

public class UniqueValuein_2Array1 {
	public static void main(String[] args) {
		
	int a[]= {1,2,3,4,5,6};
	int b[]= {6,7,4,9,8,3};
	
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
					System.out.print(b[i]+" ");
				}
			}
		}
	}
}
