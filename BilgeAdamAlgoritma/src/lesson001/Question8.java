package lesson001;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// Kenarları girilen üçgenin türünü yazan program
		Scanner input = new Scanner(System.in);
		System.out.println("ilk kenar girinz");
		float kenar1 = input.nextFloat();
		System.out.println("2. kenar girinz");
		float kenar2 = input.nextFloat();
		System.out.println("3. kenar girinz");
		float kenar3 = input.nextFloat();

		if (kenar1 <= 0 || kenar2 <= 0 || kenar3 <= 0) {
			System.err.println("değer sıfır ya da negatif olamaz");
		} else {

			if (kenar1 == kenar2 && kenar1 == kenar3) {
				System.out.println("Eşkenar");
			} else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
				System.out.println("ikizkenar");
			} else {
				System.out.println("çeşitkenar");
			}
		}
	}

}
