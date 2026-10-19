package Class_and_object;
/*difference between function and method?
actually function and methods are same in definition and calling but still there are
are some differences between both

1.we cannot create function inside class...we can directly create function in
 our source file
1.where as method should always be created inside class

2.we can directly call function without class or object name
2.where as method should always be call by using object or class name

*/

class User1 {
	
	int id; 
	String name;
	float age; //instance variable
	
	
	void getData(int a, String b, float c)
	{
		id = a;
		name = b;
		age = c;
		
		
	}
	
	void putData()
	{
		System.out.println(66);
		System.out.println("ram");
		System.out.println(45.5f);
		
	}
	
	
}


public class Instance_method {




public static void main(String args[]) {
	
	
	User1 u1 = new User1();
	
	u1.getData(66, "ram", 45.9f);
	
	u1.putData();
	

}

}



/*difference between function and method?
actually function and methods are same in definition and calling but still there are
are some differences between both

1.we cannot create function inside class...we can directly create function in
 our source file
1.whereas method should always be created inside class

2.we can directly call function without class or object name
2.whereas method should always be call by using object or class name

*/
