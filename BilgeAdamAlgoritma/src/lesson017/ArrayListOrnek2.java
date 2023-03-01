package lesson017;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListOrnek2 {
	public static void main(String[] args) {

		//1 tane çift sayılar
		//1 tane tek sayilar arrayListi acalm
		//1den 100e kadar 35 tane random sayi uretelim
		// uretilen sayılardan tekleri tekarraylistine çiftleri çift arraylistine ekleyelim.
		
		ArrayList<Integer> tekSayilar = new ArrayList<>();
		ArrayList<Integer> ciftSayilar = new ArrayList<>();
		
		for (int i=0; i<35 ;i++) {
			Random random = new Random();
			int sayi = random.nextInt(0,101);
			if(sayi%2 ==0) {
				ciftSayilar.add(sayi);
			}
			else
				tekSayilar.add(sayi);
		}
		
		System.out.println("çiftler: ");
		for(Integer integer : ciftSayilar) {
			System.out.print(integer + ",");
		}
		
	
		System.out.println("\ntekler: ");
		for(Integer integer : tekSayilar) {
			System.out.print(integer + ",");
		}
	}
	
}
