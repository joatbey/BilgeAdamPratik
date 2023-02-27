package lesson004;

import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) {
		
		//kaç tane e var
		
		Scanner input = new Scanner(System.in);
		System.out.println(	"enter text");
		
		String text = input.nextLine();
		int counter = 0 ;
		for (int i = 0 ; i < text.length(); i++) {
			if(text.charAt(i)=='e') {
				counter ++;
			}
		}
		System.out.println("içinde " +counter+ " tane 'e' var.");
		
		String upperText = text.toUpperCase();
		System.out.println(upperText);
		
		String lowerText = text.toLowerCase();
		System.out.println(lowerText);
	}

}
