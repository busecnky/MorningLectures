package com.guraysungur.maraton2.soruCozumu054;

public class Maymun extends MemeliHayvan {

	
	
	public Maymun(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}

	@Override
	public void yuru() {
		System.out.println(this.getAd() + "  isimli maymun yürüyor...");
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd() + "   maymun sesi çıkarıyor..");
	}

}
