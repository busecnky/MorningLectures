package com.busecnky.kasim24.fileOutputStream041;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_02 {

	public static void main(String[] args) {
		
		
		FileOutputStream fileOutputStream = null;
		
		//Dosya açmak için
		//1.yol:
		//Açacağımız dosyayı bir file nesnesi olarak oluşturabiliriz.
		
//		File file = new File("dosya.txt");
//		fileOutputStream = new FileOutputStream(file);
		
		//2.yol
		try {
//			fileOutputStream = new FileOutputStream("dosya.txt");  //Bu şekilde dosya varsa içeriğini siler ve yeniden yazar
			

			
			fileOutputStream = new FileOutputStream("/Users/busecankaya/Desktop/buse/eclipse/lessons/sabahdersleri/dosya.txt",true);
		//böyle dosya ismi ve true dediğimizde üzerine yazar artık sil komple ne varsa yaz yapmaz var olanı günceller.
			
			
			
			//byte byte yazar.  ASCII letters kullanırız.
			fileOutputStream.write(67); //---> C harfini yazar
			fileOutputStream.write(79); //---> O harfini yazar
			fileOutputStream.write(68); //---> D harfini yazar
			fileOutputStream.write(69); //---> E harfini yazar
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya/dizin bulunamadı");
		} catch (IOException e) {
			System.out.println("Dosyaya yazma hatası");
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu.");
		}
		finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılması esnasında exception aldık");
				}
			}
		}
		
		
		System.out.println("Hoşçakalın");
		
		
		
		
		
		
		
		
		
		
		
	}

}
