package lesson001;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// Girilen iki sayının çarpımını veren program.
		int sayi1 = 5;
		int sayi2 = 10;
		int carpim = sayi1 * sayi2;
		System.out.println("çarpım: " + carpim);

		//girilen iki sayının yapalım
		Scanner girdi = new Scanner(System.in);
		System.out.println("Bir sayı giriniz : ");
		int number1 = girdi.nextInt();
		
		System.out.println("Bir sayı daha giriniz : ");
		int number2 = girdi.nextInt();
		
		int carpim2 = number1 * number2 ; 		
		System.out.println("Çarpımımız: " + carpim2 );
		System.out.println("Çarpımımız: " + (number1*number2) );

	}

}
