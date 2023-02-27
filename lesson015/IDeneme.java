package lesson015;

public interface IDeneme{
	

	static void databaseEkle() {
		System.out.println("govdeli method.");
	}

	default void databaseEkle2() {
		System.out.println("govdeli method.");
	}
	
	
	// ya yukarıdaki gibi static ya da default yapacaksın ya da govdesiz.
	// commente bile hatta {} olmasına bile izin vermiyor.
	
	
	public String databaseEkle3() ;
	
	public void databaseEkle4();
	
}