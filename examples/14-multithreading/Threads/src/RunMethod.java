public class RunMethod extends Thread {

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
		Thread t1 = new RunMethod();
		Thread t2 = new RunMethod();
		t1.run();
		t2.run();
	}

}
