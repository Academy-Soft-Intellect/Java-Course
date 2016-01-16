public class E02_SleepingThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			System.out.println(i);		
		}
	}

	public static void main(String[] args) {
		Thread t1 = new E02_SleepingThread();
		Thread t2 = new E02_SleepingThread();
		t1.start();
		t2.start();
	}

}
