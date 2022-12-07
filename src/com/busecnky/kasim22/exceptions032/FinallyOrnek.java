package com.busecnky.kasim22.exceptions032;

public class FinallyOrnek {

	

	//Dosya kapama, veritabanı bağlantısı kapama, açık bir network soketini kapama gibi
	//işlemler genelde finally kod bloğu içinde yapılır.
	
	
	
	public static void main(String[] args) {
		// Exception alan ve finally çalışan bir örnek
		
		
		try {
			int x = 4 / 0;
		} catch (Exception e) {
			System.out.println("Exception alındı!");
		} finally {
			System.out.println("Finally code bloğunun içine ne yazarsan yaz hep çalışır");
		}
		System.out.println("Bye");
		
		
		
		// Exception almayan ve finally çalışan bir örnek
		
		System.out.println("\n************");
		try {
		String s = "test";
		System.out.println(s.length());
		} catch (Exception e) {
			System.out.println("Exception aldık!");
		} finally {
			System.out.println("Finally code bloğunun içine ne yazarsan yaz hep çalışır");
		}
		System.out.println("Bye");
				
		
	;
				
			
				

		System.out.println("\n++++++++++++");
		try {
			int x = 4 / 0;
		
		} catch (ArithmeticException e) {
			System.out.println("Exception alındı!");
		} finally {
			System.out.println("Finally code bloğunun içinw ne yazarsan yaz hep çalışır");
		}
		System.out.println("Bye");
		
		
		
		
		
		
		
		// Exception alsın ancak exception'ı yakalamayalım
		
				//Çalıştırınca finally yazdı sonra hatayı gösterdi ve sistem durdu
				
				System.out.println("\n************");
				try {
					int x = 4 / 0;
				
				} catch (NullPointerException e) {
					System.out.println("Exception alındı!");
				} finally {
					System.out.println("Finally code bloğunun içine ne yazarsan yaz hep çalışır");
				}
				System.out.println("Bye");
		
		
		

	}

}
