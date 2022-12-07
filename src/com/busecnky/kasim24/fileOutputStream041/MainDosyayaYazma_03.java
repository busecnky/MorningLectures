package com.busecnky.kasim24.fileOutputStream041;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_03 {

	public static void main(String[] args) {
		
		
		FileOutputStream fileOutputStream = null;
		
		//Dosya açmak için
		//1.yol:
		//Açacağımız dosyayı bir file nesnesi olarak oluşturabiliriz.
		
//		File file = new File("dosya.txt");
//		fileOutputStream = new FileOutputStream(file);
		
		//2.yol
		try {
			fileOutputStream = new FileOutputStream("dosya2.txt");  
			
		
			//Dosyaya byte array yazdırma
			byte[] byteArray = {74, 65, 86, 65};
			fileOutputStream.write(byteArray);
			//Burdaki write metodu method overloading yapmış.
		
			
			
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
