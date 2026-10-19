package wrapper_classes;

//Q.Is java 100% purely object oriented programming language?
//=> No, bcz, java uses primitive datatypes from C language and c is PRocedural oriented programming language

//Wrapper classes= 8(for each primitive datatype) =>  
//Wrapper classes comes under java.lang package
//Wrapper classes are immutable

//DATATYPE   WRAPPER CLASSES
//int =>    Integer
//float => Float
//double => Double
//char => Character
//boolean => Boolean
//short => Short
//long=> Long
//byte => Byte

//the conversion of  primitive values into object using wrapper classes is called as Autoboxing 
//the conversion of Object into  primitive values using wrapper classes is called as AutoUnboxing 

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int a=56;                 //here,a  is primitive value
		System.out.println("Primitive int value, a  = "+a); //56
		   // Integer obj=Integer.valueOf(a);   //boxing 
		      Integer obj=a;                    //autoboxing(without using any method it performs boxing)
		    
		    System.out.println("Object value, obj  = "+obj); //56
		    */
			
		boolean bl=true;
		System.out.println("Primitive boolean value, bl  = "+bl); //true
		 //Boolean obj1=Boolean.valueOf(bl) ;  //boxing 
		Boolean obj1=bl ;  //autoboxing
		System.out.println("Object boolean value, obj1  = "+obj1); //56
	}

}



