public class Main {

	public static void main(String[] args) {
		multiThreaded();
	}
	
	// single-threaded Singleton
	public static void singleThreaded() {
		Singleton s = Singleton.getInstance("nazar");
		Singleton s2 = Singleton.getInstance("vita");
		
		System.out.println(s.name);
		System.out.println(s2.name);
	}
	
	// multi-threaded Singleton
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
	 
	 
	
}
