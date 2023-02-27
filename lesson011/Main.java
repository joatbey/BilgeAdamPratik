package lesson011;

import java.security.PublicKey;
import java.util.Scanner;

import lesson011.helper.RandomGenerateId;

public class Main {
	
	public static void productEkle() {
		Scanner scanner = new Scanner(System.in);
		Product product = new Product();

		System.out.println("ürün fiyatını giriniz:");
		int price = scanner.nextInt();

		System.out.println("Stock giriniz:");
		int stock = scanner.nextInt();

		System.out.println("İsim giriniz :");
		String name = scanner.next();// nextLine ile kullanınca bi salaklık oluyor "" alıyor nedense... 

		product.setName(name);
		product.setPrice(price);
		product.setStock(stock);

		System.out.println("ürün başarıyla oluşturuldu. Id ' si : " + product.getId() + " ismi : " + product.getName()
				+ " stok durumu : " + product.getStock() + "  fiyatı: " + product.getPrice()
				);
	}
	
	public static Product productEkle2() {
		Scanner scanner = new Scanner(System.in);
		Product product = new Product();

		System.out.println("ürün fiyatını giriniz:");
		int price = scanner.nextInt();

		System.out.println("Stock giriniz:");
		int stock = scanner.nextInt();

		System.out.println("İsim giriniz :");
		String name = scanner.next();// nextLine ile kullanınca bi salaklık oluyor "" alıyor nedense... 
		String code = RandomGenerateId.generateProductCode(name);
		Product product2 = new Product(name,stock,price);

		System.out.println("ürün başarıyla oluşturuldu. Id ' si : " + product2.getId() + " ismi : " + product2.getName()
				+ " stok durumu : " + product2.getStock() + "  fiyatı: " + product2.getPrice()+ " productcode: " + product2.getProductCode()
				);
		return product2;	
	}
	
	public static void productEkle3() {
		Product.productEkle5();
		
	}
	
	public static void sepeteEkle(Product product) {
		Sepet sepet  = new Sepet();
		sepet.sepeteEkle(product);
		sepet.sepettekiUrunleriGoster();
		
	}
	
	// ürün kodu
	//apple pro
	//app325
	//urun oludtututrken ismi alalım ve bi urun kodu oluşturalm
	//urun adı sony
	//urun kodu sony123
	//urun adı apple
	//urun kodu apple512
	 
	
	
	
	

	public static void main(String[] args) {

		// Product sınıfı oluşturalım
		// id, price, name, stock
		// bilgileriGoster methodu yazalım

		// değişkenler private
		// birde boş constructor

		// veritabanına kaydet --> ürün ismi + veritabanına kaydedildi
		// urunu Guncelle ->> ismini güncellicez paramatre olarak string name

		// Farklı paket açalım
		// o paketin içinde bir class oluşturup içinde random id oluşturcak bir metot
		// yazalım
		// sonrada ben her product nesnesi ürettiğimde otomatik olarak
		// id si oluşmuş olsun

		// Sepet sınıfı oluşturalım
		// Array olarak products, totalprice

		// Sepete ürün ekle metotu yazalım
		// void, parametre --> Product tipinde bir parametre alsın
		// gelen productı arrayin içine atıcaz.
		
//
//		Product product1 = new Product();
//		product1.setName("asus");
//		product1.setPrice(15000);
//		product1.setStock(100);// mesela 2 yap ürün stogu bitsin onu da check et.
//		product1.bilgileriGoster();
//
//		Product product2 = new Product("apple", 100, 20000);
//		product2.bilgileriGoster();
//		product2.ismiGuncelle("apple2");
//		product2.bilgileriGoster();
//
//		String[] array = new String[10];
//		array[0] = "ahmet";
//
//		Product[] products = new Product[10];
//		products[0] = product1;

		System.out.println("*****************");
//		Sepet sepet1 = new Sepet();
//
//		System.out.println(product1.getStock());
//		System.out.println(sepet1.getTotalPrice());
//		sepet1.sepeteEkle(product1);
//		sepet1.sepeteEkle(product2);
//		sepet1.sepeteEkle(product2);
//		sepet1.sepeteEkle(product1);
//		sepet1.sepeteEkle(product2);
//		sepet1.sepeteEkle(product2);
//		sepet1.sepeteEkle(product1);
//		sepet1.sepeteEkle(product1);
//		sepet1.sepeteEkle(product2);
//		sepet1.sepeteEkle(product2);
//		sepet1.sepeteEkle(product2);
//		System.out.println(product1.getStock());
//		System.out.println(sepet1.getTotalPrice());
//		
		
//		productEkle();
//		
//		
//		
//		productEkle2();
//		
//		productEkle3();
//		
		Product eklenenProduct = productEkle2();
		sepeteEkle(eklenenProduct);
		eklenenProduct.bilgileriGoster();
		
		Product product6 = productEkle2();
		product6.bilgileriGoster();
		
		
	
		
		
		
		
		
	}

	

	
	
	

}