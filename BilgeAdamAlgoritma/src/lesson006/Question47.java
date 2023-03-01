package lesson006;

import java.util.Scanner;

public class Question47 {

	public static void main(String[] args) {
		// ikiye ikilik bir array oluşturalım
		// bu arrayin içine isimler yazdırcaz
		// isimleri kullanıcıdan alacağız
		// çıktı olarak

		// 1. Grup
		// ali
		// mehmet

		// 2.Grup
		// ahmet
		// hakan
		Scanner scanner = new Scanner(System.in);
		String[][] grupArray = new String[2][2];

		for (int i = 0; i < grupArray.length; i++) {
			for (int j = 0; j < grupArray[i].length; j++) {
				System.out.println("isim: ");
				String isim = scanner.nextLine();
				grupArray[i][j] = isim;
			}
		}
		// --
		// --
		// String [][] grupArray = {{ahmet,hasan}, {hakan,ayse}}

		for (int i = 0; i < grupArray.length; i++) {
			System.out.println(i + 1 + ". Grup");
			for (int j = 0; j < grupArray[i].length; j++) {
				System.out.println(grupArray[i][j]);
			}
		}

	}

}
