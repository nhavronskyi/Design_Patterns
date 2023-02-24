public class Main {

	public static void main(String[] args) {
		//multiThreaded();
		//synchronizedSingleton();
	}
	
	// single-threaded Singleton
	public static void singleThreaded() {
		Singleton s = Singleton.getInstance("nazar");
		Singleton s2 = Singleton.getInstance("vita");
		
		System.out.println(s.name);
		System.out.println(s2.name);
	}
	
	// multi-threaded Singleton, fast and save
	public static void multiThreaded() {
		Thread tOne = new Thread(new ThreadOne());
		Thread tTwo = new Thread(new ThreadTwo());
		tOne.run();
		tTwo.run();
	}
	
	 static class ThreadOne implements Runnable{
	 	@Override
		public void run() {
			ThreadSingleton s = ThreadSingleton.getInstance("one");
			System.out.println(s.threadName);
		}
	 }
	 static class ThreadTwo implements Runnable{
		 	@Override
			public void run() {
		 		ThreadSingleton s = ThreadSingleton.getInstance("two");
		 		System.out.println(s.threadName);
				
			}
		 }
	 
	 
	 // synchronized Singleton, more safe, but slow
	 public static void synchronizedSingleton() {
		 SynchronizedSingleton s;
		 Thread one = new Thread(new SyncThreadOne());
		 Thread two = new Thread(new SyncThreadTwo());
		 
		 one.start();
		 two.start();
	 }
	 static class SyncThreadOne implements Runnable{
		 	@Override
			public void run() {
				SynchronizedSingleton s = SynchronizedSingleton.getInstance("one");
				System.out.println(s.value);
			}
		 }
		 static class SyncThreadTwo implements Runnable{
			 	@Override
				public void run() {
			 		SynchronizedSingleton s = SynchronizedSingleton.getInstance("two");
			 		System.out.println(s.value);
					
				}
			 }
}
