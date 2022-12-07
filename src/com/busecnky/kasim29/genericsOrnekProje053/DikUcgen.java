package com.busecnky.kasim29.genericsOrnekProje053;

public class DikUcgen extends Sekil{

	private int kenar1;
	private int kenar2;
	
	@Override
	public int alanHesapla() {
		return ((kenar1*kenar2)/2);
	}
	
	
	public DikUcgen(int kenar1, int kenar2) {
		super();
		this.kenar1 = kenar1;
		this.kenar2 = kenar2;
	}
	
	
	public int getKenar1() {
		return kenar1;
	}
	public void setKenar1(int kenar1) {
		this.kenar1 = kenar1;
	}
	public int getKenar2() {
		return kenar2;
	}
	public void setKenar2(int kenar2) {
		this.kenar2 = kenar2;
	}



	
	
	
	
}
