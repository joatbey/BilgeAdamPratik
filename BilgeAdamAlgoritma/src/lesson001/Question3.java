package lesson001;

public class Question3 {

	public static void main(String[] args) {
		// verilen ürünün satış fiyatının içinde %18 kdv %15 kar olduğunu varsay ham fiyatı bulan program
		float fiyat = 100;
		float kdv = 0.18f * fiyat; // burada f koymayı unutursak hata veriyor
		float kar = 0.15f * fiyat;//
		float hamFiyat = fiyat - kdv - kar ;
		System.out.println("ham fiyat: " + hamFiyat);
		
	}

}
