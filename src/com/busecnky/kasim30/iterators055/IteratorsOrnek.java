package com.busecnky.kasim30.iterators055;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorsOrnek {

	public static void main(String[] args) {
	

		//Iterable interface ini implement eden Collection sınıfları istendiğinde
		//bizlere bir Iterator sağlamakla/return etmekle mükelleftirler

		
		//Java iterator collection içindeki elemanlar arasında gezinmemize yarar.
		//en önemli özelliklerinden birisi collection elemanlarını remove edebilmeleridir.
		
		//Nesnen ne tipteyse iterator ımızda aynı tipte olur. Nesneyse nesne Integersa Integer.
		
		List<Integer> listInteger = new ArrayList<Integer>();
		
		listInteger.add(5);
		listInteger.add(42);
		listInteger.add(37);
		System.out.println(listInteger);
		
		Iterator<Integer> iterator = listInteger.iterator();
		while( iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//sırayla içindeki iteratorları döndürüyo
		
		
	}

}
