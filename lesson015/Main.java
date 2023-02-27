package lesson015;

public class Main {

	public static void showInfo(Person person) {
		person.bilgileriGoster();
	}
	
	public static void main(String[] args) {
		// Mülakatlarda sorulur
		// Abstract sınıflar ve interface farkı...
		
		// interfaceler bir sınıfın nasıl davranacağını söyler
		
		//interfacelerde gövdeli method yazılır mı ? Hayır yazılmaz . {} olmaz.
		//public interface Deneme{
		//void DatabaseEkle(); //şeklinde yazılır
		//}

		// static methodlarda Java8'den sonra yapılabiliyor...

		
		// başka bir sınıfta yazıp override edilir... 
	
		//Polymorphism: Bir nesnenin farklı nesnelerinin farklı referansını tutabilme özelliği...
	
		Person person = new Person("Ahmet" , "Yaz" , 25);
		VipPerson vipPerson = new VipPerson("Mehmet","Kış",40,"55447788");
		NormalPerson normalPerson = new NormalPerson("Ali","Sonbahar",35,"22447788");
		
		showInfo(person);
		showInfo(vipPerson);
		showInfo(normalPerson);
	}
	

}
