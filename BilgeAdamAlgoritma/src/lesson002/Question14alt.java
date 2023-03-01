package lesson002;

import java.util.Scanner;

public class Question14alt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. sayıyı giriniz:");
		double sayi1 = scanner.nextDouble();
		System.out.println("2.sayıyı giriniz :");
		double sayi2 = scanner.nextDouble();
		System.out.println("3.sayıyı giriniz:");
		double sayi3 = scanner.nextDouble();
		if (sayi1 > sayi2 && sayi1 > sayi3 && sayi2 > sayi3) {
			System.out.println("büyük sıralaması " + sayi1 + " > " + sayi2 + " >" + sayi3);
		} else if (sayi1 > sayi2 && sayi1 > sayi3 && sayi3 > sayi2) {
			System.out.println("büyük sıralaması " + sayi1 + " > " + sayi3 + " >" + sayi2);
		} else if (sayi2 > sayi1 && sayi2 > sayi3 && sayi1 > sayi3) {
			System.out.println("büyük sıralaması " + sayi2 + " > " + sayi1 + " >" + sayi3);
		} else if (sayi2 > sayi1 && sayi2 > sayi3 && sayi3 > sayi1) {
			System.out.println("büyük sıralaması " + sayi2 + " > " + sayi3 + " >" + sayi1);
		} else if (sayi3 > sayi1 && sayi3 > sayi2 && sayi1 > sayi2) {
			System.out.println("büyük sıralaması " + sayi3 + " > " + sayi1 + " >" + sayi2);
		} else if (sayi3 > sayi1 && sayi3 > sayi2 && sayi2 > sayi1) {
			System.out.println("büyük sıralaması " + sayi3 + " > " + sayi2 + " >" + sayi1);
		} else if (sayi2 == sayi1 && sayi2 > sayi3) {
			System.out.println("büyük sıralaması " + sayi2 + " = " + sayi1 + " > " + sayi3);
		} else if (sayi2 == sayi1 && sayi2 < sayi3) {
			System.out.println("büyük sıralaması " + sayi3 + " > " + sayi1 + " = " + sayi3);
		} else if (sayi3 == sayi1 && sayi3 > sayi2) {
			System.out.println("büyük sıralaması " + sayi3 + " = " + sayi1 + " > " + sayi2);
		} else if (sayi3 == sayi1 && sayi3 < sayi2) {
			System.out.println("büyük sıralaması " + sayi2 + " > " + sayi1 + " = " + sayi1);
		} else if (sayi3 == sayi2 && sayi2 > sayi1) {
			System.out.println("büyük sıralaması " + sayi2 + " = " + sayi3 + " > " + sayi1);
		} else if (sayi3 == sayi2 && sayi2 < sayi1) {
			System.out.println("büyük sıralaması " + sayi1 + " < " + sayi3 + " = " + sayi1);
		} else
			System.out.println("Hepsi eşittir " + sayi2 + " = " + sayi1 + " = " + sayi3);

	}

	

}
