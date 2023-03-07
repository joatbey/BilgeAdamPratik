package lesson018;

import java.util.PriorityQueue;
import java.util.Queue;

public class Hasta implements Comparable < Hasta>{
	// Hasta diye bir sınıf acalim
	// isim sikayet ve oncelik (int)
	// sikayete gore oncelik
	// apandisit----> en yuksek oncelik :1
	// yanık ----> orta oncelik : 2
	// agri -----> dusuk oncelik : 3

	private String isim;
	private ESikayet sikayet;
	private String sikayet2;
	private int oncelik;
	
	///////constructors
	public Hasta(String isim, ESikayet sikayet) {
		super();
		this.isim = isim;
		this.sikayet = sikayet;
		oncelikBelirleEnum(sikayet);
	}
	
	public Hasta(String isim, String sikayet2) {
		super();
		this.isim = isim;
		this.sikayet2 = sikayet2;
		// oncelikBelirle(sikayet);

		this.oncelik = sikayet2.equalsIgnoreCase("Apandist") ? 1
				: sikayet2.equalsIgnoreCase("Yanık") ? 2 : sikayet2.equalsIgnoreCase("Agrı") ? 3 : 4;
	}
	
	////////////////methods
	public void oncelikBelirle(String sikayet2) { // sikayet alıp oncelik yapmaca...
		if(sikayet2.equalsIgnoreCase("apandisit")) {
			this.oncelik =1;
		}
		else if(sikayet2.equalsIgnoreCase("yanık")) {
			this.oncelik = 2; 
		}
		else {
			this.oncelik = 3;
		}
	}
	//ILLEGALGUMENTHATASI
	// Sİkayeti Enum tutalım
		public void oncelikBelirleEnum(ESikayet sikayet) {
			switch (sikayet) {
			case APANDISIT:
				this.oncelik = 1;
				break;
			case YANIK:
				this.oncelik = 2;
				break;
			case AGRI:
				this.oncelik = 3;
				break;

			default:
				throw new IllegalArgumentException("Beklenmedik değer girisi oldu");
			}
		}

		public String getIsim() {
			return isim;
		}

		public void setIsim(String isim) {
			this.isim = isim;
		}

//		public String getSikayet() {
//			return sikayet;
//		}
	//
//		public void setSikayet(String sikayet) {
//			this.sikayet = sikayet;
//		}

		public ESikayet getSikayet() {
			return sikayet;
		}

		public void setSikayet(ESikayet sikayet) {
			this.sikayet = sikayet;
		}

		public int getOncelik() {
			return oncelik;
		}

		public void setOncelik(int oncelik) {
			this.oncelik = oncelik;
		}
	

	
	public int compareTo(Hasta hasta) {
		if (hasta.getOncelik() > this.oncelik) {
			return -1;
		} else if (hasta.getOncelik() < this.oncelik) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		
}}