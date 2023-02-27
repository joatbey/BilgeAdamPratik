package lesson013;

import java.util.Scanner;

public class Sinav {
	// programı run ettiğimde arka tarafta heapte kendine bir yer açıyodu
		static String[] cevapSecenekleri = { "A", "B", "C", "D" };

		private int maxPuan;
		private int sure;
		private int soruSayisi;
		private String ders;
		private String konu;
		private Soru[] sorular;
		private String[] cevaplar;

		public Sinav() {

		}

		public int getMaxPuan() {
			return maxPuan;
		}

		public void setMaxPuan(int maxPuan) {
			this.maxPuan = maxPuan;
		}

		public int getSure() {
			return sure;
		}

		public void setSure(int sure) {
			this.sure = sure;
		}

		public int getSoruSayisi() {
			return soruSayisi;
		}

		public void setSoruSayisi(int soruSayisi) {
			this.soruSayisi = soruSayisi;
		}

		public String getDers() {
			return ders;
		}

		public void setDers(String ders) {
			this.ders = ders;
		}

		public String getKonu() {
			return konu;
		}

		public void setKonu(String konu) {
			this.konu = konu;
		}

		public Soru[] getSorular() {
			return sorular;
		}

		public void setSorular(Soru[] sorular) {
			this.sorular = sorular;
		}

		public String[] getCevapSecenekleri() {
			return cevapSecenekleri;
		}

		public void setCevapSecenekleri(String[] cevapSecenekleri) {
			this.cevapSecenekleri = cevapSecenekleri;
		}

		public String[] getCevaplar() {
			return cevaplar;
		}

		public void setCevaplar(String[] cevaplar) {
			this.cevaplar = cevaplar;
		}

		// Sınav Oluştur methodu yazalım
		public void sinavOlustur() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Lütfen sınav dersini girin");
			ders = scanner.nextLine();

			System.out.println("Lütfen sınav konusunu girin");
			konu = scanner.nextLine();

			System.out.println("Lütfen sınav süresi girin");
			sure = Integer.valueOf(scanner.nextLine());

			System.out.println("Soru Sayisini Girin");
			soruSayisi = Integer.valueOf(scanner.nextLine());
			sorular = new Soru[soruSayisi];

			for (int i = 0; i < sorular.length; i++) {
				// sorular[i] = new Soru();
				Soru soru = new Soru();
				soru.soruOlustur(cevapSecenekleri);
				sorular[i] = soru;
			}

			// String to Integer

			// Dersi alalım
			// Konuyu alalım
			// sınav süresi alalım
			// Soru sayısını alcaz 5
			// 5 tena soru yaratcaz

		}

		public void cevapGir() {
			Scanner scanner = new Scanner(System.in);

			cevaplar = new String[sorular.length];

			for (int i = 0; i < sorular.length; i++) {
				System.out.println(sorular[i].getIcerik());

				for (int j = 0; j < sorular[i].getCevapIcerikleri().length; j++) {
					System.out.println(cevapSecenekleri[j] + "-)" + sorular[i].getCevapIcerikleri()[j]);
				}
				System.out.println("Lütfen cevabınızı giriniz:");
				cevaplar[i] = scanner.nextLine().toUpperCase();
			}

			// Soruları ve şıkları görmemiz lazım
			// aldıgımız cevapları arrayde tutalım
			// kullanıcıdan aldıgımız cevapları cevaplar arrayine atalım

			// miras nedir?
			// A- inheritance
			// B- abstract
		}

		public void cevaplariKontrolEt() {
			// dogruSayisi
			// yanlıs sayisi
			// puanını kullanıcıya gösterilm

			int dogru = 0;
			int puan = 0;
			int yanlis = 0;

			for (int i = 0; i < sorular.length; i++) {
				if (cevaplar[i].equals(sorular[i].getDogruCevap())) {
					dogru++;
					puan += sorular[i].getPuan();
				} else {
					yanlis++;
				}
			}
			System.out.println("doğru cevap sayiniz= " + dogru);
			System.out.println("yanlis cevap sayiniz= " + yanlis);

			System.out.println("toplam puan= " + puan);
		}
}
