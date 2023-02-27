package lesson006;

public class Question52 {

	public static void main(String[] args) {
		// verilen 2 arrayde tekrar eden sayıları bulalım
		int array1[] = { 50, 60, 3, 4, 3, 9, 8, 7, 45, 95 };

		int array2[] = { 1, 2, 50, 50, 60, 3, 8, 9, 7, 88, 95 };
		int array3[] =  new int[array1.length] ;

		int index = 1;
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				
				if(array1[i] == array2[j]) {
					//array3[index] = array1[i];
					
					System.out.print(array1[i] + " ");
				}
			}
		}
		System.out.println("\n\n****************\n");
		// benimki daha güzel oldu her tekrarda saymıyor.
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {

				if (array1[i] == array2[j] && array3[index-1] != array1[i]) {
					 array3[index] = array1[i];
					 index++;
					System.out.print(array1[i] + " ");
					
				}
			}
		}
//		System.out.println("\n*******************\n"); yazdırmasam da olur o diziyi kontrol için kullanıyorum...
//		for(int i = 1 ; i<= array3.length ; i++) {
//			System.out.print(array3[i-1] + " ");
//		}

	}

}
