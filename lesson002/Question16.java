package lesson002;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// kullanıcıdan aldığımız sayı haftanın hangi gunune denk geliyor haftaiçi mi haftasonu mu kontrol edelm switch case ile
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int sayi = input.nextInt();
		switch (sayi) {
		case 1:
			System.out.println("pazartesi");
			break; // break unutulrsa break edip switch caseden çıkmaz case2 ye geçer onu da yazdırır
		case 2: 
			System.out.println("salı");
			break;
		case 3: 
			System.out.println("çarsamba");
			break;
		case 4: 
			System.out.println("perşembe");
			break;	
		case 5: 
			System.out.println("cuma");
			break;
		case 6: 
			System.out.println("cumartesi");
			break;
		case 7: 
			System.out.println("pazar");
			break;
		default:
			System.out.println("Hafta 7 gün sayı 1 ile 7 arasında olmalı.");
			break;
		}
		
		switch (sayi) {
		case 1,2,3,4,5:
			System.out.println("haftaiçi");
			break;
		case 6,7: 
			System.out.println("haftasonu");
			break;
			
		default:
			
			break;
		}
		
	
	}

}
