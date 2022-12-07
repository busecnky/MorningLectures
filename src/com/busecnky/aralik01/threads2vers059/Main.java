package com.busecnky.aralik01.threads2vers059;

public class Main {

	public static void main(String[] args) {
		// Main thread çalışıyor şu sn mainde
		
		
//		while(true) {
//		System.out.println("Main thread çalışıyor...");
//		}   //bu thread sonsuz döngüye girdi.

		System.out.println("Main thread çalışıyor...");
		
		
		Yazici yaziciThread1 = new Yazici("Yazıcı Thread-1");
		Yazici2 yaziciThread2 = new Yazici2("Yazıcı Thread-2");
		// bu threadlere start vermemiz lazım yoksa çalışmazlar
		
		yaziciThread1.start();  //burda start dedikten sonra kontrol bizde değil artık JVMde
		yaziciThread2.start();
		

		try {
			yaziciThread1.join();
			yaziciThread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main thread bitti, çıkıyor.");

		
		
		
		
	}

}
