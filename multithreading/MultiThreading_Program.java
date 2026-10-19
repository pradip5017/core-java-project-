package multithreading;

//runtime/unchecked => try catch
//compiletime/checked => throws =>method signature

//As this is  Multithreading_program all of the below 3 threads t1,t2,t3 executes simultaneously


//Executing one thread completely at a time using join method
//As this is  Multithreading_program all of the below 3 threads t1,t2,t3 executes simultaneously

class C extends Thread{   // import java.lang packege
	
	int a[]= {2,4,6,77,8,65,43,64,66,};
	
	public void run() //overridden method from Thread class //in run() method we can specify an action that thread needs to be perform
	// run method is inbuild method in java 
	{
	for(int i=0; i<5; i++)
	{
		System.out.println(Thread.currentThread().getName()+" "+i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}	
	}
public class MultiThreading_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		C c1 = new C(); 
		Thread t1 = new Thread(c1); //default name of thread => Thread-0
		t1.setName("t2");
		t1.start();  //here, there is no need to call run() method...we just need to call start() will internally calls run() method
		
		
		C c2 = new C(); 
		Thread t2 = new Thread(c2);//changing the name of thread
		t2.setName("t4");
		t2.start();  //here, there is no need to call run() method...we just need to call start() will internally calls run() method
		
		
		C c3 = new C(); 
		Thread t3= new Thread(c3); //Thread 2
		t3.setName("t3");
		t3.start(); //here, there is no need to call run() method...we just need to call start() will internally calls run() method
		
	}

}
