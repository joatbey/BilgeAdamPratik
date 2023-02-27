package lesson001;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// girilen sayının tek mi çift mi olduğu
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı giriniz : ");
		int sayi = input.nextInt();
		if (sayi % 2 == 0 ) {
			System.out.println("Sayı çifttir");
		}
		else System.out.println("Sayi tektir");

	}

}