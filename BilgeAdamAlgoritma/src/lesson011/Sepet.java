package lesson011;

public class Sepet {

	private Product[] products = new Product[10];
	private int totalPrice;

	private int index = 0;

	public Sepet() {
		this.products = new Product[10];
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getIndex() {
		return index;
	}

	// sepete her ürün eklediğimde sepetin totalPrice'ı artmalı
	// sepete her ürün eklendiğinde product'ın stock'u azalmalı
	// sepet 10 taneden fazla ürün alamaz. kullanıcıya bilgi verelim
	// ürünün aktif mi pasif mi olduğunu göstersin
	
	// Product sınıfının içine metod yazalım. pasif olan ürünü gösterimden kaldırsın
	// boolean isActive = true;

	public void sepeteUrunEkle(Product product) {
		if (product.getStock() > 0) {
			if (index >= 10) {
				System.out.println("sepet 10 üründen fazla alamaz");
			} else {
				products[index] = product;
				index++;

				this.totalPrice = product.getPrice();
				product.setStock(product.getStock() - 1);
				product.gosterimdenKaldir();
				
			}

		} else {
			System.out.println("ürün stoğu bitmiştir");
		}

	}
	
	// sepetteki ürünleri göster metodu yazalım. for veya for each ile
	// 1- ürün ismi
	// 2- ürün ismi
	// null değerleri yazdırmayalım
	
	public void sepettekiUrunleriGoster() {
		int i = 1;
		for (Product product: products ) {
			if(product != null) {
			System.out.println((i++) + " " + product.getName());
		}
		}
	}
	


}