package com.busecnky.aralik06.polymorphismGenelTekrar.araclar;

public class Benzinlik {
	
	
	// INTERFACELER İLE POLYMORPHISM ORNEK
	public static void benzindoldur(IBenzinliArac benzinliArac) {
		benzinliArac.benzinKoy();		
	}
	
	public static void mazotDoldur(IMazotluArac mazotluArac) {
		mazotluArac.mazotKoy();
	}
	
	
	// INHERITANCE KULLANARAK POLYMORPHİSM ORNEK
	public static void havaBas(Tasit tasit, int basinc) {
		tasit.aracaHavaBas(basinc);
	}

}
