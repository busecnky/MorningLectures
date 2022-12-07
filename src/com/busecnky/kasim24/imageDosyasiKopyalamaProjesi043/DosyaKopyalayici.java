package com.busecnky.kasim24.imageDosyasiKopyalamaProjesi043;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class DosyaKopyalayici {

	
	public static ArrayList<Integer> dosyaIcerigiByteList = new ArrayList<Integer>();
	
	
	public static void dosyaOku(String dosyaAdi) {
		FileInputStream fileInputStream = null;
		
		
		try {
			
			
			fileInputStream = new FileInputStream(dosyaAdi);
			
			int okunan;
			
			while((okunan = fileInputStream.read()) != -1) {
				
				dosyaIcerigiByteList.add(okunan);
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası");
		} catch (Exception e) {
            System.out.println("Bilinemeyen bir hata oluştu");
        }finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılması esnasında exception aldık");
				}
			}
		}
		
	}
	
	public static void kopyala(String dosyaIsmi) {
		FileOutputStream fileOutputStream = null;
		
		try {
			
			fileOutputStream = new FileOutputStream(dosyaIsmi);
			
			for (int deger : dosyaIcerigiByteList) {
				fileOutputStream.write(deger);
			}
			System.out.println("Dosya kopyalandı");
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası");
		} catch (Exception e) {
			System.out.println("Bilinmeyen hata oluştu!");
		}finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılması esnasında exception aldık");
				}
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
	
		DosyaKopyalayici.dosyaOku("/Users/busecankaya/Desktop/buse/sholmes.jpg");
		
		DosyaKopyalayici.kopyala("/Users/busecankaya/Desktop/buse/sholmes_kopya1.jpg");
		DosyaKopyalayici.kopyala("/Users/busecankaya/Desktop/buse/sholmes_kopya2.jpg");
		DosyaKopyalayici.kopyala("/Users/busecankaya/Desktop/buse/sholmes_kopya3.jpg");
		
		
		
	}

}
