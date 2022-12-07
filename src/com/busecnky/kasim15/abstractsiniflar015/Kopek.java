package com.busecnky.kasim15.abstractsiniflar015;

public class Kopek extends Hayvan {

	public Kopek(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);		
	}
	
	@Override
	public void sesCikar() {
		System.out.println("Hav hav hav...");
	}

	@Override
	public void yemekYe() {
		System.out.println("Köpek " + this.getAd() + " yemek yiyor.");	
	}

}
