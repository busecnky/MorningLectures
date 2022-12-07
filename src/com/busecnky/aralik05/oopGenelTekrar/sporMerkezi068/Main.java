package com.busecnky.aralik05.oopGenelTekrar.sporMerkezi068;

public class Main {

	public static void main(String[] args) {
		

		SporMerkeziUye kaan = new SporMerkeziUye(1, "Kaan Kara", 120);
		
		kaan.sporYap("koşu", 2);
		kaan.sporYap("koşu", 2);
		kaan.sporYap("mekik", 1);
		
		System.out.println("Toplam " +  kaan.getAdSoyad() + " 'ın harcadığı kalori " + kaan.getToplamHarcananKalori());

	}

}
