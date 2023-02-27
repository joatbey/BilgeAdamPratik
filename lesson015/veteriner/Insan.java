package lesson015.veteriner;

public abstract class Insan {
	
	private String tcKimlik;
	private String isim;
	
	//////CONSTRUCTORS//////
	public Insan(String isim, String tcKimlik) {
		super();
		this.tcKimlik = tcKimlik;
		this.isim = isim;
	}


	/////GETTERS-SETTERS //////

	public String getTcKimlik() {
		return tcKimlik;
	}

	public void setTcKimlik(String tcKimlik) {
		this.tcKimlik = tcKimlik;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	////////TOSTRING///////////

	@Override
	public String toString() {
		return "Insan [tcKimlik=" + tcKimlik + ", isim=" + isim + "]";
	}

}
