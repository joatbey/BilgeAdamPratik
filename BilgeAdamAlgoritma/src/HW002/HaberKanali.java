package HW002;

public class HaberKanali extends Kanal {

	public enum HaberTuru {
		BORSA, SPOR, MAGAZIN
	}

	private HaberTuru haberTuru;

	public HaberKanali(String kanalAdi, int kanalNo, HaberTuru haberTuru) {
		super(kanalAdi, kanalNo);
		this.haberTuru = haberTuru;
	}

		public HaberTuru getHaberTuru() {
		return haberTuru;
	}

	public void setHaberTuru(HaberTuru haberTuru) {
		this.haberTuru = haberTuru;
	}
}
