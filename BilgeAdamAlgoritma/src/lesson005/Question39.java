package lesson005;

import java.util.Random;
import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		// random int sayı üretmemiz lazım
		// random sayıyı üretelim 0 ile 100 arasında yazdıralım.

		// sayi tahmin uygulamasın yapalım
		// sürekli kullanıcıdan sayıyı tahmin etmesini isticez
		// eğer kullanıcın girdiği sayı bulması gereken sayıdan az ise
		// tahmin yükseltin
		// fazla is tahmininizi azalan diyelin
		// doğru tahmin ettiği zaman kaçıncı denemesinde bulduğunu kullanıcıya söyle

//		Random random = new Random();
//		int randomNumber = random.nextInt();
//		int sayi = Integer.MAX_VALUE;
//		int sayi2 = Integer.MIN_VALUE;
//		System.out.println(sayi + " " +sayi2 );
//		
//		
//		int randomNum = random.nextInt(0,101);
//		
//		int rastgele = (int)(Math.random()*100); // 0.55 gibi yapıyor onu 100 le carpıyorz
//		System.out.println(randomNumber);
//		System.out.println(randomNum);
//		System.out.println(rastgele);
//		
		Random random = new Random();
		int randomNumber = random.nextInt(0,101);
		int tahminSayisi = 0;
		int secim = -1;
		System.out.println("üretilen --> " + randomNumber);
		while (secim != 0 ) {
			Scanner scanner = new Scanner(System.in);
			//System.out.println("üretilen --> " + randomNumber);
			int tahmin = scanner.nextInt();

			if (tahmin == randomNumber) {
				tahminSayisi++;
				System.out.println("Tebrikler " + tahminSayisi + " Denemede buldunuz");
				System.out.println("devam etmek için 1. bitirmek için 0");
				tahminSayisi = 0;
				secim = scanner.nextInt();
				randomNumber = random.nextInt(0,101);
				
			} else if (tahmin > randomNumber) {
				System.out.println("Sayi azaltın.");
				tahminSayisi++;
			} else {
				System.out.println("Sayıyı artırın.");
				tahminSayisi++;
			}

		}

	}

}
