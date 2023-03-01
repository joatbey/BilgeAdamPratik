package lesson009;

public class Question67 {

	// Cosenio

	// girilen sayı arrayedki kaç tane sayıdan büyük oldugunu bulan method
	// array uzunlugu 1 ile 100 arasında olacak
	// girilen sayi 1 ile 100 arasında olcak
	// arrayin içindeki sayılarda 1 ile 100 arasında olcak
	// method int bir değer dönecek

	int[] myNum = { 1, 3, 4, 6, 102 };

	// buyukleriSay(myNum,6); //--> 3
	// buyukleriSay(myNum,3); //--> 1

	//System.out.println(kucukleriSayi(myNum, 90));

	public static int kucukleriSayi(int[] arr, int sayi) {
			if (arr.length < 0 || arr.length > 100) {
				System.out.println("arrayin uzunlugu hatalı");
			}
			if (sayi < 0 || sayi > 100) {
				System.out.println("sayi  hatalı");
			}

			for (int number : arr) {
				if (number < 0 || number > 100) {
					System.out.println("arrayin elemanları  hatalı");
				}
			}

			int sayac = 0;

			for (int i = 0; i < arr.length; i++) {
				if (sayi > arr[i]) {
					sayac++;
				}
			}
			return sayac;
		}

}
