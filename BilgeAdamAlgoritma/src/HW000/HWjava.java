package HW000;

public class HWjava {

	public static void main(String[] args) {
		// 1

		// 2
		// Bir dizide en büyük ikinci sayıyı bulan program
		int nums[] = { 1, 13, 13, 13, 2, 5, 13, 1 };

		int max = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("en buyuk sayi: " + max);
		// bi int dizisi oluşturdum boş ve aynı boyda
		int[] numKesik = new int[nums.length];
		for (int i = 0; i < nums.length; i++)
			if (nums[i] < max) {
				numKesik[i] = nums[i];
			}
		int biUfakMax = 0;
		for (int i = 0; i < numKesik.length - 1; i++) {
			if (numKesik[i] > biUfakMax) {
				biUfakMax = numKesik[i];
			}
		}
		System.out.println("en buyuk ikinci sayi: " + biUfakMax);
		System.out.println("**********");

		// 3
		// bir dizide eğer 13 var ise hem 13ü hemde bir sonraki indexi
		// toplama işlemine almayacak
		// dizideki elemanların toplamını bulalım
		int nums2[] = { 1, 13, 5, 13,13,13,13,13, 2, 5, 7, 1 };
		int toplam = 0;
		// 1 + 5 + 7 +1
		// toplam --> 1 + 5 = 6
		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] == 13) {
				i++;
				do {
					i++;
					continue;
				} while (nums2[i] == 13);
				continue; // bu continue for loopun sonuna atıyo sanırım...

			}
			toplam = toplam + nums2[i];

			System.out.print(nums2[i] + ", ");

		}

		System.out.println("toplam : " + toplam);
	}

}
