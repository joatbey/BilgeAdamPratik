package lesson016.InterfaceUygulama;

import java.util.ArrayList;
import java.util.List;

public class Kutuphane implements IKutuphaneManager {

	private String name;
	private List<Kitap> kitapListesi;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Kitap> getKitapListesi() {
		return kitapListesi;
	}

	public void setKitapListesi(List<Kitap> kitapListesi) {
		this.kitapListesi = kitapListesi;
	}

	public Kutuphane(String name, List<Kitap> kitapListesi) {
		super();
		this.name = name;
		this.kitapListesi = new ArrayList<>();
	}

	public Kutuphane(String name) {
		super();
		this.name = name;
		this.kitapListesi = new ArrayList<>();
		System.out.println("Kütüphane oluştu");
	}

	@Override
	public void kitapEkle() {
		String isim = Util.stringDegerAl2("Lütfen Kitap ismi giriniz");
		String yazar = Util.stringDegerAl2("Lütfen yazar ismi giriniz");
		int fiyat = Util.intDegerAl2("Lütfen Kitabın Fiyatını giriniz");
		Kitap kitap = new Kitap(isim, yazar, fiyat);

		kitapListesi.add(kitap);

		System.out.println(isim + " Kütüphaneye eklendi");

	}

	@Override
	public void kitaplariListele() {
		for (Kitap kitap : kitapListesi) {
			System.out.println("İsim: " + kitap.getIsim() + " Fiyatı: " + kitap.getFiyat());
		}
	}

	@Override
	public void yazarIsmineGoreArama() {
		String yazar = new String();
		for (Kitap kitap : kitapListesi) {
			if (kitap.getYazar().equalsIgnoreCase(yazar)) {
				System.out.println(kitap.getIsim());
			}
		}
	}

	public void yazarIsmineGoreAramaAlternatif() {
		String yazar = new String();
		for (int i =0; i <kitapListesi.size() ; i++) {
			if (kitapListesi.get(i).getYazar().equalsIgnoreCase(yazar)) {
				System.out.println(kitapListesi.get(i).getIsim());
			}
		}
	}
	
}
