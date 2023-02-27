package lesson009;

public class Main {

	// chat gptnin çözümü : 
	public static void main(String[] args) {
		int sayiDizisi[] = { 13, 7, 5, 4, 3, 3, 3, 3 };
		int tekrarSayisi = 0;
		boolean kontrol = false;

		for (int i = 0; i < sayiDizisi.length; i++) {
			tekrarSayisi = 0; // bu forun içinde tanımlıyorum çünkü ilk indis için diğer hepsini deneyecek alttaki for ve tekrarSayisinda sayacak...
			for (int j = i + 1; j < sayiDizisi.length; j++) {// i+1den başlaması akıllıca çünkü dinamik bi şekilde sadece kalan kısma bakıyor. 
				if (sayiDizisi[i] == sayiDizisi[j]) { // karşılaştırdıgım sayı zaten SayiDizisi[i] o ne zaman iç döngüde tekrar eşitse artır. 
					tekrarSayisi++;
					if (tekrarSayisi >= 1) { // 1 kez tekrar edince 
						System.out.println(sayiDizisi[i] + " sayısı " + (tekrarSayisi + 1) + " kez tekrar ediyor."); 
						//break; // içteki döngüyü durduruyoruz
					}
				}
			}
			if (kontrol) {
				break; // dıştaki döngüyü de durduruyoruz
			}
		}
		if (!kontrol) {
			System.out.println("Tekrar eden sayı bulunamadı.");
		}
	}
}
