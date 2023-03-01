package lesson007;

import java.util.Scanner;

public class Question58 {

	public static void main(String[] args) {

		// parametre olarak int alan ve int döndüren
		// girilen sayının kaç basamaklı oldugunu bulan methodu yazalım
		// 1000 -->string -->length

		// daha sonra farklı bir method yazalım

		// sayının 1000den büyük olup olmadıgını kontrol edelim
		// "1000" --> length 4 ten büyükse 1000 den büyük

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = scanner.nextInt();
		// 1000
		bindenBuyukMu(sayi);

	}

	private static int kacBasamakli(int x) {
		String sayi = String.valueOf(x);// integeri stringe çevirdik
		int basamak = sayi.length(); // basamak sayısı length kadar...
		return basamak; // basamağı return eder...
	}

	public static void bindenBuyukMu(int x) {
		int sayi = x;
		int sayininUzunlugu = kacBasamakli(x);// kacBasamakli methodunun return ettiği int basamak ...
		if (sayininUzunlugu >= 4) {
			System.out.println((x == 1000) ? "sayi tam 1000 hayret bir olay" : "sayi 1000 den büyüktür");
		}
		else {
			System.out.println("sayi 1000 den büyüktür");
		}
	}

}