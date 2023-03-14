package lesson022;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiOrnek2 {

	// User sınıfı oluşturalım
	// id ve name
	// toString
	// bilgileriGoster methodu
	// mainde users dite liste oluşturalım
	// bu listeye birkaç user atalım

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();
		users.add(new User("ahmet", 12));
		users.add(new User("ahmet", 12));// aynı ama referansları farklı olduğu için set kabul etti 
		users.add(new User("ahmet", 12));
		users.add(new User("ali", 13));
		users.add(new User("abdullah", 14));
		users.add(new User("deniz", 25));
		users.add(new User("ahmet", 21));
		// yazdıralm
		System.out.println("* * * * *liste * * * * * *\n");
		users.stream().forEach(user -> System.out.println(user.toString()));
		System.out.println("\n* * * * *liste * * * * * *\n") ;
		// users.stream().forEach(user -> System.out.println(user.bilgileriGoster()));
		users.stream().forEach(user -> user.bilgileriGoster());

		System.out.println("\n* * * * 13tenbuyuk * * * * * * *\n");

		// idsi 13ten buyuk olanları bir listeye atalım
		// ve bu liste içindeki userlaron bilgilertini goster metodunu yazalm

		List<User> onUctenBuyukListe = users.stream().filter(user -> (user.getId() > 13)).collect(Collectors.toList());
		onUctenBuyukListe.stream().forEach(user -> user.bilgileriGoster());

		System.out.println("---------");
		onUctenBuyukListe.stream().forEach(user -> System.out.println(user.toString())); // sys out ile yazınca bilgileri gosteri

		System.out.println("\n* * * * * 13tenbuyuk* * * * * *\n");

		onUctenBuyukListe.stream().forEach(User::bilgileriGoster); // bu :: kullanımı da enteresan class içindeki
																	// methodu çağırıyor

		System.out.println("\n* * * * * 20denkucuk idli* * * * * *\n");

		
		//idsi 20den kucuk olanları sete atalım:
		Set<User> yirmidenKucukler = users.stream().filter(user-> user.getId() <20).collect(Collectors.toSet());
		yirmidenKucukler.forEach(User::bilgileriGoster);
		System.out.println("set formunda: "+yirmidenKucukler);
		
		
		
		System.out.println("\n* * * * * ahmet isimli * * * * * *\n");

		// ismi ahmet olanları yazalım
		List<User> ahmetler = users.stream().filter(user -> user.getName().equalsIgnoreCase("ahmet")).collect(Collectors.toList());
		ahmetler.forEach(User::bilgileriGoster);
		
		
		System.out.println("\n* * * * * sonuna!! * * * * * *\n");

		// her bir user için yeni bir User nesnesi oluşturalım
		// parametre olarak id ve isimlerini alsınlar ve isimlerinin sonuna !! ekleyelim
		// yeni listede yazdıralım
		
		List<User> yeniUser = users.stream()
				.map(user-> new User(user.getName()+"!!", user.getId()))
				.collect(Collectors.toList());
		
		yeniUser.forEach(User::bilgileriGoster);
		
		
		
		
		
	}

}
