package lesson018;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueOrnek2 {

	public static void main(String[] args) {
		// bir queue oluşturalım
		//10-12 tane isim atalım
		// daha sonra 1-10 arasında bir sayı uretelim ve bu sayi bizim pide sayımız 
		//pide yazdıralım
		//kuyruğa göre pideleri dağıtacağız pideler bittiğinde pideler bitti yazdıralım
		//pideyi alan kişileri kuyruktan çıkartacağız
		//pideyi alamayan kişileri yazdıralım.
		
		
		Queue<String> queue = new LinkedList<String>();
		Random random = new Random();
		int pideSayisi = random.nextInt(1, 10);
		
		queue.offer("Ali");
		queue.offer("Veli");
		queue.offer("Ayşe");
		queue.offer("Fatma");
		queue.offer("Ekrem");
		queue.offer("Hasan");
		queue.offer("Zeynep");
		queue.offer("Ebru");
		queue.offer("Hüseyin");
		queue.offer("Sinem");
		queue.offer("Ahmet");
		queue.offer("Sevan");
		
		System.out.println(pideSayisi);
		// fifo :
		for ( int i = 0 ; i< pideSayisi; i++) {
			System.out.println(queue.poll() +  " pidesini aldi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1 saniye bekle 
			
		}
		System.out.println();
		for( String q : queue ) {
			System.err.println( q + " pidesini alamadı ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1 saniye bekle 
		}
	}

}
