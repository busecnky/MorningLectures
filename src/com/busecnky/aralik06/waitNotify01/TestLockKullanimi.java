package com.busecnky.aralik06.waitNotify01;

import java.util.Scanner;

public class TestLockKullanimi {

	private Object lock = new Object();
	
	
	public void thread1Metod() {
		// synchronized (this) kullanımı ile public synchronized thread1Metod() aynı
		// görevi icra eder.
		// synchronized (this) kullanarak nesne/obje üzerinde lock kurulur. Yani diğer
		// tüm synchronized yazılan metodlar kitlenir.
		synchronized (lock) {
			System.out.println("Thread1 is running....");
			System.out.println("Thread1 waits...");			
			try {
				lock.wait(); // wait ile diyoruz ki ben uyuycam lock'u (anahtarı/kiliti) teslim edebilirim
						// isteyen alabilir.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread1 is awake and continues...");
		}

	}

	public void thread2Metod() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized (lock) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Thread2 is running..");
			System.out.println("Please press a key to cintune: ");
			scanner.nextInt(); // Thread2 Thread1 başladıktan sonra başlamalı o yuzden burada hemen console'dan
								// sayı girmeyelim en az 3 sn bekleyim.
								// ve emin olalım ki thread1 önce başlasın.
			lock.notify(); // notify ile diyoruz ki bizim bu lock'ile işimiz bitti isteyen lock'u alıp çalışabilir.
			System.out.println("Thread2 quits");
		}
	}
	
	

}
