	
	package multithreading;

import ExceptionHandling.Try_catch_finally;

	class Thread50 extends Thread
	{
		int a []= {11,22,33,44,55,66,77,88};
		
		public void run()
		{
			for(int i=0; i<a.length; i++)
			{
				System.out.println(Thread.currentThread().getName()+" "+i);
				
				try {
					
					Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println(e);
					// TODO: handle exception
				}
				
			}
		}
		
		
		
		
	}

	
	public class Creating_thread_by_extending_Thread_class_practic {
		public static void main(String args[])
		{
			Thread50 t1 = new Thread50();
			Thread s1 = new Thread(t1);
			s1.setName("Pradip");
			s1.start();
		}
	}
	
