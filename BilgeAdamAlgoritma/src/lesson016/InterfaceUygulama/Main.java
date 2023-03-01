package lesson016.InterfaceUygulama;

public class Main {
	
    static Kutuphane kutuphane = new Kutuphane("Milli Kütüphane");


	public static void main(String[] args) {
		// Kitap sınıfımız olsun
		//isim yazar fiyat
		
		//Kütüphane 
		// İsim Kitaplar
		
		//IKütüphaneleManager diye bir interface oluşsutralım
		//interface kitapEkle methodu yazalım
		
		//util sınıfı oluşturalım.
		
		
//		int sayi = Util.intDegerAl2("Lütfen sayi girin");
//		String isim = Util.stringDegerAl2("Lütfen isim giriniz");
		
		//Kullanıcıdan aldığımız isim yazar ve fiyatla bir kitap nesnesi oluşturalım...
		//kitapları listele ismi ve fiyatı görüntüle
		
		//kullanıcıdan yazar ismi alalım
		//ahmetin yazdığı kitapları listelemek istiyorum
		
		
		
		
		adminMenu();
		
		
	}
	
	
	public static void adminMenu(){
		
		
		while(true) {
			
			System.out.println("1-Kitap Ekle");
			System.out.println("2-Bütün Kitapları Listele");
			System.out.println("3-Yazara Gore Arama Yap");
			System.out.println("4-Kitağ Sil");
			System.out.println("5-İndirim Uygula");
			System.out.println("6-Kitap İsmini Güncelle");
			
			int secim = Util.intDegerAl2("Seçiminiz  ? ");
			switch (secim) {
			case 1:
				kutuphane.kitapEkle();
				break;

			case 2:
				kutuphane.kitaplariListele();
				
				break;
			case 3:
				
				break;
				
			case 4:
				break;
				
			case 5:
				
				break;
				
			default:
				break;
			}
		} 
	}
}
