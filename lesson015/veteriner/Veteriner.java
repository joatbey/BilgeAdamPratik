package lesson015.veteriner;

import java.util.ArrayList;

public class Veteriner extends Insan {
	////// FIELDS//////////

	private String mezunOlduguOkul;
	private int calismaSuresi;
	private ArrayList<Musteri> musteriListesi;

	/////// METHODS//////////
	public void bilgileriGoster() {
		System.out.println(toString());
	}

	public void musteriEkle(Musteri musteri) {
		musteriListesi.add(musteri);

	}

	public void musteriGoster() {
		System.out.println(getIsim() + "in musterileri:");
		for (Musteri musteri : musteriListesi) {
			System.out.println(musteri.getIsim());
		}
	}

	public void kayıtlıHayvanlarıGetir(Musteri musteri) {
		for (Hayvan hayvan : musteri.getHayvanListesi()) {
			if (hayvan.isKayitliMi()) {
				System.out.println(hayvan.getName());
			} else {
				emailGonder(musteri);
			}
		}
	}

	public void emailGonder(Musteri musteri) {
		for (Hayvan hayvan : musteri.getHayvanListesi()) {
			if (hayvan.isKayitliMi()) {
				System.out.println(hayvan.getName());
			}
			else {
				System.out.println(hayvan.getName() + "isimli hayvanı kayıt ettiriniz..");
			}
		}
	}

	////// CONSTRUCTORS//////
	public Veteriner(String isim, String tcKimlik, String mezunOlduguOkul, int calismaSuresi,
			ArrayList musteriListesi) {
		super(isim, tcKimlik);
		this.calismaSuresi = calismaSuresi;
		this.mezunOlduguOkul = mezunOlduguOkul;
		this.musteriListesi = musteriListesi;
	}

	//////// TOSTRING///////////

	@Override
	public String toString() {
		return super.toString() + "Veteriner [mezunOlduguOkul=" + mezunOlduguOkul + ", calismaSuresi=" + calismaSuresi
				+ "]";
	}

}
