package stringBuffer_class;
//Difference between StringBuffer and StringBuilder
//=> Most of the methods present inside  StringBuffer class are synchronized
//=>It consists of non-synchronized methods

public class StringBuffer_All_classes_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s1 = new StringBuffer("Hello words");
		System.out.println(s1);
		
		System.out.println("capacity check of value= "+s1.capacity());//capacity of stringBuffer = 27
		
//		2. inserting of value
		
		s1.insert(6, " pradip rathod ");
		System.out.println(s1);
		
		
//		3. insert the integer number
		s1.insert(5, 67);
		System.out.println(s1);
		
		
//		4. deleting
		
		s1.delete(2, 9); //deletes string starting from 2nd index till 4(5-1)
		System.out.println(s1);
		
//		5. reverse 
//		s1.reverse();  // reverse keywords is used to reverse the all value
//		System.out.println(s1);
		
//		6. replace
		s1.replace(0, 5, "python ");// replace name is holle to python replace words
		System.out.println(s1);
		
		
//		6. ensurecapacity
		
//		s1.ensureCapacity(); //=> we can set our own capacity to SB object by using this method
		System.out.println("ensureCapacity is= "+s1.capacity());
		
		s1.ensureCapacity(500);
		System.out.println("The ecxact capacity is 500 is memory= "+s1.capacity());
		
		
//		7. trimToSize
		System.out.println("before trimToSize length = "+s1.length());  // length are 27
		System.out.println("before tripToSize capacity "+s1.capacity()); // capacity is= 500
		s1.trimToSize();
		
		
		System.out.println("After tripToSize length "+s1.length());
		System.out.println("After tripToSize capacity "+s1.capacity());
		s1.trimToSize();
		
		
	}

}
