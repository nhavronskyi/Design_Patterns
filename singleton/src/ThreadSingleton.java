
public class ThreadSingleton{
	private static ThreadSingleton instance;
	public String threadName;
	
	private ThreadSingleton(String threadName) {
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.threadName = threadName;
	}
	
	public  static ThreadSingleton getInstance(String threadName) {
		if(instance == null)
			instance = new ThreadSingleton(threadName);
		return instance;
	}

}
