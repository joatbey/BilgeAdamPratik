package lesson013;

public class Main {
public static void main(String[] args) {
		
		// Sınav sınıfı oluşturalım attributelerini yazalım
		
//		Soru soru1 = new Soru();
//		
//		soru1.soruOlustur(Sinav.cevapSecenekleri);
//		
//		//A B C D 
//		for (int i = 0; i < soru1.getCevapIcerikleri().length; i++) {
//			System.out.println(soru1.getCevapIcerikleri()[i]);
//		}
		
		Sinav sinav = new Sinav();
		sinav.sinavOlustur();
		sinav.cevapGir();
		sinav.cevaplariKontrolEt();
		
		
//		for (int i = 0; i < sinav.getSorular().length; i++) {
//			System.out.println(sinav.getSorular()[i].getIcerik());
//		}
//		
//		System.out.println("****************");
//		sinav.cevapGir();
		
	}

}
