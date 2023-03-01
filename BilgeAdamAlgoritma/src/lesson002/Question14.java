package lesson002;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// girilen 3 sayıyı büyükten küçüğe sıralama

		Scanner input = new Scanner(System.in);
		System.out.println("1.sayi sayı");
		double sayi1 = input.nextDouble();
		System.out.println("2.sayi sayı");
		double sayi2 = input.nextDouble();
		System.out.println("3.sayi sayı");
		double sayi3 = input.nextDouble();

		if (sayi1 == sayi2 && sayi2 == sayi3) {
			System.out.println("farklı sayılar giriniz");
		} else {
			if (sayi1 <= sayi2) {
				if (sayi2 <= sayi3) {
					System.out.println("sayi3> sayi2 > sayi1");
				} else if (sayi3 <= sayi1) {
					System.out.println("sayi2> sayi1 > sayi3");
				} else if (sayi1 < sayi3) {
					System.out.println("sayi2 > sayi3 > sayi1");
				}
			}
			if (sayi2 < sayi1) {
				if (sayi3 <= sayi2) {
					System.out.println("sayi1 > sayi2 > sayi3");
				} else if (sayi3 <= sayi1) {
					System.out.println("sayi1 > sayi3 > sayi2");
				} else if (sayi1 < sayi3) {
					System.out.println("sayi3 > sayi1 > sayi2");
				}
			}
		}
	}
}