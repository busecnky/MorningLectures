package com.busecnky.aralik06.polymorphismGenelTekrar.araclar;

public class AraziAraci extends Tasit implements IBenzinliArac {

	
	public AraziAraci(String mark) {
		super(mark); // => this.marka = mark;		
	}

	@Override
	public void sur() {
		System.out.println("Arazi Araci sdürülüyor...");

	}

	public void araziSurusModunaGec() {
		System.out.println("Arazi sürüş moduna geç..");
	}

	@Override
	public void benzinKoy() {
		System.out.println(this.marka + " araca benzin konuluyor...");
	}
	
}
