package com.busecnky.kasim23.javaStreamAPI037;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	
	public static void main(String[] args) {
		
		List<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();

		ogrenciler.add(new Ogrenci("Ali", 100));
		ogrenciler.add(new Ogrenci("Veli", 101));
		ogrenciler.add(new Ogrenci("Ayşe", 102));
		ogrenciler.add(new Ogrenci("Osman", 103));
		ogrenciler.add(new Ogrenci("Gökhan", 104));
		
		//Bu zaten öğrendiğimiz for each
		
//		for (Ogrenci ogr : ogrenciler) {
//			System.out.println(ogr);
//		}
		
		//******************
		//Stream : Akış
		//Öğrenciler listesinin üzerinden gidip işlemler yapmamızı sağlar. Bir nevi akış oluşturur.
		//ogrenciler.stream() ===> yazdığımız zaman kaynağı öğrenciler listesi olan bir akış oluşturur.
		//
		// içindeki -> buna lambda expression deniliyor.
		//Lambda functions: ok ->'un solundaki ogrenci parametre,
		//					ok ->'un sağındaki de o parametrenin çalışacağı methoddur.
		
		
		ogrenciler.stream().forEach(ogrenci -> System.out.println(ogrenci));
		//Bir de stream API sinin for each i var
		//yukarıdaki bildiğimiz for each'te ogr yazdığımız yere ne istiyorsak yazıyorduk
		//Bunda da ogrenci yazdığımız yere ne yazarsak yazalım oluyo ogrenciler.stream().forEach(xyz -> System.out.println(xyz));
		
		
		ogrenciler.stream().forEach(ogrenci -> {
			System.out.println("Öğrenci bilgisi: ");
			System.out.println(ogrenci);
			System.out.println("-----------");
		});
		
		//Sınav notları:
		ogrenciler.stream().forEach(ogrenci -> ogrenci.printSinavNotu());
		
		System.out.println("\n------For Each Kısa Yazım ::-------\n");
		//Yukarıdaki ifadenin çok daha kısa yazılabilecek hali:
		//"Method reference" deniyor.
		ogrenciler.stream().forEach(Ogrenci::printSinavNotu);
		
		// :: manası: bu öğrenci sınıfının içindeki printSinavNotu methodunu çağır demek
		System.out.println("\n------Count-------\n");
		//Stream api'nin en çok kullanılan methodlarından biri:
		//filter method
		long okulNo102DenBuyukCount = ogrenciler.stream().filter(ogrenci -> ogrenci.getOkulNo()>102).count();
		System.out.println("count: " + okulNo102DenBuyukCount);
		
		System.out.println("\n------Filteleme-------\n");
		//collect() methodu ile filtre sonuçlarını liste haline çevirme:
		List<Ogrenci> filtrelenmisListe = ogrenciler.stream().filter(ogrenci -> ogrenci.getOkulNo()>102).collect(Collectors.toList());
		System.out.println(filtrelenmisListe);
		
		System.out.println("\n------Mapleme-------\n");
		//mapleme işlemi ile yeni nesneler oluşturma (STREAM API ile)
		List<Ogrenci> mappedList = ogrenciler.stream().map(ogr -> new Ogrenci(ogr.getAd(), ogr.getOkulNo()*100)).collect(Collectors.toList());
		System.out.println(mappedList);
		
		System.out.println("\n------Map Sınıfından Nesne OLuşturma-------\n");
		//Şimdi ise map sınıfından bir nesne oluşturalım (Ogrenci sınıfından istediğimiz değerleri alarak)
		Map<Integer, String> ogrenciMap = ogrenciler.stream().collect(Collectors.toMap(ogr -> ogr.getOkulNo(), ogr -> ogr.getAd()));
		
		//Map içeriğini ekrana yazdıralım
		ogrenciMap.forEach((key, value) -> System.out.println(key + "    " + value));
		
	}

}
