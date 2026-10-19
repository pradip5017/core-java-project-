package multithreading;


//main thread class =>   thread is parrent thread of all user define thread

//Thread lifecycle phases/states => 4
//1.new
//2.runnable  => ready to run but not actually running
    //3.running
//4.non-runnable
//5.terminate

//Thread schedular => program resides in JVM which decides whether which thread should execute and which thread should wait
//1.priority of thread  1-10  => preemptive priority scheduling algo
 //t1=  5 ,  t2 =9, t3=9
//2. arrival time of thread    => FIrst Come First Serve (FCFS)
    //  t3= 0.5sec  t2=0.5sec

//3. execution time/time slice of thread  => time slicing algorithm
  //t3, t2


class E extends Thread{   // import java.lang packege
	
	int a[]= {2,4,6,77,8,65,43,64,66,};
	
	public void run() //overridden method from Thread class //in run() method we can specify an action that thread needs to be perform
	// run method is inbuild method in java 
	{
	for(int i=0; i<a.length; i++)
	{
		System.out.println(Thread.currentThread().getName()+" "+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}	
	}




public class Thread_priority {

	public static void main(String[] args) {
		

		E e1 = new E(); 
		Thread t1 = new Thread(e1); //default name of thread => Thread-0
		
		System.out.println("the defualt priority of thread is ="+t1.getPriority());
		t1.setPriority(8);
		
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.setPriority(Thread.NORM_PRIORITY);
		
		
		t1.start();
		
		System.out.println("after setting userdeffined proirity to t1 thread...= "+t1.getPriority());
	}

}
