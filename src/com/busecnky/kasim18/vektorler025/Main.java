package com.busecnky.kasim18.vektorler025;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> arraylist = new ArrayList<String>();

		// Multi-threading application'larda ArrayList'ler safe kabul edilmez.
		// Multi-threading uygulamarda ArrayList yerine Vector sınıfı tercih edilmelidir.
		// Vector'lerin dezavantajı ise ArrayList'e göre daha YAVAŞ çalışmalarıdır.
		Vector<String> vector = new Vector<String>();
		
		vector.add("Kedi");
		vector.add("Köpek");
		vector.add("Aslan");
		vector.add("Kuş");
		

		for (String s : vector) {
			System.out.println(s);
		}
		
		System.out.println(vector.get(1));
		
		// Iterator kullanımı:
		System.out.println();
		
		ListIterator<String> iterator = vector.listIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
	}

}
