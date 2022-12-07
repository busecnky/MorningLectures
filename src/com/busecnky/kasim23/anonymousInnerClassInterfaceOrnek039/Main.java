package com.busecnky.kasim23.anonymousInnerClassInterfaceOrnek039;

public class Main {

	//Anonymous Inner Class'lar Interface'ler kullanılarak da oluşturulabilir.
	public static void main(String[] args) {
	

		IUcabilir ucanKaz = new IUcabilir() {
			
			@Override
			public void uc() {
				System.out.println("Kaz uçuyor - saniyede 3 kez kanat çırpıyor.");
				
			}
		};
		
		ucanKaz.uc();
		
		
		
		
	}

}
