package com.busecnky.kasim21.EnumOrnek030;

public class EnumOrnek1 {

	
	
	//enum'lar bizi aşağıdaki gibi FİNAL değerleri tek tek yazmaktan kurtarır.
	//enum değerşer, public static ve final'dır.
	public static final int LOW = 1; 
	public static final int MEDIUM = 2; 
	public static final int HIGH = 3; 
	
	
	
	
	//Bu şekilde yazılır:
	enum Size{
		LOW,
		MEDIUM,
		HIGH
	}
	
	
	
	enum Mevsimler{
		İLKBAHAR,
		YAZ,
		SONBAHAR,
		KIŞ
	}
	
	
	public static void main(String[] args) {
		
		//enum:
		//		
		//enumlar değişmeyecek olan sabit değerlerdir:
		//enumlardan nesne türetilmez
		
		Size size = Size.HIGH;
		size = Size.MEDIUM;
		System.out.println(size);
		
		for (Size s : Size.values()) {
			System.out.println(s);
		}
		
		//enumlar ne zaman kullanılır?
		//Değişmez değerleriniz varsa kullanabilirsiniz
		//Mesela ilkbahar yaz kış gibi
		
		Size beden = size.MEDIUM;
		if(beden == size.MEDIUM) {
			System.out.println("Orta - M Beden");
		}
		
		
		System.out.println(Mevsimler.SONBAHAR);
		
		
		
	}
}
