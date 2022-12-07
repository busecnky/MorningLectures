package com.guraysungur.maraton2.soruCozumu054;

public class Kertenkele extends Surungen {

	public Kertenkele(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);		
	}

	@Override
	public void surun() {
		System.out.println(this.getAd() + "  isimli kertenkele  sürünerek gidiyor...");

	}

	@Override
	public void sesCikar() {
		System.out.println(getAd() + "  kertenkele sesi çıkarıyor..");
	}

}
