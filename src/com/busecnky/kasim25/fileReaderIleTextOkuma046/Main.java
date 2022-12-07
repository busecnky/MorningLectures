package com.busecnky.kasim25.fileReaderIleTextOkuma046;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
	
		List<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
		
		//Scanner ı bi try with resources ile deneyelim
		//bunu yapabilmemizin sebebi hem scanner ın F3'e tıklayınca görebiliriz ki
		//Closeable interface'ini implement ettiği içim try-with-resources yapısı ile kullanılabilir.
		
		try (Scanner sc = new Scanner(new FileReader("liste.txt"))){
			
			//tek tek satırları okuruz bölye
//			String s = sc.nextLine();
//			System.out.println(s);
			
			
			//Tüm satırları okumak için:
			while (sc.hasNextLine()) {
				String okunanSatir = sc.nextLine();
				//System.out.println(okunanSatir);
				
				//Okuduklarımızı nesneler halinde okumak
				String[] arr = okunanSatir.split(",");  //Ali Kaya, 111 => arr[0] = "Ali Kaya"  arr[1] = "111"
				Ogrenci ogr = new Ogrenci(arr[0], Integer.parseInt(arr[1].trim()));
				ogrenciList.add(ogr);
			}
			
			
			
		}catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		}
		
		
		System.out.println(ogrenciList);
		

	}

}
