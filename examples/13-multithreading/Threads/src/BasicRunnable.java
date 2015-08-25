public class BasicRunnable implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		BasicRunnable m1 = new BasicRunnable();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}
