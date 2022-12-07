package com.busecnky.kasim24.fileOutputStream041;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_01 {

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
			
			//Olmayan bir dizin verince hata veriyor. Önceden oluşturulmuş bir dizin(bilgisayarda klasör) gibi bir şey lazım
			fileOutputStream = new FileOutputStream("/Users/busecankaya/Desktop/buse/eclipse/lessons/sabahdersleri/dosya.txt");
			
			//byte byte yazar.  ASCII letters kullanırız.
			fileOutputStream.write(74); //---> J harfini yazar
			fileOutputStream.write(65); //---> A harfini yazar
			fileOutputStream.write(86); //---> V harfini yazar
			fileOutputStream.write(65); //---> A harfini yazar
			fileOutputStream.write(10); //---> Alt sayır
			fileOutputStream.write(72); //---> H harfini yazar
			fileOutputStream.write(73); //---> I harfini yazar
			
			
			
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
