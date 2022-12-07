package com.busecnky.kasim23.anonymousInnerClasses038;


public class Main {
	

//Java anonymous inner class is an inner class without a name and for which only a single object is created.
//
//Anonymous Inner Class'lar ne zaman faydalıdırlar?
//Bir sınıfın bir methodunu override edip tek bir nesne oluşturmak istediğimiz zaman kullanabilirsiniz.


	public static void main(String[] args) {
		
		Insan vejeteryanInsan = new Insan() {
			public void yemekYe() {
				System.out.println("Sadece sebze ve meyve ye.");
			};
		};

		vejeteryanInsan.yemekYe();
		
		
		Insan insan = new Insan();
		insan.yemekYe();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
