package com.busecnky.aralik06.polymorphismGenelTekrar.araclar;

public class Main {

	public static void main(String[] args) {

		//Otomobil opel = new Otomobil("Opel");
		Otomobil audi = new Otomobil("Audi");
		System.out.println(audi.getMarka());
		audi.cocukKoltuguTak();
		audi.sur();
		
		Kamyon fordKamyon = new Kamyon("Ford");
		fordKamyon.sur();
		
		Benzinlik.benzindoldur(audi);
		Benzinlik.mazotDoldur(fordKamyon);
		
		AraziAraci landrover = new AraziAraci("Land Rover");
		//Benzinlik.mazotDoldur(landrover); => AraziAraci sınıfımızı IBenzinliAraci interface'ini implement ettiği için mazotDoldur() metodu hata verir
		Benzinlik.benzindoldur(landrover);

		// Anonymous Inner Class
		IBenzinliArac opel = new IBenzinliArac() {			
			@Override
			public void benzinKoy() {
				System.out.println("Anonmymous Inner class ile oluşturuduğum opelime benzin konuluyor!");
				
			}
		};
		Benzinlik.benzindoldur(opel);
		
		
		// Polymorphism nedir:
		// Polymorphism çok biçimlilik demektir.
		
		// Interface 'ler ile polymorphism
		IBenzinliArac  benzArac;
		benzArac = new Otomobil("Renault");
		benzArac = new AraziAraci("Toyota Rav4");
		
		// Polymorphism Inheritance
		// Ust sınıftan bir nesne değişkeninin alt sınıftan nesneleri gösterebilmesidir/ tutabilmesidir.
		System.out.println();
		Tasit tasit;
		tasit = new Otomobil("Suzuki");
		tasit.sur();
		tasit = new Kamyon("BMC");
		tasit.sur();
		tasit = new AraziAraci("Jeep");
		tasit.sur();
		
		
		Benzinlik.havaBas(audi, 32);
		Benzinlik.havaBas(fordKamyon, 30);
		
	}

}
