package com.busecnky.aralik01.threads2vers059;

//Bu sınıfı nasıl thread haline getireceğim?
//1.yol:
//Bir class'ı thread sınıfından extend ederseniz(türetirseniz), türettiğiniz bu yeni class da bir Thread olur.



public class Yazici extends Thread{

	private String isim;

	public Yazici(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	
	//Yukarıda extend thread dedikten sonra sınıfa buraya gelip sağ tıklayıp override implements metotlardan run a bastık.
	@Override
	public void run() {
		System.out.println(this.isim + " isimli thread çalışıyor.");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(isim + " yazıyor" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	
	
	
	
}
