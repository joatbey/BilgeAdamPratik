package lesson011;

import java.util.Scanner;

import lesson011.helper.RandomGenerateId;
public class Main {

	// product sınıfı oluşturalım
	// id, price, name, stock
	// bilgileriGoster metodu yazalım, değişkenler private tanımlansın
	// bir de boş constructor oluşturalım

	// veritabanına kaydet -> ürün ismi + veritabanına kaydedildi
	// urunu güncelle -> ismini güncelleyeceğiz parametre olarak String name

	// Farklı paket açalım. Paketin içinde bir class oluşturup içinde random id
	// oluşturacak bir metod yazalım
	// sonra da ben her product nesnesi ürettiğimde otomatik olarak id'si oluşmuş
	// olsun

	// sepet sınıfı oluşturalım
	// Array olarak products (ürün sayısı), totalPrice olsun

	// sepete ütün ekle metodu olsun. void, parametre -> Product tipinde parametre
	// alsın
	// gelen product'ı arrayin içine atacağız

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("asus");
		product1.setPrice(1500);
		product1.setStock(2);
		product1.bilgileriGoster();

		Product product2 = new Product("apple", 100, 20000);
		product2.bilgileriGoster();
		product2.ismiGuncelle("elma");
		product2.bilgileriGoster();
		product2.veriTabanınaKaydet();

		Sepet sepet1 = new Sepet();
		Sepet sepet2 = new Sepet();
		System.out.println(sepet1.getIndex());
		sepet1.sepeteUrunEkle(product2);
		System.out.println(sepet1.getIndex());

		System.out.println("----------");

		System.out.println(product1.getStock());
		System.out.println(sepet1.getTotalPrice());
//		sepet1.sepeteUrunEkle(product1);
//		sepet1.sepeteUrunEkle(product2);
//		sepet1.sepeteUrunEkle(product2);
//		sepet1.sepeteUrunEkle(product1);
//		sepet1.sepeteUrunEkle(product2);
//		sepet1.sepeteUrunEkle(product2);
//		sepet1.sepeteUrunEkle(product1);
//		sepet1.sepeteUrunEkle(product1);
//		sepet1.sepeteUrunEkle(product2);
//		sepet1.sepeteUrunEkle(product2);
//		sepet1.sepeteUrunEkle(product2);
		System.out.println(product1.getStock());
		System.out.println(sepet1.getTotalPrice());

		System.out.println("----------");
		Product product3 = new Product();
		System.out.println(product3.isActive());
		product3.setName("HP");
		product3.gosterimdenKaldir();
		System.out.println(product3.isActive());

		System.out.println("----------");
		System.out.println(product1.isActive());
		System.out.println(product1.getStock());
		System.out.println(sepet1.getTotalPrice());
		sepet1.sepeteUrunEkle(product1);
		sepet1.sepeteUrunEkle(product1);
		System.out.println(sepet1.getTotalPrice());
		System.out.println(product1.isActive());

		sepet1.sepettekiUrunleriGoster();

		System.out.println("----------");
		productEkle();

		System.out.println("----------");
		Product product = productEkle();
		product.bilgileriGoster();

		Product product6 = productEkle();
		product6.bilgileriGoster();
		
		System.out.println("----------");
		Product eklenenProduct = productEkle();
		sepeteEkle(eklenenProduct);
		
		System.out.println("----------");
		Product eklenenProduct2 = productEkle();
		sepeteEkle(eklenenProduct2);


	}

	// product ekle metodu yapalım
	// değerleri kullanıcıdan alalım
	// aldığımız değerlerle product oluşturalım

	public static Product productEkle() {
		Scanner scanner = new Scanner(System.in);
		Product product = new Product();

		System.out.println("ürünün fiyatını girin: ");
		int price = scanner.nextInt();
		System.out.println("ürünün stoğunu girin: ");
		int stock = scanner.nextInt();
		scanner.nextLine();
		System.out.println("ürünün adını girin: ");
		String name = scanner.nextLine();

		product.setName(name);
		product.setPrice(price);
		product.setStock(stock);
		
		
		product.setProductCode(name);
		System.out.println("Ürün başarıyla oluşturuldu: ID: " + product.getId() + " İsmi: " + product.getName() + " ProductID: " 
				+ product.getProductCode());
		product.bilgileriGoster();

		// Product product1 = new Product(name, price, stock);
		return product;
	}

	public static Product productEkle2() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("ürünün fiyatını girin: ");
		int price = scanner.nextInt();
		System.out.println("ürünün stoğunu girin: ");
		int stock = scanner.nextInt();
		scanner.nextLine();
		System.out.println("ürünün adını girin: ");
		String name = scanner.nextLine();

		Product product = new Product(name, stock, price);

		System.out.println("Ürün başarıyla oluşturuldu: ID: " + product.getId() + " İsmi: " + product.getName() + " ProductID: " 
		+ product.getProductCode());
		product.bilgileriGoster();

		return product;
	}
	
	public static void productEkle3() {
	//	Product product = new Product();   // eğer productEkle5 static olmasaydı bu metoda bir nesne üzerinden ulaşmamız gerekirdi
		Product.productEkle5();
		
	}
	
	// sepete ekle metodu yazalım. productEkle metodundan gelenleri buraya ekle
	
	public static void sepeteEkle(Product product) {
		Sepet sepet = new Sepet();
		
		sepet.sepeteUrunEkle(product);
		sepet.sepettekiUrunleriGoster();
		
		}
	
	// ürünKodu
	// Apple Pro, App325
	// ürün oluşturulurken ürünün ismini alalım ve bir ürün kodu oluşturalım
	// ürün adı apple ise ürün kodu --> app258 (son 3 sayı random gelecek)
	// ürün oluştururken bu değeri de nesneye atamalıyız

}