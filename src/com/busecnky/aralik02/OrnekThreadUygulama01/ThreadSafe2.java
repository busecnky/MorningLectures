package com.busecnky.aralik02.OrnekThreadUygulama01;

import java.util.Random;

public class ThreadSafe2 {
	
	public int count = 0;
	


	//En kolay thread yazma yöntemi olan anoynmous threadler şeklinde yazcakmış hoca
	
	//Synchronized yapıyoruz ya burda bu işleyişi yavaşlatıyor. Bunu engellemek için
		//multilock kullanırız.
		//Buna örnek olarak hoca avm tuvaletlerini verdi.
		//Bir ana kapı var ve içeride 5 adet kabin var diyelim
		//Ana kapı sürekli her giren kitlerse 1 saat sürer belki 10 kişinin tuvalet kullanması
		//Ama eğer ana kapı açık olursa 5 kabinin tamamı kullanılabileceğinden 10 dk sürer.
		//İlk durum tek anahtar oluştuğu için ana kapıyı kitleyen anahtar gibi düşünebiliriz.
		//Bir metotun başına public synchronized ... yazınca bütün yazdıklarımız kitlenmiş oluyo
		//tek bir anahtarla.
		
		//Bu ikinci durum multilock bir sürü anahtar var her kapıya özel
		//bunu nasıl yazıyoruz peki?
		//private Object lock1 = new Object();   ---> bu sayede kilit üretmiş oluyoruz
	
	
	
	
	
	
	//thread safe yapmak için bu metotu yazıyoruz
	public synchronized void uretimTuketim(int degisimSayisi) {
		count = count + degisimSayisi;
		if (degisimSayisi < 0) {
			System.out.println("Stoktan mal çıkışı");
		}else {
			System.out.println("Üretim sonucu stoğa mal girişi");
		}System.out.println("Güncel stok: " + count);
	}
	
	
	
	
	public void threadleriCalistir() {
		
		//2 tane hattım olsun. Biri üretici biri tüketici
		
		//Üretici threasd
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Üretici thread çalıştı.");
				
				for (int i = 0; i < 100; i++) {
					Random r = new Random();
					int uretimSayisi = r.nextInt(10);
					uretimTuketim(uretimSayisi);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Thread1/Üretici sonlandı.");
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Tüketici thread çalıştı.");
				
				for (int i = 0; i < 100; i++) {
					Random r = new Random();
					int tuketimSayisi = r.nextInt(5) * -1;
					uretimTuketim(tuketimSayisi);
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Thread2/Tüketici sonlandı.");
			}
		});
		
		
		
		
		
		thread1.start();
		thread2.start();
		
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		ThreadSafe2 threadsafe = new ThreadSafe2();
		threadsafe.threadleriCalistir();
	
	
	
	
	}

}
