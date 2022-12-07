package com.busecnky.kasim29.SerializationUygulama051;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class MainNEsneyiSerilestirveDosyayaYaz {

	
	//ObjectOutputStream: nesneleri byte stream e dönüştürebilmek için böyle bi sınıf yapmışlar
	public static void main(String[] args) {
	
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("otomobil2.bin"))){
			
			Otomobil otomobil1 = new Otomobil("Opel", "Astra", 2018, 123789);
			Otomobil otomobil2 = new Otomobil("Audi", "A3", 2017, 456987);
			Otomobil otomobil3 = new Otomobil("BMW", "1.18", 2015, 789426);
			Otomobil otomobil4 = new Otomobil("Suzuki", "Vitara", 2019, 152852);

			out.writeObject(otomobil1); 
			out.writeObject(otomobil2);
			out.writeObject(otomobil3);
			out.writeObject(otomobil4);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya/dizin bulunamadı");
		}catch (NotSerializableException e) {
			System.out.println("Oopps Otomobil sınıfına 'implements Serializable' yazmayı unuttun!");
		} catch (IOException e) {
			System.out.println("I/O Exception aldık...");
		}
		
		System.out.println("Dosyaya yazılmıştır.");
		
		
		
		

	}

}
