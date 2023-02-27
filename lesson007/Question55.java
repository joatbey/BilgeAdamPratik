package lesson007;

public class Question55 {

	public static void main(String[] args) {

		// Verilen arrayda en büyük ve küçük değerleri bulan program
		String[] array = { "100", "8", "7", "5", "99", "85" };// burada string dizisi olduğu için. önce inte çevirmek
																// lazım...

		int min = Integer.MAX_VALUE; // 2147483647 // küçük bulurken min değeri MAXINTGEER ile initialize etmek makul
		int max = Integer.MIN_VALUE; // -2147483648 // bu da vice versa

		// min 8
		// max 100
		int[] intArray = new int[array.length]; // boş bi array yaptım

		for (int i = 0; i < array.length; i++) {
			intArray[i] = Integer.parseInt(array[i]); // arrayi integer arrayine çevirdim. bu method Integer classında
														// parseInt methodu ve bu bir integer alıyor parametre olarak
		}

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > max) {
				max = intArray[i];
			}
		}
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] < min) {
				min = intArray[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);

		System.out.println("**********************");
		
		for (int i = 0; i < array.length; i++) {
			if (Integer.parseInt(array[i]) < min) {
				min = Integer.parseInt(array[i]);
				//primitive int döndürüyo
				//ikisinin farkı
				
				min = Integer.valueOf(array[i]);
				//Nesne(Obje) döndürüyo
				
				
			} else if (Integer.parseInt(array[i]) > max) {
				max = Integer.parseInt(array[i]);
			}
		}
		System.out.println("min: " + min + "\nmax: " + max);
	}

}