package lesson018;

import java.util.HashSet;
import java.util.Scanner;

public class SetOrnek {

	// 2 tane set oluşturalım. tekrarEdenler tekrarEtmeyenler
	// kullanıcıdan bir kelime alacağız.
	// eğer tekrar eden harf varsa tekraredenler setine atalım. tekrar etmeyenler
	// setinden çıkaralım.
	// tekrarEdenleri ve tekrarEtmeyenleri yazdıralım.

	// java
	// tekrarEdenler --> a
	// tekrarEtmeyenler --> j,v
	public static void main(String[] args) {

		// setler unique değerler alır bunu hatırla

		HashSet<Character> tekrarEdenler = new HashSet<Character>();
		HashSet<Character> tekrarEtmeyenler = new HashSet<Character>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz: ");
		String kelime = scanner.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
			for (int j = i + 1; j < kelime.length(); j++) {
				if (kelime.charAt(i) == kelime.charAt(j)) {
					tekrarEdenler.add(kelime.charAt(i));
				}
			}
			if (!tekrarEdenler.contains(kelime.charAt(i))) {
				tekrarEtmeyenler.add(kelime.charAt(i));
			}
		}
		System.out.println("tekrarEdenler: " + tekrarEdenler);
		System.out.println("tekrarEtmeyenler: " + tekrarEtmeyenler);

		System.out.println("******************");
		// j, a, v, a
		// set özelliği--> unique değerler alıyo
		// tekrar etmeyenler--> j, v
		// tekrarEdenler --> a
		
		HashSet<Character> tekrarEdenler2 = new HashSet<Character>();
		HashSet<Character> tekrarEtmeyenler2 = new HashSet<Character>();
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz: ");
		String metin = scanner.nextLine();
		// j, a, v, a
		// set özelliği--> unique değerler alıyo
		// tekrar etmeyenler--> j, v
		// tekrarEdenler --> a
		for (int i = 0; i < metin.length(); i++) {
			if (!tekrarEdenler2.contains(metin.charAt(i)) && !tekrarEtmeyenler2.add(metin.charAt(i))) {
				tekrarEdenler2.add(metin.charAt(i));
				tekrarEtmeyenler2.remove(metin.charAt(i));
			}
		}
		System.out.println("tekrarEdenler");
		for (Character character : tekrarEdenler2) {
			System.out.print(character + " ,");
		}
		System.out.println();
		System.out.println("Tekrar etmeyenler");
		for (Character character : tekrarEtmeyenler2) {
			System.out.print(character + " ,");
		}
	}
}
