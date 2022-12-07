package com.busecnky.kasim25.serialization048;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;

public class MainNesneyiDeserializeEtveOku {

	public static void main(String[] args) {
	
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("otomobil.bin"))){
			
			//Yazdığımız sırayla okumalıyız
			Otomobil otomobil1 = (Otomobil) input.readObject();
			Otomobil otomobil2 = (Otomobil) input.readObject();
			Otomobil otomobil3 = (Otomobil) input.readObject();
			Otomobil otomobil4 = (Otomobil) input.readObject();
			
			System.out.println(otomobil1);
			System.out.println(otomobil2);
			System.out.println(otomobil3);
			System.out.println(otomobil4);

			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya/dizin bulunamadı");
		} catch (IOException e) {
			System.out.println("I/O Exception aldık...");
		} catch (ClassNotFoundException e) {
			System.out.println("Deserialization yaparken Cast edilen Sınıf bulunamadı, sınıf adı yanlış yazılmış olabilir.");
		}
		
		
		
		
		

	}

}
