package com.busecnky.aralik01.threads3vers060;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main thread çalışıyor...");
		
		//Thread sınıfının içine var olan runnable bi interface koyarız.
		//Burda runnable olması demek o sınıfın içinde bi run metodunun olması demek
		
		//Birden fazla extends edemeyeceğimiz için bazen örn Aslan extends Hayvan implements Runnable gibi
		//Çünkü şu anki yazici örneğinde biz Yazici extends Thread dedik ama tek extendi bu olduğu için sıkıntı yok.
		
		
		//Thread sınıfından iki tane nesne oluşturdum.
		Thread printer1 = new Thread(new Yazici("Printer-1"));
		Thread printer2 = new Thread(new Yazici("Printer-2"));
		
		
		printer1.start();
		printer2.start();
		
		//Main thread startları veriyor ve çıkıyor.
		System.out.println("Main thread bitti, çıkıyor.");
		
		System.out.println("*****Hocanın Sorusu*****");
		
		
	}

}
