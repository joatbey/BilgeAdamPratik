package lesson003;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// TODO girilen sayının 5'in kuvveti olup olmadigini bulan program.
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz:  ");
		int sayi = input.nextInt();

		if (sayi % 5 == 0) {
			System.out.println("Sayı 5'in katı. ");

		} else {
			System.out.println("Sayı 5'in katı değil.");
		}

		// kuvvete bakalım
		System.out.println("*******************");

		//!!! bu alttaki kod neden çalışmıyor anlamadım. 125i almıyor 
//		System.out.println("Sayı giriniz:  ");
//		int sayi2 = input.nextInt();
//		if (Math.log10(sayi2) % Math.log10(5) == 0  ) {
//			System.out.println("sayı 5in kuvvetidir");
//		} else {
//			System.out.println("sayı 5in kuvveti değildir");
//		}
//		System.out.println("*******************");
		// bi tane daha
		System.out.println("Sayı giriniz:  ");
		
		boolean kontrol = true;
		int sayi3 = input.nextInt();
		if (sayi3 == 0) {
			System.out.println("sıfırdan farklı bi değer girin.");
		} else {
			while (kontrol == true) {
				if (sayi3 % 5 == 0) {
					sayi3 = sayi3 / 5;
					if (sayi3 == 1) {
						System.out.println("5'in kuvvetidir.");
						kontrol = false;

					}
				} else {
					System.out.println("5'in kuvveti değildir.");
					kontrol = false;
				}
			}
		}
	}

}
