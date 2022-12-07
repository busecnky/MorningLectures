package com.busecnky.aralik06.waitNotify01;

import java.util.Scanner;

public class TestSynchronizedThisKullanimi {

	//biz public synchronized kullanıyorduk ama şimdi onu kullanmayacağız ama onun mantığını uygulayacağız.
	//synchronized (this) kullancaz ve bunu kullanarak nesne/obje üzerinde lock kurulur.
	//Yani diğer tüm synchronized yazılan metotlar kitlenir.
	
	//synchronized (this) ile public synchronized thread1Method yazmak aynıdır, aynı görevi icra ederler.
	
	
	
	
	public void thread1Method() {
		synchronized (this) {
			System.out.println("Thread1 is running");
			System.out.println("Thread1 waits...");
			
			try {
				wait();			//wait ile diyoruz ki ben uyucam lock'u (anahtarı/kilidi) teslim edebilirim isteyen alabilir.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread1 is awake and continues...");
		
	}

	public void thread2Method() {
		//thread1 ve thread2 aynı anda giriyor joinlemiştik. Thread 2 daha lock'a geçemeden thread1 bitmesin diye
		//burda uyutuyoruz. Ayrıca thread1 önce başlarsa olmaz, o yüzden thread2yi bir süre bekletiyoruz.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized (this) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Thread2 is running...");
		System.out.println("Please press a key to continue:");
		scanner.nextInt();		//Thread2 Thread1 başladıktan sonra başlamalı o yüzden burada hemen console'dan sayı
								//girmeyelim en az 3 sn bekleyelim. Ve emin olalım ki thread1 önce başlasın.
		
		notify();   //notify ile diyoruz ki bizim bu lock ile işimiz bitti isteyen lock'ı alıp çalışabilir.,
		System.out.println("Thread2 quits");
		}//notify bu kod bloğunun dışına çıkınca haver veriyor. Kodun içinde yapılacaklar var önce onlar yapılır sonra
		//code block'tan çıkınca haber verecekti.
		
		
		
		//eğer notify etmeyi unutursak yazmazsak:
		//thread1 asla uyanmayacak kod sonsuza kadar aynı şekilde kalarak devam edecek.
		
	}

}
