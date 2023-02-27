package lesson002;
import java.util.Scanner;
public class Question17 {

	public static void main(String[] args) {
		// // Girilen karakterin asci kodunu bulan program

		//how to get input char in java17
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("karakter giriniz");
		char ch = scanner.next().charAt(0);
		
		int asciiCode = ch;
		System.out.println("asciiKodu " + asciiCode);
		
		

	}

}
