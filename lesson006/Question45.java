package lesson006;

public class Question45 {

	public static void main(String[] args) {
		
		// BilgeAdam
		//AdvancedJava yazdır...
				
		String[][] matris1 = { { "Bilge", "Advanced" }, { "Postgre", "Data" } };

		String[][] matris2 = { { "Adam", "Java" }, { "SQL", "Base" } };
		
		System.out.println(matris1[0][0] + matris2[0][0]);
		System.out.println(matris1[0][1] + matris2[0][1]);
		System.out.println(matris1[1][0] + matris2[1][0]);
		System.out.println(matris1[1][1] + matris2[1][1]);
		System.out.println("************");
		//// for döngüsü
		//i = 0 -> 1 
		//j = 0 -> 1
		//Bilge + Adam
		//Advanced + Java
		//PostgreSQL
		//Data + Base 
		for (int i = 0; i < matris1.length; i++) {
			for (int j = 0; j < matris2[i].length; j++) {
				System.out.print(matris1[i][j] + matris2[i][j]);
				System.out.println();

				
			}
		}
		
	}

}
