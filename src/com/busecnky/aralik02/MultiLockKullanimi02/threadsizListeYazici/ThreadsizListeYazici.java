package com.busecnky.aralik02.MultiLockKullanimi02.threadsizListeYazici;

import java.util.ArrayList;
import java.util.Random;

public class ThreadsizListeYazici {
	
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	Random random = new Random();
	
	
	public void list1DegerEkle() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list1.add(random.nextInt(100));		
	}
	
	public void list2DegerEkle() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list2.add(random.nextInt(100));		
	}
	
	
	public void listelereDegerEkle() {
		
		for (int i=0;i<1000;i++) {					
			list1DegerEkle();
			list2DegerEkle();
		}
		System.out.println("list1 size: " + list1.size() + "  list2 size: " + list2.size());
	}
	

}
