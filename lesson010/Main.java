package lesson010;

public class Main {

	public static void main(String[] args) {
		Profile profil1 = new Profile();
		profil1.profilResmi = "resim.png";
		profil1.isim = "Mehmet";
		profil1.kullaniciAdi = "mehmet123";

		System.out.println(profil1); // lesson010.Profile@723279cf
		System.out.println(profil1.toString()); // lesson010.Profile@723279cf
		System.out.println(profil1.isim); // Mehmet

		System.out.println(profil1.posts); // [Ljava.lang.String;@10f87f48
		System.out.println(profil1.posts[0]); // null
		profil1.posts[1] = "hello ";
		System.out.println(profil1.posts[1]); // hello

//		String name = new String("Ahmet");
//		name.charAt(0);

		System.out.println(profil1.postOlustur("resim1.png"));
		System.out.println(profil1.postOlustur("resim1.png"));
		System.out.println(profil1.postOlustur("resim1.png"));
		System.out.println(profil1.postOlustur("resim1.png"));
		System.out.println(profil1.postOlustur("resim1.png"));
		System.out.println(profil1.postOlustur("resim1.png"));
		System.out.println(profil1.postOlustur("resim1.png"));
		System.out.println(profil1.postOlustur("resim1.png"));// 10dan fazla olursa out of bounds hatası veriyor. bunu
																// daha iyi nasıl yaparız bilmiyorum

		System.out.println(profil1.isim);
		profil1.profilIsminiGuncelle("Yasin");
		System.out.println(profil1.isim);
		profil1.istegiKabulEt();
		profil1.istegiKabulEt();
		profil1.istegiKabulEt();
		profil1.istegiKabulEt();
		System.out.println(profil1.takipciSayisi);
		System.out.println(profil1.maviTik);
		System.out.println(profil1.bilgileriGoster());
		System.out.println(profil1.bilgileriGoster2());

		profil1.posts[0] = "resim3" ;// String[] posts = {"resim3","resim4"}
		profil1.posts[1] = "resim4";
		profil1.posts[2] = "resim5";
		profil1.posts[3] = "resim6";

		System.out.println("profil1 in postları: ");

		for (int i = 0; i < profil1.posts.length; i++) {
			if (profil1.posts[i] != null) { // null olanları yazdırmamak adina...
				System.out.println(profil1.posts[i]);
			}
		}

		
		for(String post: profil1.posts) {
			if(post != null) {
				System.out.println(post);
			}
		}
	}

}
