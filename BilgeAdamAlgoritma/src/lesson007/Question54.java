package lesson007;

public class Question54 {

	public static void main(String[] args) {

		// Verilen dizide rakamların farkının EN AZ oldugu sayıların farkını bulalım

		int[] array2 = { 1, -10, -4, -1 };
		// mutlak değer alabiliriz
		// int mutlakDeger = Math.abs(-4);

		int mins = Integer.MAX_VALUE;// olabilecek max int değeri 2147483647
		// System.out.println(mins);

		for (int i = 0; i < array2.length; i++) {// her i için,

			for (int j = i + 1; j < array2.length; j++) {// bi sonrakine bak

				int fark = Math.abs(array2[i] - array2[j]);// farkın absolute value halini al
				if (fark < mins) {
					mins = fark;
				}
			}
		}
		System.out.println(mins);
		// 14:47

		System.out.println("*************");
		
		// Burada da // Verilen dizide rakamların farkının EN ÇOK oldugu sayıların farkını bulalım

		int[] fark = new int[array2.length];// fark diye bir dizi oluiştur array2nin lengthi kadar

		boolean kosul = true;

		while (kosul) {
			for (int i = 0; i < array2.length; i++) {// her i için
				if (i != array2.length - 1) { // son indis değil ise
					fark[i] = Math.abs(array2[i] - array2[i + 1]);// fark dizisinin i indisine array2nin i ve i+1
																	// farkının absolute valuesını al
				} else if (i == array2.length - 1) {// son indise geldikse koşulu false yap döngüyü tekrarlama
					kosul = false;
				}
			}
		}
		
//		// fark dizisini yazdır...
//		for( int i=0; i< fark.length; i++ ) {
//		System.out.print(fark[i] + " ");
//		}
//		
		int max = fark[0];// dizinin ilk değeri maks olsun

		for (int i = 0; i < fark.length; i++) {// yok başkası daha büyükse onu maxa ata...
			if (fark[i] > max) {
				max = fark[i];
			}
		}
		System.out.println(max);
	}

}