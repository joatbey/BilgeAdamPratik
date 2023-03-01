package lesson015;

public class NormalPerson extends Person{
	
	private String normalPersonNumber;
	
	public NormalPerson(String name, String surname, int age, String normalPersonNumber) {
		super(name, surname, age);
		this.normalPersonNumber = normalPersonNumber;
		
	}

	public String getNormalPersonNumber() {
		return normalPersonNumber;
	}

	public void setNormalPersonNumber(String normalPersonNumber) {
		this.normalPersonNumber = normalPersonNumber;
	}
	
	@Override
	public void bilgileriGoster() {
		System.out.println("Normal Person sınıfı çalıştı. " + getNormalPersonNumber());
	}
	

}