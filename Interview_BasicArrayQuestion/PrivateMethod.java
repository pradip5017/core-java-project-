package Interview_BasicArrayQuestion;

 class  Emp {
	 
	 private  void put()
	 {
		 System.out.println("This is a Rahul Question..!!");
	 } 
	 void getPut()
	 {
		 put();
	 }
	 
	 void  get()
	 {
		 System.out.println("This is a getting data..@@");
		 
	 }
	
 }
 
public class PrivateMethod {
	public static void main(String[] args) {
		
		Emp e =new Emp();
		e.get();
		e.getPut();
		
		
	}

}
