package com.busecnky.aralik01.threads2vers059;


	
public class Yazici2 extends Thread{

		private String isim;

		public Yazici2(String isim) {
			this.isim = isim;
		}

		public String getIsim() {
			return isim;
		}

		public void setIsim(String isim) {
			this.isim = isim;
		}
	
		
		
		// dikkat : 
	    // threadimiz start() ettirildiğinde çalışacak kodlar run() metodunun içine yazılır.
		
		public void run() {
			System.out.println(this.isim + " isimli thread çalışıyor.");
			
			for (int i = 0; i < 5; i++) {
				System.err.println(isim + " yazıyor" + i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}		
	
}
