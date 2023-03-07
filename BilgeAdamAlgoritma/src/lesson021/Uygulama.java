package lesson021;

import java.time.LocalDate;
import java.util.Scanner;

//1- bir yuk yeri seçme metodumuz olsun
//bu metot limandali yükler arayinden bi yer belirlesin kendine
//eğer mevcut sınırdan fazla ise hata fırlatalım

//2- Kendi exception sınıfımızı yaratalım
//LimanAppExcepion, Daha sonra seçtiğimiz yer null değilse hata fırlatcaz
//kendi yazdığımız exception sınfımızı throw edicez

//3-Hata mesajları için Enum Sınıfı oluşturalım
//ErrorType--> hata mesajının kodu, mesaj kısmı olsun

//4- Ağırlık belirle methodu --> limanımız 100 kilo altı yükleri kabul etmesin
//excepiton fırlatcaz
//double dönsün

public class Uygulama {

	Liman liman;
	static Scanner scanner = new Scanner(System.in);

	public Uygulama() {
		this.liman = new Liman();
	}

	public void yukYeriSec() {
		System.out.println("Lütfen bi yük yeri seçin");
		int index = scanner.nextInt();
		try {
			Yuk yuk = liman.getYukler()[index];
		} catch (Exception e) {
			System.out.println("Lütfen sınırları dahilinde bir yer seçiniz");
		}
	}

	// 0 ile yukler arayimiz kadar bu aralıkta bir yer seçmemiz için ovverride
	// edelim
	// int değer dösün index

	public int yukYeriSec2() {
		liman.getYukler()[0] = new Yuk("1 palet kıyafet", 150, LocalDate.now());
		int index = Util.intDegerAlma("Lütfen Yük yeri seçin");
		
		if (index < 0 || index >= liman.getYukler().length) {
			throw new LimanAppException(EErrorType.OUT_OF_BOUNDS);

		} else if (liman.getYukler()[index] != null) {
			throw new LimanAppException(EErrorType.SEAT_ALREADY_OCCPUIED);
		}
		return index;
	}

	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		try {
			uygulama.yukYeriSec2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}