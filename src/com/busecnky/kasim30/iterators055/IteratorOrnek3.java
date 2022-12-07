package com.busecnky.kasim30.iterators055;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorOrnek3 {

	public static void main(String[] args) {
		// ListIterator Kullanımı:
		/*
		next() : ileri
        previous(): geri
        hasNext(): ileride eleman varmı?
        hasPrevious(): geride elaman varmı? true yada false
		 */

		
		List<String> list = new ArrayList<String>();
		
		list.add("Cihan");
		list.add("Kadirefe");
		list.add("Tolga");
		System.out.println(list);
		
		
		//listIterator oluşturma
		ListIterator<String> listIterator = list.listIterator();
		
		System.out.println("------Listeyi ileriye doğru gezmez için-------");
		//Listeyi baştan sona gezmek için
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("------Listeyi ileriye doğru gezmez için-------");
		//Listeyi sondan başa doğru gezmek için
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	
		
		
	}

}
