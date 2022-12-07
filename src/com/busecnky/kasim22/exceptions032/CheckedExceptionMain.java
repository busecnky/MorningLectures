package com.busecnky.kasim22.exceptions032;

public class CheckedExceptionMain {

	public static void main(String[] args) {
	

		//Checked exception'lar Exception sınıfından türerler.
		
		//try catch lerde exception yazarak hepsini yakalamayı sağlarız.
		
		
		//Bu tarz exceptionlar program compile edilirken yakalanması ve handle edilmesi (ilgilenilmesi) gereken durumlardır.
		//Bu tarz exceptionlar try-catch blokları içinde throws keywordu kullarak handle edilmelidir.
		//Aksi takdirde compile hatası alırsınız.
		
		//NOT: Checked Exception'lar Runtime Exception'lardan türemez.
		//yani  run etmeden önce hata verir.
		
		
		
		//Örn. thread.sleep();
		
		//Hata yönetimi yapmaya zorladığı exception türleridir.
		
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println("2");

    }
		
		
		
		
		

	}

