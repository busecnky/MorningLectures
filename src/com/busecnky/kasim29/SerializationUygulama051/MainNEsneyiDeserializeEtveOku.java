package com.busecnky.kasim29.SerializationUygulama051;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;

public class MainNEsneyiDeserializeEtveOku {

	public static void main(String[] args) {
	
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("otomobil2.bin"))){
			
			Otomobil oto = null;
			
			
			while ((oto = (Otomobil) input.readObject()) != null) {
				if (oto != null) {
					System.out.println(oto);
				}
			}

			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya/dizin bulunamadı");
		} catch (EOFException e) {								
			System.out.println("Dosya sonu...");
		} catch (IOException e) {
			System.out.println("I/O Exception aldık...");
		} catch (ClassNotFoundException e) {
			System.out.println("Deserialization yaparken Cast edilen Sınıf bulunamadı, sınıf adı yanlış yazılmış olabilir.");
		}
		
		
		
		
		

	}

}
