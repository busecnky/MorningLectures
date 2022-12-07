package com.busecnky.aralik02.MultiLockKullanimi02.multiLockThreadliListeYazici;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class ThreadliListeYazici {
	
	
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	Random random = new Random();
	
	// Aşağıda 2 tane lock - yani kilit oluşturuyoruz. (Daha önce Metodun başına synchrnized yazıyor böylece tek bir lock oluyor ve motedu 
	// kiliyliyorduk, bir thread herhangi bir synchronized metoda girdiği zaman tüm synchronized metodlar kitleniyordu).
	private Object lock1 = new Object();   // Kilit ürettik
	private Object lock2 = new Object();   // Kilit ürettik
	
	
	public void list1DegerEkle() {
		// Metodun başına synchronized yazmak yerine sadece kod bloğumuzun başına kilit koyuyoruz..
		synchronized (lock1) 
		{					
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
	}
	
	public void list2DegerEkle() {
		// Metodun başına synchronized yazmak yerine sadece kod bloğumuzun başına kilit koyuyoruz..
		synchronized (lock2) 
		{
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
	}
	
	
	public void listelereDegerEkle() {
		
		for (int i=0;i<500;i++) {					
			list1DegerEkle();
			list2DegerEkle();
		}
		//System.out.println("list1 size: " + list1.size() + "  list2 size: " + list2.size());
	}

	
	// Her iki thread'de her iki listeye 500'er kayıt atacak
	// Toplamda listelerin her birisnde yin e 1000 kayıt olmasını hedefliyoruz!
	public void threadlerOlusturCalistir() {
		
		Thread thread1 = new Thread(new Runnable() {			
			@Override
			public void run() {
				listelereDegerEkle();				
			}
		});
		
		
		Thread thread2 = new Thread(new Runnable() {			
			@Override
			public void run() {
				listelereDegerEkle();				
			}
		});
		
		long baslangic = System.currentTimeMillis();
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// main thread'e join yapıldığı için her iki threadin çalışmasının bitmesi beklenir, bittiği zaman ilk çalışacak yer burasıdır.
		System.out.println("list1 size: " + list1.size() + "  list2 size: " + list2.size());
		long bitis = System.currentTimeMillis();
		System.out.println("Toplam süre: " + ( bitis - baslangic));
		
	}
	

}
