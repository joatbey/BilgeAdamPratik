package lesson005;

public class Question42 {

	public static void main(String[] args) {
		int[] sayilar = {-5,- 2, 4, 10, 5 };
		// bu sayi çifttir ve bu sayı tektir şeklinde çıktı alan ve
		// dizideki tüm sayıların toplamını veren program
		//ve 
		// dizinin içindeki elemanların toplamını yazdıralım.

		int toplam = 0 ;
		for (int i = 0; i < sayilar.length; i++) {
			toplam = toplam + sayilar[i];
			if (sayilar[i] % 2 == 0) {
				System.out.println("bu sayi '" + sayilar[i]  + "' çifttir");
			} else if (sayilar[i] % 2 != 0) {
				System.out.println("bu sayi '" + sayilar[i] + "' tektir");

			}
		}
		
		System.out.println("toplam: "+ toplam);
	}

}
