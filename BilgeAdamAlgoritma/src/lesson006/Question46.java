package lesson006;

public class Question46 {

	public static void main(String[] args) {
		// 3x3luk bos bir matris olusturalım
		// 1 1 1 
		// 2 2 2
		// 3 3 3
		

		// 	1 1 1
		//	2 2 2
		//	---
		
		//i ->1
		//j-> 0,1
		
		
		//14:48
		
		int[][] array = new int[2][3];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				array[i][j] = i + 1;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
