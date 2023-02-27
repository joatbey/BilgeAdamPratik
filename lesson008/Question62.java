package lesson008;

import java.util.Scanner;

public class Question62 {

	public static void main(String[] args) {
		// 2 metot yazcaz
		// 1- kullanıcdan aldıgımız email değerini kontrol edelim doğru formatta mı diye
		// @ varmı
		// hotmail.com veya gmail.com ile mi bitiyor

		// password ve repassword bunların uyuşup uyuşmadıgını kontrol edicez
		//

		// bilg@gmail.com
		// indexOf(@)
		// substring()
		// equals()

		// endswith()
		// emailKontrol2("basadas@gmail.com12");
		login();
	}

	public static boolean emailKontrol() {
		boolean mailKontrol = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("mail giriniz: ");

		String mail = scanner.nextLine();
		mail.trim();
		emailKontrol2(mail);
		if (!(mail.endsWith("@hotmail.com") || mail.endsWith("@gmail.com"))) {// bunla ya da diğeriyle bitmiyorsa (!'a
																				// dikkat) kontolbooleanını false yap
			mailKontrol = false;
		}
		return mailKontrol;
	}

	public static boolean passwordKontrol() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("şifre giriniz: ");
		String sifre1 = scanner.nextLine();

		System.out.println("şifreyi tekrar giriniz: ");
		String sifre2 = scanner.nextLine();
		boolean passwordKontrol = true;
		if (sifre1.equals(sifre2)) {
			// bir boolean nesneyi .equals ile bullandık. sifre1==sifre2 diye de yapamaz
			// mıyız ?
			// YAPAMAYIZ burası önemli: çünkü == string için kullanılamaz bu primitive data
			// tipleri ile kullanılır.
			System.out.println("şifreler aynı  : " + "sifre1:" + sifre1 + " = " + "sifre2:" + sifre2);
		} else {
			passwordKontrol = false;
		}
		return passwordKontrol;
	}

	public static void login() {
		boolean passwordCheck = passwordKontrol();// bu metodlar boolean return edecek şekilde yazıldığı için böyle yap
		// System.out.println(passwordCheck);
		boolean emailCheck = emailKontrol();
		// System.out.println(emailCheck);

//		if (emailCheck && passwordCheck) { // yap ki burada iflerin içinde kullan
//			System.out.println("giriş yaptınız");
//		} else {
//			System.out.println("bilgiler yanlış");
//		}

		if (emailKontrol() && passwordKontrol()) { // yap ki burada iflerin içinde kullan
			// bu ifin içine methodları direkt koyduğun zaman
			// ifin içinde çağırmak için bir daha methodu çağırıyor.  
			System.out.println("giriş yaptınız");
		} else {
			System.out.println("bilgiler yanlış");
		}

	}

	public static void emailKontrol2(String email) {
		//abc@gmail.com
		if (email.contains("@")) {
			int index = email.indexOf('@');
			System.out.println(index + ". indekste @ var.");
			String kontrol = email.substring(index, email.length());
			System.out.println("@ten sonrasi böyle: " + kontrol);
			//kontrol --> @gmail.com

			if (kontrol.equals("@hotmail.com") || kontrol.equals("@gmail.com")) {
				System.out.println("doğru format");
			}else {
				System.out.println("email doğru formatta değil");
			}
		}else {
			System.out.println("@ yok");
		}
	}

}