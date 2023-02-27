package lesson001;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// Girilen notun harf notu olarak değeri
		// 90 üstü AA
		// 80 90 BB, 80 70 CC, 70 60 DD,
		// 60 altı FF
		Scanner input = new Scanner(System.in);
		System.out.println("Notu giriniz:");
		int not = input.nextInt();

		if (not > 100 || not < 0 ) {
			System.err.println("doğru aralıkta değer girin ");
			
		}
		else {
			if (not >= 90) {
				System.out.println("AA");
			} else if (not < 90 && not >= 80) {
				System.out.println("BB");
			} else if (not < 80 && not >= 70) {
				System.out.println("CC");
			} else if (not < 70 && not >= 60) {
				System.out.println("BB");
			} else {
				System.err.println("FF");
			}
		}

	}

}
