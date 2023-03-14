package lesson023.service;

import lesson023.entity.data.User;
import lesson023.entity.database.DataBase;
import lesson023.entity.enums.EStatus;
import lesson023.util.Util;

public class AdminManager {

	public void getAll() {
		for (User user : DataBase.getUserList()) {
			System.out.println(user);
		}
		// DataBase.getUserList().forEach(user-> System.out.println(user.toString()));
	}

	public void getUserByActive() {
		System.out.println("**Aktive Edilmiş Kullanıcılar**");
		for (User user : DataBase.getUserList()) {
			if (user.geteStatus() == EStatus.ACTIVE) {
				System.out.println(user);
			}
		}
	}
	public void getUserByPendıng() {
		System.out.println("**Onay Bekleyen Kullanıcılar**");
		for (User user : DataBase.getUserList()) {
			if (user.geteStatus() == EStatus.PENDING) {
				System.out.println(user);
			}
		}
	}
	private User userIdKontrol(String id) {
		for (int i = 0; i < DataBase.getUserList().size(); i++) {
			if (DataBase.getUserList().get(i).getId().equals(id)) {
				return DataBase.getUserList().get(i);
			}
		}
		System.out.println("User Bulunamadı");
		return null;
	}

	public void setActive() {
		String id = Util.stringDegerAl("aktive etmek istediğinzi kullanıcının ID'si");
		User user = userIdKontrol(id);
		if (user != null) {
			user.seteStatus(EStatus.ACTIVE);
		}
	}
}