package com.busecnky.kasim29.ArrayListSerialization050;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjeyiYaz {

	public static void main(String[] args) {
	 
		Ogrenci ogrenci1 = new Ogrenci("Ahmet", 123456, "Bilgisayar Mühendisliği");
		Ogrenci ogrenci2 = new Ogrenci("Zeynep", 954356, "Elektronik Mühendisliği");
		Ogrenci ogrenci3 = new Ogrenci("Okan", 128521, "Maden Mühendisliği");
		
		ArrayList<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
		ogrenciList.add(ogrenci1);
		ogrenciList.add(ogrenci2);
		ogrenciList.add(ogrenci3);
		
		//ArrayListler de F3e tıklayınca görüyoruz ki serializable dan implement edilmiş.
		//Burda serializable özelliğini kullandığım yetmiyor. Ogrenci listesini de implement etmemiz gerekiyor.
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))) {
			
			out.writeObject(ogrenciList);
			
			

			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya yazma hatası.");
			e.printStackTrace();
		} 
		
		System.out.println("Arraylist ve içindeki nesneler dosyaya yazıldı...");

	}

}
