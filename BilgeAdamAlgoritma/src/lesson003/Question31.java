package lesson003;
import java.util.Scanner;
public class Question31 {

	public static void main(String[] args) {

		// Girilen sayıda hangi basmakta hangi sayı var onu bulacağız
		// 375
		// birler basamağı ->5
		// onlar basamagı ->7
		// yüzler basamagı-> 3
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int sayi = scanner.nextInt();
		int i = 1;

		while (sayi > 0) {
			System.out.println(i + "'ler basamagı: " + sayi % 10);
			sayi = sayi / 10;
			i = i * 10;
		}
	}
}