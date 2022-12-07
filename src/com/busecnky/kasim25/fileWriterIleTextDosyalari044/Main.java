package com.busecnky.kasim25.fileWriterIleTextDosyalari044;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	
	//FilrWriter ile sadece text dpsyaları yazılabilir
	//write() methodunun içine direk String yazabiliriz.
	
	public static void main(String[] args) {
		

		FileWriter filewriter = null;
		
		try {
			filewriter = new FileWriter("dosyaFW.text",true);
			
			//FileWriter ile dosyaya veriyi byte'a çevirmeden direk String olarak yazabiliriz.

			filewriter.write("Buse Çankaya");
			filewriter.write("Erdem Çankaya");
			
		} catch (IOException e) {
			System.out.println("Dosya açılırken veya yazarken hata oluştu.");
			}finally {
				if (filewriter != null) 
				try {
					filewriter.close();
				} catch (Exception e2) {
					System.out.println("Dosya kapatılırken hata oluştu");
				}					
				
			}
		
		
		//Java 7'de gelen bir özellik ile finally yi uzun uzun yazmayalım demişler
		//tryWithResources ile bir yapı getirmişler
		
		
		
		System.out.println("Hoşçakalın");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
