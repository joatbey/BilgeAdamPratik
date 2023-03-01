package lesson007;

import java.util.Scanner;

public class Question53 {

	public static void main(String[] args) {
		// iki kez üst üste aynı sayı
		// klavyeden girilene kadar döngü
		// devam edicek
		// üst üste iki sayı girildiğinde
		// o zaman kadar girilen sayıların
		// ortalamasını veren program

		// 1 2 5 9 8 7 7

		Scanner scanner = new Scanner(System.in);

		boolean kontrol = true;
		double eskiSayi = 0;
		double sayi = 0;
		double toplam = 0;
		double ortalama = 0;
		double sayac = 0;

		while (kontrol) {
			System.out.println("Lütfen bir sayı giriniz");
			sayi = scanner.nextInt();
			if (sayi != eskiSayi) {
				toplam = toplam + sayi;
				eskiSayi = sayi;
				sayac++;
			} else {
				kontrol = false;
			}
		}
		ortalama = toplam / sayac;
		System.out.println(ortalama);
	}
}