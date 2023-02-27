package lesson013;

import java.util.Scanner;

public class Soru {
	private int puan;
	private String icerik;
	private String dogruCevap;
	private String[] cevapIcerikleri; // A şıkkında yazan deger, B şıkkında yazna deger... şeklinde string dizisi... 
	
	

	public Soru() {
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public String getIcerik() {
		return icerik;
	}

	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}

	public String getDogruCevap() {
		return dogruCevap;
	}

	public void setDogruCevap(String dogruCevap) {
		this.dogruCevap = dogruCevap;
	}

	public String[] getCevapIcerikleri() {
		return cevapIcerikleri;
	}

	public void setCevapIcerikleri(String[] cevapIcerikleri) {
		this.cevapIcerikleri = cevapIcerikleri;
	}

	public void soruOlustur(String[] cevapSecenekleri) { // parametre olarak string dizisi alacak...
		Scanner scanner = new Scanner(System.in);
		// içerik alacağız...(soruyu alıyoruz)
		// Şıkların değerlerini isteyeceğiz
		// Doğru cevabını belirtin
		// Puanı kaç olsun ? 
		System.out.println("Lütfen sorunun içeriğini girin: ");
		icerik = scanner.nextLine();
		cevapIcerikleri = new String[cevapSecenekleri.length];

		for (int i = 0; i < cevapSecenekleri.length; i++) {//şıklardaki cevaplar
			System.out.println("Lütfen " + cevapSecenekleri[i] + " şıkkının degerini girin");
			cevapIcerikleri[i] = scanner.nextLine();
		}
		System.out.println("Lütfen doğru cevabı belirtin");
		dogruCevap = scanner.nextLine().toUpperCase();
		System.out.println("Sorunun Puanını belirtin");

		//setPuan(scanner.nextInt());
		this.puan = Integer.valueOf(scanner.nextLine());
	}
}
