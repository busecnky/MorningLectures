package com.busecnky.aralik02.MultiLockKullanimi02.threadliListeYazici;

public class Main {

	public static void main(String[] args) {

		ThreadliListeYazici threadliListeYazici = new ThreadliListeYazici();
		threadliListeYazici.threadlerOlusturCalistir();  // Listelerin boyutlaırnın 1000 olmamasının nedeni threadleirn aynı anda listeye erişiyor olmasıdır.
														 // synchronized kullanmadığımız için böyle oluyor.
		
		
		// Bunun çözümü nedir?
		// 1. çözüm ArrayList yerine Vector kullanırsak uygulamamız thread Safe olur.
		
		// 2.çözüm:
		// list1DegerEkle() ve list2DegerEkle() metodlaırnı synchronized yapalım:
		// public synchronized void list1DegerEkle() 
		// public synchronized void list2DegerEkle()
		
	}

}
