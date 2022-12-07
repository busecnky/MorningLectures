package com.busecnky.kasim21.katmanMimarisi028.controller;

import java.util.Scanner;

import com.busecnky.kasim21.katmanMimarisi028.repository.OgretmenRepository;
import com.busecnky.kasim21.katmanMimarisi028.repository.entity.Ogretmen;



public class OgretmenController {

	
private OgretmenRepository ogretmenRepository;
	
	
	public OgretmenController() {
		this.ogretmenRepository = new OgretmenRepository();
	}
	
	
	public void ogretmenEkleme() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eklenecek öğretmenin adını giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Eklenecek öğretmenin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		
	
		System.out.println("Eklenecek öğretmenin TC Kimlik no'sunu giriniz: ");
		int id = scanner.nextInt();
		Ogretmen ogr = new Ogretmen(adi, soyadi, id);
		
		this.ogretmenRepository.save(ogr);
	}
	
	public void ogretmenListesiniGoster() {
		System.out.println("******************************");
		System.out.println("*							 *");
		System.out.println("*		ÖĞRETMEN LİSTESİ	 *");
		System.out.println("*							 *");
		System.out.println("******************************");
		
		for(Ogretmen ogr : this.ogretmenRepository.findAll()) {
			System.out.println(ogr);
		}
	}
	
	
	public void ogretmenSil() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Silinecek öğretmenin idsini giriniz: ");
		int id = scanner.nextInt();
		this.ogretmenRepository.delete(id);
	}
	
	
	public void ogretmenGuncelle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Güncellenecek öğretmenin adını giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Güncellenecek öğretmenin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		
		
		System.out.println("Güncellenecek öğretmenin TC Kimlik no'sunu giriniz: ");
		int id = scanner.nextInt();
		Ogretmen ogr = new Ogretmen(adi, soyadi, id);
		
		this.ogretmenRepository.update(ogr);
		
	}
	
	
	public void ogretmenBul() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bilgilerini görmek istediğiniz öğretmenin numarasını giriniz: ");
		int id = scanner.nextInt();
		Ogretmen ogretmen = this.ogretmenRepository.findById(id);
		System.out.println("\n\nBilgilerini görmek istediğiniz öğrenci: ");
		System.out.println(ogretmen);
	}
	

	
	
	
	
	
	
}
