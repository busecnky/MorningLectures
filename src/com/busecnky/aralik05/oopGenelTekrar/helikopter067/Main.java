package com.busecnky.aralik05.oopGenelTekrar.helikopter067;

public class Main {

	public static void main(String[] args) {
		
		// Bu ilk oluşturma yöntemi, constructor içinde sen nesneleri new lersin. Burda sadece verileri girersin.
		Helikopter helikopter = new Helikopter("Skorsky-21", 350, 500, "BELL42-15", "PP100", "PP210");
		
		
		System.out.println(helikopter.getMotor().getMotorModel());
		System.out.println(helikopter.getPervaneOn().getPervaneModeli());
		System.out.println(helikopter.getPervaneArka().getPervaneModeli());
		
		
		//------------------------- Bu da ikinci constructor sen burda nesneni oluşturursun. Nesnelerini oluşturduktan sonra verileri girersin.
		Motor m;
		m = new Motor("BELL45-15");		
		Pervane pOn = new Pervane("PP-300");
		Pervane pArka = new Pervane("PP-500");
		Helikopter helikopter2 = new Helikopter("SKR45", 333, 450, m, pOn, pArka);
		
	}
	
	
	
}
