package com.busecnky.kasim23.collectionsFrameworkSorusu040;

import java.util.HashSet;
import java.util.Set;

public class Soru {
	
	private static void ilkTekrarEdenKArakteriBul(String s) {
		
		Set<Character> hashSet = new HashSet<Character>();                
        
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            
            if (hashSet.contains(c))
            {
                System.out.println("Tekrar eden karakter: " + c);
                return;		//----> burdaki return demek burdan çık anlamına geliyor. methodun void mi int mi olmasıyla alakalı değil
            }
            else
            {
                hashSet.add(c);
            }
        }
        
        System.out.println("Tekrar eden karakter bulunamamaıştır");
		
	}

	
	public static void main(String[] args) {
		
		//İlk tekrar eden karakteri bulun
		//Koşullar:
		//1. koşul: Sadece bir for döngüsü kullanabilirsiniz.
		//2. Collections framework ünden yararlanabilirsiniz.
		
		ilkTekrarEdenKArakteriBul("ABBCDEARY"); // => B
		ilkTekrarEdenKArakteriBul("ABCDEARY"); // => A
		
		
		
		
		
	}

	
}
