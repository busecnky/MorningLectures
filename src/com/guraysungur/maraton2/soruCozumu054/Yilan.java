package com.guraysungur.maraton2.soruCozumu054;

public class Yilan extends Surungen {

	public Yilan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		this.setTehlikelimi(true);
	}

	@Override
	public void surun() {
		System.out.println(this.getAd() + "  isimli yılan sürünüyor...");

	}

	@Override
	public void sesCikar() {
		System.out.println(getAd() + "  tıslama sesi çıkarıyor..");
	}

}
