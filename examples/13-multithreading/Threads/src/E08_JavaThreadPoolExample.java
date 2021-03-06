import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class E08_JavaThreadPoolExample {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 15; i++) {
			E08_WorkerThread worker = new E08_WorkerThread("" + i);
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}
}