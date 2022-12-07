package com.busecnky.kasim24.fileInputStream042;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainDosyadanOkuma {

	
	public static void main(String[] args) {
			
			//MainDosyadanOkuma.dosyadanTekBirByteOkuma();
			//MainDosyadanOkuma.dosyaninOrtasindanByteOkuma();
			//MainDosyadanOkuma.dosyaninTumunuOkuma();
			
		
		//Soru:
		//Bir metot yazınız. Bir dosyanın n. karakterinden başlayıp m tane karakter okusun ve ekrana yazsın.
		
		
		
		MainDosyadanOkuma.dosyadanIstediginKismiOkuma(7,17);
		

			System.out.println("Hoşçakalın");
			
			
	}

	
	
	public static void dosyadanTekBirByteOkuma() {

		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream("dosya.txt");
			// Dosya yoksa hata verir. Mesela dosya2 yazarsak olmadığı için dosya bulunamadı
			// satırını yazar!

			char c = (char) fileInputStream.read(); // 1 byte'ı int olarak okur. Bunu char'a cast ederek çeviririz.
			System.out.println(c);

			char c2 = (char) fileInputStream.read();
			System.out.println(c2);
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());

			//Bu sıradaki okunan kaçıncı characterse onun ascii table daki değerini döndürür.
			int okunan = fileInputStream.read(); // dosyanın sonuna ulaşıldığında read() -1 döner! 
			System.out.println(okunan);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
		} catch (Exception e) {
			System.out.println("Dosya okuma sırasında hata oluştu!");
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılması esnasında exception aldık");
				}
			}
		}
	}

	
	public static void dosyaninOrtasindanByteOkuma() {

		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream("dosya3.txt");
			//Projeye sağ tıkla new text diyerek eğer dosya3ü oluşturduk

			
			fileInputStream.skip(8);

			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
		} catch (Exception e) {
			System.out.println("Dosya okuma sırasında hata oluştu!");
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılması esnasında exception aldık");
				}
			}
		}
	}
	
	
	public static void dosyaninTumunuOkuma() {

		FileInputStream fileInputStream = null;

		int okunan;
		String s = "";
		//initialize ederken null olarak yazmayalım çıktı nullMerhaba Java! oldu
		//onun yerine String s = ""; şeklinde boş değer atarsak sıkıntı olmuyor.
		
		try {
		
			fileInputStream = new FileInputStream("dosya4.txt");
			
			//dosyanın sonuna gelinmemişse içeri gitmeyecek sonuna gelen kadar içine gircek
		while((okunan = fileInputStream.read()) != -1) {
			s += (char) okunan; 
		}
			System.out.println(s);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası");
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
	
	

	
	private static void dosyadanIstediginKismiOkuma(int n, int m) {
		FileInputStream fileInputStream = null;

		int okunan;
		String s = "";
		
		try {
		
			fileInputStream = new FileInputStream("dosya5.txt");
			
			fileInputStream.skip(n);
			//burası ile istediğin kısımdan başlıyorsun
			int counter = 0;
		while((okunan = fileInputStream.read()) != -1) {
			s += (char) okunan;
			counter++;
			//burası ile istediğin kısımdan kaç tane char okuyacaksın onu belirtiyosun m ile (örn: 17 char oku demişiz)
			if(counter == m) {
			break;
			}
		}
		System.out.println(s);	
		
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası");
		}
	}
	
	

	

}
