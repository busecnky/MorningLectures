package com.busecnky.kasim25.bufferedReaderBufferedWriter047;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderOrnek {

	//Buffered readerlar ve buffered writerlar file reader ve file writerlata göre daha hızlıdır.
	
	
	public static void dosyadanBirSatirOku() {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("liste.txt"))){
			
			//Bu tek satır okuyor
			String s = reader.readLine();
			System.out.println(s);
			

			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("Okuma hatası");
		}
	}
	
	
	
	public static void dosyaninTamaminiOku() {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("liste.txt"))){
		
			String s = null; 
			while ((s = reader.readLine()) != null) {
				System.out.println(s);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("Okuma hatası");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		dosyadanBirSatirOku();
		dosyaninTamaminiOku();
		
	

	}

}
