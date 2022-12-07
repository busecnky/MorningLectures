package com.busecnky.aralik06.semaphores02;

import java.util.concurrent.Semaphore;

public class AdUzerindenDosyaKopyalayici {
	
	
	
	private Semaphore semaphore;

	public AdUzerindenDosyaKopyalayici(int threadSayisi) {
		semaphore = new Semaphore(threadSayisi);
		//Bu semaphore'u kullanan kod bloğuna aynı anda sadece threadSayisi kadar thread girebilir!

		
	}
	
	
	
	public void dosyaKopyalayiciThreadMetohudy(String ip) {
		try {
			//Semaphore elde edilebilecek durumdaysa elde eder, boşta semaphore yoksa aqcuire edemez.
			semaphore.acquire();
			//5 tane threadimiz var hepsi aynı anda çalıştı 
			//Hepsi buraya gelmeye çalıştı 3 tane semaphore için hakkımız var threadSayisini öyle yazmıştık
			//ilk girebilen 3 tane girer. Sonra 2 tanesi kalır.
			//Aşağıda semaphore release a gelirse bi tane thread o çıkar 
			//semaphore içinde bi yer açılır ve sırada bekleyen thread o açılan yere gelir.
			//5incş de aynı şekilde yer boşalınca girer. Sonra hepsi işlevlerini yapıp çıkar
			//Semaphore boşalınca daha sonra tekrar aynı anda hepsi gelirse yine 3 tane alır ve durur.
			//Süreç bu şekilde devam eder
			
			System.out.println("Thread Dosya kopyalamaya başlıyor hedef IP: " + ip);
			Thread.sleep(4000);
			
			

			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread Dosya kopyalamayı bitirdi ve çıkıyor hedef IP: " + ip);
		semaphore.release();
		
	}
	
	

}
