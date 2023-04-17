package startThreadTwiceExample;

public class StartThreadTwice extends Thread{
	public void run(){  
		   System.out.println("running...");  
		 }  
		 public static void main(String args[]){  
		 StartThreadTwice t1=new StartThreadTwice();  
		  t1.start();  
		  t1.start();  
		 }  
}
