package lesson018;

public class Musteri implements Comparable<Musteri>{

	private String isim;
	private int yas;

	public Musteri(String string, int i) {
		this.isim = string;
		this.yas = i;

	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
	
	
	public int compareTo(Musteri mst) { // bu bu şekilde , -1 ile 1 değiştirirsen ters de sıralıyor. ilk if -1 ise önce en düşük
		// ilk if 1 ise en büyükten.
		
		if(this.yas < mst.getYas()){
			return 1;
		}
		else if (this.yas > mst.getYas()) {
			return -1 ; 
		}
		return 0;
	}
}
