package lesson007;

import java.util.Scanner;

public class Question56 {

	public static void main(String[] args) {

		// parametre olarak girilien isim ve soyisimi alıp ekrana
		// yazdıran bir method yazalım

		//burada 
		String name = inputName();
		String surname = inputSurname();
		showInformation(name, surname);
	}

	private static void showInformation(String name, String surname) {
		System.out.println("İsminiz: " + name + " Soy İsminiz : " + surname);
	}

	private static String inputName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("isim giriniz");
		String name = scanner.nextLine();
		return name;
	}

	private static String inputSurname() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("isim giriniz");
		String surname = scanner.nextLine();
		return surname;
	}

	// AccessModifier
	// private --> Bulunduğu class
	// public --> Bütün proje içinden erişebniliriz
	// protected --> aynı package, inherit alan classlar da erişebilir.
}