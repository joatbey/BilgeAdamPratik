package lesson003;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// Girilen sayının asal olup olmadığını bulan programı yazalım
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		int sayac = 2;
		for (int i = 2; i <= sayi; i++) {
			if (sayi == 2) {
				System.out.println("asal cunku 2");
				break;
			}
			else if (sayi % i == 0 && sayi != i) {
			
				System.out.println("asal değil " + i + " sayısının katı");// ilk böleni yaz
				break;

			} else if (sayi % i != 0) {
				System.out.println(i + " sayısına tam bölünmüyor.");
				sayac++;
				//System.out.println(sayac);
			}
			if (sayac == sayi) {
				System.out.println("galiba oldu lan ... asal sayı bu");
				break;
			}

		}

		System.out.println("*****************");
		System.out.println("dersteki çözüm: ");
		// Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi giriniz:");

		int sayi2 = scanner.nextInt();

		boolean isPrime = true; // kontrol için boolean isPrime kullandık true olarak tanımlayarak başladık.
		for (int i = 2; i < sayi; i++) { // 2 den başladık ilk satırda
			if (sayi2 % i == 0) {
				isPrime = false; // i'ye kalansız bölünüyorsa kontrolü false yap
			} else {
				isPrime = true; // yoksa dokunma
			}
		}
		// kontrole göre basit bi yazırma satırı ile halledebiliyoruz.
		if (isPrime) {
			System.out.println("sayi asaldır");
		} else {
			System.out.println("asal değildir");
		}

	}

}
