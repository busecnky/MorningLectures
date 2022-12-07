package com.guraysungur.maraton2.soruCozumu054;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HayvanatBahcesi {
	
	private List<Surungen> surungenlerList;
	private List<MemeliHayvan> memelilerList;
	private Set<String> hashSetHayvanlar;
	
	
	public HayvanatBahcesi() {
		this.surungenlerList = new ArrayList<Surungen>();  // Hayvanat Bahçesindeki tüm sürüngenler tutulur
		this.memelilerList =  new ArrayList<MemeliHayvan>();  // Hayvanat bahçesindeki tüm Memeli Hayvanlar tutulur
		this.hashSetHayvanlar = new HashSet<String>();  // Hayvanat bahçesindeki tüm hayvanların sadece isimleri String olarak tutulur
	}
	
	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
		if (hashSetHayvanlar.contains(m.getAd()))
		{
			System.err.println("Bu isimde bir hayvan zaten mevcut, aynı isimde ekleme yapılamaz!");
		}
		else
		{
			memelilerList.add(m);
			hashSetHayvanlar.add(m.getAd());
		}
	}
	
	public void bahceyeSurungenEkle(Surungen s) {
		if (hashSetHayvanlar.contains(s.getAd()))
		{
			System.err.println("Bu isimde bir hayvan zaten mevcut, aynı isimde ekleme yapılamaz!");
		}
		else 
		{		
			surungenlerList.add(s);
			hashSetHayvanlar.add(s.getAd());
		}
	}
	
	
	public void hayvanSesCikarsin(Hayvan h) {
		h.sesCikar();
	}
	
	
	public void hayvaninCinsiniBul(String hayvanAdi) {
		for (Hayvan h : surungenlerList) {
			if (h.getAd().equalsIgnoreCase(hayvanAdi)) 
			{
				System.out.println(hayvanAdi + "   bir Sürüngen");
				return;
			}
		}
		
		for (Hayvan h : memelilerList) {
			if (h.getAd().equalsIgnoreCase(hayvanAdi))
			{
				System.out.println(hayvanAdi + "  bir Memeli Hayvan");
				return;
			}
		}
		
		System.out.println(hayvanAdi + "   isimli  hayvan bu Hayvanat Bahçesinde yok!");
	}
	
	
	public void hayvaninBilgileriniYazdir(String hayvanAdi) {
		for (Hayvan h : surungenlerList) {
			if (h.getAd().equalsIgnoreCase(hayvanAdi)) 
			{
				System.out.println(h.toString());
				return;
			}
		}
		
		for (Hayvan h : memelilerList) {
			if (h.getAd().equalsIgnoreCase(hayvanAdi))
			{
				System.out.println(h);
				return;
			}
		}
		
		System.out.println(hayvanAdi + "   isimli  hayvan bu Hayvanat Bahçesinde yok!");
	}
	
	
	public void hayvaniHareketEttir(String hayvanAdi) {
		
		for (Surungen s : surungenlerList) {
			if (s.getAd().equalsIgnoreCase(hayvanAdi))
			{
				s.surun();
				return;
			}
		}
		
		for (MemeliHayvan m : memelilerList) {
			if (m.getAd().equalsIgnoreCase(hayvanAdi))
			{
				m.yuru();
				return;
			}
		}
		
		System.out.println(hayvanAdi + "   isimli  hayvan bu Hayvanat Bahçesinde yok!");
	}
	
}
