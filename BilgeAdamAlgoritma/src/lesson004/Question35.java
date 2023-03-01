package lesson004;

public class Question35 {

	public static void main(String[] args) {
		// Java,Spring,Postgre,React
		// bunları asagidaki gibi yaz...
		// Java
		// Spring
		// Postgre
		// React

		String liste = "Java,Spring,Postgre,React";
		String[] str = liste.split(",");
		// System.out.println(str[0]);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);

		}

		
		
		System.out.println("***********************");
		// böyle de oluyor.
		
		String stringText = "Java,Spring,Postgre,React";
		int index = 0;
		for (int i = 0; i < stringText.length(); i++) {
			if (stringText.charAt(i) == ',') {
				System.out.println(stringText.substring(index, i));
				// index = 0 , i = 4
				index = i + 1;
				// index = 5
			}
	
		}		
		System.out.println(stringText.substring(index));
		
	}

}
