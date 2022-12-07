package com.guraysungur.maraton2.soruCozumu054;

public class Main {

	public static void main(String[] args) {
		
		HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();
        Aslan aslan = new Aslan("Simba", 110, 120);
        Yilan yilan = new Yilan("Terminator", 40, 225);
        hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
        hayvanatBahcesi.bahceyeSurungenEkle(yilan);
        hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan ("Ciko" , 150, 200));
        hayvanatBahcesi.bahceyeSurungenEkle(new Yilan ("Sahmeran" , 40, 200));
        hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun ("Charlie" , 150, 140));
        hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("Kerti", 15, 20));
        
        hayvanatBahcesi.hayvanSesCikarsin(aslan);
        hayvanatBahcesi.hayvanSesCikarsin(yilan);
        System.out.println("\n ! ! ! ! ! ! ! ! !");
        hayvanatBahcesi.hayvaninBilgileriniYazdir("Simba");
        hayvanatBahcesi.hayvaninBilgileriniYazdir("Terminator");
        System.out.println("\n ! ! ! ! ! ! ! ! !");
        hayvanatBahcesi.hayvaniHareketEttir("Ciko");
        hayvanatBahcesi.hayvaniHareketEttir("Sahmeran");
        hayvanatBahcesi.hayvaniHareketEttir("Charlie");
        hayvanatBahcesi.hayvaniHareketEttir("Kerti");
        System.out.println("\n ! ! ! ! ! ! ! ! !");
        hayvanatBahcesi.hayvaninCinsiniBul("Ciko");
        hayvanatBahcesi.hayvaninCinsiniBul("Sahmeran");
        hayvanatBahcesi.hayvaninCinsiniBul("Charlie");
        hayvanatBahcesi.hayvaninCinsiniBul("Kerti");
		
        hayvanatBahcesi.hayvaninBilgileriniYazdir("Kerti");
        
        hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Simba", 11, 30));
        
        
	}

}
