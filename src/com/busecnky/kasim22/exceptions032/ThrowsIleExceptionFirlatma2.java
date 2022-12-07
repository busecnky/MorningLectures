package com.busecnky.kasim22.exceptions032;

import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsIleExceptionFirlatma2 {

	
	
	
	public static void hizKontrol(int hiz) throws SQLException {
		if(hiz > 120) {
			throw new SQLException();   //SQL Exception bir checkedException olduğu için methoda extradan throws yazmamız gerekir.
		//Hata verir yukarıya throws yazmamız gerekir.
			
		//	System.out.println("Buraya yazdıklarım görünecek mi acaba");  //SINAV SORUSU
			
	}else {
		System.out.println("İyi yolculuklar..");
		
	}

	}
	
	
	
	//main method başlığında throws ile exception atması:
	//API olarak bizim kodumuzu kullanacak kişinin yakalamsı içindir.
	
	public static void main(String[] args) throws SQLException {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı giriniz: ");
		
		int hiz = scanner.nextInt();
		
		
		ThrowsIleExceptionFirlatma.hizKontrol(hiz);   //Böyle yazınca hata veriyor. ama yukarıda throws declaration dersek sıkıntı kalmıyor.Bu şekilde de kullanabiliriz.
		
		
		
		
		System.out.println("Hoşçakal");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
