package com.busecnky.kasim22.exceptions032;

import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsIleExceptionFirlatma {

	
	
	
	public static void hizKontrol(int hiz) throws SQLException {
		if(hiz > 120) {
			throw new SQLException();   //SQL Exception bir checkedException olduğu için methoda extradan throws yazmamız gerekir.
		//Hata verir yukarıya throws yazmamız gerekir.
			
		//	System.out.println("Buraya yazdıklarım görünecek mi acaba");  //SINAV SORUSU
			
	}else {
		System.out.println("İyi yolculuklar..");
		
	}

	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı giriniz: ");
		
		int hiz = scanner.nextInt();
		
		
	//	ThrowsIleExceptionFirlatma.hizKontrol(hiz);   //Böyle yazınca hata verir. try catch kullanmamız lazım.
		
		try {
			ThrowsIleExceptionFirlatma.hizKontrol(hiz);
		} catch (Exception e) {
			System.out.println("Çok hızlı gidiyorsunuz, lütfen hızınızı azaltın!");
		}
		
		
		
		System.out.println("Hoşçakal");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
