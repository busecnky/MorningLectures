package com.busecnky.kasim23.javaStreamAPI037;

import java.util.Random;

public class Ogrenci {

	
	private String ad;
	private int okulNo;
	

	public Ogrenci(String ad, int okulNo) {
		super();
		this.ad = ad;
		this.okulNo = okulNo;
	}


	//toString oluşturma
	@Override
	public String toString() {
		return "[Ogrenci ad=" + ad + ", okulNo=" + okulNo + "]";
	}

	public void printSinavNotu() {
		  Random r=new Random();
	        System.out.println("Öğrenci adı:"+this.ad+" Sınav notu"+r.nextInt(0,100));
	}






	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getOkulNo() {
		return okulNo;
	}
	public void setOkulNo(int okulNo) {
		this.okulNo = okulNo;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
