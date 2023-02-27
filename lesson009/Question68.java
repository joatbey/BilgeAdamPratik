package lesson009;

public class Question68 {
	public static void main(String[] args) {
		// girilen kelimedeki sesli harflerin sayısını bulan methodu yazalım
		// method int dönsün parametre olarak String alcak

		System.out.println(sesliHarfleriSay("javaaa"));
	}

	private static int sesliHarfleriSay(String kelime) {
		int count = 0;
		for (int i = 0; i < kelime.length(); i++) {
			char karakter = kelime.charAt(i);

			switch (karakter) {
			case 'a', 'e', 'i', 'o', 'u':
				count++;
				continue;

			default:
				break;
			}
		} //15:57
		return count;
	}
	public static int sesliHarfSayma(String str) {
		char[] dizi = { 'a', 'e', 'i', 'o', 'u' };
		int sesliHarfSayisi = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < dizi.length; j++) {
				if (str.charAt(i) == dizi[j]) {
					sesliHarfSayisi++;
				}
			}
		}
		return sesliHarfSayisi;
	}
}
