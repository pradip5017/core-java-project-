package multithreading;

	class Thread12 extends Thread{
		
	int a[]= {22,33,44,55,77,33,22,11};
		
		public void run() {//overridden method from Thread class //in run() method we can specify an action that thread needs to be perform
			// run method is inbuild method in java 
			
	for(int i=0; i<a.length; i++) {
			
		System.out.println(a[i]*2);
		
		try {
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	}
			
	}
	

public class Creating_thread_by_implementing_Runnable_interface_Practice {
	public static void main(String args[])
	{
		Thread12 t = new Thread12();
		t.run();
		
//		Thread t1 = new Thread();
//		
////		t1.run();
	}
}
