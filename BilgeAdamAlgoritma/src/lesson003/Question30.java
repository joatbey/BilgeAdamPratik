package lesson003;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		// Girilen sayıya kadar tek sayıların toplamını bulun:
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int sayi = scanner.nextInt();

		int toplam = 0;
		while (sayi != 0) {
			if (sayi % 2 != 0) {
				toplam = toplam + sayi;
			}
			sayi--;
		}
		System.out.println(toplam);

		System.out.println("*************");
		// aslında bu forluk
		// Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");

		int sayi1 = scanner.nextInt();

		int toplam1 = 0;
		for (int i = 1; i <= sayi1; i++) {
			if (i % 2 != 0) {
				toplam1 += i;
			} 
		}
		System.out.println(toplam1);

	}
}
