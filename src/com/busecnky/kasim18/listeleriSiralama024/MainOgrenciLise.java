package com.busecnky.kasim18.listeleriSiralama024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOgrenciLise {

	public static void main(String[] args) {

		// Şimdi kendi sınıfımızdan nesneleri kullanarak listeyi dolduralım ve
		// sıralamaya çalışalım:
		List<OgrenciLise> ogrencilerLise = new ArrayList<OgrenciLise>();
		ogrencilerLise.add(new OgrenciLise("Fatih", 1050, 80.0));
		ogrencilerLise.add(new OgrenciLise("Metehan", 1025, 85.2));
		ogrencilerLise.add(new OgrenciLise("Irfan", 1200, 60.0));
		ogrencilerLise.add(new OgrenciLise("Buse", 700, 95.2));

		System.out.println(ogrencilerLise);
		
		// Listemi not ortalamasına göre sıralattıracağım:
		Collections.sort(ogrencilerLise);
		System.out.println("\n sort edilmiş liste:");
		System.out.println(ogrencilerLise);
		
	}

}
