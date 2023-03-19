package lesson24;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileIslemler {

	Scanner scanner = new Scanner(System.in);
	/*
	 * System.out.println("0-Çıkış"); System.out.println("1-Dosya Yarat");
	 * System.out.println("2-Ekle"); System.out.println("3-Okuma");
	 * System.out.println("4-Dosya Silme");
	 * System.out.println("Lütfen işlem seçiniz: ");
	 */

	public void dosyaOlustur() {

		try {
			FileWriter file = new FileWriter(FileSabitler.file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void dosyaOlustur(File file) throws Exception {

		if (file.exists()) {
			throw new Exception("Bu doysa önceden oluşturulmuştur.");
		} else {
			System.out.println("Dosya oluşturuluyor...");
			file.createNewFile();
			Thread.sleep(1000);
			System.out.println("Dosyanız oluşturulmuştur.");

		}

	}

	public void metinEkle(File file) throws Exception {
		if (file.exists()) {
			System.out.println("Yazılacak metni giriniz: ");
			String text = scanner.nextLine();
			FileWriter fileWriter = null;
			try {

				fileWriter = new FileWriter(file, true);
				fileWriter.write(text + "\n");
			} catch (IOException e) {

				e.printStackTrace();
			} finally {
				if (fileWriter != null) {
					try {
						fileWriter.close();
					} catch (Exception e) {
						throw new Exception("Dosya Kapatma Sırasında Beklenmedik Bir Hata Meydana Geldi");
					}

				}
			}

		} else {
			throw new Exception("Dosya Bulunamadı");
		}

	}

	public void menu() {

		int input = 0;

		do {
			System.out.println("* * * * * * * * * * * * ");

			System.out.println("0-Çıkış");
			System.out.println("1-Dosya Yarat");
			System.out.println("2-Ekle");
			System.out.println("3-Okuma");
			System.out.println("4-Dosya Silme");
			System.out.println("Lütfen işlem seçiniz: ");
			System.out.println("* * * * * * * * * * * * ");

			try {
				input = Integer.parseInt(scanner.nextLine());

			} catch (NumberFormatException e) {
				
				System.err.print("olacak şey mi : ");
				e.printStackTrace();
			}
			

			switch (input) {
			case 1:
				try {
					dosyaOlustur(FileSabitler.file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case 2:
				try {
					metinEkle(FileSabitler.file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			default:
				break;
			}

		} while (input != 0);

	}

	public static void main(String[] args) {

		FileIslemler fileIslemler = new FileIslemler();
		fileIslemler.menu();
	}

}
