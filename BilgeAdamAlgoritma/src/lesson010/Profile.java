package lesson010;

import java.io.PipedOutputStream;

public class Profile {

	//attribute ,property, field
	//gerekli attributelari tanımlayalım:
	public String profilResmi;
	public String kullaniciAdi;
	public String isim;
	//public String link;
	//public String aciklama;
	public int takipciSayisi;
	public int takipSayisi;
	public String[] posts = new String[10];
	int postSayisi =0 ;
	boolean maviTik = false;
	
	//postOlustur metodu 
	// isim --> post oluşturuldu desin

	
	public String postOlustur(String posts) { // parametre olarak da posts içerde de dizi olarak posts kullandık bu ambigiuty oluyor
		String metin = isim +"kullanıcısı "+ (postSayisi	+ 1) + " kadar post olusturdu" ;
		this.posts[postSayisi] = posts; // this.posts demek Profile.posts demek yani classin objesine refer ettiğini söylüyor
								//explicit olarak yazmıyor da işte bu classtaki obje gibi this.objectName diyoruz...
		
		this.postSayisi++;
		System.out.println(postSayisi);
		return metin;
		
	}
	

	//gelenIstegiKabulEt metodu
	//takipci sayimizi artacak
	public void istegiKabulEt() {
		System.out.println("Gelen istek kabul edildi : ");
		this.takipciSayisi ++;
		System.out.println("takipci sayisi : " + takipciSayisi);
		maviTikMesaji();
	}
	
	public void maviTikMesaji() {
		if(takipciSayisi >= 5) {
			maviTik = true;
		}
		else {
			maviTik = false;
		}
	}
	
	// profilIsminiGuncelle metodu
	//methıd isim alacak ismi güncelleyecek
	
	public void profilIsminiGuncelle(String isim) {
		this.isim = isim;
	}
	
	//bilgileri göster metodu
	
	public String bilgileriGoster() {
		return "KullaniciAdi : "+ kullaniciAdi + " MaviTik : " + maviTik + " Takipci sayisi : " + takipciSayisi+ " Post Sayisi : "+ postSayisi;
	}
	public String bilgileriGoster2() {
		return toString();
	}

	@Override
	public String toString() {
		return "Profile [kullaniciAdi=" + kullaniciAdi + ", takipciSayisi=" + takipciSayisi + ", postSayisi="
				+ postSayisi + ", maviTik=" + maviTik + "]";
	}
	
	
	
	
}
