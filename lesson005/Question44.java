package lesson005;
import java.util.Arrays;
public class Question44 {

	public static void main(String[] args) {
		int[] sayilar = { -2,-4,10,5 ,4,5,-5,-3,-3,-4,-3};
		int count = 0;
		//kaç negatif olduğunu yaz:
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] < 0) {
				count++;
			}
		}
		System.out.println(count+"'tane negatif sayı var "); // 7 negatif sayı var
		// count = 3
		
		int[] negatifSayilar = new int[count]; // int sayilar {-2, -4}
		int index = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] < 0) {
				negatifSayilar[index] = sayilar[i];
				index++;
			}
		}
		for (int i = 0; i < negatifSayilar.length; i++) {
			System.out.print(negatifSayilar[i]);
			
		}
		System.out.println();
		System.out.println("array gibi göster: " + Arrays.toString(negatifSayilar)); // (Array.toString(arrayAdi)) 1dimensional arrayler için
		
		// 2dimensional arrayler için 
	}

}
