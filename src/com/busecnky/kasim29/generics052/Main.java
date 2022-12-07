package com.busecnky.kasim29.generics052;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//ilk akla gelcek şey nesnenin belirsiz olması
	
		//Generic'ler sayesinde tasarladığımız sınıfların tek bir sınıf için değil,
		//bir şablon yapısına uyan her tip sınıf için çalışmasını sağlayan yapılardır.
		//Not: interfaceleri de generic olarak tasarlayabiliriz.

		//Aslında biz Generics konusunu Collection Framework'te uyguladık
		List<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(5);
		listInteger.add(24);
		listInteger.add(150);
		System.out.println(listInteger);		
		
		
		List<String> listString = new ArrayList<String>();
		listString.add("Java");
		listString.add("C#");
		listString.add("C++");
		listString.add("Python");
		System.out.println(listString);
		
		System.out.println("*********************");
		
		GenericSinif<Integer> genericSinif = new GenericSinif<Integer>(20);
		System.out.println(genericSinif.getObj());
		
		GenericSinif<String> gnrcsnf = new GenericSinif<String>("Hellooo");
		System.out.println(gnrcsnf.getObj());
		
//		Kare k = new Kare(5);
//		GenericSinif<Kare> gsinif = new GenericSinif<Kare>(k);
		GenericSinif<Kare> gsinif = new GenericSinif<Kare>(new Kare(5));
		int alan =  gsinif.getObj().alanHesapla();
		System.out.println("Alan: " + alan);
		
		
	}

}
