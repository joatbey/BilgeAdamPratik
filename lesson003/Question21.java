package lesson003;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		//  girilen sayıya kadar olan sayıların toplamı:
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz : ");
		int sayi = input.nextInt();
		int toplam = 0;
		for(int i =0 ; i < sayi ; i++) {
			toplam = toplam + i ;
			
		}
		System.out.println(toplam);
	}

}
