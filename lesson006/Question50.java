package lesson006;

public class Question50 {

	public static void main(String[] args) {
		// bir dizide ard arda gelen 2 indexdeki sayı değer
		// 2 ise true yoksa false yazdıarlım

		int[] sayilar = { 2, -256, -256, 2, 2, 1258, 32,2,2 };

		boolean check = false;
		for (int i = 0; i < sayilar.length - 1; i++) {
			System.out.println(i);
			if (sayilar[i] == 2 && sayilar[i + 1] == 2) {
				check = true;
				System.out.println("sayi"+(i) +": "+ sayilar[i] + "   ,    "+"sayi"+(i+1) +": "+ sayilar[i+1]);

			}
		}
//		System.out.println(check);
//
//		
//		System.out.println("******************"
//				+ "");
//		int a =0;
//		
//		System.out.println(sayilar.length);
//		for (int i = 1; i < sayilar.length; i++) {
//			System.out.println(i);
//			if (sayilar[i-1] == 2 && sayilar[i] == 2) {
//				check = true;
//				System.out.println("sayi"+(i-1) +": "+ sayilar[i-1] + "   ,    "+"sayi"+(i) +": "+ sayilar[i]);
//				a= i++;// buraya i++ yazarsan başka i-- yazarsan başka bunları yapmak döngü en son ne yapıyor görmeni sağlıyor
//				
//			}
//		}
//		System.out.println("sayilarlenghth: " + sayilar.length);
//		System.out.println("a: " + a);
//		
//		System.out.println(check);
	}

}
