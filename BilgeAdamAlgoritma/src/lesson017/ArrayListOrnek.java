package lesson017;

import java.util.ArrayList;

public class ArrayListOrnek {

	public static void main(String[] args) {
		// Bir tane ArrayList oluşturalım
		// bu arraylistin içine manuel şehir atalım
		// bu şehirlerden an ile başlayan varsa
		// bu şehri "xxx";

		ArrayList<String> sehirListesi = new ArrayList<String>();
		sehirListesi.add("Istanbul");
		sehirListesi.add("Izmir");
		sehirListesi.add("Bursa");
		sehirListesi.add("Ankara");
		sehirListesi.add("Kars");
		
		//degerDegistirme(sehirListesi);
		//System.out.println(sehirListesi);
		//degerDegistirme2(sehirListesi);
		//System.out.println(sehirListesi);
		degerDegistirme3(sehirListesi);
		System.out.println(sehirListesi);
	}

	
	public static void degerDegistirme(ArrayList<String> sehirler) {
		for (String sehir : sehirler) {
			if (sehir.startsWith("An")) {//case Sensitive
				sehir = "xxx";
			}
			System.out.println(sehir); 
		}

	}
	public static void degerDegistirme2(ArrayList<String> sehirler) {
		for (int i = 0; i < sehirler.size(); i++) {
			if(sehirler.get(i).toLowerCase().startsWith("an")) {
				sehirler.set(i, "xxx");// set kullanarak ArrrayListimizi değiştirdik
			}
			
		}
	}
	public static void degerDegistirme3(ArrayList<String> sehirler) {
		for (int i = 0; i < sehirler.size(); i++) {
			String deger = sehirler.get(i);
			if(deger.toLowerCase().startsWith("an")) {
				deger = deger.toLowerCase().replaceAll("an", "***");
				System.out.println(deger);
			}
			
		}
	}
	
	
	
}
