package Static_keyword;

 class Instance {
	 
	  static int a=20;
	  static int b=30;
	 
 }
 	public class InstanceValiable {
	public static void main(String[] args) {
		
		Instance e = new Instance();
		
		System.out.println("A :"+e.a);
		System.out.println("B :"+e.b);
		
		e.a=100;
		e.b=300;
		System.out.println("Aa :"+e.a);
		System.out.println("Bb :"+e.b);
		
		
	}

}
