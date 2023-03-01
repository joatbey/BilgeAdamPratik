package lesson015.veteriner;

import java.util.ArrayList;

public class Musteri extends Insan {
	////// FIELDS//////////
	private String adres;
	private ArrayList<Hayvan> hayvanListesi;

	/////// METHODS//////////
	public void bilgileriGoster() {
		System.out.println(toString());
	}

	public void hayvanEkle(Hayvan hayvan) {

		if (hayvanListesi.size() < 3) {
			if (hayvanListesi.add(hayvan)) {// ekleyebiliyorsa true dönüyor.... add methodu ekliyor ve true dönüyor ekleyebiliyorsa...				
				System.out.println(hayvan.toString() + " " + getIsim() + " e eklendi");
			}
		}
	}
	
	public void hayvanlariListele() {
		for(Hayvan hayvan : hayvanListesi) {
			System.out.println(hayvan.getName());
		}
	}

	////// CONSTRUCTORS//////

	public Musteri(String isim, String tcKimlik, String adres) {
		super(isim, tcKimlik);
		this.adres = adres;
		hayvanListesi = new ArrayList<>(); // Musteri nesnesi construct edilirken new ArrayList diyoruz...
	}

	//////// TOSTRING///////////

	@Override
	public String toString() {
		return super.toString() + "Musteri [adres=" + adres + "]" + hayvanListesi;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public ArrayList<Hayvan> getHayvanListesi() {
		return hayvanListesi;
	}

	public void setHayvanListesi(ArrayList<Hayvan> hayvanListesi) {
		this.hayvanListesi = hayvanListesi;
	}

}
