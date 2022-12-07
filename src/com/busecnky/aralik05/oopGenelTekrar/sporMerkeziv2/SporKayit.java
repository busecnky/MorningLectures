package com.busecnky.aralik05.oopGenelTekrar.sporMerkeziv2;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class SporKayit implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String yapilanSpor;
	private int harcananKalori;
	private LocalDate tarih;
	private LocalTime zaman;
	
	
	
	public SporKayit(String yapilanSpor, int harcananKalori, LocalDate tarih, LocalTime zaman) {
		super();
		this.yapilanSpor = yapilanSpor;
		this.harcananKalori = harcananKalori;
		this.tarih = tarih;
		this.zaman = zaman;
	}



	@Override
	public String toString() {
		return "SporKayit [yapilanSpor=" + yapilanSpor + ", harcananKalori=" + harcananKalori + ", tarih=" + tarih
				+ ", zaman=" + zaman + "]";
	}
	
	
	
	
	
	
}
