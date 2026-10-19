package multithreading;

/*
class X
{

}

//class Y extends X, Thread   //errror=> of multiple inheritance
 //or
 class Y extends X implements Runnable
{


}
 */


class B extends Thread{   // import java.lang packege
	
	int a[]= {2,4,6,77,8,65,43,64,66,7};
	
	public void run() //overridden method from Thread class //in run() method we can specify an action that thread needs to be perform
	// run method is inbuild method in java 
	{
	for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]*2);  // multiplication for loop
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
}
public class Creating_thread_by_implementing_Runnable_interface {

	public static void main(String[] args) {
		B a1 = new B(); //here,b1 is not a thread object bcz, B is not a thread class,,,so here we have to convert b1 into thread object by passing that b1 object as a parameter to the parameterized constructor of Thread class 
		
		//here, converting b1 into thread object t1
		
		Thread t1 = new Thread(a1);
		
		t1.start();  //here, there is no need to call run() method...we just need to call start() will internally calls run() method
		

	}

}
