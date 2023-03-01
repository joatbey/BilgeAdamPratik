package HW001;

import java.util.Random;

public class Takim {
	private String name;
	private int puan;
	private int kasa;

	// constructor/
	public Takim(String name, int kasa) {
		this.name = name;
		this.puan = 0;
		this.kasa = kasa;
	}

	// methods//
	public void macYap(Takim rakip) {
		Random random = new Random();
		int sonuc = random.nextInt(3) + 1; // (0 1 2 verdiği için +1)
		if (sonuc == 1) {
			this.puan += 3;
			this.kasa += 10000;
			System.out.print(this.name + " ve " + rakip.name + " karşılaştılar	==>  ");
			System.out.println(this.name + " 3 puan ve 10.000 TL kazandı.");
		} else if (sonuc == 2) {
			rakip.puan += 3;
			rakip.kasa += 10000;
			System.out.print(this.name + " ve " + rakip.name + " karşılaştılar	==>  ");
			System.out.println(rakip.name + " 3 puan ve 10.000 TL kazandı.");
		} else {
			this.puan += 1;
			rakip.puan += 1;
			this.kasa += 5000;
			rakip.kasa += 5000;
			System.out.print(this.name + " ve " + rakip.name + " karşılaştılar	==>  ");
			System.out.println("Berabere kaldılar takımlar 1'er puan ve 5.000'er TL kazandı.");
		}
	}

	public void kasaGoster() {
		System.out.println(this.name + " takımının kasası: " + this.kasa + " TL");
	}

	public static void puanDurumuGoster(Takim[] takimlar) {
		System.out.println("Puan Durumu:");
		for (Takim takim : takimlar) {
			System.out.println(takim.name + ": " + takim.puan + " puan");
		}
	}

	public static void iflasEtmeDurumunuGoster(Takim[] takimlar) {
		for (Takim takim : takimlar) {
			if (takim.kasa < 5000) {// 5000 den az olması için tüm maçları kaybetmesi gerekiyor...
				System.out.println(takim.name + " iflas etti!");
			}

		}
		
	}

	public static void sampiyonuGoster(Takim[] takimlar) {
		Takim sampiyon = takimlar[0];
		for (int i = 1; i < takimlar.length; i++) {
			if (takimlar[i].puan > sampiyon.puan) {
				sampiyon = takimlar[i];
			}
		}
		System.out.println("Şampiyon: " + sampiyon.name);
	}

}
