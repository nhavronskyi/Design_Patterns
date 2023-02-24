
public class SynchronizedSingleton {
	private static volatile SynchronizedSingleton instance;
	
	public String value;
	private SynchronizedSingleton(String value) {
		this.value = value;
	}
	
	public static SynchronizedSingleton getInstance(String value) {
		SynchronizedSingleton res = instance;
		if(res != instance)
			return res;
		
		synchronized (SynchronizedSingleton.class) {
			if(instance == null) {
				instance = new SynchronizedSingleton(value);
			}
			return instance;
		}
	}
}
