package com.busecnky.aralik06.polymorphismGenelTekrar.araclar;

public class Kamyon extends Tasit implements IMazotluArac {

	
	public Kamyon(String mark) {
		super(mark);	
	}

	@Override
	public void sur() {
		System.out.println("Kamyon sürülüyor..");

	}

	public void damperBakimiYap() {
		System.out.println("Damper bakımı yapılıyor..");
	}

	@Override
	public void mazotKoy() {
		System.out.println(this.marka + "  araca mazot konuluyor...");
	}
	
}
