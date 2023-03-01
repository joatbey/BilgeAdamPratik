package lesson004;

import java.util.Scanner;

public class Question37 {

	public static void main(String[] args) {
		// kullanıcdan
		// email, password, repassword alalım

		// emaili kontrol edicez '@hotmil.com', '@outlook.com' var mı?
		// emailiniz email formatına uygun değildir

		// password repassword
		// ikisi aynı değilse passwordler uyuşmuyo
		// password min 8 karakter olsun

		//
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		boolean check2 = true;

		while (check) {
			System.out.print("mail girin : ");
			String mail = scanner.nextLine();

			if (!(mail.contains("@hotmail.com") || mail.contains("@outlook.com")|| mail.contains("@gmail.com"))) {
				System.out.println("email formatına uygun değildir");
			} else {
				while (check2) {
					System.out.print("şifrenizi girin : ");
					String password = scanner.nextLine();

					System.out.print("tekrar şifre girin : ");
					String rePassword = scanner.nextLine();

					if (password.equals(rePassword) && (password.length() >= 8)) {
						System.out.println("Giriş yaptınız--> " + mail);
						check2 = false;
						check = false;
					} else {
						System.out.println("ya şifreler uyuşmuyo ya da şifre 8 den küçk");
					}
				}

			}
		}

	}

}
