package com.busecnky.aralik05.oopGenelTekrar.sporMerkeziv2;

public class Main {

	public static void main(String[] args) {
		

		SporMerkeziUye kaan = new SporMerkeziUye(1, "Kaan Kara", 120);
		
		kaan.sporYap("koşu", 2);
		kaan.sporYap("koşu", 2);
		kaan.sporYap("mekik", 1);
		//kaan.tumSporKayitlariniGoster();
		
		//System.out.println("Toplam " +  kaan.getAdSoyad() + " 'ın harcadığı kalori " + kaan.getToplamHarcananKalori());

		System.out.println("---------------------------------------------");
		System.out.println();
		
		SporMerkeziUye ali = new SporMerkeziUye(2, "Ali Kaya", 80);
		
		ali.sporYap("şınav", 3);
		ali.sporYap("ipatlama", 6);
		ali.sporYap("koşu", 2);
		//ali.tumSporKayitlariniGoster();
		
		//System.out.println("Toplam " +  ali.getAdSoyad() + " 'ın harcadığı kalori " + ali.getToplamHarcananKalori());

		
		
		//DosyaYaziciOkuyucu sınıfı oluşturun
		//bu sınıfın içinde aşağıdaakki metotları implement edin
		//public static void dosyayaYaz(String dosyaAdi, SporMerkeziUye sporMerkeziUye)
		//public static SporMerkeziUye dosyadanOku(String dosyaAdi)
		//serilization kullanarak yapın
		
		System.out.println("******************Dosyaya yaz************************");
		
		DosyaYaziciOkuyucu.dosyayaYaz("kaaninsporbilgileri.bin", kaan);
		

		
	}

}
