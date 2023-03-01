package lesson005;

import java.util.Scanner;

public class Question43 {

	public static void main(String[] args) {
		// dizi içerisinde 2 ve 4 ün kaçar kez geçtiğini

		// hangisi daha çok geçiyor bulunuz
		// bi de kullanıcıdan al

		int[] array = { 1, 3, 4, 4, 2, 2, 9, 8, 8, 8  };
//		int ikiler = 0;
//		int dortler = 0 ;
		int searchler1 = 0;
		int searchler2 = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı giriniz ki sayalım...");
		int search1 = input.nextInt();
		System.out.println("Bir sayı giriniz ki sayalım...");
		int search2 = input.nextInt();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == search1) {
				searchler1++;
			} else if (array[i] == search2) {
				searchler2++;
			}
		}
		if (searchler1 > searchler2) {
			System.out.println(search1 + "'ler daha fazla '" + searchler1 + "' tane '" + search1 + "' var");
		} else if (searchler1 < searchler2) {

			System.out.println(search2 + "'ler daha fazla '" + searchler2 + "' tane '" + search2 + "' var");
		} else if (searchler1 == searchler2) {

			System.out.println(search1 + "'ler de " + search2 + " 'ler de eşit sayıda '" + searchler1 + "' tane var");
		}

//		for (int i = 0; i < array.length; i++) {
//			if(array[i]==2) {
//				ikiler++;
//			}
//			else if(array[i] == 4) {
//				dortler++ ;
//			}
//
//			else if(array[i] == ney) {
//				ney++ ;
//		}
//		if(ikiler > dortler) {
//			System.out.println("2'ler daha fazla '"+ikiler+"' tane '2' var");
//		}
//		else if(ikiler< dortler){
//
//			System.out.println("4'ler daha fazla '"+dortler+"' tane '4' var");
//		}
//		else if(ikiler==dortler) {
//
//			System.out.println(" 4'ler de 2'ler de eşit sayıda '"+ ikiler+"' tane var");
//		}

	}

}
