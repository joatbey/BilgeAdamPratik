package lesson004;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		// Klavyeden girilen 0 100 arasında 100 dahil 
		//5 adet sayıdan en büyük en küçük olanları bulan program

		Scanner scanner = new Scanner(System.in);
		int enBuyuk = - 1 ;
		int enKucuk = 101; // her türlü 101 den küçük olacak girilen ya
		int num;
		int i = 0;
		while (i<5) {
			System.out.println("Sayı giriniz:");
			num = scanner.nextInt();
			
			if (num <= 100 && num>=0 ) {
				if(num > enBuyuk) {
					enBuyuk = num;
				}
				if(num < enKucuk) {
					enKucuk = num;
				}
				i++;
			}
			else {
				System.out.println("geçerli aralıkta sayı girin");
			}
		}
		System.out.println("en küçük: " + enBuyuk);
		System.out.println("en büyük: " + enKucuk);
	}

}
