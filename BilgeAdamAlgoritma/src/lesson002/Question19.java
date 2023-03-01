package lesson002;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// girilen karaktein ünlü mü ünsüz mü olduğunu bulan program
		Scanner input = new Scanner(System.in);
		System.out.println("Bir karakter giriniz");
		char ch = input.next().charAt(0);
		int asciiCode = ch;
		System.out.println(ch + " 'nin ascii kodu: " + asciiCode);
		if (ch >= 65 && ch <= 122) {
			switch (ch) {
			case 65, 69, 73, 79, 85, 97, 101, 105, 111, 117:
				System.out.println("ünlü harf");
				break;

			default:
				System.out.println("ünsüz harf");
				break;
			}
		}
		else {
			System.out.println("harf değil");
		}

	}

}
