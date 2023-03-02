package lesson018;
import java.util.LinkedList;
import java.util.Queue;

public class QueueOrnek {

	public static void main(String[] args) {
		// Bir String queue oluşturalım
		//Kuyruğun içine isimler atalım kuyruktaki elemanları yazdıralım.
		
		// fifo ilk giren ilk çıkar...
		
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Ali");
		queue.offer("Veli");
		queue.offer("Ayşe");
		queue.offer("Fatma");
		
		queue.peek(); //Ali
		
		System.out.println(queue);
		
		
		Queue<String> queue2 = new LinkedList<String>();
		queue2.offer("Ali");
		queue2.offer("Veli");
		queue2.offer("Ayşe");
		queue2.offer("Fatma");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		System.out.println("***********************************");
		
		for(int i = queue2.size() ; i>0 ;i-- ) {
			queue2.poll();
			System.out.println(queue2);
		}
		
		
		
	}

}
