package lesson002;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// telefona ve maile bi kod gelecek biz tanımlayacağız
		// kullanıcıdan bu kodları isteyeceğiz
		// uyuşuyorsa sisteme kayıt oldunuz
		// ya mail ya telefon hatalıdır
		// kullanıcıyı bilgilendir
		Scanner input = new Scanner(System.in);
		int telKodSent = 123456;
		int mailKodSent = 123456;

		System.out.println("Telefona gelen kodu giriniz: ");
		int telKod = input.nextInt();
		System.out.println("Maile gelen kodu giriniz ");
		int mailKod = input.nextInt();
		
		if (telKod == mailKod) {
			System.out.println("Sisteme kayıt oldunuz...");
		}
		else { System.out.println("bi sıkıntı var.");
		
		if (telKod != telKodSent && mailKod != mailKodSent) {
			System.out.println("telefonada maile de girilen kodu yanlış girdiniz.");

		}

		else if (mailKod != mailKodSent) {
			System.out.println("maile gelen kodu yanlış girdiniz. ");
		}
		else if (telKod != telKodSent ) {
			System.out.println("telefona gelen kodu yanlış girdiniz. ");
		}
		}
	}
}