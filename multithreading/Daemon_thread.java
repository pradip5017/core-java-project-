package multithreading;
///Q. explain final=> keyword which is used to declare constant values, (fixed value assign)
//finally=> exception handling block,
//finalize=> method which performs clean up activity on your code


//2 types of threads
//1.user thread   e.g t1,t2,t3
//2.daemon thread/system defined => it used to perform garbage collection/clean up activity
//daemon thread is having low priority


class F extends Thread{   // import java.lang packege
	
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

public class Daemon_thread {
	
	
	public static void main(String[] args) {
		
		
		
		F f1 = new F(); 
		Thread t1 = new Thread(f1); //default name of thread => Thread-0
		
		
//		System.out.println("After setting t1 as a daement thread ="+t1.isDaemon()); 
		
		t1.setDaemon(true); //it is working to daemon thread ( t1.setDaemon(true);
		
		System.out.println("After setting t1 as a daement thread ="+t1.isDaemon()); 
		
		
		t1.start();  
		//as t1 is daemon thread, it is not working as daemon thread...it will not call run() method
	}

}
