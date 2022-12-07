package com.busecnky.kasim18.priorityQueue027;

public class Ogrenci implements Comparable<Ogrenci> {
	
	private String ad;
	private int id;
	
	
	
	
	public Ogrenci(String ad, int id) {
		super();
		this.ad = ad;
		this.id = id;
	}



	public String getAd() {
		return ad;
	}



	public void setAd(String ad) {
		this.ad = ad;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	
	


	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", id=" + id + "]";
	}



	@Override
	public int compareTo(Ogrenci ogrenci) {
		// Şuanki öğrencimizle paramtre olarak gelen ogrenci nesnesini karşılaştırmamız lazım..
		if (this.id < ogrenci.id) {
			return -1;
		}
		else if (this.id > ogrenci.id)
		{
			return 1;
		}
		else // eşit olma durumu
		{
			return 0;
		}
		
		// büyükten küçüğe sıralamak için > ve > işaretlerinin yerini değiştirin..
	}
	
	

}
