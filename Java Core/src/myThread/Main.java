package myThread;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("������ �����");
		MyThread thread = new MyThread();
	thread.join();
		System.out.println();
		System.out.println("������ �����");
		Thread thread1 = new Thread(new RunnableThread());
		thread1.start();
	}

}
