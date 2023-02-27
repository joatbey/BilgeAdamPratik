package lesson003;

public class Question26 {

	public static void main(String[] args) {
		// a'dan z'ye harfleri yazdıralım
		
		char ch;
		for(ch='a';ch<= 'z'; ch++) {
			System.out.println(ch+" ");
		}
		
		//ascii koduyla da boyle: 
		for(char i= 97; i<= 122; i++) {
			System.out.println(i + " ");
		}
	}

}
