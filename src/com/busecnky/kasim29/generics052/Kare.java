package com.busecnky.kasim29.generics052;

public class Kare {

	
	private int kenarUzunluk;
	
	public int alanHesapla() {
		return (kenarUzunluk*kenarUzunluk);
	}
	

	public Kare(int kenarUzunluk) {
		this.kenarUzunluk = kenarUzunluk;
	}
	


	public int getKenarUzunluk() {
		return kenarUzunluk;
	}

	public void setKenarUzunluk(int kenarUzunluk) {
		this.kenarUzunluk = kenarUzunluk;
	}

	@Override
	public String toString() {
		return "Kare [kenarUzunluk=" + kenarUzunluk + "]";
	}
	
	
	
	
	
	
	
	
}
