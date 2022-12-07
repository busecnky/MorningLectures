package com.busecnky.kasim29.SerializationUygulama051;

import java.io.Serializable;

public class Motor implements Serializable{
	//Serileştirilebilmesi için implements Serializable yazması lazım
	
	
	int motorNo;

	
	
	
		
	public Motor(int motorNo) {
		super();
		this.motorNo = motorNo;
	}
	


	public int getMotorNo() {
		return motorNo;
	}

	public void setMotorNo(int motorNo) {
		this.motorNo = motorNo;
	}
	
	
}
