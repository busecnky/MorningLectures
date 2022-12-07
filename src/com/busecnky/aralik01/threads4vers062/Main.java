package com.busecnky.aralik01.threads4vers062;

public class Main {

	
	//Thread oluşturma 3. yöntem
	//Anonymous Inner Class ile Interface üzerinden thread oluşturma
	public static void main(String[] args) {
		
	System.out.println("Main thread çalışıyor");

		//içine runnable ı önerilerden seçersek eğer altta override ı çat diye kendi veriyo
		
		Thread printer1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread1 çalışıyor");
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread1 yazıyor: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
	

		
		Thread printer2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread2 çalışıyor");
				for (int i = 0; i < 7; i++) {
					System.out.println("Thread2 yazıyor: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
	
	
		printer1.start();
		printer2.start();
		
		System.out.println("Main thread çıkıyor...");
	
	}

}
