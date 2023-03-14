package lesson022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Kisi kisi1 = new Kisi("ahmet", 52, ECinsiyet.ERKEK);	
		Kisi kisi2 = new Kisi("ali", 61, ECinsiyet.ERKEK);	
		Kisi kisi3 = new Kisi("zeynep", 56, ECinsiyet.KADIN);	
		Kisi kisi4 = new Kisi("defne", 41, ECinsiyet.KADIN);	
		Kisi kisi5 = new Kisi("aslı", 31, ECinsiyet.KADIN);	

		List<Kisi> kisiler = new ArrayList<>();
		
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		kisiler.add(kisi4);
		kisiler.add(kisi5);
		
		// kadın olNLeı farklı listeye atalım:
		
		
		System.out.println("Kadınlar: ");
		
		List<Kisi> kadinlar = kisiler.stream().filter(kisi -> kisi.geteCinsiyet().equals(ECinsiyet.KADIN)).collect(Collectors.toList());
		System.out.println(kadinlar);
	
		System.out.println(" ---------------- ");

		// Kişileri yaşlarına göre sıralayalım: 
		// googlelayalm stream api ile sıralaama nasıl yapılır ? 
		
		//Stream kullanarak:
		List<Kisi> sortedKisilerList = kisiler.stream().sorted(Comparator.comparingInt(Kisi :: getAge)).collect(Collectors.toList());
		sortedKisilerList.forEach(System.out :: println);
		System.out.println(" ---------------- ");

		//default olarak küçükten büyüğe sıralıyor.
		// reversed siralamak için .reversed()
		List<Kisi> tersSortedKisilerList = kisiler.stream().sorted(Comparator.comparingInt(Kisi :: getAge).reversed()).collect(Collectors.toList());
		tersSortedKisilerList.forEach(System.out :: println);

		System.out.println(" ---------------- ");

		// Stream olmadan yapalım bi de erkek kadın ve yas yapalm
		Collections.sort(kisiler , Comparator.comparing(Kisi ::  geteCinsiyet).thenComparing(Kisi::getName)); 
		System.out.println(kisiler);
	
		
		
	}

}
