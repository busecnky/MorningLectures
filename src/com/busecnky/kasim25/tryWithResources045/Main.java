package com.busecnky.kasim25.tryWithResources045;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	

	/*TRY WİTH RESOURCES KULLANIMI
	 * Closeable interface ini implement eden herhangi bir sınıfı try-with-resources ile kullanabilirsiniz.
	 * Bu şekilde extra finally code block unu yazmak zorunda kalmazsınız.
	 
	 
	 try (declare resources here) {
		
	} catch (Exception e) {
		// exception handling
	}	 
	 */
	
	public static void main(String[] args) {
		
	

		try (FileWriter writer = new FileWriter("markalar.txt")) {  //eğer sen burda yazarsan finally i ben kendim yaparım diyo sistem
			
			Scanner scanner = new Scanner(System.in);
			String marka = "";
			
			//Kullanıcıdan marka girmesini isteyin
			//Kullanıcı -1 girene kadar kullanıcının girdiği marka bilgisini markalar.txt doyasına yazdırın.
			while(true) {
				System.out.println("Lütfen bir marka giriniz.");
				marka = scanner.nextLine();
			
				if(marka.equals("-1")) {
					System.out.println("Programdan çıkılıyor. Lütfen dosyayı kontrol edin...");
					break;
				}
			writer.write(marka + "\n");
			
			}	
			
		}catch (IOException e) {
			System.out.println("I/O Exception aldık");
		}
		
		
		

	}

}
