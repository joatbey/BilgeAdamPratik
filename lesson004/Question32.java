package lesson004;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		// medium diye bi site var makaleler falan
		// hackerRank diye de algoritma pratiklar var

		// girilen sayının mükemmel sayı olup olmadığını kontrol
		Scanner input = new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		int sayi = input.nextInt();
		int toplam = 0;
		for (int i = 1; i <= sayi; i++) {
			if (sayi % i == 0) {
				toplam = toplam + i;
				System.out.println(i + " bölenlerden biri");

			}
		}
		if (sayi == toplam) {
			System.out.println("mükemmel");
		} else {
			System.out.println("mükemmel değil");
		}

	}

}
