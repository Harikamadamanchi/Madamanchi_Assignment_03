package threads;

public class ExtendingThreads extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendingThreads t1 = new ExtendingThreads();
		t1.start();
		System.out.println("Outside the Thread");
	}

	public void run() {
		System.out.println("Inside the Thread");
	}
}


