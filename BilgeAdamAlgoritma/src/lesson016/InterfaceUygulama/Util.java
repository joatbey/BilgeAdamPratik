package lesson016.InterfaceUygulama;

import java.util.Scanner;

public class Util {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static int intDegerAl() {
		Scanner scanner = new Scanner(System.in);
		int intDeger = scanner.nextInt();
		return intDeger;
	}
	
	public static int intDegerAl2(String sorgu) {
		System.out.println(sorgu);
		int deger = Integer.valueOf(scanner.nextLine());
		return deger;
	}
	

	public static String stringDegerAl2(String sorgu) {
		System.out.println(sorgu);
		String strdeger = scanner.nextLine();
		return strdeger;
	}
	
	
	public static String stringDegerAl(String str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(str);
		String stringDeger = scanner.next();
		return stringDeger;
	}
	
	
}
