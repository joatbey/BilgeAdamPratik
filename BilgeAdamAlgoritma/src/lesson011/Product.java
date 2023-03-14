package lesson011;

import java.util.Scanner;

import lesson011.helper.RandomGenerateId;

public class Product {

	private String name;
	private String id;
	private int price;
	private int stock;	
	private boolean isActive = true;
	private String productCode;
	
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void bilgileriGoster() {
		System.out.println(toString());
	}

	// Overloading
	public Product() {
		// Bir sınıftan nesne ürettiğimizde arka tarafta çalışan ilk metottur
		System.out.println("product sınıfının 0 parametreli constructoru çalıştı");
		this.id = RandomGenerateId.generateId();
		}

	public Product(String name, int stock, int price) {
		System.out.println("product sınıfının 4 parametreli constructoru çalıştı");
		RandomGenerateId.generateId();
		this.name = name;
		this.id = RandomGenerateId.generateId();
		this.stock = stock;
		this.price = price;
		this.productCode = RandomGenerateId.generateProductCode(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("sıfırdan büyük bir price girin");
		}
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String name) {
		this.productCode = RandomGenerateId.generateProductCode(name);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", price=" + price + ", stock=" + stock + "]";
	}
	
	public void veriTabanınaKaydet() {
		System.out.println(getName() + " veritabanına kaydedildi");
	}
	
	public void ismiGuncelle(String name) {
		System.out.println(this.name + " ürününün ismi " + name + " olarak güncellendi");
		setName(name);
	}
	
	public void gosterimdenKaldir () {
		
		if(getStock() <= 0) {
			setActive(false);
			System.out.println(getName() + " ürünü gösterimden kaldırıldı");
		}

		}
	
	public static Product productEkle5() {
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

		System.out.println("Ürün başarıyla oluşturuldu: ID: " + product.getId() + " İsmi: " + product.getName());
		product.bilgileriGoster();

		// Product product1 = new Product(name, price, stock);
		return product;
	}
		
	}
