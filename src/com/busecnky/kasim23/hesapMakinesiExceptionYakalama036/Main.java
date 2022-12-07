package com.busecnky.kasim23.hesapMakinesiExceptionYakalama036;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int secim = 0;
		
		
		try {
		
			System.out.println("Birinci sayıyı giriniz: ");
			int sayi1 = scan.nextInt();
			
			System.out.println("İkinci sayıyı giriniz: ");
			int sayi2 = scan.nextInt();
			
			System.out.println("****İşleminizi seçiniz****");
			System.out.println("1-Toplama");
			System.out.println("2-Çıkarma");
			System.out.println("3-Çarpma");
			System.out.println("4-Bölme");
			
			secim = scan.nextInt();
			
			if(secim == 1) {
				System.out.println("Toplama işleminizin sonucu: " + (sayi1 + sayi2));
			}else if(secim == 2) {
				System.out.println("Toplama işleminizin sonucu: " + (sayi1 - sayi2));
			}else if(secim == 3) {
				if (sayi1 > 10000 & sayi2 > 10000) {
					throw new CarpmaLimitException();
				}
				System.out.println("Toplama işleminizin sonucu: " + (sayi1 * sayi2));
			}else if(secim == 4) {
				System.out.println("Toplama işleminizin sonucu: " + (sayi1 / sayi2));
			}
			
		
		} catch (ArithmeticException e) {
			System.out.println("Bir sayı sıfıra bölünemez..");
		} catch (InputMismatchException e) {
			System.out.println("Lütfen inputları doğru formatta girin!");
		} catch (CarpmaLimitException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		System.out.println("Hoşçakalın");
		
		
		
		
		
		
		
		
		

	}

}
