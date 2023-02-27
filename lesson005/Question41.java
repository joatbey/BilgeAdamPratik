package lesson005;

public class Question41 {
	
	public static void main(String[]args) {
		
		int[] sayilar = {0 , 120 ,-5 ,-85 , -256 , 16 , 1258 , 81 , 14 };
		//int[] yeniSayilar = {0 , 0 ,0 ,0};
		Integer[] yeniSayilar = new Integer[4];
		// 0 dan kucuk sayilar yerine 100 koyalım.
		
		
		int enKucuk = 0;
		for(int i =0; i<sayilar.length;i++) {
			if(sayilar[i] <= enKucuk) {
				//sayilar[i]= 100;
				yeniSayilar[i] = sayilar[i];						
				int yeniSayi = sayilar[i];
				System.out.println(i+".index değişti "+ yeniSayi);
				
				
			}
		}
		System.out.println("************");
		
		for(int i = 0 ; i< sayilar.length ;i++ ) {
			System.out.println(sayilar[i]);
		}
		
		
		
		
	}
}
