package threads;

public class Driver {


	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ImplementingRunnableInterface r1 = 
				new ImplementingRunnableInterface("Hello, World!");
				 Thread t = new Thread(r1);
				 t.start();
				  }
	}


