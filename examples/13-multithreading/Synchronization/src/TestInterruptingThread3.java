class TestInterruptingThread3 extends Thread {

	public void run() {
		for (int i = 1; i <= 500; i++)
			System.out.println(i);
	}

	public static void main(String args[]) {
		TestInterruptingThread3 t1 = new TestInterruptingThread3();
		t1.start();

		t1.interrupt();

	}
}