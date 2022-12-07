package com.busecnky.kasim23.kendiCheckedExceptionSinifimiziYazmak035;

import java.io.IOException;

//Checked exception sınıflarından birinden türeteceğim
public class AsiriHizException extends IOException{

	
	
	public AsiriHizException(String message) {
		super(message);
		
	}

	@Override
	public void printStackTrace() {
		System.out.println("Bu bir Asiri hiz checked exception'dır!");
	}

	
	
	
	
	
	
	
	
	
	
	
}
