package com.busecnky.kasim29.serializationSerialVersionUID049;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class MainNesneyiSerilestirveDosyayaYaz {

	
	//ObjectOutputStream: nesneleri byte stream e dönüştürebilmek için böyle bi sınıf yapmışlar
	public static void main(String[] args) {
	
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("otomobil.bin"))){
			
			Otomobil otomobil1 = new Otomobil("Opel", "Astra", 2018);
			Otomobil otomobil2 = new Otomobil("Audi", "A3", 2017);
			Otomobil otomobil3 = new Otomobil("BMW", "1.18", 2015);
			Otomobil otomobil4 = new Otomobil("Suzuki", "Vitara", 2019);

			out.writeObject(otomobil1); //Java gönderdiğimiz otomobil objesini Object sınıfından bir nesneye dönüştürecek
										//sonra da bunu byte dizisi olarak otomobil.bin dosyasına yazacak
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
		
		
		
		
		
		

	}

}
