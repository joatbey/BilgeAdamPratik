package lesson022;

import lesson021.EErrorType;

public class Kisi {

	private String name;
	private int age;
	private ECinsiyet eCinsiyet;
	
	
	
	public Kisi(String name, int age, ECinsiyet eCinsiyet) {
		super();
		this.name = name;
		this.age = age;
		this.eCinsiyet = eCinsiyet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ECinsiyet geteCinsiyet() {
		return eCinsiyet;
	}
	public void seteCinsiyet(ECinsiyet eCinsiyet) {
		this.eCinsiyet = eCinsiyet;
	}
	@Override
	public String toString() {
		return "Kisi [name=" + name + ", age=" + age + ", eCinsiyet=" + eCinsiyet + "]";
	}
	
	public void elliYasUstu() {
		System.out.println(getName() + " 50 yas ustudur...");
	}
	
	
	
	
}
