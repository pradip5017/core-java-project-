package wrapper_classes;

//the conversion of Object into  primitive values using wrapper classes is called as AutoUnboxing 
public class AutoUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer aobj=new Integer(56);                 //here,aobj  is object
		System.out.println("Object Integer value, aobj  = "+aobj); //56
		
	    //int	a=  aobj.intValue() ;     //Unboxing
		int	a=  aobj ;                   //autoUnboxing(without using any method it performs unboxing)
	    System.out.println("primitive int value, aobj  = "+a); //56
	}

}
