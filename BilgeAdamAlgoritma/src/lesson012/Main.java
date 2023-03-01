
package lesson012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Pizza sipariş uygulaması

		// Pizza sınıfı oluşturcaz
		// attribute --> price, vejeteryan mı, normal mi;
		// eğer vejeteryan pizza ise fiyat 300tl
		// normal ise fiyat 200 tl. Construtorda yapalım

		// Mainde 1 pizza oluşturalım

		// 4 tane method yazalım

		// sos ekle--> 50tl eklensin
		// peynirEkle--> 100tl eklensin
		// eve sipariş ver--> 20 tl kruye parası alalım
		// fiş al--> bize pizzamız total price ını vercek

		// YemekSepeti
		// pizza siparişi veriyoruz

		Pizza pizza = new Pizza(true);
		Pizza pizza3 = new Pizza(false);

		System.out.println("Pizza1 " + pizza.getPrice());
		// System.out.println(pizza2.getPrice());

		pizza.sosEkle();
		pizza.sosEkle();
		pizza.sosEkle();
		pizza.peynirEkle();
		pizza.peynirEkle();
		pizza.fisAl();

		menu();
	}
	// kullanıcdan vegi mi normal mi
	// menu

	// 1-Sos Ekle
	// 2-Peynir Ekle
	// 3-fiyatı görüntüle
	// 4-sosCikar
	// 5-PeynirCikar

	public static void menu() {
		Pizza pizza2 = null;
		boolean cikis = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pizzanızı belirtin");
		boolean isVegi = true;
		String pizzaTercihi = scanner.nextLine();
		if (pizzaTercihi.equals("vegi")) {
			pizza2 = new Pizza(isVegi);
		} else if (pizzaTercihi.equals("normal")) {
			isVegi = false;
			pizza2 = new Pizza(isVegi);
		} else {
			System.out.println("böyle bir pizza bulunmamakta");
			cikis = false;
		}
		int sosSayac = 0;
		int peynirSayac = 0;
		while (cikis) {
			System.out.println("Seçim Yapınız ");
			System.out.println("--Menu-- ");
			System.out.println("1- SosEkle ");
			System.out.println("2- PeynirEkle ");
			System.out.println("3- PeynirCikar ");
			System.out.println("4- SosCikar ");
			System.out.println("5- Görüntüle ");
			int secim = scanner.nextInt();

			switch (secim) {
			case 1:
				pizza2.sosEkle();
				break;
			case 2:
				pizza2.peynirEkle();
				peynirSayac++;
				break;
			case 3:
				if (peynirSayac > 0) {
					pizza2.peynirCikar();
					peynirSayac--;
				} else {
					System.out.println("peynir eklenmemiş");
				}
				break;
			case 4:
				pizza2.sosCikar();
				break;
			case 5:
				// System.exit(0);
				pizza2.fisAl();
				cikis = false;
				break;

			default:
				System.out.println("lütfen 1-3 arası sayı giriniz");
				break;
			}
		}
	}

}