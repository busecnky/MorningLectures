package com.busecnky.kasim22.exceptions032;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	
	
	//TRY - CATCH Blokları
	
	/*
	 * try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		
		//1. BÖlüm
	/*	int x = 20 / 0;
		
		int[] arr = {1,2,3,4};
		
		System.out.println(arr[7]); //LENGTH EXCEPTION HATASINI GÖRMEZ ÜSTTEKİ ARITHMETIC EXCEPTION HATASI VERİR.
		
		//SINAV SORUSUUU:
		//BÖYLE İKİ TANE ÜST ÜSTE HATA VARSA ALTTAKİNİ GÖRMEZ BİLE ÜSTTEKİNE GELİR HATASINI VERİR VE PROGRAM DURUR
		
		
		
		//2.BÖLÜM
		//	catch (Exception e) => Bütün exceptionları yakalarsınız.
		
		try {
			int x = 20 / 0;
		} catch (Exception e) {
			System.out.println("Sıfıra bölme olmaz");
		}
		
		//Burda hatası ne bilmiyorsak exception e yazarız. O yakalar hata vermeden alttaki bloğa geçer ve hata vereceğine sıfıra bölme olmaz yazar.
		//Bişiler deniyorsak
		
		
		
		//Burda hatanın ne olduğunu biliyoruz o yüzden arithmeticexception yazıyoruz.
		//Bu bize projede kritik bir şeyler yapıyorsak hatanın ne olduğunu bilmemiz için önemli!
		try {
			int x = 20 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Sıfıra bölme olmaz");
		}
		//İlgli cihaz hata log dosyasına kayıt atabilir. --> XXYY numaralı cihazdan hatalı veri geliyor.
		
		System.out.println();
		
		//3.BÖLÜM
			//aşağıdaki örnekte try-catch ile exception'ı yakalıyoruz ve programımız kontrolsüz bir şekilde sonlanmıyor
		
		int[] arr = {1,2,3,4};
		
		try {
			System.out.println(arr[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array'in sınır dışına çıkılıyor");
		}
		System.out.println("Hoşçakalın..");
		
		
		//4.BÖLÜM
		//Aldığınız Exception'ın detayını öğrenmek için printStackTrace () methodunu kullanın.
	
		int[] arr2 = {1,2,3,4};
	
		try {
			System.out.println(arr2[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array'in sınır dışına çıkılıyor");
			//e.printStackTrace();   //----------> bunu zannetmeyelim ki hata verdi ve sistemden çıktı değil! Biz yazdırıyoruz bunu bilgi için. Alttaki satıra geçiyor yoksa.
		//ya da bunu kırmızı yazmasın diye şu şekilde de halledebiliriz.
			String logYazilacakMesaj = e.toString();
			System.out.println(logYazilacakMesaj);
			System.out.println(e); //!!! Yukarıdaki iki satır yerine
		}
		System.out.println("Hoşçakalın..");
		
		
		
		System.out.println("***** 5.Bölüm ***** ");
		//5. BÖlüm
		//Birden çok exception yakalama
		
		
				
				
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Lütfen bir sayı giriniz");
			int bolen = scanner.nextInt();
			
			
			int x = 20 / bolen;
		
		int[] arr3 = {1,2,3,4};
		System.out.println(arr3[7]);
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array'in sınır dışına çıkılıyor");
		}
		catch (ArithmeticException e) {
			System.out.println("0'a bölme hatası");
		}
		catch (Exception e) { //--------------------> Sen olabilecek hataları gördün ama başka bir hata da çıkabilir. Bu durum olmasın diye ne olur ne olmaz bi genel exception koymalı.
			System.out.println("Tahmin edilemeyen bir hata oluştu");
			e.printStackTrace();
		}
		System.out.println("Bye..");
		
		// üstteki SINAV SORUSU
		//Birden fazla hata ekledin bakalım ne oldu
		
		
		//6.Bölüm
		//null pointer exception yakalayan yok
		
		Scanner scanner = new Scanner(System.in);
		int bolen = scanner.nextInt();
		String s = null;
		
			try {
				int x = 20 / bolen;

				int[] array = {1,2,3,4};
				System.out.println(array[0]);
				System.out.println(s.length());
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array'in sınır dışına çıkılıyor");
			}
			catch (ArithmeticException e) {
				System.out.println("0'a bölme hatası");
			}
			catch (Exception e) { //--------------------> Sen olabilecek hataları gördün ama başka bir hata da çıkabilir. Bu durum olmasın diye ne olur ne olmaz bi genel exception koymalı.
				System.out.println("Tahmin edilemeyen bir hata oluştu");
				e.printStackTrace();
			}
			System.out.println("Bye..");
*/		
		//Bildiğin exceptionları önce yazarsın bilmediğinde en son Exception e yazarsın
		
	
/*	
	//7.Bölüm
			//null pointer exception yakalayan yok
			
			//Scanner scanner = new Scanner(System.in);
			//int bolen = 1;
			String s = null;
		
			
				try {
					
					int sayi = 20 / bolen;

					int[] array = {1,2,3,4};
					System.out.println(array[0]);
					System.out.println(s.length());
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Array'in sınır dışına çıkılıyor");
				}
				catch (ArithmeticException e) {
					System.out.println("0'a bölme hatası");
				}
				catch (Exception e) { //--------------------> Sen olabilecek hataları gördün ama başka bir hata da çıkabilir. Bu durum olmasın diye ne olur ne olmaz bi genel exception koymalı.
					System.out.println("Tahmin edilemeyen bir hata oluştu");
					e.printStackTrace();
				}
			System.out.println("Bye..");
*/				
				
				//8.Bölüm
					
						System.out.println("----------------");
					
						int bolen = 1;
						String s = "test;";
					
						
							try {
								
								int sayi = 20 / bolen;

								int[] array = {1,2,3,4};
								System.out.println(array[0]);
								System.out.println(s.length());
							} catch (ArrayIndexOutOfBoundsException e) {
								System.out.println("Array'in sınır dışına çıkılıyor");
							}
							catch (ArithmeticException e) {
								System.out.println("0'a bölme hatası");
							}
							catch (Exception e) { 
								System.out.println("Tahmin edilemeyen bir hata oluştu");
								e.printStackTrace();
							}
							System.out.println("SON..");		
				
				
				
				
				
				
				
				
				

}
	
}
