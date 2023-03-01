package HW001;
public class Employee {
	
	private String name; 
	private double salary; 
	private int workHours; 
	private int hireYear; 

	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	
	//tax methodu--> eğer çalışanın maaşı 2000 tl den az ise
	// vergi uygulanmayacak, fazla ise maaşının %5 i kadar vergisi olacak
	public double tax() {
		if (salary < 2000) {
			return 0; 
		} else {
			return salary * 0.05; 
		}
	}

	//bonus metodu--> eğer haftada 40 saatten fazla çalıştıysa
	// çalıştığı saat başına 30 tl maaşa bonus uygulanacak
	// ve ne kadar bonus aldığı hesaplanacak
	public double bonus() {
		if (workHours > 40) {
			return (workHours - 40) * 30;
		} else {
			return 0;
		}
	}

	//raiseSalary--> işe girdiği yıla göre maaş artışı yapılacak
	//şuanki yıl 2022, 10 yıldan az ise %5, 10- 20 yıl arasında %10
	//20 yıldan fazla ise %15 zam yapılcak
	public void raiseSalary() {
		int yearDiff = 2022 - hireYear; 
		if (yearDiff < 10) {
			salary *= 1.05; 
		} else if (yearDiff < 20) {
			salary *= 1.10; 
		} else {
			salary *= 1.15; 
		}
	}

	//employye bilgilerini goster method
	public String bilgileriGoster() {
		return "Name: " + name + "\n" + "Salary: " + salary + " TL\n" + "Work Hours: " + workHours + "\n"
				+ "Hire Year: " + hireYear;
	}
	
	
	public static void main(String[] args) {
		Employee employee1 = new Employee("Ali", 10000, 45, 2020);
		System.out.println("Employee info:  \n" + employee1.bilgileriGoster() + "\n");
		employee1.raiseSalary();
		System.out.println("Employee info after raise :  \n" +employee1.bilgileriGoster( )+ "\n");
		employee1.salary += employee1.bonus(); 
		System.out.println("Employee info after raise and bonus :  \n" +employee1.bilgileriGoster()+ "\n");
		employee1.salary -= employee1.tax() ;
		System.out.println("Employee info after raise and bonus  - tax :  \n" +employee1.bilgileriGoster()+ "\n");

	}
}
