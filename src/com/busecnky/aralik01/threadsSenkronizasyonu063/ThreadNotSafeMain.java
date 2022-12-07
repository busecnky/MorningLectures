package com.busecnky.aralik01.threadsSenkronizasyonu063;

public class ThreadNotSafeMain {

	private int count = 0;
	
	public static void main(String[] args) {
		
		ThreadNotSafeMain metot = new ThreadNotSafeMain();
		metot.threadleriCalistir();
		

	}

	
	
	
	public void threadleriCalistir() {
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					count++;
				}
				System.out.println("Thread1 bitti");
			}
		});
		
		
	

		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					count++;
				}
				System.out.println("Thread2 bitti");
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
		
		
        // Bu şekilde çalıştırınca count 10000 yazmaz. Bunun nedeni thread'ler ile ilgili
        // senkronizasyon sorunudur.
        // Yani count++ ile aynı anda ikisi de count dğeişkenine erişip artırmaya çalışıyorlar.
        // Yani 10000-6993 = 3007 gibi bir fark işte bu her iki thread'in aynı anda count değerini alıp artımaya
        // çalışmış olmalarının sonucudur.
        // Bu tarz uygulamalar Thread not safe denilebilir.
        // Bunun çözümü SENKRONİZASYON yapmaktır.
		
		System.out.println("Count değişkeninin değeri: " + count);
		
		
	}
	
}
