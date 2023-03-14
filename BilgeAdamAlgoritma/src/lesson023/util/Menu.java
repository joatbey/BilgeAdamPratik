package lesson023.util;

import lesson023.entity.data.User;
import lesson023.entity.enums.EStatus;
import lesson023.service.AdminManager;
import lesson023.service.UserManager;

public class Menu {

	UserManager userManager;
	AdminManager adminManager;

	public Menu() {
		userManager = new UserManager();
		adminManager = new AdminManager();
	}

	public void menu() {
		System.out.println("1- Admin Menu");
		System.out.println("2- User İşlemleri");
		System.out.println("3- Kayıt Ol");
		int key = Util.intDegerAlma("Yapmak istediğiniz işlem: ");
		switch (key) {
		case 1:
			adminMenu();
			break;
		case 2:
			userLogin();
			break;
		case 3:
			userManager.register();
			break;

		default:
			break;
		}
	}

	private void adminMenu() {
		System.out.println("1- Tüm Kullanıcıları Listele");
		System.out.println("2- Kullanıcı Aktif et");
		System.out.println("3- Aktif kullanıcıları listele");
		System.out.println("4- Onay Bekleyen kullanıcıları listele");
		System.out.println("5- Ana Menu");
		int key = Util.intDegerAlma("Yapmak istediğiniz işlem: ");
		switch (key) {
		case 1:
			adminManager.getAll();
			break;
		case 2:
			adminManager.setActive();
			break;
		case 3:
			adminManager.getUserByActive();
			break;
		case 4:
			adminManager.getUserByPendıng();
			break;
		default:
			break;
		}
	}

	private void userLogin() {
		String mail = Util.stringDegerAl("Mail: ");
		String password = Util.stringDegerAl("Password: ");

		User user = userManager.userMailKontrol(mail);
		boolean kontrol = userManager.userSifreKontrol(password);
		if (user != null && kontrol && user.geteStatus() == EStatus.ACTIVE) {
			System.out.println(user.getId());
			userMenu(user);
		}else {
			System.out.println("Lütfen onay bekleyin.");
		}
	}
	private void userMenu(User user) {
		System.out.println("1- Dm At");
		System.out.println("2-Mesajları listele");
		int key = Util.intDegerAlma("Yapmak istediğiniz işlem: ");
		switch (key) {
		case 1:
			userManager.dmAt(user);
			break;
		case 2:
			userManager.dmListesi(user);
			break;
		case 3:
		default:
			break;
		}
	}
	
	//UserExcepiton sınıfı
}