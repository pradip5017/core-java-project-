package Interview_BasicArrayQuestion;

public class FindOutComanElementOfTwoArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {7,3,4,8,9};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
