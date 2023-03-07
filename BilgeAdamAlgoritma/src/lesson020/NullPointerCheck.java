package lesson020;

public class NullPointerCheck extends Exception {


	private static final long serialVersionUID = 1L;
	
	private String mesaj;

	public NullPointerCheck(String mesaj) {
		super();
		this.mesaj = mesaj;
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	@Override
	public String toString() {
		return "NullPointerCheck [mesaj=" + mesaj + "]";
	}
	
	

}