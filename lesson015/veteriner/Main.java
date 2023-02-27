package lesson015.veteriner;

public class Main {

		// hayvan sınıfında 2 tane abstract method oluşturalım 
		// bilgileri göster toString methodunu kullanalım
		// diger method da karneOlustur()--> cinsinin ve türünü alıp karne oluşturalım...
	
		// kedi nesnesi oluşturduğumuzda kedinin türü otomatik olarak "kedi" olsun
		// köpek nesnesi oluşturduğumuzda köpeğin türü otomatik olarak "köpek" olsun

	
		//Ortak bir method yazalım gelen parametreye göre karne oluştursun...
	

	// hayvanları listele methodumuz olsun: 
	// musterinin sahip olduğu hayvanları listeleyeceğiz...
	
	
	//veterinerlerin müsterileri olsun 
	//veterinerlere musteri ekleme methodu yazalım
	//veterinerlerin musterilerini goruntuleyelim
	
	
	//musterinin hayvanlarından kayıtlı olanları getirelim...
	
	public static void karneOlusturParametreli(Hayvan hayvan) {
		hayvan.karneOlustur();
		
	}
	
	
	public static void main(String[] args) {

		Kedi kedi = new Kedi("Boncuk",true,"2010","tekir");
		Kedi kedi2 = new Kedi("Şanslı",true,"2015","vankedisi");
		Kedi kedi3 = new Kedi("Beyaz",true,"2012","tekir");

		Kopek kopek = new Kopek("Rex", true , "2012","Rotweiler");
		Kopek kopek2 = new Kopek("At", true , "2010","Samoyed");
		Kopek kopek3 = new Kopek("Dobul", true , "2020","Rotweiler");

				
		
		kedi.karneOlustur();
		//kedi.bilgileriGoster();
		System.out.println("******");
		//kopek.bilgileriGoster();
		System.out.println(kedi.getKarne());		
		//bu arada toString methodu Object classının içinde address name ve adress print edecek şekilde var
		//lesson015.veteriner.Kedi@24d46ca6 o yüzden böyle bir şey veriyor hiçbir yere toString yazmasak bile çağırdığımızda.
		// herhangi bir method olsaydı hata verecekti.
		System.out.println("******");

		Hayvan hayvan = new Kedi("YeniKedi",true,"2010","tekir");
		Hayvan hayvan2 = new Kopek("YeniKöpek",true,"2010","sokak");

		hayvan.karneOlustur();
		System.out.println("******");
		karneOlusturParametreli(hayvan); // polymorphic oldu kedi girersek kedi at girersek at
		System.out.println("******");
		karneOlusturParametreli(hayvan2);
		System.out.println("******");
		
		Musteri musteri = new Musteri("Sıla", "55445566811", "Kadıköy");
		musteri.hayvanEkle(kedi2);
		musteri.bilgileriGoster();
	
		
	
	
	
	}

}
