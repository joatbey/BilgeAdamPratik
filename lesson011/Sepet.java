package lesson011;

public class Sepet {

	private Product[] products;

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

	public int getIndex() {
		return index;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	// her ürün eklediğimde sepetin totalPrice artcak ürünün fiyatına göre artcak.
	// her ürün eklediğimde product'in stocku azalması lazım
	// 10 tane den fazla ürün alamasın kullanıcıya bilgi verelim

	
	//product sınıfının içinde bi değişken tutalım
	//ürünün aktif mi pasif mi oldugu
	
	//Product sınıfının için metot yazalım
	//aktif olan ürünü gösterimden kaldırsın
	//boolean isActive = true;
	public void sepeteEkle(Product product) {
		if (product.getStock() > 0) {
			if (index >= 10) {
				System.out.println("Sepette yer kalmadı");
			} else {
				products[index] = product;
				index++;
				this.totalPrice += product.getPrice();
				product.setStock(product.getStock() - 1);
				product.gosterimdenKaldir();
			}
		}else {
			System.out.println("ürün stoku bitmiştir");
		}
	}
	//sepetteki ürünleri goster methodu yazalım
	//for ve ya foreach
	//1- Ürün ismi
	//2- Ürün ismi
	//null değerleri yazdırmayalım
	public void sepettekiUrunleriGoster() {
		int i = 1;
		for (Product product : products) {
			if(product != null) {
				System.out.println(i++ + " "+product.getName());
			}
		}
	}
}