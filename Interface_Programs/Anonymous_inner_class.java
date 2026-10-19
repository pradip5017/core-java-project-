package Interface_Programs;


interface Test
{
	void show();
}

public class Anonymous_inner_class {
	public static void main(String args[])
	{
		Test t1 = new Test()
		{
			public void show()
			{
				System.out.println("the show is");
				
			}
			
		};
		t1.show();
	}

}
