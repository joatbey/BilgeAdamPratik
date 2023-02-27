package lesson003;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// girilen sayı için çarpım tablosu oluştur
		// 6x1 =6
		// 6x2 =12
		// 6x3 =18 .....

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz : ");
		int sayi = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(sayi + " x " + i + " = " + sayi * i);
		}
		System.out.println("***********");

		// tüm tabloyu oluştur iç içe for kullanarak

		for (int i = 1; i <= 10; i++) { // bu temel ama önemli bir şey nested for loop
			for (int j = 1; j <= 10; j++) { 
				System.out.println(i + "x" + j + " = " + i * j);
			}
		}
	}

}
