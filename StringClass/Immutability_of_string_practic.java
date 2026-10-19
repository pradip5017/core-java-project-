package StringClass;
//Difference between String  and StringBuffer
//String(Immutable=> non-changeable), StringBuffer(Mutable=> changeable)


//Q.explain Immutability of String?
/*
Once String object is created you can’t perform any changes into 
that already existing object if you are trying to perform any changes then with those
 changes new object will be created, but since that new object doesn’t have any reference variable that
  new object is eligible for garbage collection and you will get your original object as it is.
*/

//Q.why string objects are immutable?
public class Immutability_of_string_practic {

	public static void main(String[] args) {
		String s1= new String ("hello");
		System.out.println(s1);  //hello 
		
		System.out.println(s1.concat("user")); //hellouser a=89
		
		System.out.println(s1);   //hello  
	}

}
