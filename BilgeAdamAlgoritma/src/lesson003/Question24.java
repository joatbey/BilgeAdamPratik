package lesson003;

public class Question24 {

	public static void main(String[] args) {
		// 1den 100e kadar olan çift sayıların toplamının tek sayıların toplamına oranını bulan programı yazalım
		double ciftToplam = 0 ;
		double tekToplam = 0 ;
		
		for(int i =1 ; i<=99 ; i+=2) {
			tekToplam += i;
		}
		for(int i =2 ; i<=100 ; i+=2) {
			ciftToplam += i;
		}
		double oran = ciftToplam/tekToplam ;
		System.out.println(oran);
		/////
		System.out.println("*****************");
		////
		
		for (int i = 1 ; i <101 ; i++) {
			if( i %2 == 0 ) {
				ciftToplam = ciftToplam+i;
			}
			else {
				tekToplam = tekToplam+i;
			}
		}
		System.out.println(ciftToplam/tekToplam);
	}

}
