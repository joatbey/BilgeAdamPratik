package lesson001;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// Girilen 3 sayıdan en büyügü yazdıran program
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz");
		int sayi1 = input.nextInt();
		System.out.println("Sayı giriniz");
		int sayi2 = input.nextInt();
		System.out.println("Sayı giriniz");
		int sayi3 = input.nextInt();
		
		int max = sayi1;
		
		if (sayi2> sayi1) {
			max = sayi2;
		}
		if (sayi3 > sayi2) {
			max = sayi3;
			
		}
		System.out.println("en büyük sayı : "+ max);
	}

}
