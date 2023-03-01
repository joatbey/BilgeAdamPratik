package lesson001;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// girilen tl değerini usd değerine çeviren program yazalm
		Scanner input = new Scanner(System.in);
		System.out.println("TL DEĞERİ GİRİNİZ: ");
		float turkLirasi = input.nextFloat();
		float dolarKuru = 18.9f;
		float dolarKarsilik = (turkLirasi/ dolarKuru); 
		System.out.println("DOLAR KARŞILIĞI: "+ dolarKarsilik);
		String dolarKarsilikStringi = String.format("Dolar Karşılığı 2 decimal: %.2f", dolarKarsilik); 
		// bir string oluşturup String.format kullanarak içine arguman olarak float koyuyorsun '%.2f' yazip kac digit istiyorsan precision o böyle oluyor. f de floatun f'si
		System.out.println(dolarKarsilikStringi);	
	
		
		
	}

}
