package HW002;
import java.util.Scanner;
public class Main {

	static Scanner scanner = new Scanner(System.in);
	static boolean tekrarDon = true;

	public static Televizyon tvKurVeKanallariOlustur() {

		System.out.println("TV markasını girin: ");
		String marka = scanner.nextLine();
		scanner.nextLine();
		System.out.println("TV boyutunu girin:(inç) ");
		String boyut = scanner.nextLine();
		Televizyon televizyon = new Televizyon(marka, boyut);
		televizyon.kuruluMu= true;
		return televizyon;

	}
	
public static void menu() {
		
		Televizyon televizyon = null;

		do {			
			
			
			System.out.println("* * * * * * * * * * *");
			
			System.out.println("\n0 - Çıkış");
			System.out.println("1 - Televizyon Kur"); 
			System.out.println("2 - Televizyonu Aç");
			System.out.println("3 - Sesini Artır");
			System.out.println("4 - Sesi Azalt");
			System.out.println("5 - Kanal Değiştir");
			System.out.println("6 - Kanal Bilgisi Göster");
			System.out.println("7 - Televizyonu Kapat");
			System.out.println("8 - Menüyü Göster\n");
			System.out.println("\nLütfen giriş yapınız  \n");
			System.out.println("* * * * * * * * * * *");

			
			int secim = scanner.nextInt();
			switch (secim) {
			case 0:
				System.out.println("\n Çıkış yapılıyor... \n");
				tekrarDon = false;
				break;
			case 1:
				if (Televizyon.isKuruluMu() == false) {
					televizyon = Main.tvKurVeKanallariOlustur();
				} else {
					System.err.println("TV tekrardan kurulmaya calisiliyor !");
				}
				break;
			case 2:
				Televizyon.tvAc();
				break;
			case 3:
				Televizyon.sesiArtir();
				break;
			case 4:
				Televizyon.sesiAzalt();
				break;
			case 5:
				Televizyon.kanalDegistir();
				break;
			case 6:
				Televizyon.kanalBilgisiGoster();
				break;
			case 7:
				Televizyon.tvKapat();
				break;
			case 8:
				break;
			default:
				System.out.println("Hatalı giriş yaptınız. Dogru değer aralığında giriş yapınız...");
				break;
			}
		} while (tekrarDon);

	}

	public static void main(String[] args) {

		Main.menu();
	}
	
	
	
	
	
}
