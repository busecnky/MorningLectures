package com.busecnky.kasim22.icicemetotlardaExceptionHandling033;

public class Main {

	
	
	//1.Durum: Önce try catch siz int x = 20 / 0 ; yazdık ve System.out.println("Function 3 sonu..."); vardı ilk durumda function3 içinde ---> Hata verdi Arithmetic hata
	
	//2. Durum: function3 içi:
//	    try {
//		int x = 20 / 0 ;
//} 		catch (Exception e) {
//		// TODO: handle exception
//		}
//		System.out.println("Function 3 sonu...");   //------> bu durumda çıktı Function 3 sonu...
																	       //Function 2 sonu...
																        	//Function 1 sonu...

	
	// 3 .Durum
	
//	public void function3() {
//	
//	
//			int x = 20 / 0 ;
//		
//		System.out.println("Function 3 sonu...");
//	}
//	
//	public void function2() {
//		try {
//			function3();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		System.out.println("Function 2 sonu...");
//	}
//	
//	
//	
//	public void function1() {
//		function2();
//		System.out.println("Function 1 sonu...");
//	}
//	------------> Bunun çıktısı Function 2 sonu...
							//	Function 1 sonu...
	
	
	//4.Durum
	public void function3() {
		
		
		int x = 20 / 0 ;
	
	System.out.println("Function 3 sonu...");
}

	public void function2() {
	
			function3();
		

		System.out.println("Function 2 sonu...");
	}

	public void function1() {
		try {
				function2();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Function 1 sonu...");
}

	//bunun çıktısı Function 1 sonu...
	
	
	
	
	
	public static void main(String[] args) {

		
		Main main = new Main();
		main.function1();
		
		
		
		
		
		
		
		
		

	}

}
