package com.busecnky.kasim30.iterators055;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class IteratorOrnek2 {

	public static void main(String[] args) {
		
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			list1.add(rand.nextInt(0,100));
		}
		System.out.println(list1);
		
		for (int i = 0; i < 20; i++) {
			list2.add(rand.nextInt(0,100));
		}
		System.out.println(list2);

		System.out.println("-------------");
		Iterator<Integer> iterator1 = list1.iterator();
		Iterator<Integer> iterator2 = list2.iterator();
		
		Integer sayi1, sayi2;
		int counter = 0;
		
		while( iterator1.hasNext() && iterator2.hasNext()) {
			sayi1 = iterator1.next();
			sayi2 = iterator2.next();
			System.out.println(sayi1 + "  +  " + sayi2 + "  =  " + (sayi1+sayi2) );
			counter++;
		}
		
		System.out.println("Toplam: " + counter + " adet sayı toplandı.");
		
		
		
	}
	
	
}
