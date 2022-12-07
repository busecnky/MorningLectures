package com.guraysungur.maraton2.soruCozumu054;

public class Aslan extends MemeliHayvan {

	
	
	public Aslan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		setTehlikelimi(true);
	}

	@Override
	public void yuru() {
		System.out.println(this.getAd() + "  isimli aslan yürüyor....");

	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd() + "  kükrüyor...");

	}

}
