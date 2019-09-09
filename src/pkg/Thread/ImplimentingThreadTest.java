package pkg.Thread;

class testClass implements Runnable{

	public void run() {

			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getId()
						+ " This is Run Class!! " + i);
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}


public class ImplimentingThreadTest {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new testClass());
		Thread t2 = new Thread(new testClass());
		
		t1.start();
		t2.start();

	}

}
