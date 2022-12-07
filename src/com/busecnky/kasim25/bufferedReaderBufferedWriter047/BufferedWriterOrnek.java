package com.busecnky.kasim25.bufferedReaderBufferedWriter047;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterOrnek {

	public static void main(String[] args) {
	
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt" , true))){
		
			writer.write("Fahri Özgün, 443\n");
			writer.write("Aslı Kayhan, 333\n");
			writer.write("Yağız Öz, 123\n");
			writer.flush();  //---> kendisi belli bir sayıya ulaşınca atıyor ben bundan önce kendim eklemek istiyorsam bu aşamada flush diyorum
							//buffered da o ana kadar biriken veriler stringe yazılır.
							//eğer biz flush kullanmazsak buffer belli bir doluluğa gelince veya belirli bir zaman periyodunda otomatik Java tarafından flushlanır.
			
			writer.write("Ayşe Kaya, 555\n");
			writer.write("Çağdaş Özer, 854\n");
			writer.write("Ayhan Kayaç, 956\n");
			
		} catch (IOException e) {
			System.out.println("I/O Exception aldık");
		}
		
		
		
		
		
		

	}

}
