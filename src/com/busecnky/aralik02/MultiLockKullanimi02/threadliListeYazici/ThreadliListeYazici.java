package com.busecnky.aralik02.MultiLockKullanimi02.threadliListeYazici;

import java.util.ArrayList;
import java.util.Random;

public class ThreadliListeYazici {
	
	
//	Vector<Integer> list1 = new Vector<Integer>();
//	Vector<Integer> list2 = new Vector<Integer>();
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	Random random = new Random();
	
	
	public synchronized void list1DegerEkle() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list1.add(random.nextInt(100));		
	}
	
	public synchronized void list2DegerEkle() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list2.add(random.nextInt(100));		
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
