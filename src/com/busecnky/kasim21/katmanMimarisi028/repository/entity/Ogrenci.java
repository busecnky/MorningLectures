package com.busecnky.kasim21.katmanMimarisi028.repository.entity;

public class Ogrenci {
	
	
	private String adi;
	private String soyadi;
	 private int id;
	 
	 
	public Ogrenci(String adi, String soyadi, int id) {
	    super();
	    this.adi = adi;
	    this.soyadi = soyadi;
	    this.id = id;
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
	
	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	@Override
	public String toString() {
	    return "Ogrenci [adi=" + adi + ", id=" + id + "]";
	}


	
	
	
	
	
}
