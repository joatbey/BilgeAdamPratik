package lesson017;

import java.util.Scanner;
import java.util.Stack;

public class StackOrnek2 {

	static Stack<Character> stack = new Stack<Character>();

	public static void palindrom(String str) {
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		for (Character ch : stack) {
			System.out.println(ch);
		}
	}

	public static boolean isPalindrom(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != stack.pop()) {
				return false;
			} 
		}return true;

	}

	public static void main(String[] args) {
		// parametre olarak String alan ve girilen metnin her bir karakterini stackin
		// içine atan bir method yazalım method ismi palindrom olsun

		// java
		// j
		// a
		// v
		// a
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("bir kelime giriniz");
		String str = scanner.next();
		
		palindrom(str);
		
		palindrom("java");
		
		
		isPalindrom("kabak");
		
		

	}

}
