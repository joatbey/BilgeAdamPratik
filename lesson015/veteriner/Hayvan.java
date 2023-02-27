package lesson015.veteriner;


public abstract class Hayvan {
	
	//////FIELDS//////////
	private String name;
	private boolean kayitliMi;
	private String dogumTarihi;
	
	
	
	///////METHODS//////////
	
	public abstract void bilgileriGoster();
	public abstract void karneOlustur();
	
	
	
	//////CONSTRUCTORS//////
	public Hayvan(String name, boolean kayitliMi, String dogumTarihi) {
		super();
		this.name = name;
		this.kayitliMi = kayitliMi;
		this.dogumTarihi = dogumTarihi;
	}
	
	/////GETTERS-SETTERS //////
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isKayitliMi() {
		return kayitliMi;
	}
	public void setKayitliMi(boolean kayitliMi) {
		this.kayitliMi = kayitliMi;
	}
	public String getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	
	
	////////TOSTRING///////////
	@Override
	public String toString() {
		return "Hayvan [name=" + name + ", kayitliMi=" + kayitliMi + ", dogumTarihi=" + dogumTarihi + "]";// hayvan sınıfının toStringi
	}
	
}
