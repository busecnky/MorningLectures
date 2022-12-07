package com.busecnky.aralik05.oopGenelTekrar.sporMerkezi068;

public class SporMerkeziUye {

	
	private int uyeNo;
	private String adSoyad;
	private int agirlik;
	private int toplamHarcananKalori;
	
	private SporHesaplayici sporHesaplayici;
	
	public SporMerkeziUye ( int uyeNo, String adSoyad, int agr) {
		this.uyeNo = uyeNo;
		this.adSoyad = adSoyad;
		this.agirlik = agr;
		this.toplamHarcananKalori = 0; // opsiyonel
		this.sporHesaplayici = new SporHesaplayici(agr);
	}
	
	public void sporYap(String yapilacakHareket, int kacDakikaYapildi) {
		int harcananKalori = sporHesaplayici.sporYap(yapilacakHareket, kacDakikaYapildi);
		toplamHarcananKalori += harcananKalori;
		System.out.println(kacDakikaYapildi + " dklık " + yapilacakHareket + " spor hareketi sonucu yakılan kalori: " + harcananKalori);
	}

	public int getUyeNo() {
		return uyeNo;
	}

	public void setUyeNo(int uyeNo) {
		this.uyeNo = uyeNo;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public int getAgirlik() {
		return agirlik;
	}

	public void setAgirlik(int agirlik) {
		this.agirlik = agirlik;
	}

	public int getToplamHarcananKalori() {
		return toplamHarcananKalori;
	}

	public void setToplamHarcananKalori(int toplamHarcananKalori) {
		this.toplamHarcananKalori = toplamHarcananKalori;
	}

	public SporHesaplayici getSporHesaplayici() {
		return sporHesaplayici;
	}

	public void setSporHesaplayici(SporHesaplayici sporHesaplayici) {
		this.sporHesaplayici = sporHesaplayici;
	}
	
	
	
	
	
	
	
}
