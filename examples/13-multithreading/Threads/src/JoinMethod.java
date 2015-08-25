public class JoinMethod extends Thread {

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
		Thread t1 = new JoinMethod();
		Thread t2 = new JoinMethod();
		Thread t3 = new JoinMethod();
		t1.start();
		
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);

		}
		t2.start();
		t3.start();	
	}
}
