package lesson007;

public class Question57 {

	// topla methodu yazalım
	private static int toplayici(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;
		return toplam;
	}

	private static boolean resitMiKontrol(int sayi) {
		if (sayi < 18) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		// toplam sonucunu kontrol edelim
		// sayının 10 dan büyük olup olmadıgını bulalım

		// metot boolean değer dönsün
		// 18 den büyükse ve eşitse true
		// küçükse false

		int toplamSonuc = toplayici(5, 5);

		boolean kontrol = resitMiKontrol(toplamSonuc);

		System.out.println("Girilen yaş: " + toplamSonuc );
		System.out.println(kontrol ? "Mekana girebilirsiniz" : "Mekana giremezsiniz");// bu satır alttaki ile aynı ?dan
																						// sonrasi ifin içi, :den
																						// sonrası elsein
		System.out.println("**********");
		
		System.out.println("Girilen yaş: " + toplamSonuc );
		if (kontrol) {
			System.out.println("Mekana girebilirsiniz");
		} else {
			System.out.println("Mekana giremezsiniz");
		}
	}

}