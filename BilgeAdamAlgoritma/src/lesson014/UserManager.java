package lesson014;

public class UserManager {

	private final String emailFormat = "@xbanka.com";

	public void generateAutoEmail(User user) {
		user.setEmail(
				user.getName().toLowerCase().replace(" ", ".") + '.' + user.getSurname().toLowerCase() + emailFormat);
	}

	public void alternatifOtomatikEmailOlustur(User user) {
		String otomatikOlusanEmail = user.getName().toLowerCase().replaceAll(" ", ("."))
				.concat("." + user.getSurname().toLowerCase().replace(' ', ('.'))) + emailFormat;
		user.setEmail(otomatikOlusanEmail);
	}

	public void krediBasvurusundaBulun(Account account, int para) {
		account.setKrediBasvurusu(true);
		account.setIstenenKredi(para);

		System.out.println(para + " Değerinde kredi başvursu yaptınız");
		System.out.println("Lütfen onay bekleyin... ");
	}

	// Uğur beye Ödev.
	public void krediBorcunuOde(Account account, int taksit) {
		if (account.isKrediAlindimi()) {
			if (account.getKrediBorcu() < taksit) {
				System.out.println("Kart Borcunuz yatırılan miktardan az");
			} else {
				account.setKrediBorcu(account.getKrediBorcu() - taksit);
				System.out.println(taksit + " Kadar ödeme yaptınız Güncel Borcunuz--> " + account.getKrediBorcu());
				account.setKrediBorcuOdendiMi(true);
				account.setKrediPuani(account.getKrediPuani() + 10);
			}
		} else {
			System.out.println("Kredi Borcunu Bulunmamakta");
		}
	}
	
	public void hesaptanKrediBorcuOde(Account account, int taksit) {
		if (account.isKrediAlindimi()) {
			if (account.getKrediBorcu() < taksit) {
				System.out.println("Kart Borcunuz yatırılan miktardan az");
			} else {
				if (account.getMoney() >= taksit) {
					account.setKrediBorcu(account.getKrediBorcu() - taksit);
					account.setMoney(account.getMoney() - taksit);
					System.out.println(taksit + " Hesaptan ödeme yaptınız Güncel Borcunuz: " + account.getKrediBorcu());
					System.out.println("Hesabınızdaki bakiye : " + account.getMoney());
					account.setKrediBorcuOdendiMi(true);
					account.setKrediPuani(account.getKrediPuani() + 10);
				} else {
					System.out.println("Bakiyeniz yetersiz");
				}
			}
		} else {
			System.out.println("Kredi Borcunu Bulunmamakta");
		}
	}
	
	public void nakitAvansCek(Account account, int avans) {
		if(account.getKrediPuani() >=50) {
			System.out.println(account.getMoney() / 2 - account.getIstenenKredi() + " nakit avans çekebilirsiniz");
			account.setMoney(account.getMoney()-avans);
			System.out.println(avans + " Tl avans çektiniz ");
			System.out.println("Güncel Bakiye: " + account.getMoney());
		}else{
			System.out.println(" Kredi notu yetersiz kredi notunuz: " + account.getKrediPuani());
		}
	}
	
}