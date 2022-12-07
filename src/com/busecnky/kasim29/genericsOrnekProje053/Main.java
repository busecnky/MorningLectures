package com.busecnky.kasim29.genericsOrnekProje053;

public class Main {

	
	//Generic metotlar:
	//Nesneleri tutan bir array içeriyor.
	public static <E> void myGenericMethod(E[] array) {
		
		//Arrayin içindeki şekillerin(burda kare) toplam alanını hesaplasın
		System.out.println("--------");
		
		int toplam = 0;
		for (E obj : array) {
			Sekil sekil = (Sekil) obj;
			toplam = toplam + sekil.alanHesapla();
			System.out.println(sekil.alanHesapla());
		}
		System.out.println("Arrayin toplam alanı: " + toplam);
		
	}
	
	//eğer aşağıda mesela sekiller[0] ve sekiller[1] i ekledik sonuncu index boş kaldı diyelim
	//sekiller = {Dikucgen, Kare , null} olur. O zaman hata alırız.
	//Bu hatanın önüne geçmek içinse; 
	/*
	int toplam = 0;
	for (E obj : array) {
		Sekil sekil = (Sekil) obj;
		if (k != null) {
			toplam = toplam + sekil.alanHesapla();
			System.out.println(sekil.alanHesapla());
		}
	}*/
	
	public static void main(String[] args) {
		
		GeometrikAlan<DikUcgen, Kare> alan1 = new GeometrikAlan<DikUcgen, Kare>(new DikUcgen(4, 10), new Kare(5));
		
		System.out.println("Toplam alan1: " + alan1.geometrikSeklinAlaniniHesapla());
		
		
		GeometrikAlan<Dikdortgen, DikUcgen> alan2 = new GeometrikAlan<Dikdortgen, DikUcgen>(new Dikdortgen(10, 20), new DikUcgen(3, 4));
		
		System.out.println("Toplam alan2: " + alan2.geometrikSeklinAlaniniHesapla());
		
		
		GeometrikAlan<Kare, Kare> alan3 = new GeometrikAlan<Kare, Kare>(new Kare(10), new Kare(5));
		
		System.out.println("Toplam alan3: " + alan3.geometrikSeklinAlaniniHesapla());
		
		
		//Generic metotlar için:
        Kare[] kareArray = new Kare[3];
        kareArray[0] = new Kare(3);
        kareArray[1] = new Kare(4);
        kareArray[2] = new Kare(5);
        Main.myGenericMethod(kareArray);
    
        Dikdortgen[] dArray = new Dikdortgen[3];
        dArray[0] = new Dikdortgen(3,4);
        dArray[1] = new Dikdortgen(4,5);
        dArray[2] = new Dikdortgen(5,7);
        Main.myGenericMethod(dArray);
    
        System.out.println("***********");
        //İçinde 1 dikdörtgen , 1 kare ve 1 dilüçgen nesneleri olan array oluşturun ve myGenericMethod
        //paramerte olarak gönderip toplam alanı ekrana yazdırın.
        
        Sekil[] sekiller = new Sekil[3];
        sekiller[0] = new Kare(3);
        sekiller[1] = new Dikdortgen(5, 6);
        sekiller[2] = new DikUcgen(4, 10);
        Main.myGenericMethod(sekiller);
      
        
		

	}
}
