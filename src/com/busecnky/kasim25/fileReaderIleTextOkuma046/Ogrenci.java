package com.busecnky.kasim25.fileReaderIleTextOkuma046;

public class Ogrenci {

	
	private String adSoyad;
	private int id;
	
	
	
	
		public Ogrenci(String adSoyad, int id) {
		super();
		this.adSoyad = adSoyad;
		this.id = id;
	}
	
	
	

	public String getAdSoyad() {
		return adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}




	@Override
	public String toString() {
		return "Ogrenci [adSoyad=" + adSoyad + ", id=" + id + "]";
	}
	
	
	
}
