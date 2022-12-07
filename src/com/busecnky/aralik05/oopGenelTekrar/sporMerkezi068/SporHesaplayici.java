package com.busecnky.aralik05.oopGenelTekrar.sporMerkezi068;

public class SporHesaplayici {

	//Yapılan spor çeşidine göre kişinin ağırlığını vaz alarak harcanan kaloriyi hesaplayan sınıf
	
	public final static double KosuKaloriYakmaPerMinute1000KGAgirlik = 10; //100 kg bir insanın 1 dakika koştuğu zaman 10 kalori yakar.
	public final static double MekikKaloriYakmaPerMinute1000KGAgirlik = 5;
	public final static double IpAtlamaKaloriYakmaPerMinute1000KGAgirlik = 15;
	public final static double SinavKaloriYakmaPerMinute1000KGAgirlik = 20;
	
	
	private double kosuKaloriPerMinute;
	private double mekikKaloriPerMinute;
	private double ipAtlamaKaloriPerMinute;
	private double sinavKaloriPerMinute;
	
	public SporHesaplayici(int agirlik) {
		this.kosuKaloriPerMinute = agirlik * KosuKaloriYakmaPerMinute1000KGAgirlik / 100;
		this.mekikKaloriPerMinute = agirlik * MekikKaloriYakmaPerMinute1000KGAgirlik / 100;
		this.ipAtlamaKaloriPerMinute = agirlik * IpAtlamaKaloriYakmaPerMinute1000KGAgirlik / 100;
		this.sinavKaloriPerMinute = agirlik * SinavKaloriYakmaPerMinute1000KGAgirlik / 100;
	}
	
	
	//yapılacak spor hareketi ve süreye göre harcanan kaloriyi döner.
	public int sporYap(String yapilacakHareket, int kacDakikadaYapildi) {
		int harcananKalori = 0;
		
		if(yapilacakHareket.equalsIgnoreCase("Koşu")) {
			harcananKalori = (int) (this.kosuKaloriPerMinute * kacDakikadaYapildi);
		} else if(yapilacakHareket.equalsIgnoreCase("mekik")) {
			harcananKalori = (int) (this.mekikKaloriPerMinute * kacDakikadaYapildi);
		} else if(yapilacakHareket.equalsIgnoreCase("ipatlama")) {
			harcananKalori = (int) (this.ipAtlamaKaloriPerMinute * kacDakikadaYapildi);
		} else if(yapilacakHareket.equalsIgnoreCase("Şınav")) {
			harcananKalori = (int) (this.sinavKaloriPerMinute * kacDakikadaYapildi);
		}
		
		
		
		return harcananKalori;
	}
	
	
	
	
}
