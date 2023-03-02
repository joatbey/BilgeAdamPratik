package lesson018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class MapOrnek2 {

	public static void main(String[] args) {
		String[] ogrenci = { "Ayşe", "Ece", "Mahmut", "Zeynep", "Ali" };
		int[] notlar = { 60, 80, 70, 90, 12 };

		// bunları hashmap haline getirelim...

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		for (int i = 0; i < ogrenci.length; i++) {
			hashMap.put(ogrenci[i], notlar[i]);
		}
		System.out.println(hashMap);

		// hashmapte neye gore sıralanıyor. Hashcodeları hesaplanıyor ona gore
		// sıralanıyor.

		System.out.println("********");
		// LinkedHashMap direkt referansı tuttuğu için attığımız sırayı koruyor.

		HashMap<String, Integer> hashMap2 = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < ogrenci.length; i++) {
			hashMap2.put(ogrenci[i], notlar[i]);
		}
		System.out.println(hashMap2);

		for (Entry<String, Integer> entry : hashMap2.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// arka tarafta bu hashing nasıl çalışıyor ona bakınız...

		System.out.println("********");
		//
		// her ogrencinin 3 notu olacak şimdi:
		String[] ogrenci2 = { "Ayşe", "Ece", "Mahmut", "Zeynep", "Ali" };
		int[][] notlarUclu = { { 60, 60, 60 }, { 80, 80, 80 }, { 70, 70, 70 }, { 90, 90, 90 }, { 12, 12, 12 } };

		HashMap<String, int[]> hashMap3 = new HashMap<String, int[]>();

		for (int i = 0; i < ogrenci2.length; i++) {
			for (int j = 0; j < notlarUclu[i].length; j++) {
				hashMap3.put(ogrenci2[i], notlarUclu[i]);
			}
		}
		System.out.println(hashMap3);// adresi yazıyor ...

		for (Entry<String, int[]> entry : hashMap3.entrySet()) {
			System.out.println(entry.getKey());
			for (int i = 0; i < entry.getValue().length; i++) {
				System.out.println(entry.getValue()[i] + ",");
			}
		}

		int[][] notlar3 = { { 60, 60, 60 }, { 80, 80, 80 }, { 70, 70, 70 }, { 90, 90, 90 }, { 12, 12, 12 } };
		System.out.println("*******");
		HashMap<String, List<Integer>> map3 = new HashMap<>();

		for (int i = 0; i < notlar3.length; i++) {
			int sira = i;
			List<Integer> listNotlar = new ArrayList<>();
			for (int j = 0; j < notlar3[i].length; j++) {
				listNotlar.add(notlar3[i][j]);
			}
			map3.put(ogrenci[i], listNotlar);
		}
		System.out.println(map3); // {Ayşe=[60, 60, 60], Mahmut=[70, 70, 70], Ece=[80, 80, 80], Zeynep=[90, 90,
									// 90], Ali=[12, 12, 12]}

		System.out.println(" * * * ");
		for (Entry<String, List<Integer>> entry : map3.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
