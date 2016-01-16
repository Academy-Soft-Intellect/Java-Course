class E11_TestInterruptingThread extends Thread {

	public void run() {
		for (int i = 1; i <= 2000000; i++) {
			if (isInterrupted()) {
				break;
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		E11_TestInterruptingThread t1 = new E11_TestInterruptingThread();
		t1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.interrupt();

	}
}