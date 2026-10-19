package LabdaExpression;

// funcational inteface is having only one abstract method in java 
@FunctionalInterface
public interface Functional_Interface {
	public void sayHello(); // this is a functional inteface 
	
	default void put() {
		System.out.println("Hello..!!");
	};
	public static void heello()
	{
		System.out.println("Wellcome..!!");
	};

}
