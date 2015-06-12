public class BasicThread extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		BasicThread t1 = new BasicThread();
		t1.start();
		
	}
}