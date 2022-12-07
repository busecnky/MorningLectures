package com.guraysungur.maraton2.soruCozumu054;

public abstract class Hayvan {
	
	private String ad;
	private int kilosu;
	private int uzunlugu;
	private boolean tehlikelimi;
	
	
	public abstract void sesCikar();
	
	
	public Hayvan(String ad, int kilosu, int uzunlugu) {	
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunlugu = uzunlugu;
		this.tehlikelimi = false;
	}
	
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getKilosu() {
		return kilosu;
	}
	public void setKilosu(int kilosu) {
		this.kilosu = kilosu;
	}
	public int getUzunlugu() {
		return uzunlugu;
	}
	public void setUzunlugu(int uzunlugu) {
		this.uzunlugu = uzunlugu;
	}
	public boolean isTehlikelimi() {
		return tehlikelimi;
	}
	public void setTehlikelimi(boolean tehlikelimi) {
		this.tehlikelimi = tehlikelimi;
	}


	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlikelimi=" + tehlikelimi
				+ "]";
	}
	
	
	

}
