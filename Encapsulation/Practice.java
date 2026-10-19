package Encapsulation;
 class Emp01 {
	 
	  private static  void put(int a, int b)
	 {
		 System.out.println("This is a put method..!!"+a+b);
	 }
	 
	  private static void get(int a, int b)
	 {
		 System.out.println("This is a get method..!!"+a*b);
	 }
	  
	static public void show()
	  {
		  put(10,30);
		  get(10,20);
	  }
 }
public class Practice {
	public static void main(String[] args) {
		
//		Emp01 e1 = new Emp01();
//		e1.show();
		Emp01.show();
		
	}

}
