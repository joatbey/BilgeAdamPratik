package lesson018;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue3Ornek {

	public static void main(String[] args) {

		// musteri sınufu açalım isim ve yas alsın
		// mainde bir tane öncelikli queue oluşturalım ve kuyruğa musterileri atalm

		Queue<Musteri> musteriQueue = new PriorityQueue<>();

		musteriQueue.offer(new Musteri("mustafa", 20));
		musteriQueue.offer(new Musteri("ali", 30));
		musteriQueue.offer(new Musteri("mehmet", 40));
		musteriQueue.offer(new Musteri("aslı", 90));
		musteriQueue.offer(new Musteri("zeynep", 25));
		musteriQueue.offer(new Musteri("bugra", 100));

		// musteriler yas onceligine gore kuyruktan çıkacak olsın
		// yasi buyuk olanlar once çıkacak olsun...

		// comparable kullanacağız.
		// Musteri implements Comparable<Musteri> yaptık sınıfına

		while (!musteriQueue.isEmpty()) {
			System.out.println("Kuyruktan çıkmıştır: " + musteriQueue.poll().getIsim());
		}
		System.out.println("**********");

		Queue<Integer> intquee = new PriorityQueue<>(); // priorityqueue otomatik olarak sıralıyor.
		intquee.offer(20);
		intquee.offer(30);
		intquee.offer(40);
		intquee.offer(90);
		intquee.offer(25);
		intquee.offer(100);
		while (!intquee.isEmpty()) {
			System.out.println("Kuyruktan çıkmıştır: " + intquee.poll());
		}
		//buyukten kucuge sıraladı
//		Kuyruktan çıkmıştır: 20
//		Kuyruktan çıkmıştır: 25
//		Kuyruktan çıkmıştır: 30
//		Kuyruktan çıkmıştır: 40
//		Kuyruktan çıkmıştır: 90
//		Kuyruktan çıkmıştır: 100
		System.out.println("**********");

		Queue<String> intqueS = new PriorityQueue<>(); // priorityqueue otomatik olarak sıralıyor.
		intqueS.offer("mustafa");
		intqueS.offer("ali");
		intqueS.offer("mehmet");
		intqueS.offer("aslı");
		intqueS.offer("zeynep");
		intqueS.offer("bugra");
		while (!intqueS.isEmpty()) {
			System.out.println("Kuyruktan çıkmıştır: " + intqueS.poll());

		}
		// alfabetik sıraladı
//		Kuyruktan çıkmıştır: ali
//		Kuyruktan çıkmıştır: aslı
//		Kuyruktan çıkmıştır: bugra
//		Kuyruktan çıkmıştır: mehmet
//		Kuyruktan çıkmıştır: mustafa
//		Kuyruktan çıkmıştır: zeynep

		
		System.out.println("**********");
		
		
		
		
		
	}
}
