package com.busecnky.kasim21.katmanMimarisi028.repository.entity;

public class Ogretmen {

	
	
	private int tcKimlikNo;
	private String adi;
	private String soyadi;
	
	
	
	public Ogretmen( String adi, String soyadi, int tcKimlikNo) {
		super();
		this.tcKimlikNo = tcKimlikNo;
		this.adi = adi;
		this.soyadi = soyadi;
	}
	
	
	
	
	public int getTcKimlikNo() {
		return tcKimlikNo;
	}
	public void setTcKimlikNo(int tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
