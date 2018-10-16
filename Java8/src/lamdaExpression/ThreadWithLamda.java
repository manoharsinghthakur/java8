package lamdaExpression;

public class ThreadWithLamda {
	public static void main(String[] args) throws InterruptedException {
		Runnable r = () -> {
			for (int i = 0; i < 9; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread is running");
			}
		}; 

		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i < 9; i++) {
			t.sleep(100);
			System.out.println("Main Thread is running");
		}
		
	}

}
