package com.busecnky.kasim22.exceptions032;

import java.util.Scanner;

public class ThrowIleExceptionFirlatma {
	
	
	//Parametre olarak gelen Hız değeri 120'den büyükse exception fırlatacağız...
	
	public static void hizKontrol(int hiz) {
		if(hiz > 120) {
			throw new ArithmeticException();
		
	}else {
		System.out.println("İyi yolculuklar..");
		//Arabanın hızını artır
		//veya çanak antenin ısırma sistemini belirtilen dereceye ayarla
	}
	}

	
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı giriniz: ");
		
		int hiz = scanner.nextInt();
		
		
	//	ThrowIleExceptionFirlatma.hizKontrol(hiz);   //Böyle yazınca da hata vermemektedir. Ama throws ile exception örneğinde o class ta bu şekilde atamayız.
		
		try {
			ThrowIleExceptionFirlatma.hizKontrol(hiz);
		} catch (Exception e) {
			System.out.println("Çok hızlı gidiyorsunuz, lütfen hızınızı azaltın!");
		}
		
		
		
		System.out.println("Hoşçakal");
		
		
		
		
	}
	

}
