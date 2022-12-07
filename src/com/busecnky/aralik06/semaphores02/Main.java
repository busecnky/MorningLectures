package com.busecnky.aralik06.semaphores02;

public class Main {

	public static void main(String[] args) {
		
		
													//Aynı anda kaç thread çalıştırcağını yazıyoruz parametre olarak
		AdUzerindenDosyaKopyalayici kopyalayici = new AdUzerindenDosyaKopyalayici(3);
		
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				kopyalayici.dosyaKopyalayiciThreadMetohudy("144.122.41.1");
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				kopyalayici.dosyaKopyalayiciThreadMetohudy("144.122.41.2");

				
			}
		});
		
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				kopyalayici.dosyaKopyalayiciThreadMetohudy("144.122.41.3");

				
			}
		});
		
		Thread thread4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				kopyalayici.dosyaKopyalayiciThreadMetohudy("144.122.41.4");

				
			}
		});
		
		Thread thread5 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				kopyalayici.dosyaKopyalayiciThreadMetohudy("144.122.41.5");

				
			}
		});

		
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
