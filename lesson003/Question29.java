package lesson003;

import java.util.Scanner;

public class Question29 {
	public static void main(String[] args) {
		
		// Kullanıcdan sürekli sayı alcaz
		// kullanıcı 0 a basınca aldığımız sayıların çarpımını yazdırcaz

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı girin, çıkış için 0'a basın");
		
		int sayi = scanner.nextInt();
		int carpim = 1 ;
		int ilkDeger =0 ;
		
		while (sayi != 0) {
			carpim = carpim * sayi;
			System.out.println("Bir sayı daha giriniz ya da çıkmak için 0'a basınız.");
			sayi= scanner.nextInt(); // buradaki sayinin scope'u bu while dongüsü 
			ilkDeger = 1;
		}
		
		if (ilkDeger == 0 ) {
			System.out.println("Programdan çıktınız.");
		}else {
			System.out.println(carpim);
		}
		System.out.println("************");
		
		

		int number;
		int carpim2 = 1;
		boolean sifirMi = false;
		while (sifirMi == false) {
			System.out.println("Sayı girin: ");
			number = scanner.nextInt();
			if (number != 0) {
				carpim2 = carpim2 * number;
				System.out.println(carpim2);
			} else {
				sifirMi = true;
			}
		}
		System.out.println("Programdan çıktınız");
		
		
		
		
		
		
		
		
	}
	
	
}
