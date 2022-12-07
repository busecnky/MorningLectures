package com.busecnky.aralik02.producerConsumer03;

public class Main {

	public static void main(String[] args) {
		
		Stock stock = new Stock();
		
		Thread producer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				stock.produce();
				
			}
		});
		
		
		Thread consumer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				stock.consume();
				
			}
		});
		
		
		
		producer.start();
		
		//Stokta başlangıçta biraz mal biriksin istiyoruz...
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		consumer.start();
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
