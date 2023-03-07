package HW002;

public class MuzikKanali extends Kanal {

	public enum MuzikTuru {
		POP, KLASIK, ROCK
	}

	private MuzikTuru muzikTuru;

	public MuzikKanali(String kanalAdi, int kanalNo, MuzikTuru muzikTuru) {
		super(kanalAdi, kanalNo);
		this.muzikTuru = muzikTuru;
	}

	public MuzikTuru getMuzikTuru() {
		return muzikTuru;
	}

	public void setMuzikTuru(MuzikTuru muzikTuru) {
		this.muzikTuru = muzikTuru;
	}
}
