package com.busecnky.aralik05.oopGenelTekrar.sporMerkeziv2;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class SporMerkeziUye implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private int uyeNo;
	private String adSoyad;
	private int agirlik;
	private int toplamHarcananKalori;
	
	private SporHesaplayici sporHesaplayici;
	private ArrayList<SporKayit> sporKayitListesi;
	
	public SporMerkeziUye ( int uyeNo, String adSoyad, int agr) {
		this.uyeNo = uyeNo;
		this.adSoyad = adSoyad;
		this.agirlik = agr;
		this.toplamHarcananKalori = 0; // opsiyonel
		this.sporHesaplayici = new SporHesaplayici(agr);
		this.sporKayitListesi = new ArrayList<SporKayit>();  //yukarıda listeyi oluşturdun diyelim. Burda initialize etmemiz lazım!!(ya da yukarıda)
															//ama bir yerde initialize etmezsek null hatasını alırız!!.
	}
	
	public void sporYap(String yapilacakHareket, int kacDakikaYapildi) {
		int harcananKalori = sporHesaplayici.sporYap(yapilacakHareket, kacDakikaYapildi);
		toplamHarcananKalori += harcananKalori;
		System.out.println(kacDakikaYapildi + " dklık " + yapilacakHareket + " spor hareketi sonucu yakılan kalori: " + harcananKalori);
		
		SporKayit kayit = new SporKayit(yapilacakHareket, harcananKalori, LocalDate.now(), LocalTime.now());
		sporKayitListesi.add(kayit);
		
	}

	public void tumSporKayitlariniGoster() {
		System.out.println("***********************************************");
		System.out.println();
		System.out.println("Üye no: " + this.uyeNo + " Ad Soyad: " + this.adSoyad + " Ağırlık: " + this.agirlik);
		for (SporKayit sk : sporKayitListesi) {
			System.out.println(sk);
		}
		System.out.println("\nToplam harcanan kalori: " + this.toplamHarcananKalori);
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
