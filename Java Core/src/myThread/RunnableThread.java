package myThread;

import java.util.Scanner;


public class RunnableThread implements Runnable{
	Scanner sc = new Scanner(System.in);
	int b;
	public RunnableThread() {
		b = sc.nextInt();
	}
	
	@Override
	public void run() {
		System.out.print("Потік Runnable : ");
		int[] array1 = new int[b];
		array1[0] = array1[1] = 1;
		for (int a = 2; a < b; a = a + 1) {
			array1[a] = array1[a - 1] + array1[a - 2];
		//	System.out.print(array1[a] + " ");
		}
		for (int a = b-1; a >= 0; a = a - 1) {
			System.out.print(array1[a] + " ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
	}
}
