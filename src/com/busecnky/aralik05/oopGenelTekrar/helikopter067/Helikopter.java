package com.busecnky.aralik05.oopGenelTekrar.helikopter067;

public class Helikopter {

	private String model;
	private int azamiHiz;
	private int menzil;
	private int hiz;
	
	
	private Pervane pervaneOn = null;
	private Pervane pervaneArka = null;
	
	private Motor motor = null;

	public Helikopter(String model, int azamiHiz, int menzil, String motorModeli, String onPervaneModeli,
			String arkaPervaneModeli) {
		super();
		this.model = model;
		this.azamiHiz = azamiHiz;
		this.menzil = menzil;
		this.motor = new Motor(motorModeli);
		this.pervaneOn = new Pervane(onPervaneModeli);				//Burda bunları bu şekilde tanımlamazsak mainde bunları 
		this.pervaneArka = new Pervane(onPervaneModeli);			//çağırmaya çalıştığımızda nullException alırız.
		
	}
	
	
	public Helikopter (String model, int azamiHiz, int menzil, Motor motor, 
						Pervane onPervane, Pervane arkaPervane) {
		this.model = model;
		this.azamiHiz = azamiHiz;
		this.menzil = menzil;
		this.motor = motor;
		this.pervaneArka = arkaPervane;
		this.pervaneOn = onPervane;
	}
	
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAzamiHiz() {
		return azamiHiz;
	}

	public void setAzamiHiz(int azamiHiz) {
		this.azamiHiz = azamiHiz;
	}

	public int getMenzil() {
		return menzil;
	}

	public void setMenzil(int menzil) {
		this.menzil = menzil;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	public Pervane getPervaneOn() {
		return pervaneOn;
	}

	public void setPervaneOn(Pervane pervaneOn) {
		this.pervaneOn = pervaneOn;
	}

	public Pervane getPervaneArka() {
		return pervaneArka;
	}

	public void setPervaneArka(Pervane pervaneArka) {
		this.pervaneArka = pervaneArka;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
