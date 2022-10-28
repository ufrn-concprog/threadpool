import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Demonstrating the use of a thread pool
 * @author <a href="mailto:everton.cavalcante@ufrn.br">Everton Cavalcante</a>
 */
public class ThreadPoolMain {
	/** Number of threads to create */
	private static final int NUM_THREADS = 50;

	/** Number of tasks to execute */
	private static final int NUM_TASKS = 100;

	/**
	 * Main method
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		ExecutorService executor =
			Executors.newFixedThreadPool(NUM_THREADS);
		
		for (int i = 0; i < NUM_TASKS; i++) {
			Runnable task = new Task(String.valueOf(i));
			executor.execute(task);
		}
		
		executor.shutdown();
	}
}
