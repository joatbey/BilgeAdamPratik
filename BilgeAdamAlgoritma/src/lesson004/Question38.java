package lesson004;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		// //         Menu 1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin
		// için de o 
		//         harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
		//         eğer harfi içermiyorsa bir çıktı aradağınız harf yok gibi
		//         2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz
		// harfi
		//           giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer
		// kelimemiz
		//           içerisinde o harf varsa değiştirsin.
		//         3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom
		// olup
		//          * olmadığını bulunuz(kek,iki,kabak,kayak)
		// 4-Sistemden çıkın

		Scanner scanner = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println("=====String İşlemleri=====");
			System.out.println();
			System.out.println("1-Harf Saydırma");
			System.out.println("2-Harf Değiştirme");
			System.out.println("3-Palindrome Kontrolü");
			System.out.println("4-Kelimenin harflerinin arasına ? koymaca");
			System.out.println("5-Kelimenin ilk üç harfini alıp sonuna ... koymaca");
			System.out.println("6-Kelimenin ilk üç harfini alıp sonuna ...... kelimenin uzunluğu kadar koymaca");

			System.out.println("0-Çıkış");
			int secim = scanner.nextInt();
			scanner.nextLine();

			switch (secim) {
			case 1:
				int sayac=0;
				String indexler="";
				System.out.println("Lütfen bir kelime giriniz...");
				String kelime = scanner.nextLine();
				System.out.println("Hangi harfi saymak istiyorsunuz ?");
				String harf = scanner.nextLine();
				if(!kelime.contains(harf)) {
					System.out.println("Aradığınız harf kelimenin içinde yoktur.");
				}
				else {
					for(int i = 0 ; i< kelime.length() ; i++) {
						if (kelime.charAt(i)==harf.charAt(0)) {
							sayac++;
							indexler +=i + ",";
							// var demek ki sayaç bir artmalı
						
						}
					}
					System.out.println(harf+" harfi kelime içinde " + sayac+ " adet bulunuyor");
					System.out.println(harf+ " değerinin indexleri ==> " + indexler.substring(0, indexler.length()-1));
				}
				break;

			case 2:
				System.out.println("Lütfen bir kelime giriniz: ");
				String kelime2 = scanner.nextLine();
				System.out.println("Değiştirilecek harf: ");
				String eskiHarf = scanner.nextLine();
				System.out.println("Ne ile değiştireceğiz");
				String yeniHarf = scanner.nextLine();
				if(kelime2.contains(eskiHarf)) {
					kelime2 = kelime2.replace(eskiHarf, yeniHarf);
					
				}
				else {
					System.out.println("yok oyle bir harf ");
				}
				System.out.println(kelime2);
				System.out.println();

				break;

			case 3:
				System.out.println("Lütfen bir kelime giriniz: ");
				String kelime3 = scanner.nextLine();
				String isPalindrome = "";
//				for(int i = kelime3.length()-1 ; i>=0  ;i-- ) {
//					isPalindrome += kelime3.charAt(i);
//				}
//				
//				if(isPalindrome.equals(kelime3)) {
//					System.out.println("kelime palindrome");
//				}else {
//					System.out.println("kelime palindrome değil");
//					
//				}
			
				System.out.println();
				boolean kontrol2= true;
				for(int i = 0 ; i< kelime3.length()/2 ; i++) {
					if (!(kelime3.charAt(i)==(kelime3.charAt(kelime3.length()-1)) -i )) {
						kontrol = false;
						break;
					}
				}
				if (kontrol2) {
					System.out.println("kelime palindrome");
				
				}
				else {
					System.out.println("kelime palindrome değil");
					
				}
				
				break;
			
			case 4:
				System.out.println("Lütfen bir kelime giriniz...");
				StringBuilder stringBuilder= new StringBuilder();
				String kelime4 = scanner.nextLine();
				String kelimeVirgullu = "" ;
				for(int i = 0 ; i < kelime4.length(); i++) {
					stringBuilder.append(kelime4.charAt(i)).append(",") ;
				}
				System.out.println(stringBuilder.toString()); // stringe çevirip yazdır. cunku stringBuilder bi string değil tam, nesne ...
				//java
				//j,a,v,a,
				System.out.println(stringBuilder.substring(0,stringBuilder.length()-1));
				
				break;
				
			case 5:
				System.out.println("Lütfen bir kelime giriniz...");
				String kelime5 = scanner.nextLine();
				String kelime5Kesik = kelime5.substring(0, 3);
				String eklenecekSekil = "...";
				System.out.println(kelime5Kesik+eklenecekSekil);
				

				
				
				break;
			case 6:
				System.out.println("Lütfen bir kelime giriniz...");
				String kelime6 = scanner.nextLine();
				String kelimeBisi = kelime6.substring(0, 3);
				for(int i = 0 ; i< kelimeBisi.length(); i++) {
					if(i<3) {
						kelimeBisi += kelime6.charAt(i);
						System.out.println("hatalı değer");
					}
					else {
						kelimeBisi += ".";
					}
				}
				System.out.println(kelimeBisi);
				
				
				break;
			
			default:
				System.out.println("Lütfen geçerli bir değer giriniz.");
				System.out.println();
				break;
			}
		}

	}

}
