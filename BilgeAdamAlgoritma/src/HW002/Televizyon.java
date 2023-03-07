package HW002;


import java.util.ArrayList;
import java.util.Scanner;

public class Televizyon {
	private String marka;
	private String boyut;
	private static ArrayList<Kanal> kanallar;
	private static boolean acikMi = false;
	protected static boolean kuruluMu = false;
	private static int ses = 0;
	private static int izlenenKanalNo = 1;

	public Televizyon(String marka, String boyut) {
		this.marka = marka;
		this.boyut = boyut;
		this.kanallar = new ArrayList<Kanal>();
		Televizyon.acikMi = false;
		Televizyon.kuruluMu = false;
		kanallariOlustur();
	}

	private void kanallariOlustur() {
		MuzikKanali kanal1 = new MuzikKanali("TRT 3", 1, MuzikKanali.MuzikTuru.KLASIK);
		MuzikKanali kanal2 = new MuzikKanali("MTV", 2, MuzikKanali.MuzikTuru.POP);
		HaberKanali kanal3 = new HaberKanali("CNN Türk", 3, HaberKanali.HaberTuru.SPOR);
		HaberKanali kanal4 = new HaberKanali("NTV", 4, HaberKanali.HaberTuru.MAGAZIN);

		kanallar.add(kanal1);
		kanallar.add(kanal2);
		kanallar.add(kanal3);
		kanallar.add(kanal4);
	}

	public static void tvAc() {
		if (kuruluMu) {
			if (Televizyon.acikMi) {
				System.err.println("TV açık oldugu halde tekrar açılmaya çalışılıyor !");
			} else {
				System.out.println("TV açıldı.");
				Televizyon.acikMi = true;
			}
		} else {
			System.err.println("TV kurulu değil.");
		}

	}

	public static void sesiAzalt() {
		if (Televizyon.acikMi) {
			if (Televizyon.ses == 0) {
				System.out.println("TV sesi minimum seviyede: 0");
			} else {
				Televizyon.ses--;
				System.out.println("TV Sesi: " + Televizyon.ses);
			}
		} else {
			System.err.println("TV açık değil.");
		}

	}

	public static void sesiArtir() {
		if (Televizyon.acikMi) {
			if (Televizyon.ses == 20) {
				System.out.println("Ses sonda." + Televizyon.ses);
			} else if (Televizyon.ses < 20) {

				Televizyon.ses++;
				System.out.println("Ses: " + Televizyon.ses);

			}
		} else {
			System.err.println("TV açık değil.");
		}

	}

	public static void kanalDegistir() {
		if (Televizyon.acikMi) {
			System.out.println("Izlenecek kanal no girin: ");
			Scanner scanner = new Scanner(System.in);
			int temp = scanner.nextInt();
			if (temp <= Televizyon.kanallar.size()) {
				izlenenKanalNo = temp;
				System.out.println("Kanal değiştirildi.");
			} else {
				System.err.println("Istenen kanal kanallar listesinde yok.");
			}

		} else {
			System.err.println("TV açık değil.");
		}
	}

	public static void tvKapat() {
		if (Televizyon.acikMi) {
			System.out.println("TV kapatılılyor.");
			Televizyon.acikMi = false;

		} else {
			System.err.println("TV açık değil.");
		}

	}

	public static void kanalBilgisiGoster() {
		if (Televizyon.acikMi) {
			for (Kanal kanal : Televizyon.kanallar) {
				System.out.println("Kanal No: " + kanal.getKanalNo() + " Adı: " + kanal.getKanalAdi());
				if( kanal.getKanalNo() ==  izlenenKanalNo) {
					System.out.println("İzlenmekte olan Kanal:  No: " + kanal.getKanalNo() + " Adı: " + kanal.getKanalAdi()  );
			}
		} }else {
			System.err.println("TV açık değil.");
		}

	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getBoyut() {
		return boyut;
	}

	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}

	public ArrayList<Kanal> getKanallar() {
		return kanallar;
	}

	public void setKanallar(ArrayList<Kanal> kanallar) {
		this.kanallar = kanallar;
	}

	public static boolean isAcikMi() {
		return acikMi;
	}

	public static void setAcikMi(boolean acikMi) {
		Televizyon.acikMi = acikMi;
	}

	public static boolean isKuruluMu() {
		return kuruluMu;
	}

	public static void setKuruluMu(boolean kuruluMu) {
		Televizyon.kuruluMu = kuruluMu;
	}

	public static int getSes() {
		return ses;
	}

	public static void setSes(int ses) {
		Televizyon.ses = ses;
	}

	public static int getIzlenenKanalNo() {
		return izlenenKanalNo;
	}

	public static void setIzlenenKanalNo(int izlenenKanalNo) {
		Televizyon.izlenenKanalNo = izlenenKanalNo;
	}

}
