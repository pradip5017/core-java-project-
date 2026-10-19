package multithreading;
//runtime/unchecked => try catch
//compiletime/checked => throws =>method signature


//thread is a sub program/sub process which runs in the background of main process
//multithreading means multiple threads will get execute at the same time

//with the help of multithreading we can achieve multi-processing
//and with the help of  multi-processing we can achieve multitasking

//multithreading  => multi-processing=> multitasking

//*********** imp ***********
//there are 2 ways to create a thread
//1.by extending Thread class   //java.lang

//2.by implementing Runnable interface(most widely used way to create a thread this way can create a thread in case of normal program and also in case of inheritance program where we wants to create therad in child class)
//Types
//1.Marker  // empty abstract method
//2.Single abstract method/functional
//Runnable is functional type of interface as it has one abstract method i.e run()

//runtime/unchecked => try catch
//compiletime/checked => throws =>method signature

//overridden method from Thread class //in run() method we can specify an action that thread needs to be perform

class A extends Thread{   // import java.lang packege
	
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

public class Creating_thread_by_extending_Thread_class {

	public static void main(String[] args) {
		
		
		A a1 = new A(); // create a object child thread  A
		a1.start();  //here, there is no need to call run() method...we just need to call start() will internally calls run() method
		
		

	}

}
