package lesson022;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiOrnek {
	public static void main(String[] args) {
	
		List<Integer> sayilar = new ArrayList <>();
		sayilar.add(61);
		sayilar.add(55);
		sayilar.add(78);
		sayilar.add(42);
		sayilar.add(25);
		// 5 ile bolunen sayilari bir listeye atalım ve listeyi yazdıralim StreamApi Kullanarak
		
	
		List<Integer> filtrelenmisListe = sayilar.stream().filter(sayi -> (sayi %5 ==0)).collect(Collectors.toList());
		System.out.println("5'e tam bölünenler listesi: " + filtrelenmisListe);
		
		
		
		// sayilari kendileriyle çarpip yeni bir listeye atalım.
		List<Integer> kareListe = sayilar.stream().map(sayi -> sayi*sayi).collect(Collectors.toList());
		System.out.println("Karelerin alındığı liste : " + kareListe);
		
		
		//kaç tane 5'e bölünen sayi var olduğunu bulalım
		long count5eBolunen = sayilar.stream().filter(sayi -> (sayi %5 ==0)).count();
		int intCount5eBolunen = (int) sayilar.stream().filter(sayi -> (sayi %5 ==0)).count();

		System.out.println("5'e bölünen "+ count5eBolunen+ " tane sayi vardir.");
		//.out.println("5'e bölünen "+ intCount5eBolunen+ " tane sayi vardir.");

		
		
		
		
		
		
		
		
		
		
		
}
}
