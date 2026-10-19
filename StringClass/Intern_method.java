package StringClass;

//Intern_method is used to create an exact copy of heap object into SCP area
public class Intern_method {
	public static void main(String[] args) {
		
		String s1 = new String ("hello"); //heap
		String s2 = "hello";   // scp 
		
		String s3=s1.intern();  //returns a string from heap,now it will be //same as s2 because, both s2 and s3 are in scp area
		//Intern_method is used to create an exact copy of heap object into SCP area
		
		System.out.println(s1==s2); //false because reference variables s1 and s2 is pointing to different instance in memory.here s1 pointing to the heap object and s2 is pointing to the SCP object
		
		System.out.println(s2==s3); //true because reference variables s2 and s3 is pointing to same instance in memory. Here, s2 and s3 both are pointing to the SCP object
		
		
		
	      /* == comparator operator=>(comparator operator always checks for reference comparison)
	    	        if both given reference variables are pointing  to same object in memory then it returns true else it returns false
	    	        */
		
	}

}
