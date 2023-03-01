package HW001;

public class Main {

	public static void main(String[] args) {
		Takim barca = new Takim("Barcelona", 0);
		Takim real = new Takim("Real Madrid", 0);
		Takim atletico = new Takim("Atletico Madrid", 0);
		Takim sevilla = new Takim("Sevilla", 0);

		Takim[] takimlar = { barca, real, atletico, sevilla };

		for (int i = 0; i < 4; i++) {
			// Takimlar[i] takimlar j=iden 4e kadar olan
			for (int j = 0; j < 4; j++) {
				if (takimlar[i] != takimlar[j]) {
					takimlar[i].macYap(takimlar[j]);
				}
			}
			System.out.println("******");
		}
		
		
		Takim.puanDurumuGoster(takimlar);
		
		System.out.println("******");
		
		for(int i =0; i<4; i++) {
			takimlar[i].kasaGoster();
		}
		
		System.out.println("******");

		Takim.iflasEtmeDurumunuGoster(takimlar);
		Takim.sampiyonuGoster(takimlar);
		
	}

}
