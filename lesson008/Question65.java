package lesson008;

import java.util.Random;
import java.util.Scanner;

public class Question65 {
	// randomSayiUret methodu yazalım burada 1 den 500 e kadar random sayı üreteceğiz bi diziye bunları yazacağız.
	public static int[] randomSayiUret() { // int[] return edeceğiz.
		Scanner scanner = new Scanner(System.in);
		System.out.println("dizi uzunlugu giriniz: ");// biraz çirkin bu tabi
		int uzunluk = scanner.nextInt();
		
		int[] array = new int[uzunluk];// girilen boyda int arrayimiz...
		
		for (int i = 0; i < array.length; i++) {
			Random random = new Random();
			array[i] = random.nextInt(1,500);// bu aralıkta random sayi at, arrayi doldur bu for loopunda dönerek
			System.out.print(array[i] + " , ");// yaz bi de tek tek			
		}
		return array;
	}

	public static void ortalamaHesapla(int[] array) { // parametre olarak int[] alıp indisleri toplayacak uzunluğa bölecek...
		double toplam =0;
		double ortalama =0;
		for (int i = 0; i < array.length; i++) {
			toplam += array[i];
		}
		ortalama = toplam / array.length;
		System.out.println("Ortalama "+ortalama);
	}
	
	
//	public static double otrHesapla() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Lütfen dizinin uzunluğunu giriniz");
//		int uzunluk = scanner.nextInt();
//		double[] dizi = new double[uzunluk];
//		double toplam = 0;
//
//		for (int i = 0; i < dizi.length; i++) {
//			double sayi = sayiUret2();
//			dizi[i] = sayi;
//			toplam += sayi;
//			System.out.println(sayi);
//		}
//
//		return toplam / uzunluk;
//
//	}
//
//	public static double sayiUret2() {
//		Random random = new Random();
//		return random.nextDouble() * 500; // 0.0-1.0
//	}
	public static void main(String[] args) {
		
		// ortalama hesapla diye bir method yazalım

		// kullanıcdan kaç tane sayıyıla işlem yapmasını istediğini soralım
		// girdiği veriye göre içerde bir array oluşturcaz ve random üretilen sayıları
		// bu arraye
		// atıcaz daha sonra ortalamasını bulcaz
		
		int[] array = randomSayiUret();
		System.out.println();
		ortalamaHesapla(array);
		
		//System.out.println(otrHesapla()); 

	}

}