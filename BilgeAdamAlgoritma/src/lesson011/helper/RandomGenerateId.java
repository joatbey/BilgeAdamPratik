package lesson011.helper;

import java.util.Random;

public class RandomGenerateId {

	public static String generateId() {
		Random random = new Random();
		int intRandomNumber = random.nextInt(1000, 10000);
		String randomId = Integer.toString(intRandomNumber);
		return randomId;
	}

	public static String generateProductCode(String name) {
		Random random = new Random();
		int intRandomNumber = random.nextInt(100, 1000);
		String urunKodu = name.substring(0, 3) + intRandomNumber;
		System.out.println(urunKodu);
		return urunKodu;
	}

	public static String generateProductCodeWithStringBuilder(String productName) { // string builder ile yaptık
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		sb.append(productName.substring(0, 3));
		sb.append(Integer.toString(random.nextInt(100, 1000)));
		return sb.toString();
	}

}