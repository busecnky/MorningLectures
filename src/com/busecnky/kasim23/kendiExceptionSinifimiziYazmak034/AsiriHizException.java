package com.busecnky.kasim23.kendiExceptionSinifimiziYazmak034;


//Unchecked Exception sınıflarından birinden türeteceğim.
public class AsiriHizException extends ArithmeticException{

	
	//Sağ tıkla --> Source --> Generate Constructors from Superclass'a tıkladık
	public AsiriHizException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	
	//Sağ tıkla --> Source --> Override / Implement Methods -->  printStackTrace
	@Override
	public void printStackTrace() {
		System.out.println("Bu bir aşırı hız exception'dır.Yüksek hız tespit edildi.");
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
