package com.busecnky.aralik01.threadsSoru061;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main thread çalışıyor...");
		

		
		
		// 3 tane farklı thread sınıfı oluşturun
        // 1. sınıf 0-50 arasında 3'erli saysın
        // 2. sınıf 0-50 arasında 5'erli saysın
        // 3. sınıf 0-50 arasında 7'serli saysın
        // Aralarda 1 sn beklesin her 3 sınıf da
		
		Thread sayici1 = new Thread(new Sayici1("3er 3er Sayici-1"));
		Thread sayici2 = new Thread(new Sayici2("5er 5er Sayici-2"));
		Thread sayici3 = new Thread(new Sayici3("7er 7er Sayici-3"));
		
		sayici1.start();
		sayici2.start();
		sayici3.start();
		
		//Çalıştırıp çıkıyor.
		System.out.println("Main thread bitti, çıkıyor.");
		
	}

}
