package lesson007;

import java.util.Scanner;

public class Question56alt {

	
	public static void ekranaYaz(String isim , String soyisim) {
		System.out.println("isim : " + isim);
		System.out.println("soyisim: " + soyisim);		
	}
	
	
	
	public static void main(String[] args) {
		// parametre olarak girilien isim ve soyisimi alıp ekrana
		// yazdıran bir method yazalım
		
		
		ekranaYaz("hardcoded at"," hardcoed atoglu");//hardcoded olsun
		
		System.out.println("***********");
		// disardan al parametreleri de 
		Scanner scanner = new Scanner(System.in);
		System.out.println("ad:");
		String ad = scanner.nextLine();
		System.out.println("ad:");
		String soyad = scanner.nextLine();
		
		
		System.out.println("***********");
		ekranaYaz(ad, soyad);
		
		
	}

}
