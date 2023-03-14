package lesson023.entity.database;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lesson023.entity.data.User;

public class DataBase {

	private static List<User> userList = new ArrayList<>();

	public DataBase() {
		userList.add(new User("ahmet@gmail.com", "123", "ahmet", LocalDate.now()));
		userList.add(new User("hakan@gmail.com", "123", "hakan", LocalDate.now()));
		userList.add(new User("serkan@gmail.com", "123", "serkan", LocalDate.now()));
		userList.add(new User("onur@gmail.com", "123", "onur", LocalDate.now()));
	}

	public static List<User> getUserList() {
		return userList;
	}

}