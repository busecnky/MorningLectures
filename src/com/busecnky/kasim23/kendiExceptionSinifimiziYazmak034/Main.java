package com.busecnky.kasim23.kendiExceptionSinifimiziYazmak034;

import java.util.Scanner;

public class Main {

	
	
	public static void hizKontrol(int hiz) {
		if (hiz > 120) {
			throw new AsiriHizException("Çok hızlı gidiyor!!");
		}else {
			System.out.println("İyi yolculuklar...");
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hızı giriniz: ");
		int hiz = sc.nextInt();
		
		
//		Main.hizKontrol(hiz);      //Bu haline unchecked exception diyoruz. Ve bu şekilde throwsuz kullanabiliyoruz hata vermiyor
		
		
		try {
			Main.hizKontrol(hiz);
		} catch (AsiriHizException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Bye..");

	}

}
