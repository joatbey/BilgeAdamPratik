package lesson015.veteriner;

public class Kedi extends Hayvan {
	
	//////FIELDS//////////
	private String tur ="Kedi";
	private String cins;
	private String karne;
	
	
	
	///////METHODS//////////

	@Override
	public void bilgileriGoster() {
		System.out.println(this.toString());
	}


	@Override
	public void karneOlustur() {
		setKarne("cins = " + getCins()+ " tur = " + getTur());
		System.out.println(getName() +" için Karnemiz oluştu : " + this.getKarne());
	}
	//////CONSTRUCTORS//////
	public Kedi(String name, boolean kayitliMi, String dogumTarihi,String cins) {
		super(name, kayitliMi, dogumTarihi);
		this.cins = cins;
	}


	/////GETTERS-SETTERS //////
	public String getTur() {
		return tur;
	}



	public void setTur(String tur) {
		this.tur = tur;
	}



	public String getCins() {
		return cins;
	}



	public void setCins(String cins) {
		this.cins = cins;
	}



	public String getKarne() {
		return karne;
	}



	public void setKarne(String karne) {
		this.karne = karne;
	}


	

	////////TOSTRING/////////// 

	@Override
	public String toString() {
		return super.toString()+"Kedi [tur=" + tur + ", cins=" + cins + ", karne=" + karne + "]";
	}
	
	
	
}
