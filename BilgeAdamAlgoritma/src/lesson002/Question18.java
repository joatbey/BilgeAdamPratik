package lesson002;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// girilen char değerinin alfabede olup olmadığını kontrol et
		Scanner input = new Scanner(System.in);
		System.out.println("Bir karakter giriniz");
		char ch = input.next().charAt(0);
		
		int asciiCode = ch;
		if (asciiCode >= 65 && asciiCode<=90) {
			System.out.println("ALFABETİK");
		}
		else if (asciiCode >=97 && asciiCode<= 122) {
			System.out.println("alfabetik ");
		}
		else {
			System.out.println("alfabetik değildir");
		}

	}

}
