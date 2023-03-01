package lesson002;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// daire çap çevre hesapla ryi kullanıcıdan alıp
		Scanner input = new Scanner(System.in);
		System.out.println("Radius giriniz :  ");
		float radius = input.nextFloat();
		if (radius <= 0) {
			System.out.println("Radius pozitif olmak zorunda.");
		}
		else {
			final float pi = 3.14159f;
			float area = pi * radius * radius;
			float circumference = 2 * pi * radius;
			System.out.println("area: " + area + " circumference: " + circumference);
		}}
}
