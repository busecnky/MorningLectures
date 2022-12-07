package com.busecnky.kasim29.SerializationUygulama051;

import java.io.Serializable;

public class Otomobil implements Serializable {
	//Serileştirilebilmesi için implements Serializable yazması lazım
	
	
	private static final long serialVersionUID = 1;

	private String marka;
	private String model;
	private int yil;
	private Motor motor;
	
	

	public Otomobil(String marka, String model, int yil, int motorNo) {
		super();
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.motor = new Motor(motorNo);
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		this.yil = yil;
	}



	@Override
	public String toString() {
		return "Otomobil [marka=" + marka + ", model=" + model + ", yil=" + yil + ", motorNo=" + motor.motorNo + "]";
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}



}
