import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
	
	private String id;
	
	public Task(String id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Thread " + id + " executing");
		try {
			int duration = (int) (Math.random() * 5) + 1;
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
