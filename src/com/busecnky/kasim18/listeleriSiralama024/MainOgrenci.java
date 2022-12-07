package com.busecnky.kasim18.listeleriSiralama024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MainOgrenci {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Opel");
		list.add("Audi");
		list.add("VW");
		list.add("Renault");
		System.out.println(list);
		
		// Collections sınıfı:
		//
		// Collections sınıfı bir UTILITY sınıfıdır. (Yani collection framework kullanırken bize yardımıcı
		// olabilecek metodları barındırır.)
		Collections.sort(list);
		
		System.out.println(list);  // => Bakınız sıraladı !
		
		
		// Şimdi kendi sınıfımızdan nesneleri kullanarak listeyi dolduralım ve sıralamaya çalışalım:
		List<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
		ogrenciler.add(new Ogrenci("Fatih", 1050));
		ogrenciler.add(new Ogrenci("Metehan", 1025));
		ogrenciler.add(new Ogrenci("Irfan", 1200));
		ogrenciler.add(new Ogrenci("Buse", 700));
		
		System.out.println(ogrenciler);
		Collections.sort(ogrenciler);
		System.out.println(ogrenciler);
		
		// Şimdi de nesnelerimizi compare edelim..
		Ogrenci ogr1 = new Ogrenci("Ahmet", 210);
		Ogrenci ogr2 = new Ogrenci("Veli", 208);
		System.out.println(ogr1.compareTo(ogr2));
		
	}

}
