package lesson001;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// kullanıcıdan alınan vize ve final notu bak .4 ve .6 katsayılar toplamda50den büyükse pass
		Scanner input = new Scanner(System.in);
		System.out.println("Vize notu giriniz: ");
		float vizeNotu = input.nextFloat();
		System.out.println("Final notu giriniz: ");
		float finalNotu = input.nextFloat();
		
		float not = (vizeNotu*0.4f) + (finalNotu*0.6f) ; 
		System.out.println("Not: "+ not );
		
		if (not < 50 ) {
			System.err.println("Dersten kaldınız "); // err ile yazınca kırmızı veriyor error gibi
		}
		else {System.out.println("Dersten geçtiniz tebrikler");}
	}

}
