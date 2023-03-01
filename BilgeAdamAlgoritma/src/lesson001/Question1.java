package lesson001;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
	
		
		//verilen isim değerlerini hello isim soyisim şeklinde yazdıralım
		String isim = "mehmet";
		String soyisim = "kaya" ; 
		
		System.out.println("Hello "+isim+" "+ soyisim );
		// kullanıcıdan alalım isimi
		
		//input nesnesi oluşturduk ya da girdi deseydik adına Scanner tipinde bir input isimli nesne oluşturduk
		Scanner input = new Scanner(System.in);
		// bu nesne üzerinden 
		System.out.println("Bir isim giriniz.");
		String isim2 = input.nextLine(); // string türünde bir isim objesi input.nextline methoduyla
		System.out.println("Bir soyisim giriniz.");
		String soyisim2 = input.nextLine();
		System.out.println("girilen isim: " + isim2 +"\n"  + "girilen soyisim: "+ soyisim2 );
	}

}
