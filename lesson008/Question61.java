package lesson008;

public class Question61 {

	public static void main(String[] args) {
		// 1 den 1000 e kadar olan sayıların asal olanlarını bulan methodu yazalım
		// asalMi methodunuz yazcaz, bu metotta sadece sayı asal mı diye bakıyoruz
		// daha sonra mainde for döngüsüne sokup bulucaz
		
		for (int i = 2; i < 1000; i++) {
			asalMi(i);
		}

	}


	private static void asalMi(int sayi) {
		boolean asalMi = true;

		for (int j = 2; j < sayi; j++) {// mesela 1den başlarsa, her sayi 1 e kalansız bölüneceği için hiçbir zaman
										// asalMi boolean'ı false olmayacak. dolayısıyla aşağıdaki if(asalMi)
										// calışmayacak... hatta 0 a bölününce "java.lang.ArithmeticException:" / by
										// zero diyecek...
			if (sayi % j == 0) {
				asalMi = false;
			}
		}

		if (asalMi) {
			System.out.println(sayi + " asaldir");
		}
	}
}