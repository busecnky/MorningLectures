package com.busecnky.aralik06.polymorphismGenelTekrar.araclar;

public class Otomobil extends Tasit implements IBenzinliArac {

	
	public Otomobil(String marka) {		
		super(marka);
	}
	
	
	
	@Override
	public void sur() {
		System.out.println("Otomobil suruluyor...");		
	}
	
	public void cocukKoltuguTak() {
		System.out.println("çocuk koltugu takıldı...");
	}



	@Override
	public void benzinKoy() {
		System.out.println(this.marka + "  araca benzin konuluyor..");
		
	}

}
