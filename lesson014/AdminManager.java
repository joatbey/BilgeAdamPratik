package lesson014;

public class AdminManager {
	
	
	public void krediBasvurusunuOnayla(Account account) {
		// Kredi başvurusu var mı yok mu?
		if (account.isKrediBasvurusu()) {
			System.out.println("Kredi Başvurnuz Onaylanmıştır. ");
			account.setMoney(account.getMoney() + account.getIstenenKredi());
			
			account.setKrediBorcu(account.getIstenenKredi());
			account.setKrediAlindimi(true);
			
			account.setKrediBasvurusu(false);
			account.setIstenenKredi(0);
			
		} else {
			System.out.println("Kredi Başvurusu Yok");
		}
	}

	public void krediBasvurusunuOnayla(User user) {
		// Kredi başvurusu var mı yok mu?
		if (user.getAccount().isKrediBasvurusu()) {
			System.out.println("Kredi Başvurnuz Onaylanmıştır. ");
			user.getAccount().setMoney(user.getAccount().getMoney() + user.getAccount().getIstenenKredi());
			user.getAccount().setKrediBasvurusu(false);
		} else {
			System.out.println("Kredi Başvurusu Yok");
		}
	}
	public void krediBasvurusunuReddet(Account account) {
		if (account.isKrediBasvurusu()) {
			System.out.println("Kredi Başvurnuz Reddedilmiştir. ");
			account.setKrediBasvurusu(false);
			account.setIstenenKredi(0);
		} else {
			System.out.println("Kredi Başvurusu Yok");
		}
	}
}