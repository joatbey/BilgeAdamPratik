package lesson002;

import java.util.Scanner;

public class Question12 {
	public static void main(String[] args) {
		// int olarak dışardan 2 sayı alalım
		// iki satının toplamı çift ise true değilse false yaz
		// sayıların toplamımın yarısını yazdır
		Scanner input = new Scanner(System.in);
		System.out.println("integer sayı giriniz :");
		int sayi1 = input.nextInt();
		System.out.println("integer sayı giriniz :");
		int sayi2 = input.nextInt();
		double toplam = sayi1 + sayi2;
		// boolean ciftMi kullanarak
		boolean ciftMi = (toplam % 2 == 0); // if kullanmadan oluyor böyle
		System.out.println(ciftMi);

		if (toplam % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		System.out.println("toplamın yarısı : " + toplam / 2);
	}
}
