package lesson008;

import java.util.Arrays;

public class Question63 {

	public static int[] arrayToplam(int[] array1, int[] array2) {// returns an integer array... // takes 2 int arrays as
																	// parameters

		int[] toplam = new int[array1.length];// gayet straightforward

		for (int i = 0; i < array1.length; i++) {
			toplam[i] = array1[i] + array2[i];
		}
		return toplam;
	}

	// toplamları yazdıracağız

	public static void bilgilerYazdir(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void bilgileriYazdir2(int[] array) {
		System.out.println(Arrays.toString(array)); // Arrays classında toString metodları var. bunlardan biri array
													// alıyor.
	}

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = { 1, 2, 3, 4, 5, 6 };

		int[] toplam = arrayToplam(array1, array2);

		bilgilerYazdir(toplam);
		bilgileriYazdir2(toplam);

	}
// parametre olarak iki tane array alan
	// ve aldıgı arrayleri toplayıp farklı bir arrayin içinde saklayan method

}