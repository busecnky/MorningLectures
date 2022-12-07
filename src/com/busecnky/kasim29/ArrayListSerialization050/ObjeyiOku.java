package com.busecnky.kasim29.ArrayListSerialization050;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku {

	public static void main(String[] args) {
	

		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))){
			ArrayList<Ogrenci> ogrenciler = (ArrayList<Ogrenci>) in.readObject();
			
			
			for (Ogrenci ogrenci : ogrenciler) {
				System.out.println(ogrenci);
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) { //Bu en aşağıya gelmişti bunu yukarıya(ortaya) taşıdık
			System.out.println("Class bulunamadı.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okunamadı.");
			e.printStackTrace();
		} 
		
		
		
		
		
		
		
		
		
		
	}

}
