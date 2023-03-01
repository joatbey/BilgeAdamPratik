package lesson001;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		//verilen iki sayıdan en büyük olanı bulam program 
		int x = 4, y = 6;
		
		if(x>y) {
			System.out.println("daha büyük olan "+ x);
		}
		else if (x == y) {
			System.out.println("iki sayı eşit");
		}
		else if (x<y) {
			System.out.println("daha büyük olan "+ y);
		}
		
		
		//girilen iki sayıdan en büyük olanı bulan program
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayi1 = input.nextInt();
		
		System.out.println("Bir sayı daha giriniz: ");
		int sayi2 = input.nextInt();
		
		if(sayi1>sayi2) {
			System.out.println("daha büyük olan "+ sayi1);
		}
		else if (sayi1 == sayi2) {
			System.out.println("iki sayı eşit");
		}
		else if (sayi1<sayi2) {
			System.out.println("daha büyük olan "+ sayi2);
		}
		
	}

}
