package lesson022.StreamUygulama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Market {
	
	//product isimli bir enum arrayı yapalım EUrun enumindan valueları çekelim...
	EUrun[] product = EUrun.values();
	
	// urunler diye bir listemiz olsun enum arrayinden buraya urunleri taşıyacağız
	List<Urun> urunler = new ArrayList<>();
	
	// map olarak sepeti tutacağız burada urun ismi ve adet yer alacak :sepetMap
	Map<String,Integer>  sepetMap = new HashMap<>();
	
	// urunleri hem isim hem fiyat ile tutan bir map : urunMap
	Map<String, Double> urunMap = new HashMap<>();
	
	public Market() {
		urunOlustur();
		urunFiyatMapOlustur();
	}

	
	public void urunOlustur() {
		// product arrayini liste çevireceğiz sonra da streame. ki manipule edelim...
		// urun nesnesi oluştururken değerleri EUrun içinden alacağız.
		
		urunler = Arrays.asList(product).stream().map(urun -> new Urun(urun.name(), urun.fiyat)).collect(Collectors.toList());
		
		
		
	}
	
	public void urunleriListele() {
		// urunler.forEach(Urun::toString);
		// urunler.forEach(System.out::println);
		urunler.forEach(urun -> System.out.println(urun.getName()));
	}
	
	
	
	// urunFiyat listesi olustur
		public void urunFiyatMapOlustur() {

			urunMap = urunler.stream().collect(Collectors.toMap(urun -> urun.getName(), urun -> urun.getPrice()));

//			for (Urun urun : urunler) {
//				urunMap.put(urun.getName(), urun.getPrice());
//			}
		}

		
		
		

		public void fiyatListesi() {
			urunMap.forEach((key, value) -> System.out.println(key + "-->  " + value));
			// urunMap.entrySet().forEach(System.out::println);
		}
		
		//fiyati50 den büyük olan ürünleri Listeleleyelim
		public void fiyati50denBuyukOlanlar() {
			
			List<Entry<String,Double>> ellidenBuyukler = urunMap.entrySet()
					.stream()
					.filter(x-> x.getValue() > 50)
					.collect(Collectors.toList());
			
			System.out.println(ellidenBuyukler.toString());

		}
		
		public void fiyati50denBuyukOlanlar2() {			
			List<String> urunler = urunMap.entrySet().stream()
					.filter(entry -> entry.getValue() >50)
					.map(Entry::getKey)
					.collect(Collectors.toList());
			System.out.println(urunler);
			
		}
		
		
		public void ortalama() {

			List<Urun> ellidenBuyukler = urunler.stream()
					.filter(x-> x.getPrice() > 50)
					.collect(Collectors.toList());
			double avgPrice = ellidenBuyukler.stream().collect(Collectors.averagingDouble(Urun::getPrice));
			
			//guzelce yazdırdı Average found is 76.66666666666667
			ellidenBuyukler.stream().mapToDouble(i -> i.getPrice()).average().ifPresent(avg-> System.out.println("Average found is " + avg));
			
			System.out.println(avgPrice);
		}
		
		
		
		

	
	
}
