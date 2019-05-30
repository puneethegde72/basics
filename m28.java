package basics;
import java.util.*;
import java.util.concurrent.Executors;
/*class Multi extends Thread{
	public void run() {
			System.out.println("hello i'm new here");
	}
}
class Sleep extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{
				Thread.sleep(500);
				}
			catch(Exception e){
				System.out.println("hello"+e);
			}
		}
	}
}
class Run2 extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try
	    {
	    	Thread.sleep(500);
	    	}
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	}  
	    System.out.println(i);
	  }  
}  
}
class Run extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try
	    {
	    	Thread.sleep(500);
	    	}
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	}  
	    System.out.println(i);
	  }  
}  
}*
class Run1 extends Thread{
	public void run()
	{
		System.out.println("running");
	}
}
class Run2 extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
class Run3 extends Thread
{
	public void run()
	{
		System.out.println("running thread name:"+Thread.currentThread().getName());
		System.out.println("running thread priority:"+Thread.currentThread().getPriority());
		
	}
}
class Run4 extends Thread{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("daemon thread working");
		}
		else
		{
			System.out.println("user thread working");
		}
	}
}
class WorkerThread implements Runnable{
	 private String message;  
	 public  WorkerThread(String s){  
	        this.message=s;  
	    }  
	  public void run() {  
	        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
	        processmessage();  
	        System.out.println(Thread.currentThread().getName()+" (End)");  
	    } 
	  private void processmessage() {  
	        try {
	        	Thread.sleep(2000);
	        	} 
	        catch (InterruptedException e) 
	        {
	        	e.printStackTrace();
	        	}  
	    }  

public class ThreadGroupDemo implements Runnable{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		
	}
}
class MyThread extends Thread{  
    public void run(){  
        System.out.println("shut down hook task completed..");  
    }  
}*/  







public class m28 {
	public static void main(String args[]) throws Exception
	{
		/*Multi m=new Multi();
		 m.run();
		Multi m1=new Multi();
		Thread t=new Thread(m1);
		t.run();
		Sleep s=new Sleep();
		Sleep s1=new Sleep();
		s.start();
		s1.start();
		  Run2 r1=new Run2();  
		  Run2 r2=new Run2();  
		   
		  r1.run();  
		  r2.run(); 
		Run r=new Run();
		Run r1=new Run();
		Run r2=new Run();
		r.start();
		{
			try {
				r.join();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		r1.start();
		r2.start();
		Run1 r=new Run1();
		Run1 r1=new Run1();
		Run1 r2=new Run1();
		System.out.println("name of r:"+r.getName());
		System.out.println("name of r1:"+r1.getName());
		System.out.println("name of r2:"+r2.getName());
		System.out.println("id of r:"+r.getId());
		System.out.println("id of r1:"+r1.getId());
		System.out.println("id of r2:"+r2.getId());
		r.start();
		r1.start();
		r2.start();
		r.setName("papapa");
		System.out.println("...........................................");
		System.out.println("name of r:"+r.getName());
		Run2 r=new Run2();
		Run2 r2=new Run2();
		Run2 r3=new Run2();
		r.start();
		r2.start();
		r3.start();
		Run3 r=new Run3();
		Run3 r2=new Run3();
		  r.setPriority(Thread.MIN_PRIORITY);  
		  r2.setPriority(Thread.MAX_PRIORITY);  
		r.start();
		r2.start();
		Run4 r=new Run4();
		Run4 r2=new Run4();
		r.setDaemon(true);
		r.start();
		r2.start();
		ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
        for (int i = 0; i < 10; i++) {  
            Runnable worker = new WorkerThread("" + i);  
            executor.execute(worker);//calling execute method of ExecutorService  
          }  
        executor.shutdown();  
        while (!executor.isTerminated()) {   }  
  
        System.out.println("Finished all threads");    
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new Thread());
		public void run()
		{
			System.out.println("shutdown hook is completed");
		}
		System.out.println("Now main sleeping... press ctrl+c to exit"); 
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
		}
		Thread t1=new Thread(){  
		    public void run(){  
		      System.out.println("task one");  
		    }  
		  };  
		  Thread t2=new Thread(){  
		    public void run(){  
		      System.out.println("task two");  
		    }  
		  };  
		  
		  
		  t1.start();  
		  t2.start(); *
		Runnable r1=new Runnable(){  
		    public void run(){  
		      System.out.println("task one");  
		    }  
		  };  
		  
		  Runnable r2=new Runnable(){  
		    public void run(){  
		      System.out.println("task two");  
		    }  
		  };  
		      
		  Thread t1=new Thread(r1);  
		  Thread t2=new Thread(r2);  
		  
		  t1.start();  
		  t2.start();  */
		
		
		
}
}
