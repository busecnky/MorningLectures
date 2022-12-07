package com.busecnky.kasim30.iteratorsOrnekUygulama056;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		

		ArrayList<Otomobil> cars = new ArrayList<Otomobil>();
		cars.add(new Otomobil("Opel", "Astra", 2011));
		cars.add(new Otomobil("Audi", "A3", 2015));
		cars.add(new Otomobil("BMW", "1.18", 2017));
		cars.add(new Otomobil("Renault", "Clio", 2019));
		cars.add(new Otomobil("Audi", "Q5", 2020));
		
		
		for( Otomobil o : cars) {
			System.out.println(o);
		}
		
		//Soru:
		//
		//Audi a3 otomobilirini index.remove kullanmadan for döngüsü içinde silmeye çalışsın
		//Döngü içinde silemiyoruz!!
		
/*		for( Otomobil o : cars) {
			if(o.getMarka().equalsIgnoreCase("Audi") && o.getModel().equalsIgnoreCase("A3")){
				cars.remove(o);
			}
		}
*/		
		//Bu üsttekini yapınca hata alıyoruz!!
		
		
		
		//Iterator'ların en önemki kullanım alanı döngü içinde gezerken istediğiniz liste elemanını silebilmenizdir.
		//for loop içinde bunu klasik yöntemle yapamazsınız hata alırsınız! (Üstteki örnek)
		for(Iterator iterator = cars.iterator(); iterator.hasNext();) {
			Otomobil otomobil = (Otomobil) iterator.next();
			if(otomobil.getMarka().equalsIgnoreCase("Audi") && otomobil.getModel().equalsIgnoreCase("A3")) {
				iterator.remove();
			}
		}
		
		System.out.println();
		for (Otomobil o : cars) {
			System.out.println(o);
		}

	}

}
