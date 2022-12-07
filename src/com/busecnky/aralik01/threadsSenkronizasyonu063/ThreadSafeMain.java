package com.busecnky.aralik01.threadsSenkronizasyonu063;

public class ThreadSafeMain {

	private int count = 0;

	// synchronized metodları aynı anda sadece 1 thread çalıştırabilir.
    // Oda-anahtar(kilit) mekanizmasyı gibi düşünün, bur metoda ilk giren thread odayı kitler ve anahtarı alır (lock'ı alır).
	//Bu şekilde yaptığımız zaman uygulamamız Thread-Safe olur.
	
	public static void main(String[] args) {
		
		ThreadSafeMain metot = new ThreadSafeMain();
		metot.threadleriCalistir();
		

	}

	public synchronized void threadlerBurayaSenkronOlarakGirer() {
		count++;
	}
	
	
	public void threadleriCalistir() {
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread1 e girdi");
				for (int i = 0; i < 5000; i++) {
					threadlerBurayaSenkronOlarakGirer();
				}
				System.out.println("Thread1 bitti");
			}
		});
		
		
	

		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread2 ye girdi");
				for (int i = 0; i < 5000; i++) {
					threadlerBurayaSenkronOlarakGirer();
				}
				System.out.println("hTread2 bitti");
			}
		});
		
		thread1.start();
		thread2.start();
		
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		System.out.println("Count değişkeninin değeri: " + count);
		
		
	}

	

}
