package lesson020;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek {
	public static void main(String[] args) {
		double bolum1;
		try {
			bolum1 = bolme();
			System.out.println(bolum1);
		} catch (IllegalArgumentException e) {
			System.out.println(Constant.ILLEGAL_ARGUMENT);
		}
		
	}
	
	//14:55
	

	// bir tane bölme methodu yazalım kullanıcıdan 2 tane sayı alcaz
	// ve bölümü return dicez bunu yaparken gerekli hataları karşı önlem alalım

	// kulanıcıdı doğru sonuc girene kadar kullanıcdan girdi alalım

	public static double bolme() throws IllegalArgumentException {
		boolean kontrol = true;
		double bolum = 0;
		double sayi1 =0;
		double sayi2 = 0;
		while (kontrol) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("1. Sayi");
				 sayi1 = scanner.nextDouble();
				System.out.println("2. Sayi");
				sayi2 = scanner.nextDouble();
				bolum = sayi1 / sayi2;
				kontrol = false;
			} catch (ArithmeticException e) {
				System.out.println(Constant.NUMBER_EQUALS_ZERO);
			}  catch (InputMismatchException e) {
				System.out.println(Constant.MIS_MATCH_EXCEPTION);
			}catch (Exception e) {
				System.out.println(Constant.UNEXPECTED_EXCEPTION);
			}
			if(sayi2 ==1) {
				 throw new IllegalArgumentException(Constant.NUMBER_EQUALS_ZERO);
			}
		}
		return bolum;
	}
}