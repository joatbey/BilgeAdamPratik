package lesson004;
import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		// "java"yı 
		//	j	
		//	a
		//	v
		//	a
		// olarak yazdır
		
		String text = "java";
		for (int i=0; i< text.length();i++) { // DİKKAT burada length 4 mesela: 0 1 2 3 diye sayıyorsun ama length için kaç tane char var demek o da 4 
			System.out.println(text.charAt(i));
		}
		
		
		
		// kullanıcıdan bi string al , 0. indexi j, 1. indeksi a gibi yazdır.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir string girin");
		String text2 = scanner.nextLine();
		
		for(int i = 0 ; i< text2.length(); i++ ) {
			System.out.println(i+". index : "+ text2.charAt(i));
		}
		
		
		
		
		
	}

}
