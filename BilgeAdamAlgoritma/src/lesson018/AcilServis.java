package lesson018;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class AcilServis{
	public static void main(String[] args) {
		Queue<Hasta> acilServis = new PriorityQueue<Hasta>();
		acilServis.offer(new Hasta("Mustafa", "Apandisit"));
		acilServis.offer(new Hasta("Oguz", "Apandisit"));
		acilServis.offer(new Hasta("Kemal", "Agrı"));
		acilServis.offer(new Hasta("Ayşe", "Yanık"));
		acilServis.offer(new Hasta("Zeliha", "Yanık"));
		acilServis.offer(new Hasta("Okan", "Apandisit"));
		acilServis.offer(new Hasta("Orhan", "Yanık"));
		acilServis.offer(new Hasta("Gizem", "Agrı"));
		acilServis.offer(new Hasta("Muharrem", "Apandisit"));
		acilServis.offer(new Hasta("Merve", "Yanık"));
		
		while(!acilServis.isEmpty()) { 
			System.out.println(acilServis.peek().getIsim() + " "+ acilServis.poll().getOncelik());
		}
	
		System.out.println("******************************");
		
		
		// linked list verilen sırayla sıralıyor.
		Queue<Hasta> acilServis2 = new LinkedList<Hasta>();
		acilServis2.offer(new Hasta("Mustafa", "Apandisit"));
		acilServis2.offer(new Hasta("Oguz", "Apandisit"));
		acilServis2.offer(new Hasta("Kemal", "Agrı"));
		acilServis2.offer(new Hasta("Ayşe", "Yanık"));
		acilServis2.offer(new Hasta("Zeliha", "Yanık"));
		acilServis2.offer(new Hasta("Okan", "Apandisit"));
		acilServis2.offer(new Hasta("Orhan", "Yanık"));
		acilServis2.offer(new Hasta("Gizem", "Agrı"));
		acilServis2.offer(new Hasta("Muharrem", "Apandisit"));
		acilServis2.offer(new Hasta("Merve", "Yanık"));
		
		while(!acilServis2.isEmpty()) { 
			System.out.println(acilServis2.peek().getIsim() + " "+ acilServis2.poll().getOncelik());
		}
	
	
	}	
}
