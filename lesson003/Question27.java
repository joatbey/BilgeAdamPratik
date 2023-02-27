package lesson003;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		// girilen sayının basamaklarının toplamını bulun 127-->1+2+7=10
		// do while kullanın
		// while ile de yapın
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();

		int toplam = 0;
		do {
			toplam = toplam + sayi % 10;
			sayi = sayi / 10;

		} while (sayi > 0);
		{
			System.out.println(toplam);
		}
		System.out.println("*******************");
		
		
		System.out.println("bir Sayı daha giriniz: ");
		int sayi2 = scanner.nextInt();
		int kalan = 0;
		int basamakToplam = 0;
		
		while(sayi2 % 10 > 0 ) {
			kalan = sayi2 % 10;
			sayi2 = sayi2/10;
			basamakToplam= basamakToplam + kalan;
			
		}
		System.out.println(basamakToplam);
		
	}

}
