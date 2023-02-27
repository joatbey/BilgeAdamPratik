package lesson014;

import java.util.Random;

import lesson011.helper.RandomGenerateId;

public class Account {
	private String accountNo;
	private int money;

	private boolean krediBasvurusu;
	private int istenenKredi;

	private int krediBorcu;
	private boolean krediAlindimi;

	private boolean krediBorcuOdendiMi;
	private int nakitAvans;
	private int krediPuani;

	public Account() {
		this.accountNo = randomAccountNo();
	}

	public Account(int money) {
		this.accountNo = randomAccountNo();
		this.money = money;
	}

	public int getKrediPuani() {
		return krediPuani;
	}

	public void setKrediPuani(int krediPuani) {
		this.krediPuani = krediPuani;
	}

	public boolean isKrediBorcuOdendiMi() {
		return krediBorcuOdendiMi;
	}

	public void setKrediBorcuOdendiMi(boolean krediBorcuOdendiMi) {
		this.krediBorcuOdendiMi = krediBorcuOdendiMi;
	}

	public int getNakitAvans() {
		return nakitAvans;
	}

	public void setNakitAvans(int nakitAvans) {
		this.nakitAvans = nakitAvans;
	}

	public int getKrediBorcu() {
		return krediBorcu;
	}

	public void setKrediBorcu(int krediBorcu) {
		this.krediBorcu = krediBorcu;
	}

	public boolean isKrediAlindimi() {
		return krediAlindimi;
	}

	public void setKrediAlindimi(boolean krediAlindimi) {
		this.krediAlindimi = krediAlindimi;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public boolean isKrediBasvurusu() {
		return krediBasvurusu;
	}

	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}

	public int getIstenenKredi() {
		return istenenKredi;
	}

	public void setIstenenKredi(int istenenKredi) {
		this.istenenKredi = istenenKredi;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

//	public void depositMoney(int money) {
//		if (money > 0 && money <= 10000) {
//			this.setMoney(this.getMoney() + money);
//			System.out.println(money + " para hesaba yatırıldı güncel bakiyeniz " + this.getMoney());
//		} else {
//			System.err.println("Sadece 1 ile 10.000 tl Arasında işlem yapabilirsiniz");
//		}
//	}
//
//	public void withdrawMoney(int money) {
//		if (money > this.getMoney()) {
//			System.err.println("Yetersiz bakiye");
//		} else {
//			this.setMoney(this.getMoney() - money);
//			System.out.println(money + " para hesaptan çekildi güncel bakiyeniz " + this.getMoney());
//		}
//	}

	private String randomAccountNo() {
		Random random = new Random();
		Long sayi = random.nextLong(1000, 5000);
		String accountNo = String.valueOf(sayi);
		return accountNo;
	}
}
