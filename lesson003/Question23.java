package lesson003;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		// Girilen sayının faktoryelini bulan program
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı giriniz : ");
		int sayi = input.nextInt();
		int faktoryel = 1;
		for (int i = 1; i <= sayi; i++) {
			faktoryel = faktoryel * i;
		}
		System.out.println("faktoryeli : " + faktoryel);
	}

}
