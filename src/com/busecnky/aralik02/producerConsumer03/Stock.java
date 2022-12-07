package com.busecnky.aralik02.producerConsumer03;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Stock {

	Random random = new Random();
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
																	//Buraya capacity soruyor
	//capacity: 10 dedik. (yani max 10 eleman olabilir bu queue'da)
	//Bir tane ReentrantLock lock nesnesi tutuyor, bu lock sınıfı içindeki locklar sayesinde
	//bu queue thread safe ve multilock oluyor.
	
	
	//produce methodu random bir sayı üretip ArrayBlockingQueue 'ya ekleyecek
	public void produce() {
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Integer val = random.nextInt(1000);
			
			try {
				queue.put(val);
				System.out.println("Producer stoğa mal ekliyor: " + val);
				System.out.println("Stok büyüklüğü/Queue güncel size: " + queue.size());

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

	//consume metodu stoktan integer değer çekiyor
	public void consume() {
		while(true) {
		
		
			try {
				Integer val;
				val = queue.take();
				System.out.println("Consumer stoktan mal çekiyor: " + val);
				System.out.println("Stok büyüklüğü/Queue güncel size: " + queue.size());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}

	
	
	
}
