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
	private String sikayet;
	private int oncelik;
	
	
	public void oncelikBelirle(String sikayet) { // sikayet alıp oncelik yapmaca...
		if(sikayet.equalsIgnoreCase("apandisit")) {
			this.oncelik =1;
		}
		else if(sikayet.equalsIgnoreCase("yanık")) {
			this.oncelik = 2; 
		}
		else {
			this.oncelik = 3;
		}
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSikayet() {
		return sikayet;
	}

	public void setSikayet(String sikayet) {
		this.sikayet = sikayet;
	}

	public int getOncelik() {
		return oncelik;
	}

	public void setOncelik(int oncelik) {
		this.oncelik = oncelik;
	}

	public Hasta(String isim, String sikayet) {// önceliği almadık çünkü şikayeti alıp ona gore biz int atayacağız ...
		super();
		this.isim = isim;
		this.sikayet = sikayet;
		oncelikBelirle(sikayet);
		
		
		
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