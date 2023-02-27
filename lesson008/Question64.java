package lesson008;

public class Question64 {

	// girilen kelimenin ilk ve son harflerini birbirleriyle değiştirelim

	public static String harfDegistir(String kelime) {
		if (kelime.length() < 2) {// eğer tek harfli girildiyse girilen harfi return etsin
			return kelime;
		}
		if (kelime.length() > 100 || kelime.length() < 0) {// girilen kelimenin 0 ile 100 karakter arasında olması lazım

			System.out.println("0 ile 100 arasında sayıda karakter girmelisiniz.");
		}
		// System.out.println(kelime[1]); // her ne kadar string bir char dizisi gibi
		// olsa da javada nesne...
		// o yüzden bir stringin bilmemkaçıncı indeksini manipule edebilmek için
		// toCharArray kullanıyoruz.
		char[] chArray = kelime.toCharArray();// Converts this string to a new character array.

		char ilkHarf = chArray[0]; // bunları böyle değişkenlerde tutuyorum çünkü yoksa ilk değişimden sonra diğer
									// değişimi yapamam.
		char sonHarf = chArray[chArray.length - 1];

		chArray[0] = sonHarf;// sonHarf değişkenine kaydettiğim son harfi ilk harfe atadım.

		chArray[chArray.length - 1] = ilkHarf; // ilkHarf değişkenine kaydettiğim ilk harfi de ilk harfe atadım.

		return String.valueOf(chArray); // Returns the string representation of the char array

	}

	// Stringbuilder ile de yapalım.

	public static String harfDegistirStringBuilder(String kelime) {
		if (kelime.length() < 2) {
			return kelime;
		}
		if (kelime.length() > 100 || kelime.length() < 0) {
			System.out.println("0 ile 100 arasında sayıda karakter girmelisiniz");
		}

		StringBuilder stringBuilder = new StringBuilder(kelime); // StringBuilder bir class. setCharAt(i,j) methodunu
																	// kullanmamızı sağlıyor. parametre olarak stringi
																	// alıyor. nesne olarak stringBuilder nesnesine
																	// istediğimizi yapıypruz. sonra toString ile tekrar
																	// string yapıyoruz

		char first = kelime.charAt(0); // Returns the char value at the specified index.
		char last = kelime.charAt(kelime.length() - 1); // yukarda da bunu yaptıl

		stringBuilder.setCharAt(0, last); // stringBuilder objesinden doğan bir method setCharAt. ilk parametredeki
											// indexse ikinci parametredeki karakteri set et
		stringBuilder.setCharAt((kelime.length() - 1), first);

		return stringBuilder.toString();
	}

	// palindrome checker...

	public static boolean isPalindrome(String kelime) {
		// kelime-->kayak
		// ters Çevrilmiş Kelime--> kayak
		// bu ikisi eşit mi
		StringBuilder stringBuilder = new StringBuilder(kelime); // yine StringBuilder classı işe yarıyor.
		String tersi = stringBuilder.reverse().toString(); // yine stringBuilder objesinden doğan bir method reverse()
															// ve toString ile tekrar stringe çevirdik.
		// yukarıdaki iki satır yerine
		// String tersi = new StringBuilder(kelime).reverse().toString(); yalnız bu da
		// olur...

		boolean kontrol = kelime.equals(tersi); // kelime ve tersi stringlerini equals() metoduyla karşılaştırdım. Bu
				// equals() boolean return ediyor.
		System.out.println(( kontrol? "palindrome " : "palindrome değil     " ));// bu (kontrol ? "doğruysa " : "yanlışsa") notasyonuna da alış...
		return kontrol;
	}

	public static void main(String[] args) {
		//

		System.out.println(harfDegistir("abcde"));
		System.out.println(harfDegistirStringBuilder("consio"));
		
		System.out.println(isPalindrome("skayaks"));

	}
}