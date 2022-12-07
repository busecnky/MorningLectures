package com.busecnky.kasim23.kendiCheckedExceptionSinifimiziYazmak035;

import java.util.Scanner;

public class Main {

	
	
	public static void hizKontrol(int hiz) throws AsiriHizException {
		if (hiz > 150) {
			throw new AsiriHizException("Çooook fazla hız yapılıyor!!");
		}
		else if (hiz > 120) {
			throw new AsiriHizException("Aşırı hız yapılıyor!!");
		}else {
			System.out.println("İyi yolculuklar...");
		}
	}
	
	//bu checked bir exception olduğu için throws yapmamız gerekiyor.
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hızı giriniz: ");
		int hiz = sc.nextInt();
		
		
		//Main.hizKontrol(hiz);   ---> checked olduğu için hata mesajı veriyor ya try catch kullanmalısın ya da throws decleration
		
		try {
			Main.hizKontrol(hiz);
		} catch (AsiriHizException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	
	}

}
