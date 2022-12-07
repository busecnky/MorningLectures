package com.busecnky.kasim25.bufferedReaderBufferedWriter047;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.busecnky.kasim25.fileReaderIleTextOkuma046.Ogrenci;

public class BufferedReaderOrnek2 {

	public static void main(String[] args) {
	
		
		List<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
		
//		Bu aşağıdaki  new scannerdan itibaren böyle 3lü nesne içinde nesne oluşturmaya composition deniliyor.
		try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("liste.txt")))){
			
			//scanner.hasNextLine => okunacak satır kaldıysa true olur aksi halde false olur
			//Bunu bir while döngüsü içinde kullanarak tüm satırları okuyabiliriz.
			while (scanner.hasNextLine()){
				String okunanSatir = scanner.nextLine();
				
				String[] arr = okunanSatir.split(",");  //Ali Kaya, 111 => arr[0] = "Ali Kaya"  arr[1] = "111"
				Ogrenci ogr = new Ogrenci(arr[0], Integer.parseInt(arr[1].trim()));
				ogrenciList.add(ogr);
				
			}

			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		}
		
		for (Ogrenci o : ogrenciList) {
			System.out.println(o);
		}
		
	}

}
