package lesson018;

import java.util.HashMap;
import java.util.Scanner;

public class MapOrnek {

	public static void main(String[] args) {
		// character ve int tutan bi map oluşturalım
		// kullanıcıdan vir kelime alalım ve girilen kelimede hangi harften kaç tane var
		// onu yazdıralım
		// ve girilen kelimede hangi harften kaç tane var onu yazdıralım...

		// selamm
		// s-1
		// e-1
		// a-1
		// m-2

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz: ");
		String kelime = scanner.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
			char c = kelime.charAt(i);
			if (hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c) + 1) ; // put yerine replace de yapabilirdik.
			} else {
				hashMap.put(c, 1);
			}
		}
		System.out.println(hashMap);

		//tek tek yazdırmak için:
		for(Character ch : hashMap.keySet()) {
			System.out.println(ch + "-" + hashMap.get(ch)  );
		}
	}

}
