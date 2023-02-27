package lesson014;

public class Main {

	public static void main(String[] args) {

		// Account sınıfımız olsun sınıfımız attributeleri
		// accountNo, money

		// paraYatir()
		// paraCekMethodu()

		// paraYatir() -->hesabamızı bizim belirttiğimiz miktarda para eklencek
		// paraCekMethodu() -->hesabamızdan bizim belirttiğimiz miktarda para düşücek

		// bakiye 0
		// paraYatir() --> 100 tl yatırdınız güncel bakiyeniz 100
		// paraCekMethodu() --> 50 tl hesaptan para çektiniz güncel bakiyeniz 50

		// para çekmek istediğimiz zaman hesapta o kadar para yoksa çekmemize izin
		// vermesin
		// para yatırırıken max 10.000tl limit

		// AccountManager sınıf oluşturalım para cek ve para yatır methodlarını
		// AccountManager sınıfına taşıyalım

		// AccountManager sınıfında bilgileri göster methodu
		// hesapnomuzu ve güncel bakiyemizi

		// User sınıfı oluşturalım
		// String name, surname, email, Account account
		// mainde user oluştururken birde accountu verelim

		// kullanıcıdan aldıgımız name ve surname değerleri ile
		// otomatik @xbanka.com uzantılı mail oluşturalım
		// Xbanka
		// name.surname@xbanka.com

		// User olarak
		// krediBaşvurusunuda bulunalım
		// krediyi çekeceği accountu bir de ne kadar kredi istiyorsa, miktar

		// Account sınıfının içinde
		// private boolean krediBasvurusu
		// private int istenenKrediMiktari --> 10.000
		// krediBasvurusndaBulun() --> Account account, int para
		// UserManager içinde yazalım

		// AdminManager sınıfı oluşturalım
		// krediBasvurusunuOnayla();
		// kredibaşvurusnun olması lazım
		// bizim hesabımızı çekmek istediğimiz kadar kredimiktarı hesabımıza düşsün
		
		//KrediBasvurusunuReddet()
		//kredibaşvurusnun olması lazım
		
		//Account Nesnesi oluşturdugumuz
		//Otomatik id atasın
		
		//-----
		
		//krediBorcunuÖde()
		//dışardan nakit ödeme
		//eğer user'ın çekmiş oldugu kredi yoksa ve ya kredi başvurusu reddilmiş ise
		//işleminizi gerçekleştiremiyoruz
		//çekilmiş kredi varsa parametre olarak girdiğimiz miktar kadar ödeme yapmış olalım
		//ve kredi kartı borcundan düşülsün
		
		//çıktı olarak--> güncel kredi kartı borcunuz ....TL. 
		
		//hesaptanKrediBorcunuOde();
		
		
			
		AccountManager accountManager = new AccountManager();
		UserManager userManager = new UserManager();
		AdminManager adminManager = new AdminManager();

		Account account = new Account();
		account.setMoney(30000);
		accountManager.accountDetails(account);

		Account account2 = new Account();
		account2.setMoney(20000);
		accountManager.accountDetails(account2);

		Account account3 = new Account(5000);
		account3.setMoney(10000);
		accountManager.accountDetails(account3);

		User user1 = new User("ahmet", "yaz", account);
		System.out.println(user1.getAccount().getMoney());

		User user2 = new User();
		user2.setEmail("asd@gmail.com");
		user2.setName("mehmet");
		user2.setSurname("kış");
		user2.setAccount(account2);
		System.out.println(user2.getAccount().getMoney() + " " + user2.getEmail());

		User user3 = new User("ali demir", "sonbahar", account3);
		userManager.generateAutoEmail(user3);
		System.out.println(user3.getEmail());

		System.out.println("*****************");
		System.out.println(account.getMoney());
		userManager.krediBasvurusundaBulun(account, 17500);
		
		adminManager.krediBasvurusunuOnayla(account);
		adminManager.krediBasvurusunuReddet(account);
		adminManager.krediBasvurusunuOnayla(account);
		System.out.println(account.getMoney());
		
		System.out.println(account.getIstenenKredi());

		System.out.println("*****************");
		
		System.out.println(account3.getMoney());
		userManager.krediBasvurusundaBulun(account3, 25000);
		adminManager.krediBasvurusunuOnayla(account3);
		//adminManager.krediBasvurusunuReddet(account3);
		accountManager.accountDetails(account3);
		userManager.krediBorcunuOde(account3, 5000);
		userManager.krediBorcunuOde(account3, 15000);
		System.out.println(account3.getKrediBorcu());
		System.out.println("Bakiyeniz: " + account3.getMoney());
		userManager.hesaptanKrediBorcuOde(account3, 1000);
		userManager.hesaptanKrediBorcuOde(account3, 1000);
		userManager.hesaptanKrediBorcuOde(account3, 1000);
		userManager.hesaptanKrediBorcuOde(account3, 6000);
		System.out.println(account3.getKrediBorcu());
		System.out.println("Bakiyeniz: " + account3.getMoney());
		
		userManager.nakitAvansCek(account3, 2000);
		System.out.println("Bakiyeniz: " + account3.getMoney());
		
		System.out.println("*****************");
		

		// accountManager.depositMoney(account, 200);
		// accountManager.depositMoney(account, 300);
		// accountManager.withdrawMoney(account, 300);
		// accountManager.accountDetails(account2);
		// accountManager.depositMoney(account2, 200);

		// account.withdrawMoney(100);
		// account.withdrawMoney(100);
		// account.depositMoney(500);

	}

}