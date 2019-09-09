package pkg.Thread;

class myClass extends Thread {

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

public class ThreadTest {

	public static void main(String[] args) {

		myClass mc = new myClass();
		mc.start();

		myClass mc1 = new myClass();
		mc1.start();

	}

}
