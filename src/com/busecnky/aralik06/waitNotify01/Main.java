package com.busecnky.aralik06.waitNotify01;

public class Main {

	public static void main(String[] args) {
		
		
		TestSynchronizedThisKullanimi test = new TestSynchronizedThisKullanimi();
		
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				test.thread1Method();
				
			}
		});
		
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				test.thread2Method();
				
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
		
	}
}
