class E08_WorkerThread extends Thread {
	private String message;

	public E08_WorkerThread(String s) {
		this.message = s;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName()	+ " (Start) message = " + message);
		processMessage();
		System.out.println(Thread.currentThread().getName() + " (End)");
	}

	private void processMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}