package lesson020;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek2 {
	public static void main(String[] args) {

		String[] array = { "6", "10", "bc", null, "20" };

		// elemaniGetir(array);
		sum(array);
		
		try {
			sum3(array);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	// Parametre olarak array alan ve girdiğimiz değere karşılık gelen indexi
	// getiren
	// bir method yazalım

	public static void elemaniGetir(String[] array) {
		int index = 0;
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Indexi girin");
			index = scanner.nextInt();
			System.out.println(array[index]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(Constant.OUT_OF_INDEX);
		} catch (InputMismatchException e) {
			System.out.println(Constant.MIS_MATCH_EXCEPTION);
		} catch (Exception e) {
			System.out.println(Constant.UNEXPECTED_EXCEPTION);
		}

	}

	// Array içinde gezelim sayısal değerleri int e çeviripi toplayalım
	// döngü sonunda sayıların toplamını ve toplam hata sayısını yazdıralım
	public static void sum(String[] array) {
		int toplam = 0;
		int hataToplam = 0;

		for (String string : array) {
			try {
				toplam += Integer.valueOf(string);
			}
			catch (Exception e) {
				hataToplam++;
			}
		}
		System.out.println("Array Sayiların toplamı: " + toplam + " Hatalı işlemler: " + hataToplam);
	}

	public static void sum2(String[] array) {
		int toplam = 0;
		int hataToplam = 0;

		for (String string : array) {
			if (string == null) {
				throw new NullPointerException("null olamazzzzzz");
			}
			try {
				toplam += Integer.valueOf(string);
			} catch (Exception e) {
				System.out.println(e);
				hataToplam++;
			}
		}
		System.out.println("Array Sayiların toplamı: " + toplam + " Hatalı işlemler: " + hataToplam);
	}

	// null hatasını yönetelim arrayde null değer gelirse nullpointer fırlatalım

	public static void sum3(String[] array) {
		int toplam = 0;
		int hataToplam = 0;

		for (String string : array) {
			try {
				nullCheck(string);
				toplam += Integer.valueOf(string);
			}catch (NullPointerCheck e) {
				System.out.println(e.toString());
				hataToplam++;
			}
			catch (Exception e) {
				System.out.println(e);
				hataToplam++;
			}
		}
		System.out.println("Array Sayiların toplamı: " + toplam + " Hatalı işlemler: " + hataToplam);
	}

	// nullpointer hatasını farklı bir methodda kontrol edelim
	
	//throw thorws
	//unchecked chekd farkı
	public static String nullCheck(String string) throws NullPointerCheck {
		if (string == null) {
			throw new NullPointerCheck("null olamaz");
		}
		return string;
	}
	
	//NullPointerCheck sınıfı oluşturalım
	
}