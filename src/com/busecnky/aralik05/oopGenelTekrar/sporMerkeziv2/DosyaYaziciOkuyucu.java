package com.busecnky.aralik05.oopGenelTekrar.sporMerkeziv2;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.busecnky.kasim29.serializationSerialVersionUID049.Otomobil;

public class DosyaYaziciOkuyucu {

	
	public static void dosyayaYaz(String dosyaAdi, SporMerkeziUye sporMerkeziUye) {
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dosyaAdi))){
			
			out.writeObject(sporMerkeziUye);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		System.out.println("Dosya başarılı bir şekilde serileştirip " + dosyaAdi + " adlı dosyaya yazıldı");

	}
	
	
	
	
	public static SporMerkeziUye dosyadanOku(String dosyaAdi) {
		
		SporMerkeziUye sporMerkeziUye = null;
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(dosyaAdi))){
			
		
			sporMerkeziUye =  (SporMerkeziUye) input.readObject();

			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya/dizin bulunamadı");
		} catch (EOFException e) {								
			System.out.println("Dosya sonu...");
		} catch (IOException e) {
			System.out.println("I/O Exception aldık...");
		} catch (ClassNotFoundException e) {
			System.out.println("Deserialization yaparken Cast edilen Sınıf bulunamadı, sınıf adı yanlış yazılmış olabilir.");
		}
		
		System.out.println("Dosya başarılı bir şekilde deserileştirip okundu");
		return sporMerkeziUye;
		
	}
	
	
}
